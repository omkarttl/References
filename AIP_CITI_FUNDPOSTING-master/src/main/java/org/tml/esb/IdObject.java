package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Id", propOrder = { "othr" })


public class IdObject {

	@XmlElement(name ="Othr")
	private OthrObject othr;

	public OthrObject getOthr() {
		return othr;
	}

	public void setOthr(OthrObject othr) {
		this.othr = othr;
	}

}

