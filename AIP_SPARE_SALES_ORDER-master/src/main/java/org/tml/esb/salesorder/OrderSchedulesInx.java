package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import org.apache.camel.util.Time;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderSchedulesInx {
	
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
	@XmlElement(name = "SchedLine")
    private String schedLine;
	@XmlElement(name = "Updateflag")
    private String updateflag;
	@XmlElement(name = "ReqDate")
    private String reqDate;
	@XmlElement(name = "DateType")
    private String dateType;
	@XmlElement(name = "ReqTime")
    private Time reqTime;
    @XmlElement(name = "ReqQty")
    private String reqQty;
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
    @XmlElement(name = "TpTime")
    private Time tpTime;
    @XmlElement(name = "MsTime")
    private Time msTime;
    @XmlElement(name = "LoadTime")
    private Time loadTime;
    @XmlElement(name = "GiTime")
    private Time giTime;
    @XmlElement(name = "Refobjtype")
    private String refobjtype;
    @XmlElement(name = "Refobjkey")
    private String refobjkey;
    @XmlElement(name = "DlvDate")
    private String dlvDate;
    @XmlElement(name = "DlvTime")
    private Time dlvTime;
    @XmlElement(name = "RelType")
    private String relType;
    @XmlElement(name = "PlanSchedType")
    private String planSchedType;
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
	public String getUpdateflag() {
		return updateflag;
	}
	public void setUpdateflag(String updateflag) {
		this.updateflag = updateflag;
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
	public Time getReqTime() {
		return reqTime;
	}
	public void setReqTime(Time reqTime) {
		this.reqTime = reqTime;
	}
	public String getReqQty() {
		return reqQty;
	}
	public void setReqQty(String reqQty) {
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
	public Time getTpTime() {
		return tpTime;
	}
	public void setTpTime(Time tpTime) {
		this.tpTime = tpTime;
	}
	public Time getMsTime() {
		return msTime;
	}
	public void setMsTime(Time msTime) {
		this.msTime = msTime;
	}
	public Time getLoadTime() {
		return loadTime;
	}
	public void setLoadTime(Time loadTime) {
		this.loadTime = loadTime;
	}
	public Time getGiTime() {
		return giTime;
	}
	public void setGiTime(Time giTime) {
		this.giTime = giTime;
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
	public String getDlvDate() {
		return dlvDate;
	}
	public void setDlvDate(String dlvDate) {
		this.dlvDate = dlvDate;
	}
	public Time getDlvTime() {
		return dlvTime;
	}
	public void setDlvTime(Time dlvTime) {
		this.dlvTime = dlvTime;
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

   
}
