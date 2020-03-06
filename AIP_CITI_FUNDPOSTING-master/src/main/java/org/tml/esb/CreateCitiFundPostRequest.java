package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CITI_NOTIFICATION_API",namespace = "https://tatamotors.com/citi/api/1.0", propOrder = { "document" })
@JsonIgnoreProperties(ignoreUnknown = true)

public class CreateCitiFundPostRequest {

	@XmlElement(name = "Document")
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}




}
