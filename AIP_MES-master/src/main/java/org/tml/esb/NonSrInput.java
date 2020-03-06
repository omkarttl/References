package org.tml.esb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class NonSrInput {
	
	@XmlAttribute(name = "NAME")
	private String rfcName;

	@XmlElement(name = "atr_key")
	private Integer mesNo;

	@XmlElement(name = "PartNumber")
	private String partNumber;
	
	@XmlElement(name = "MaterialNumber")
	private String materialNumber;
	
	@XmlElement(name = "Plant")
	private String werks;
	
	@XmlElement(name = "ProdLine")
	private String mdv01;
	
	@XmlElement(name = "DATE")
	private String mesDate;
	
	@XmlElement(name = "TIME")
	private String mesTime;
	
	@XmlElement(name = "Quantity")
	private String menge;

	public Integer getMesNo() {
		return mesNo;
	}

	public void setMesNo(Integer mesNo) {
		this.mesNo = mesNo;
	}

	public String getMatnr() {
		if(partNumber != null) 
			return partNumber;
		else
			return materialNumber;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public String getMdv01() {
		return mdv01;
	}

	public void setMdv01(String mdv01) {
		this.mdv01 = mdv01;
	}

	public String getMesDate() {
		return mesDate;
	}

	public void setMesDate(String mesdate) {
		this.mesDate = mesdate;
	}

	public String getMesTime() {
		return mesTime;
	}

	public void setMesTime(String mestime) {
		this.mesTime = mestime;
	}

	public String getMenge() {
		return menge;
	}

	public void setMenge(String menge) {
		this.menge = menge;
	}

}
