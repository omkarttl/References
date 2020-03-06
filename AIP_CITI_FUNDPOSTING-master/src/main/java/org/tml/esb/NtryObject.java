package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ntry", propOrder = { "amt", "cdtDbtInd", "sts", "valDt", "bkTxCd", "ntryDtls", "addtlNtryInf" })

public class NtryObject {

	@XmlElement(name = "Amt")
	private String amt;
	
	@XmlElement(name = "CdtDbtInd")
	private String cdtDbtInd;
	
	@XmlElement(name = "Sts")
	private String sts;
	
	@XmlElement(name = "ValDt")
	private ValDtObject valDt;
	
	@XmlElement(name = "BkTxCd")
	private BkTxCdObject bkTxCd;
	
	@XmlElement(name = "NtryDtls")
	private NtryDtlsObject ntryDtls;
	
	@XmlElement(name = "AddtlNtryInf")
	private String addtlNtryInf;

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getCdtDbtInd() {
		return cdtDbtInd;
	}

	public void setCdtDbtInd(String cdtDbtInd) {
		this.cdtDbtInd = cdtDbtInd;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

	public ValDtObject getValDt() {
		return valDt;
	}

	public void setValDt(ValDtObject valDt) {
		this.valDt = valDt;
	}

	public BkTxCdObject getBkTxCd() {
		return bkTxCd;
	}

	public void setBkTxCd(BkTxCdObject bkTxCd) {
		this.bkTxCd = bkTxCd;
	}

	public NtryDtlsObject getNtryDtls() {
		return ntryDtls;
	}

	public void setNtryDtls(NtryDtlsObject ntryDtls) {
		this.ntryDtls = ntryDtls;
	}

	public String getAddtlNtryInf() {
		return addtlNtryInf;
	}

	public void setAddtlNtryInf(String addtlNtryInf) {
		this.addtlNtryInf = addtlNtryInf;
	}

	
}
