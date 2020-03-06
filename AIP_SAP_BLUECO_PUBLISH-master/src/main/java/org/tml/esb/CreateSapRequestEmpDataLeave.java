
package org.tml.esb;

import java.util.Date;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;

public class CreateSapRequestEmpDataLeave {
	
	@Value("${sapLeaveEndpoint}")
	private String rfcname;

	public void createRequest(Exchange exchange) throws Exception {

			SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext()
					.getEndpoint("sap-srfc-destination:rfcDest:"+rfcname, SapSynchronousRfcDestinationEndpoint.class);
			Structure request = endpoint.createRequest();

			request.put("PERNR_001", exchange.getIn().getHeader("pernr_001", String.class));
			request.put("SUBTY_006", exchange.getIn().getHeader("subty_006",String.class));
			request.put("BEGDA_007", exchange.getIn().getHeader("begda_007", Date.class));
			request.put("ENDDA_008", exchange.getIn().getHeader("endda_008",Date.class));
			request.put("FULL_FIRST_SEC", exchange.getIn().getHeader("full_first_sec", String.class));
			request.put("SIMULATION", exchange.getIn().getHeader("simulation",String.class));
			request.put("DELETION", exchange.getIn().getHeader("deletion", String.class));
			exchange.getIn().setBody(request);
	}
}
