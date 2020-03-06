package org.tml.esb.salesorder;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "createsalesws", targetNamespace="urn:sap-com:document:sap:soap:functions:mc-style")
public interface CreateSalesOrder {
	
	 	@WebMethod
	    @RequestWrapper(localName = "ZsdrfcCreateSalesOrder",className = "org.tml.esb.salesorder.CreateSalesOrderRequest")
	    @ResponseWrapper(localName = "ZsdrfcCreateSalesOrderResponse",className = "org.tml.esb.salesorder.CreateSalesOrderResponse")
	 	//@WebResult(name = "createSalesOrderResponse", targetNamespace = "http://salesorder.esb.tml.org/")
	 public CreateSalesOrderResponse createOrder(

			 CreateSalesOrderRequest createOrder);

}
