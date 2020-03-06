package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02", propOrder = { "bkToCstmrDbtCdt" })

public class Document {

	@XmlElement(name = "BkToCstmrDbtCdtNtfctn")
	private BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdt;

	public BkToCstmrDbtCdtNtfctn getBkToCstmrDbtCdt() {
		return bkToCstmrDbtCdt;
	}

	public void setBkToCstmrDbtCdt(BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdt) {
		this.bkToCstmrDbtCdt = bkToCstmrDbtCdt;
	}

	

	

}
