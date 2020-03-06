package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZFIRFC_CUSTOMER_VALIDATION", propOrder = {
	"custId"
})
@XmlRootElement(name="ZFIRFC_CUSTOMER_VALIDATION")
public class CustValidation {
	
	@XmlElement(name = "I_KUNNR")
	private String custId;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	
	
}
