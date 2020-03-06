package org.tml.esb;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;

public class SapRequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		CreateCitiFundPostRequest citiReq = exchange.getIn().getBody(CreateCitiFundPostRequest.class);
		SapRequest req = new SapRequest();
		ItemObj item = new ItemObj();
		ItemList itemList = new ItemList();

		item.setHdfcRef(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getIdOne());
		item.setBankAcc(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getAcct().getIdTwo().getOthr()
				.getIdThree());
		item.setAmt(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getAmt());
		item.setDocDate(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getValDt().getDt());
		item.setDealer(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getNtryDtls().getTxDtls()
				.getRefs().getEndToEndId());
		
		if(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getAddtlNtryInf() == null || citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getAddtlNtryInf().length() == 0)
		{
			   item.setUtrNo(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getNtryDtls().getTxDtls()
						.getRmtInf().getUstrd().substring(35, 52));
			}
		else {
			 item.setUtrNo(citiReq.getDocument().getBkToCstmrDbtCdt().getNtfctn().getNtry().getAddtlNtryInf().substring(35,
						52));
		}
		
		itemList.setItem(item);
		req.setbankEcollection(itemList);

		exchange.getOut().setBody(req);

	}

}
