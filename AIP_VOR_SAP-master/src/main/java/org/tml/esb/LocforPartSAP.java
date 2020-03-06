package org.tml.esb;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "locforPartSAP", targetNamespace="urn:sap-com:document:sap:soap:functions:mc-style")
public interface LocforPartSAP {
	
	 	@WebMethod
	    @RequestWrapper(localName = "ZsdcrmVorSalesOrder",className = "org.tml.esb.LocforPartSAPRequest")
	    @ResponseWrapper(localName = "ZsdcrmVorSalesOrderResponse",className = "org.tml.esb.LocforPartSAPResponse")
	 public LocforPartSAPResponse vororder(LocforPartSAPRequest vorOrder);

}