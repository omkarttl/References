package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZFIRFC_YES_BANK_DOC_POSTING", propOrder = {
	"budat",
	"dmbtr",
	"custId",
	"xblnr"
})
@XmlRootElement(name="ZFIRFC_YES_BANK_DOC_POSTING")
public class DocPosting {
	
	@XmlElement(name = "I_BUDAT")
	private String budat;
	@XmlElement(name = "I_DMBTR")
	private String dmbtr;
	@XmlElement(name = "I_KUNNR")
	private String custId;
	@XmlElement(name = "I_XBLNR")
	private String xblnr;
	public String getBudat() {
		return budat;
	}
	public void setBudat(String budat) {
		this.budat = budat;
	}
	public String getDmbtr() {
		return dmbtr;
	}
	public void setDmbtr(String dmbtr) {
		this.dmbtr = dmbtr;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getXblnr() {
		return xblnr;
	}
	public void setXblnr(String xblnr) {
		this.xblnr = xblnr;
	}


	
}
