package org.tml.esb;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SapRequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		ItemObj item = exchange.getIn().getBody(ItemObj.class);
		SapRequest req = new SapRequest();
		ItemList itemList = new ItemList();
		String creditdateTime = item.getCreditDateTime();
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(creditdateTime);
		item.setCreditDateTime(new SimpleDateFormat("yyyy-MM-dd").format(date));
		itemList.setItem(item);
		req.setbankEcollection(itemList);

		exchange.getOut().setBody(req);

	}

}
