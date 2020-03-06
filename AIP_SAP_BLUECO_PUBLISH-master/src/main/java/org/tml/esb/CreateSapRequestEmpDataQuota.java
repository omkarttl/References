package org.tml.esb;

import java.util.Date;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;

public class CreateSapRequestEmpDataQuota {
	
	@Value("${sapQuotaEndpoint}")
	private String rfcname;

	public void createRequest(Exchange exchange) throws Exception {
			SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext()
					.getEndpoint("sap-srfc-destination:rfcDest:"+rfcname, SapSynchronousRfcDestinationEndpoint.class);
			Structure request = endpoint.createRequest();
			request.put("PERNR_NO", exchange.getIn().getHeader("pernr_no", String.class));
			request.put("BEGDA",exchange.getIn().getHeader("begda", Date.class));
			request.put("ENDDA",exchange.getIn().getHeader("endda", Date.class));
			request.put("ABWKO", exchange.getIn().getHeader("abwko", String.class));
			exchange.getIn().setBody(request);
	}
}
