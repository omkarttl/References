package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinInstnId", propOrder = { "clrSysMmbId" })


public class FinInstnIdObject {

	@XmlElement(name = "ClrSysMmbId")
	private ClrSysMmbIdObject clrSysMmbId;

	public ClrSysMmbIdObject getClrSysMmbId() {
		return clrSysMmbId;
	}

	public void setClrSysMmbId(ClrSysMmbIdObject clrSysMmbId) {
		this.clrSysMmbId = clrSysMmbId;
	}

}
