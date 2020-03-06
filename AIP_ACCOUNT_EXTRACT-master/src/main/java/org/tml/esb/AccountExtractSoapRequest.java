package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNT_EXTRACT_API", namespace = "https://tatamotors.com/api/1.0", propOrder = { "item" })

@JsonIgnoreProperties(ignoreUnknown = true)

public class AccountExtractSoapRequest {

	@XmlElement(name = "item")
	private AccountExtractSoapItem item;

	public AccountExtractSoapItem getItem() {
		return item;
	}

	public void setItem(AccountExtractSoapItem item) {
		this.item = item;
	}

}
