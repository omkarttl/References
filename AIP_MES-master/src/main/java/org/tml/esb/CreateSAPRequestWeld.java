package org.tml.esb;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSAPRequestWeld {
	 private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	@Value("${sap.weld.endpoint}")
	private String sapEndpoint;

	public void createRequest(Exchange exchange) {
		try {
			WeldInput weldInput = (WeldInput) exchange.getIn().getBody();

			SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint(
					"sap-srfc-destination:rfcDest:ZMES_WELD_DATA", SapSynchronousRfcDestinationEndpoint.class);
			Structure request;
			request = endpoint.createRequest();
			request.put("WELDNO", weldInput.getWeldNo());
			request.put("BIWNO", weldInput.getBiwNo());
			request.put("IND", weldInput.getInd());
			request.put("MDV01", weldInput.getMdv01());
			request.put("MESDATE", weldInput.getMesDate());
			request.put("MESTIME", weldInput.getMesTime());
			request.put("I_MESID", weldInput.getiMesid());
			request.put("FISCAL_DATE", weldInput.getFiscalDate());
			exchange.getIn().setBody(request);
		} catch (Exception e) {
			logger.error("Exception Occurred ::"+e);

		}

	}

}
