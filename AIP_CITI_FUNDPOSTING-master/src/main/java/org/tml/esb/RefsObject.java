package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Refs", propOrder = { "acctSvcrRef", "endToEndId" })


public class RefsObject {

	@XmlElement(name = "AcctSvcrRef")
	private String acctSvcrRef;
	
	@XmlElement(name = "EndToEndId")
	private String endToEndId;

	public String getAcctSvcrRef() {
		return acctSvcrRef;
	}

	public void setAcctSvcrRef(String acctSvcrRef) {
		this.acctSvcrRef = acctSvcrRef;
	}

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}
	
	
	
}
