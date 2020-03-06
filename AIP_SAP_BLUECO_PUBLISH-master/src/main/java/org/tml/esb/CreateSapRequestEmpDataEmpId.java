package org.tml.esb;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;

public class CreateSapRequestEmpDataEmpId {

@Value("${sapEmpIdEndpoint}")
private String rfcname;	
	
	public void createRequest(Exchange exchange)  throws Exception {
			SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext()
					.getEndpoint("sap-srfc-destination:rfcDest:"+rfcname, SapSynchronousRfcDestinationEndpoint.class);
			Structure request = endpoint.createRequest();
			request.put("SMART_CARD_ID_NO", exchange.getIn().getHeader("smartcard_id_no", String.class));
			exchange.getIn().setBody(request);
	}
}
