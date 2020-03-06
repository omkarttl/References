package org.tml.esb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RFC_CALL")
public class SAPResponse {
	
	@XmlAttribute(name = "NAME")
	private String rfcName;
	@XmlElement(name = "atr_key")
	private Integer atrKey;
	@XmlElement(name = "Response")
	private String response;
	@XmlElement(name = "Remarks")
	private String remarks;

	public Integer getAtrKey() {
		return atrKey;
	}

	public void setAtrKey(Integer atrKey) {
		this.atrKey = atrKey;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRfcName() {
		return rfcName;
	}

	public void setRfcName(String rfcName) {
		this.rfcName = rfcName;
	}
	
	
}
