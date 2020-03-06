package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prtry", propOrder = { "cd" })


public class PrtryObject {

@XmlElement(name = "Cd")
private String cd;

public String getCd() {
	return cd;
}

public void setCd(String cd) {
	this.cd = cd;
}


}
