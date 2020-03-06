package org.tml.esb;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.springframework.beans.factory.annotation.Value;

public class CreateSapRequestEmpDataAttendance {

@Value("${sapAttendanceEndpoint}")
private String rfcname;

	public void createRequest(Exchange exchange) throws Exception {

		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext()
				.getEndpoint("sap-srfc-destination:rfcDest:"+rfcname, SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();

		request.put("PERNR", exchange.getIn().getHeader("pernr", String.class));
		request.put("MONTH", exchange.getIn().getHeader("month", String.class));
		request.put("YEAR", exchange.getIn().getHeader("year", String.class));
		exchange.getIn().setBody(request);

	}
}
