package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Othr", propOrder = { "idThree" })


public class OthrObject {

	@XmlElement(name = "Id")
	private String idThree;

	public String getIdThree() {
		return idThree;
	}

	public void setIdThree(String idThree) {
		this.idThree = idThree;
	}

}
