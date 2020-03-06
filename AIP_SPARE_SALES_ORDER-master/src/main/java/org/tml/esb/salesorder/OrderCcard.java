package org.tml.esb.salesorder;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCcard {
	
	@XmlElement(name = "CcType")
	private String ccType;
	@XmlElement(name = "CcNumber")
    private String ccNumber;
	@XmlElement(name = "CcValidT")
    private String ccValidT;
	@XmlElement(name = "CcName")
    private String ccName;
	@XmlElement(name = "Billamount")
    private String billamount;
	@XmlElement(name = "AuthFlag")
    private String authFlag;
	@XmlElement(name = "Authamount")
    private String authamount;
	@XmlElement(name = "Currency")
    private String currency;
	@XmlElement(name = "CurrIso")
    private String currISO;
	@XmlElement(name = "AuthDate")
    private String authDate;
	@XmlElement(name = "AuthTime")
    private String authTime;
	@XmlElement(name = "AuthCcNo")	
    private String authCcNo;
	@XmlElement(name = "AuthRefno")
    private String authRefno;
	@XmlElement(name = "CcReact")
    private String ccReact;
	@XmlElement(name = "CcReAmount")
    private String ccReAmount;
	@XmlElement(name = "GlAccount")
    private String glAccount;
	@XmlElement(name = "CcStatEx")
    private String ccStatEx;
	@XmlElement(name = "CcReactT")
    private String ccReactT;
	@XmlElement(name = "VirtCard")
    private String virtCard;
	@XmlElement(name = "Merchidcl")
    private String merchidcl;
	@XmlElement(name = "PreAuth")
    private String preAuth;
	@XmlElement(name = "CcSeqNo")
    private String ccSeqNo;
	@XmlElement(name = "AmountChan")
    private String amountChan;
	@XmlElement(name = "AuthorType")
    private String authorType;
	@XmlElement(name = "DataOrigin")
    private String dataOrigin;
	@XmlElement(name = "RadrCheck1")
    private String radrCheck1;
	@XmlElement(name = "RadrCheck2")
    private String radrCheck2;
	@XmlElement(name = "RadrCheck3")
    private String radrCheck3;
	@XmlElement(name = "RcardCheck")
    private String rcardCheck;
	@XmlElement(name = "CcLimited")
    private String ccLimited;
	@XmlElement(name = "CcVerifValue")
    private String ccVerifValue;
	@XmlElement(name = "CcCtrlField")
    private String ccCtrlField;
	@XmlElement(name = "CcInUseSt")
    private String ccInUseSt;
	
	public String getCcType() {
		return ccType;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcValidT() {
		return ccValidT;
	}
	public void setCcValidT(String ccValidT) {
		this.ccValidT = ccValidT;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getBillamount() {
		return billamount;
	}
	public void setBillamount(String billamount) {
		this.billamount = billamount;
	}
	public String getAuthFlag() {
		return authFlag;
	}
	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}
	public String getAuthamount() {
		return authamount;
	}
	public void setAuthamount(String authamount) {
		this.authamount = authamount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrISO() {
		return currISO;
	}
	public void setCurrISO(String currISO) {
		this.currISO = currISO;
	}
	public String getAuthDate() {
		return authDate;
	}
	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}
	public String getAuthTime() {
		return authTime;
	}
	public void setAuthTime(String authTime) {
		this.authTime = authTime;
	}
	public String getAuthCcNo() {
		return authCcNo;
	}
	public void setAuthCcNo(String authCcNo) {
		this.authCcNo = authCcNo;
	}
	public String getAuthRefno() {
		return authRefno;
	}
	public void setAuthRefno(String authRefno) {
		this.authRefno = authRefno;
	}
	public String getCcReact() {
		return ccReact;
	}
	public void setCcReact(String ccReact) {
		this.ccReact = ccReact;
	}
	public String getCcReAmount() {
		return ccReAmount;
	}
	public void setCcReAmount(String ccReAmount) {
		this.ccReAmount = ccReAmount;
	}
	public String getGlAccount() {
		return glAccount;
	}
	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}
	public String getCcStatEx() {
		return ccStatEx;
	}
	public void setCcStatEx(String ccStatEx) {
		this.ccStatEx = ccStatEx;
	}
	public String getCcReactT() {
		return ccReactT;
	}
	public void setCcReactT(String ccReactT) {
		this.ccReactT = ccReactT;
	}
	public String getVirtCard() {
		return virtCard;
	}
	public void setVirtCard(String virtCard) {
		this.virtCard = virtCard;
	}
	public String getMerchidcl() {
		return merchidcl;
	}
	public void setMerchidcl(String merchidcl) {
		this.merchidcl = merchidcl;
	}
	public String getPreAuth() {
		return preAuth;
	}
	public void setPreAuth(String preAuth) {
		this.preAuth = preAuth;
	}
	public String getCcSeqNo() {
		return ccSeqNo;
	}
	public void setCcSeqNo(String ccSeqNo) {
		this.ccSeqNo = ccSeqNo;
	}
	public String getAmountChan() {
		return amountChan;
	}
	public void setAmountChan(String amountChan) {
		this.amountChan = amountChan;
	}
	public String getAuthorType() {
		return authorType;
	}
	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}
	public String getDataOrigin() {
		return dataOrigin;
	}
	public void setDataOrigin(String dataOrigin) {
		this.dataOrigin = dataOrigin;
	}
	public String getRadrCheck1() {
		return radrCheck1;
	}
	public void setRadrCheck1(String radrCheck1) {
		this.radrCheck1 = radrCheck1;
	}
	public String getRadrCheck2() {
		return radrCheck2;
	}
	public void setRadrCheck2(String radrCheck2) {
		this.radrCheck2 = radrCheck2;
	}
	public String getRadrCheck3() {
		return radrCheck3;
	}
	public void setRadrCheck3(String radrCheck3) {
		this.radrCheck3 = radrCheck3;
	}
	public String getRcardCheck() {
		return rcardCheck;
	}
	public void setRcardCheck(String rcardCheck) {
		this.rcardCheck = rcardCheck;
	}
	public String getCcLimited() {
		return ccLimited;
	}
	public void setCcLimited(String ccLimited) {
		this.ccLimited = ccLimited;
	}
	public String getCcVerifValue() {
		return ccVerifValue;
	}
	public void setCcVerifValue(String ccVerifValue) {
		this.ccVerifValue = ccVerifValue;
	}
	public String getCcCtrlField() {
		return ccCtrlField;
	}
	public void setCcCtrlField(String ccCtrlField) {
		this.ccCtrlField = ccCtrlField;
	}
	public String getCcInUseSt() {
		return ccInUseSt;
	}
	public void setCcInUseSt(String ccInUseSt) {
		this.ccInUseSt = ccInUseSt;
	}

}
