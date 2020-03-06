package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZFIRFC_CUSTOMER_VALIDATIONResponse", propOrder = {
	"status"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name="ZFIRFC_CUSTOMER_VALIDATIONResponse")
public class CustValidationResponse {
	
	@XmlElement(name = "RETURN")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}




}
