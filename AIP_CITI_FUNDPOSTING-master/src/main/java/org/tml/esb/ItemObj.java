package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = { "hdfcRef", "bankAcc", "amt", "docDate", "dealer", "busType", "status", "utrNo",
		"remark", "dealerD" })

@XmlRootElement(name="I_ZFI_BANK_ECOLLECTION_CITI")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemObj {

	@XmlElement(name = "HDFC_REF")
	private String hdfcRef;
	@XmlElement(name = "BANK_ACC")
	private String bankAcc;
	@XmlElement(name = "AMOUNT")
	private String amt;
	@XmlElement(name = "DOC_DATE")
	private String docDate;
	@XmlElement(name = "DEALER")
	private String dealer;
	@XmlElement(name = "BUSTYP")
	private String busType;
	@XmlElement(name = "STATUS")
	private String status;
	@XmlElement(name = "UTR_NO")
	private String utrNo;
	@XmlElement(name = "REMARK")
	private String remark;
	@XmlElement(name = "DEALERD")
	private String dealerD;

	public String getHdfcRef() {
		return hdfcRef;
	}

	public void setHdfcRef(String hdfcRef) {
		this.hdfcRef = hdfcRef;
	}

	public String getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getDocDate() {
		return docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getDealer() {
		return dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUtrNo() {
		return utrNo;
	}

	public void setUtrNo(String utrNo) {
		this.utrNo = utrNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDealerD() {
		return dealerD;
	}

	public void setDealerD(String dealerD) {
		this.dealerD = dealerD;
	}

}
