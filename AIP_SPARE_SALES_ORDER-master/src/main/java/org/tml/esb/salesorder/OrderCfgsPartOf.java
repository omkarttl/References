package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsPartOf {
	
	 @XmlElement(name = "ConfigId")
	 private String configId;
	 @XmlElement(name = "ParentId")
    private String parentId;
	 @XmlElement(name = "InstId")
    private String instId;
	 @XmlElement(name = "PartOfNo")
	 private String partOfNo;
	 @XmlElement(name = "ObjType")
    private String objType;
	 @XmlElement(name = "ClassType")
    private String classType;
	 @XmlElement(name = "ObjKey")
    private String objKey;
	 @XmlElement(name = "Author")
    private String author;
	 @XmlElement(name = "SalesRelevant")
    private String salesRelevant;
	 @XmlElement(name = "PartOfGuid")
    private String partOfGuid;
	 
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getPartOfNo() {
		return partOfNo;
	}
	public void setPartOfNo(String partOfNo) {
		this.partOfNo = partOfNo;
	}
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getObjKey() {
		return objKey;
	}
	public void setObjKey(String objKey) {
		this.objKey = objKey;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSalesRelevant() {
		return salesRelevant;
	}
	public void setSalesRelevant(String salesRelevant) {
		this.salesRelevant = salesRelevant;
	}
	public String getPartOfGuid() {
		return partOfGuid;
	}
	public void setPartOfGuid(String partOfGuid) {
		this.partOfGuid = partOfGuid;
	}
     
}
