package org.tml.esb;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "accountExtract", targetNamespace = "https://tatamotors.com/api/1.0")

public interface AccountExtract {

	@WebMethod
	@RequestWrapper(localName = "ACCOUNT_EXTRACT_API", className = "org.tml.esb.AccountExtractSoapRequest")
	@ResponseWrapper(localName = "ACCOUNT_EXTRACT_APIResponse", className = "org.tml.esb.AccountExtractSoapResponseItem")

	public AccountExtractSoapResponseItem acctReq(AccountExtractSoapRequest acctReq);

}