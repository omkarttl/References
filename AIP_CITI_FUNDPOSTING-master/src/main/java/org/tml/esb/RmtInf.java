package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RmtInf", propOrder = { "ustrd" })

public class RmtInf {

	@XmlElement(name = "Ustrd")
	private String ustrd;

	public String getUstrd() {
		return ustrd;
	}

	public void setUstrd(String ustrd) {
		this.ustrd = ustrd;
	}
	
	
	
}
