package org.tml.esb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class WeldInput {
	
	@XmlAttribute(name = "NAME")
	private String rfcName;
	
	@XmlElement(name = "atr_key")
	private String atrKey;

	@XmlElement(name = "SerialNumber")
	private Integer weldNo;

	@XmlElement(name = "Plant")
	private String werks;

	@XmlElement(name = "LineNumber")
	private String mdv01;

	@XmlElement(name = "IND")
	private String ind;

	@XmlElement(name = "PartNumber")
	private String biwNo;

	@XmlElement(name = "DATE")
	private String mesDate;

	@XmlElement(name = "TIME")
	private String mesTime;

	@XmlElement(name = "FiscalDate")
	private String fiscalDate;

	@XmlElement(name = "ItemId")
	private String iMesid;
	
	public String getAtrKey() {
		return atrKey;
	}

	public void setAtrKey(String atrKey) {
		this.atrKey = atrKey;
	}

	public Integer getWeldNo() {
		return weldNo;
	}

	public void setWeldNo(Integer weldNo) {
		this.weldNo = weldNo;
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

	public String getInd() {
		return ind;
	}

	public void setInd(String ind) {
		this.ind = ind;
	}

	public String getBiwNo() {
		return biwNo;
	}

	public void setBiwNo(String biwNo) {
		this.biwNo = biwNo;
	}

	public String getMesDate() {
		return mesDate;
	}

	public void setMesDate(String mesDate) {
		this.mesDate = mesDate;
	}

	public String getMesTime() {
		return mesTime;
	}

	public void setMesTime(String mesTime) {
		this.mesTime = mesTime;
	}

	public String getFiscalDate() {
		return fiscalDate.replace("-", "");
	}

	public void setFiscalDate(String fiscalDate) {
		this.fiscalDate = fiscalDate;
	}

	public String getiMesid() {
		return iMesid;
	}

	public void setiMesid(String iMesid) {
		this.iMesid = iMesid;
	}
}
