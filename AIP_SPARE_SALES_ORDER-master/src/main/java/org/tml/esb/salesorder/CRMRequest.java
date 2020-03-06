package org.tml.esb.salesorder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.apache.camel.Exchange;

public class CRMRequest {

	public String newDate() {
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");

		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		if (month == 11) {
			year = year + 1;
		} else {
			month = month + 1;
		}

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		dateFormat.setTimeZone(tz);

		return dateFormat.format(cal.getTime());

	}

	public void createCRMRequest(Exchange exchange) {

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");
		sdf.setTimeZone(tz);
		Calendar cal = Calendar.getInstance();
		String timestamp = sdf.format(cal.getTime());
		String bu = exchange.getProperty("BU", String.class);
		String ordReason = exchange.getProperty("OrderReason", String.class);
		String reqShipDate = exchange.getProperty("ReqDate", String.class);
		String orderId = exchange.getProperty("OrderId", String.class);
		CreateSalesOrderResponse order = new CreateSalesOrderResponse();
		String errorType = "";
		String msgId = "";
		String msgNum = "";
		String wrnZ1Msg = "";
		String wrnMsg = "";
		String sucessMsg = "";
		String displayMsg = "";
		String errTxt = "";
		String errMsg = "";
		String responseCode500 = "";
		String responseCode502 = "";
		String responseCode503 = "";
		String responseCode504 = "";
		String faultCode = "";
		String faultString = "";
		String salesDocument = "";
		String exceptionMsg = "";
		List<ReturnDetails> returnItems;
		faultCode = (String) exchange.getIn().getHeader("faultCode");
		faultString = (String) exchange.getIn().getHeader("faultString");
		responseCode500 = (String) exchange.getIn().getHeader("responseCode500");
		responseCode502 = (String) exchange.getIn().getHeader("responseCode502");
		responseCode503 = (String) exchange.getIn().getHeader("responseCode503");
		responseCode504 = (String) exchange.getIn().getHeader("responseCode504");

		if (faultCode == "" || faultString == "" || faultCode == "null" || faultString == "null"
				|| responseCode504 == "null" || responseCode503 == "null" || responseCode502 == "null"
				|| responseCode500 == "null") {
			SAPResponse sapRes = exchange.getIn().getBody(SAPResponse.class);
			salesDocument = sapRes.getSalesDocuments();
			returnItems = sapRes.getReturnDetails();
			if (salesDocument != null && !salesDocument.isEmpty()) {
				if (bu.equals("TMPC") || bu.equals("PCBU")) {
				
					if ( returnItems != null ) {
						
						for (int i = 0; i < returnItems.size(); i++) {

							errorType = returnItems.get(i).getType();
							msgId = returnItems.get(i).getId();
							msgNum = returnItems.get(i).getNumber();

							if (errorType.equals("W")) {
								if (msgId.equals("ZI")) {
									wrnZ1Msg = returnItems.get(i).getMessage();
								} else
									wrnMsg = wrnMsg + " " + returnItems.get(i).getMessage();
							} else if (errorType.equals("S") && msgId.equals("V1") && msgNum.equals("311")) {
								sucessMsg = returnItems.get(i).getMessage();
							}
						}
					}
					displayMsg = wrnZ1Msg + " " + wrnMsg + " " + sucessMsg;
					
				}
			        displayMsg=displayMsg.trim();
				if (displayMsg.isEmpty() || displayMsg == "") {
					order.setIntegrationStatusAsOfDate(timestamp);
					order.setIntegrationMessage("SALES_HEADER_IN has been processed successfully");

				} else {
					order.setIntegrationMessage(displayMsg);

				}
				
				if ((reqShipDate == null || reqShipDate.isEmpty()) && ordReason.equals("DAM")) // TMCV and TMPC
				{
					order.setRequestedDate(newDate());

				}
				order.setStatusAsOfDate(timestamp);
				order.setStatus("Order Placed");
				order.setOrderId(orderId);
				order.setIntegrationId(salesDocument);

			} else {
				if ( returnItems != null) {
					for (int i = 0; i < returnItems.size(); i++) {
						errorType = returnItems.get(i).getType();
						if (errorType.equals("E")) {
							errTxt = returnItems.get(i).getMessage();
							errMsg = errorType + " : " + errTxt + errMsg;
						}
					}
					order.setIntegrationMessage(errMsg);
					order.setOrderId(orderId);
					order.setStatusAsOfDate(timestamp);

				}
			}
		} else {

			exceptionMsg = responseCode500 + responseCode502 + responseCode503 + responseCode504 + faultCode
					+ faultString;
			exceptionMsg = exceptionMsg.replaceAll("null", "");
			order.setOrderId(orderId);
			order.setIntegrationMessage(exceptionMsg);
			order.setStatusAsOfDate(timestamp);

		}

		exchange.getOut().setBody(order);
	}
}
