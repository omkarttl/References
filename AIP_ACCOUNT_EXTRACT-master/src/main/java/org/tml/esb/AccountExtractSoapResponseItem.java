package org.tml.esb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNT_EXTRACT_APIResponse", propOrder = { "item" })

@XmlRootElement(name = "ACCOUNT_EXTRACT_APIResponse")

public class AccountExtractSoapResponseItem {

	@XmlElement(name = "item")
	private List<AccountExtractResponse> item;

	public List<AccountExtractResponse> getItem() {
		return item;
	}

	public void setItem(List<AccountExtractResponse> item) {
		this.item = item;
	}

}