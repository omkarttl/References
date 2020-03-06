package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZsdcrmVorSalesOrderResponse", propOrder = { "itFinal", "vMsg" })
@XmlRootElement(name = "LocforPartSAPResponse")
public class LocforPartSAPResponse {
	
	@XmlElement(name = "ItFinal")
	private VorOrder itFinal;

	@XmlElement(name = "VMsg")
	private String vMsg;

	public VorOrder getItFinal() {
		return itFinal;
	}

	public void setItFinal(VorOrder itFinal) {
		this.itFinal = itFinal;
	}

	public String getvMsg() {
		return vMsg;
	}

	public void setvMsg(String vMsg) {
		this.vMsg = vMsg;
	}
	
	

}
