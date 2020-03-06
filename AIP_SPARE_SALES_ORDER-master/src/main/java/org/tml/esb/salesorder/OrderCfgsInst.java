package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsInst {

	@XmlElement(name = "ConfigId")
	private String configId;
	@XmlElement(name = "InstId")
	private String instId;
	@XmlElement(name = "ObjType")
	private String objType;
	@XmlElement(name = "ClassType")
	private String classType;
	@XmlElement(name = "ObjKey")
	private String objKey;
	@XmlElement(name = "ObjTxt")
	private String objTxt;
	@XmlElement(name = "Quantity")
	private String quantity;
	@XmlElement(name = "Author")
	private String author;
	@XmlElement(name = "QuantityUnit")
	private int quantityUnit;
	@XmlElement(name = "Complete")
	private String complete;
	@XmlElement(name = "Consistent")
	private String consistent;
	@XmlElement(name = "ObjectGuid")
	private String objectGuid;
	@XmlElement(name = "PersistId")
	private String persistId;
	@XmlElement(name = "PersistIdType")
	private String persistIdType;
	
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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
	public String getObjTxt() {
		return objTxt;
	}
	public void setObjTxt(String objTxt) {
		this.objTxt = objTxt;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	public String getConsistent() {
		return consistent;
	}
	public void setConsistent(String consistent) {
		this.consistent = consistent;
	}
	public String getObjectGuid() {
		return objectGuid;
	}
	public void setObjectGuid(String objectGuid) {
		this.objectGuid = objectGuid;
	}
	public String getPersistId() {
		return persistId;
	}
	public void setPersistId(String persistId) {
		this.persistId = persistId;
	}
	public String getPersistIdType() {
		return persistIdType;
	}
	public void setPersistIdType(String persistIdType) {
		this.persistIdType = persistIdType;
	}
	
}
