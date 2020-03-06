package org.tml.esb;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSAPRequestNonSR {
	 private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	@Value("${sap.nonsr.endpoint}")
	private String sapEndpoint;

	public void createRequest(Exchange exchange) {
		try {
			NonSrInput nsrlInput = (NonSrInput) exchange.getIn().getBody();
			SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint(
					"sap-srfc-destination:rfcDest:" + sapEndpoint, SapSynchronousRfcDestinationEndpoint.class);
			Structure request;
			request = endpoint.createRequest();
			request.put("MES_NO", nsrlInput.getMesNo());
			request.put("MATNR", nsrlInput.getMatnr());
			request.put("WERKS", nsrlInput.getWerks());
			request.put("MDV01", nsrlInput.getMdv01());
			request.put("MESDATE", nsrlInput.getMesDate());
			request.put("MESTIME", nsrlInput.getMesTime());
			request.put("MENGE", nsrlInput.getMenge());
			exchange.getIn().setBody(request);
		} catch (Exception e) {
			
			logger.error("Exception Occurred ::"+e);
		}

	}

}
