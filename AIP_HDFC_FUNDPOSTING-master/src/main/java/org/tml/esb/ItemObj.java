package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "item", propOrder = {
	"transactionId",
	"bankAcc",
	"amount",
	"creditDateTime",
	"dealer",
	"busType",
	"status",
	"utrNo",
	"remark",
	"dealerD"
})
@XmlRootElement(name="item")

public class ItemObj {
	
	@XmlElement(name = "HDFC_REF")
	private String transactionId;
	@XmlElement(name = "BANK_ACC")
	private String bankAcc;
	@XmlElement(name = "AMOUNT")
	private String amount;
	@XmlElement(name = "DOC_DATE")
	private String creditDateTime;
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
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getBankAcc() {
		return bankAcc;
	}
	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCreditDateTime() {
		return creditDateTime;
	}
	public void setCreditDateTime(String creditDateTime) {
		this.creditDateTime = creditDateTime;
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
