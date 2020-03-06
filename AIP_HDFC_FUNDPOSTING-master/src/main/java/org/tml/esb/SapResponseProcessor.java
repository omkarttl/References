package org.tml.esb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SapResponseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		SapResponse resp = exchange.getIn().getBody(SapResponse.class);
		String status = resp.getStatus();
		String remark = resp.getRemark();

		if (status.equals("1")) {
			String customRemark = "Not Valid";
			resp.setRemark(customRemark);
			resp.setCode("400");
		}
		
		else if (status.equals("0")) {
			resp.setCode("200");
			resp.setRemark(remark);
		}
	
		exchange.getOut().setBody(resp);
	}	

}
