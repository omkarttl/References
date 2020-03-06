package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderConditionsInx {
	
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
	@XmlElement(name = "CondStNo")
    private String condStNo;
	@XmlElement(name = "CondCount")
    private String condCount;
	@XmlElement(name = "CondType")
    private String condType;
	@XmlElement(name = "Updateflag")
    private String updateFlag;
	@XmlElement(name = "CondValue")
    private String condValue;
	@XmlElement(name = "Currency")
    private String currency;
	@XmlElement(name = "CondUnit")
    private String condUnit;
	@XmlElement(name = "CondPUnt")
    private String condPUnt;
	@XmlElement(name = "Varcond")
    private String varCond;
    
    
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getCondStNo() {
		return condStNo;
	}
	public void setCondStNo(String condStNo) {
		this.condStNo = condStNo;
	}
	public String getCondCount() {
		return condCount;
	}
	public void setCondCount(String condCount) {
		this.condCount = condCount;
	}
	public String getCondType() {
		return condType;
	}
	public void setCondType(String condType) {
		this.condType = condType;
	}
	public String getUpdateFlag() {
		return updateFlag;
	}
	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}
	public String getCondValue() {
		return condValue;
	}
	public void setCondValue(String condValue) {
		this.condValue = condValue;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCondUnit() {
		return condUnit;
	}
	public void setCondUnit(String condUnit) {
		this.condUnit = condUnit;
	}
	public String getCondPUnt() {
		return condPUnt;
	}
	public void setCondPUnt(String condPUnt) {
		this.condPUnt = condPUnt;
	}
	public String getVarCond() {
		return varCond;
	}
	public void setVarCond(String varCond) {
		this.varCond = varCond;
	}

}
