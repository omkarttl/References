package org.tml.esb;

import javax.jws.WebResult;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.RequestWrapper;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://esb.tml.org/")
public interface SMSService
{
    @WebMethod
    @RequestWrapper(localName = "insert", targetNamespace = "http://esb.tml.org/", className = "org.tml.esb.SMSInput")
    @ResponseWrapper(localName = "insertResponse", targetNamespace = "http://esb.tml.org/", className = "org.tml.esb.SMSOutput")
    @WebResult(name = "status", targetNamespace = "")
    SMSOutput insert(final SMSInput p0);
}
