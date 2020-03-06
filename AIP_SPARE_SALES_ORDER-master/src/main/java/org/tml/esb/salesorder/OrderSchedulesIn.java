package org.tml.esb.salesorder;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderSchedulesIn {
	
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
	@XmlElement(name = "SchedLine")
    private String schedLine;
	@XmlElement(name = "ReqDate")
    private String reqDate;
	@XmlElement(name = "DateType")
    private String dateType;
	@XmlElement(name = "ReqTime")
    private String reqTime;
	@XmlElement(name = "TpTime")
    private String tpTime;
	@XmlElement(name = "MsTime")
    private String msTime;
	@XmlElement(name = "LoadTime")
    private String loadTime;
	@XmlElement(name = "GiTime")
    private String giTime;
	@XmlElement(name = "ReqString")
    private String reqString;
    @XmlElement(name = "ReqQty")
    private BigDecimal reqQty;
    @XmlElement(name = "ReqDlvBl")
    private String reqDlvBl;
    @XmlElement(name = "SchedType")
    private String schedType;
    @XmlElement(name = "TpDate")
    private String tpDate;
    @XmlElement(name = "MsDate")
    private String msDate;
    @XmlElement(name = "LoadDate")
    private String loadDate;
    @XmlElement(name = "GiDate")
    private String giDate;
    @XmlElement(name = "TpString")
    private String tpString;
    @XmlElement(name = "MsString")
    private String msString;
    @XmlElement(name = "LoadString")
    private String loadString;
    @XmlElement(name = "GiString")
    private String giString;
    @XmlElement(name = "Refobjtype")
    private String refobjtype;
    @XmlElement(name = "Refobjkey")
    private String refobjkey;
    @XmlElement(name = "Reflogsys")
    private String reflogsys;
    @XmlElement(name = "DlvDate")
    private String dlvDate;
    @XmlElement(name = "DlvTime")
    private String dlvTime;
    @XmlElement(name = "DlvString")
    private String dlvString;
    @XmlElement(name = "RelType")
    private String relType;
    @XmlElement(name = "PlanSchedType")
    private String planSchedType;

    
	public String getMsTime() {
		return msTime;
	}
	public void setMsTime(String msTime) {
		this.msTime = msTime;
	}
	public String getLoadTime() {
		return loadTime;
	}
	public void setLoadTime(String loadTime) {
		this.loadTime = loadTime;
	}
	public String getGiTime() {
		return giTime;
	}
	public void setGiTime(String giTime) {
		this.giTime = giTime;
	}
	public String getDlvTime() {
		return dlvTime;
	}
	public void setDlvTime(String dlvTime) {
		this.dlvTime = dlvTime;
	}
	public String getTpTime() {
		return tpTime;
	}
	public void setTpTime(String tpTime) {
		this.tpTime = tpTime;
	}
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getSchedLine() {
		return schedLine;
	}
	public void setSchedLine(String schedLine) {
		this.schedLine = schedLine;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}
	public String getReqString() {
		return reqString;
	}
	public void setReqString(String reqString) {
		this.reqString = reqString;
	}
	public BigDecimal getReqQty() {
		return reqQty;
	}
	public void setReqQty(BigDecimal reqQty) {
		this.reqQty = reqQty;
	}
	public String getReqDlvBl() {
		return reqDlvBl;
	}
	public void setReqDlvBl(String reqDlvBl) {
		this.reqDlvBl = reqDlvBl;
	}
	public String getSchedType() {
		return schedType;
	}
	public void setSchedType(String schedType) {
		this.schedType = schedType;
	}
	public String getTpDate() {
		return tpDate;
	}
	public void setTpDate(String tpDate) {
		this.tpDate = tpDate;
	}
	public String getMsDate() {
		return msDate;
	}
	public void setMsDate(String msDate) {
		this.msDate = msDate;
	}
	public String getLoadDate() {
		return loadDate;
	}
	public void setLoadDate(String loadDate) {
		this.loadDate = loadDate;
	}
	public String getGiDate() {
		return giDate;
	}
	public void setGiDate(String giDate) {
		this.giDate = giDate;
	}
	public String getTpString() {
		return tpString;
	}
	public void setTpString(String tpString) {
		this.tpString = tpString;
	}
	public String getMsString() {
		return msString;
	}
	public void setMsString(String msString) {
		this.msString = msString;
	}
	public String getLoadString() {
		return loadString;
	}
	public void setLoadString(String loadString) {
		this.loadString = loadString;
	}
	public String getGiString() {
		return giString;
	}
	public void setGiString(String giString) {
		this.giString = giString;
	}
	public String getRefobjtype() {
		return refobjtype;
	}
	public void setRefobjtype(String refobjtype) {
		this.refobjtype = refobjtype;
	}
	public String getRefobjkey() {
		return refobjkey;
	}
	public void setRefobjkey(String refobjkey) {
		this.refobjkey = refobjkey;
	}
	public String getReflogsys() {
		return reflogsys;
	}
	public void setReflogsys(String reflogsys) {
		this.reflogsys = reflogsys;
	}
	public String getDlvDate() {
		return dlvDate;
	}
	public void setDlvDate(String dlvDate) {
		this.dlvDate = dlvDate;
	}
	public String getDlvString() {
		return dlvString;
	}
	public void setDlvString(String dlvString) {
		this.dlvString = dlvString;
	}
	public String getRelType() {
		return relType;
	}
	public void setRelType(String relType) {
		this.relType = relType;
	}
	public String getPlanSchedType() {
		return planSchedType;
	}
	public void setPlanSchedType(String planSchedType) {
		this.planSchedType = planSchedType;
	}
	public String getReqTime() {
		return reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	
}
