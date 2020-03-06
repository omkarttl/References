package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Svcr", propOrder = { "finInstnId" })


public class SvcrObject {

	@XmlElement(name = "FinInstnId")
	private FinInstnIdObject finInstnId;

	public FinInstnIdObject getFinInstnId() {
		return finInstnId;
	}

	public void setFinInstnId(FinInstnIdObject finInstnId) {
		this.finInstnId = finInstnId;
	}



	
}
