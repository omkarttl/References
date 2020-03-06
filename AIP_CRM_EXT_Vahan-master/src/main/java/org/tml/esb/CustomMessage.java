package org.tml.esb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CustomMessage implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		String payload = exchange.getIn().getBody(String.class);

		 if (payload.contains("Failed to access the WSDL")) {
			exchange.getIn().setBody("<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"  + 
					 "<S:Body>\n"+ 
					 "<ns2:uploadResponse xmlns:ns2=\"http://service.web.homologation.transport.nic/\">\n"  + 
					 "<return>There is some technical error to access https://vahan.parivahan.gov.in/makerws/dataportws. Please try after sometime.</return>\n"  + 
					 "</ns2:uploadResponse>\n"  + 
					 "</S:Body>\n"  + 
					 "</S:Envelope>");
			
		} else if (payload.contains("Unique Model Ref No")) {
			exchange.getIn().setBody(payload.replaceAll("Unique Model Ref No", "URN"));

		} 
		 else if (payload.contains("Duplicate Chassis No")) {
			exchange.getIn().setBody("<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"  + 
					 "<S:Body>\n"+ 
					 "<ns2:uploadResponse xmlns:ns2=\"http://service.web.homologation.transport.nic/\">\n"  + 
					 "<return>Chassis is already available in  Vahan Portal.</return>\n"  + 
					 "</ns2:uploadResponse>\n"  + 
					 "</S:Body>\n"  + 
					 "</S:Envelope>");
			
		} else if (payload.contains("Duplicate Transaction Id")) {
			exchange.getIn().setBody("<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"  + 
					 "<S:Body>\n"+ 
					 "<ns2:uploadResponse xmlns:ns2=\"http://service.web.homologation.transport.nic/\">\n"  + 
					 "<return>Chassis is already available in Vahan Portal.</return>\n"  + 
					 "</ns2:uploadResponse>\n"  + 
					 "</S:Body>\n"  + 
					 "</S:Envelope>");
		}
		else
			exchange.getIn().setBody(payload);

	}

}
