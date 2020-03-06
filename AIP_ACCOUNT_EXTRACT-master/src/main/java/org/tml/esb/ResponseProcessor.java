package org.tml.esb;

import org.apache.camel.Processor;

import org.apache.camel.Exchange;

public class ResponseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		AccountExtractResponse acctRes = exchange.getIn().getBody(AccountExtractResponse.class);
	
		if (acctRes.getItemDtlAmt() == null || acctRes.getItemDtlAmt().length() == 0) {
			acctRes.setItemDtlAmt("0");
		}
		/* if (acctRes.getAttrib01() == null || acctRes.getAttrib01().length() == 0) {
			acctRes.setAttrib01("0");
		}*/
		if (acctRes.getAttrib16() == null || acctRes.getAttrib16().length() == 0) {
			acctRes.setAttrib16("0");
		}
		if (acctRes.getAttrib17() == null || acctRes.getAttrib17().length() == 0) {
			acctRes.setAttrib17("0");
		}
		if (acctRes.getAttrib18() == null || acctRes.getAttrib18().length() == 0) {
			acctRes.setAttrib18("0");
		}
		if (acctRes.getAttrib19() == null || acctRes.getAttrib19().length() == 0) {
			acctRes.setAttrib19("0");
		}
		if (acctRes.getAttrib21() == null || acctRes.getAttrib21().length() == 0) {
			acctRes.setAttrib21("1");
		}
		if (acctRes.getAttrib22() == null || acctRes.getAttrib22().length() == 0) {
			acctRes.setAttrib22("0");
		}
		if (acctRes.getxOrdItmDscntAmt() == null || acctRes.getxOrdItmDscntAmt().length() == 0) {
			acctRes.setxOrdItmDscntAmt("0");
		}
		if (acctRes.getTaxAmt() == null || acctRes.getTaxAmt().length() == 0) {
			acctRes.setTaxAmt("0");
		}
		if (acctRes.getTaxRate() == null || acctRes.getTaxRate().length() == 0) {
			acctRes.setTaxRate("1");
		}

		if (acctRes.getOrderNum() == null || acctRes.getOrderNum().length() == 0) {
			acctRes.setOrderNum("");
		}
		if (acctRes.getxSerialNum() == null || acctRes.getxSerialNum().length() == 0) {
			acctRes.setxSerialNum("");
		}
		if (acctRes.getxEngineNum() == null || acctRes.getxEngineNum().length() == 0) {
			acctRes.setxEngineNum("");
		}
		if (acctRes.getName() == null || acctRes.getName().length() == 0) {
			acctRes.setName("");
		}
		if (acctRes.getxItemColor() == null || acctRes.getxItemColor().length() == 0) {
			acctRes.setxItemColor("");
		}
		if (acctRes.getLogin() == null || acctRes.getLogin().length() == 0) {
			acctRes.setLogin("");
		}
		if (acctRes.getHypothecation() == null || acctRes.getHypothecation().length() == 0) {
			acctRes.setHypothecation("");
		}

		exchange.getOut().setBody(acctRes);

	}
}
