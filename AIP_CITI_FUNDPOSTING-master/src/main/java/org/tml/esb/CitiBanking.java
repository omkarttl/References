package org.tml.esb;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.tml.esb.CreateCitiResponse;

@WebService(name = "citibanking", targetNamespace = "https://tatamotors.com/citi/api/1.0")

public interface CitiBanking {

	@WebMethod
	@RequestWrapper(localName = "CITI_NOTIFICATION_API", className = "org.tml.esb.CreateCitiFundPostRequest")
	@ResponseWrapper(localName = "CITI_NOTIFICATION_APIResponse", className = "org.tml.esb.CreateCitiResponse")

	public CreateCitiResponse citiReq(CreateCitiFundPostRequest citiReq);

}
