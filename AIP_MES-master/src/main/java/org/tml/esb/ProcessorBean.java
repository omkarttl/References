package org.tml.esb;

import org.apache.camel.Exchange;

public class ProcessorBean {
	
	SAPResponse sapResponseObj = new SAPResponse();

	public SAPResponse process(Exchange exchange){
		
		String retValue=(String) exchange.getIn().getBody();
		if (retValue.equals("SUCESS")) {
			sapResponseObj.setRfcName(exchange.getIn().getHeader("rfcName",String.class));
			sapResponseObj.setAtrKey(exchange.getIn().getHeader("atrKey",Integer.class));
			sapResponseObj.setResponse("1");
			sapResponseObj.setRemarks("SUCCESS");
			
		}else if (retValue.equals("DUPLICATE ENTRY") ) {
			sapResponseObj.setRfcName(exchange.getIn().getHeader("rfcName",String.class));
			sapResponseObj.setAtrKey(exchange.getIn().getHeader("atrKey",Integer.class));
			sapResponseObj.setResponse("2");
			sapResponseObj.setRemarks("DUPLICATE ENTRY");			
		}
		return sapResponseObj;

	}

}
