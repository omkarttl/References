package org.tml.esb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.Exchange;

public class QueryChecker {
	private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	public void queryCheck(Exchange exchange) throws Exception {
		try {
			String queryFlag;
			LocalDate jdgStartD = LocalDate.parse(exchange.getIn().getHeader("JDG_StartDate").toString(),
					DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

			LocalDate jdgEndD = LocalDate.parse(exchange.getIn().getHeader("JDG_EndDate").toString(),
					DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

			LocalDate invcSDate = LocalDate.parse(exchange.getIn().getHeader("invoiceDate").toString(),
					DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

			if ((exchange.getIn().getHeader("dateFlag").toString().equalsIgnoreCase("1"))) {

				if ((jdgStartD.isBefore(invcSDate)) && (invcSDate.isBefore(jdgEndD))) {
					queryFlag = "jdg";
					exchange.getIn().setHeader("QueryFlag", queryFlag);
				} else {
					queryFlag = "drDB";
					exchange.getIn().setHeader("QueryFlag", queryFlag);
				}
			}

			else if ((exchange.getIn().getHeader("dateFlag").toString().equalsIgnoreCase("0"))) {

				LocalDate invcEDate = LocalDate.parse(exchange.getIn().getHeader("invoiceEndDate").toString(),
						DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

				if ((jdgStartD.isBefore(invcSDate)) && (invcEDate.isBefore(jdgEndD))) {
					queryFlag = "jdg";
					exchange.getIn().setHeader("QueryFlag", queryFlag);
				} else {
					queryFlag = "drDB";
					exchange.getIn().setHeader("QueryFlag", queryFlag);
				}

			}

		} catch (Exception e) {

			logger.error("Exception Occurred ::" + e);
		}
	}

}
