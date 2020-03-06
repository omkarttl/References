package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Document;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZsdcrmVorSalesOrder", propOrder = { 
		"matnr",
		"pLabst",
		"werks"
		})
public class LocforPartSAPRequest {

	@XmlElement(name = "Matnr")
	private String matnr;
	
	@XmlElement(name = "PLabst")
	private String pLabst;
	
	@XmlElement(name = "Werks")
	private String werks;

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getpLabst() {
		return pLabst;
	}

	public void setpLabst(String pLabst) {
		this.pLabst = pLabst;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	
}
