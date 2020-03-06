package org.tml.jdgrepo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.apache.camel.Exchange;
import org.infinispan.client.hotrod.RemoteCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tml.config.JdgConstants;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Soumya Gupta
 *
 */
@Service
public class JdgConnectionManagerImpl implements JdgConnectionManager {

	private static Logger logger = LoggerFactory.getLogger(JdgConnectionManagerImpl.class);
	private RemoteCache<String, Object> cache;
	private HashMap<String, Date> indexMasterDataMap;
	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private ObjectMapper mapper = new ObjectMapper();

	public JdgConnectionManagerImpl() {
		logger.info("JdgConnectionManagerImpl constructor is called *************");
		try {
			this.cache = JdgConnection.getCache(JdgConstants.CACHE_NAME, 1);
			this.mapper.setDateFormat(sdf);
			this.mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
			this.mapper.configure(Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
		} catch (Exception e) {
			logger.error(
					"Exception occured while creating bean of class JdgConnectionManagerImpl with cache name {} and exception {}",
					JdgConstants.CACHE_NAME, e.toString());
		}
	}

	@Override
	public boolean put(String key, Exchange value) {
		logger.info("Entering Method  JdgConnectionManagerImpl.put with key :{}", key);

		if (value != null) {
			logger.info("Entering for getting cache to put data :");
			try {

				this.cache.put(key, value.getIn().getBody(String.class));
				
				System.out.println("Get:::::::::::::::::"+this.cache.get(key));

			} catch (Exception e) {
				logger.error("Exception occured while putting data in cache {}", e.toString());
				return false;
			}
		}
		logger.info("Exiting Method JdgConnectionManagerImpl.put with parameters");
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean updateOrAddIndex(Date startDate, Date endDate, boolean isStartDate) throws Exception {

		logger.info("Entering Method JdgConnectionManagerImpl.updateOrAddIndex with Start Date & End Date :{},{} ",
				startDate.toString(), endDate.toString());

		if (startDate != null && endDate != null) {
			this.cache = JdgConnection.getCache(JdgConstants.CACHE_NAME, 0);
			if (this.cache != null && this.cache.get(JdgConstants.INDEX_DATA_MAP) != null) {

				this.indexMasterDataMap = mapper.readValue(this.cache.get(JdgConstants.INDEX_DATA_MAP).toString(),
						HashMap.class);
			}

			if (this.indexMasterDataMap != null) {

				logger.info("Index Cache is not empty and value is :{}", this.indexMasterDataMap.toString());

				String indexMap = convertMaptoString(startDate, endDate, isStartDate);
				this.cache.put(JdgConstants.INDEX_DATA_MAP, indexMap);
				logger.info("Index Cache of master is added to cache");
			} else {
				logger.info("Index Cache is  empty , creating new object to store data");
				this.indexMasterDataMap = new HashMap<>();
				String indexMap = convertMaptoString(startDate, endDate, true);
				this.cache.put(JdgConstants.INDEX_DATA_MAP, indexMap);
				logger.info("Index Cache of master is added to cache");
			}
		} else {
			logger.error("Start Date and End Date cannot be null , start date is {} and end date is {}", startDate,
					endDate);
			throw new Exception("Start Date and End Date cannot be null");
		}
		logger.info("Exiting from method JdgConnectionManagerImpl.updateOrAddIndex");
		return true;
	}

	private String convertMaptoString(Date startDate, Date endDate, boolean isStartDate)
			throws ParseException, JsonProcessingException {
		if (isStartDate) {
			this.indexMasterDataMap.put(JdgConstants.START_DATE, sdf.parse(sdf.format(startDate)));
		}
		this.indexMasterDataMap.put(JdgConstants.END_DATE, sdf.parse(sdf.format(endDate)));
		String indexMap = this.mapper.writeValueAsString(this.indexMasterDataMap);
		return indexMap;
	}

}