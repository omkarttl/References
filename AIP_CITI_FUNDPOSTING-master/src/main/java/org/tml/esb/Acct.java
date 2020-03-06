package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acct", propOrder = { "idTwo", "svcr" })

public class Acct {

	@XmlElement(name = "Id")
	private IdObject idTwo;

	@XmlElement(name = "Svcr")
	private SvcrObject svcr;

	public IdObject getIdTwo() {
		return idTwo;
	}

	public void setIdTwo(IdObject idTwo) {
		this.idTwo = idTwo;
	}

	public SvcrObject getSvcr() {
		return svcr;
	}

	public void setSvcr(SvcrObject svcr) {
		this.svcr = svcr;
	}

	

}
