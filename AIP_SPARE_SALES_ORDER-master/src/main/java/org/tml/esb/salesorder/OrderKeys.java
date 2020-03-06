package org.tml.esb.salesorder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderKeys {
	
	@XmlElement(name = "Refobjtyp")
    private String refObjTyp;
	@XmlElement(name = "Refobject")
    private String refObject;
	@XmlElement(name = "Refobjkey")
    private String refObjKey;
	@XmlElement(name = "Reflogsys")
    private String refLogSys;
	@XmlElement(name = "DocNumber")
    private String docNumber;
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
	@XmlElement(name = "SchedLin")
    private String schedLin;
	@XmlElement(name = "CondNo")
    private String condNo;
	@XmlElement(name = "Conditemno")
    private String condItemNo;
	@XmlElement(name = "CondStNo")
    private String condStNo;
	@XmlElement(name = "CondCount")
    private String condCount;
	@XmlElement(name = "CondType")
    private String condType;
	@XmlElement(name = "Status")
    private String status;
	@XmlElement(name = "Tindex")
    private String tindex;
	@XmlElement(name = "Address")
    private String address;
	@XmlElement(name = "Abrli")
    private String abrli;
	@XmlElement(name = "Abart")
    private String abart;

    
	public String getRefObjTyp() {
		return refObjTyp;
	}
	public void setRefObjTyp(String refObjTyp) {
		this.refObjTyp = refObjTyp;
	}
	public String getRefObject() {
		return refObject;
	}
	public void setRefObject(String refObject) {
		this.refObject = refObject;
	}
	public String getRefObjKey() {
		return refObjKey;
	}
	public void setRefObjKey(String refObjKey) {
		this.refObjKey = refObjKey;
	}
	public String getRefLogSys() {
		return refLogSys;
	}
	public void setRefLogSys(String refLogSys) {
		this.refLogSys = refLogSys;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getSchedLin() {
		return schedLin;
	}
	public void setSchedLin(String schedLin) {
		this.schedLin = schedLin;
	}
	public String getCondNo() {
		return condNo;
	}
	public void setCondNo(String condNo) {
		this.condNo = condNo;
	}
	public String getCondItemNo() {
		return condItemNo;
	}
	public void setCondItemNo(String condItemNo) {
		this.condItemNo = condItemNo;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTindex() {
		return tindex;
	}
	public void setTindex(String tindex) {
		this.tindex = tindex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAbrli() {
		return abrli;
	}
	public void setAbrli(String abrli) {
		this.abrli = abrli;
	}
	public String getAbart() {
		return abart;
	}
	public void setAbart(String abart) {
		this.abart = abart;
	}

}
