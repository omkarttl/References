package org.tml.esb.salesorder;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsRef {
	
	
	 @XmlElement(name = "Posex")
	 private String posex;
	 @XmlElement(name = "ConfigId")
    private String configId;
	 @XmlElement(name = "RootId")
    private String rootId;
	 @XmlElement(name = "Sce")
    private String sce;
	 @XmlElement(name = "Kbname")
    private String kbName;
	 @XmlElement(name = "KbVersion")
    private String kbVersion;
	 @XmlElement(name = "Complete")
    private String complete;
	 @XmlElement(name = "Consistent")
    private String consistent;
	 @XmlElement(name = "Cfginfo")
    private String cfgInfo;
	 @XmlElement(name = "Kbprofile")
    private String kbProfile;
	 @XmlElement(name = "Kblanguage")
    private String kbLanguage;
	 @XmlElement(name = "CbaseId")
    private String cbaseId;
	 @XmlElement(name = "CbaseIdType")
    private String cbaseIdType;
	 
	public String getPosex() {
		return posex;
	}
	public void setPosex(String posex) {
		this.posex = posex;
	}
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getRootId() {
		return rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}
	public String getSce() {
		return sce;
	}
	public void setSce(String sce) {
		this.sce = sce;
	}
	public String getKbName() {
		return kbName;
	}
	public void setKbName(String kbName) {
		this.kbName = kbName;
	}
	public String getKbVersion() {
		return kbVersion;
	}
	public void setKbVersion(String kbVersion) {
		this.kbVersion = kbVersion;
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
	public String getCfgInfo() {
		return cfgInfo;
	}
	public void setCfgInfo(String cfgInfo) {
		this.cfgInfo = cfgInfo;
	}
	public String getKbProfile() {
		return kbProfile;
	}
	public void setKbProfile(String kbProfile) {
		this.kbProfile = kbProfile;
	}
	public String getKbLanguage() {
		return kbLanguage;
	}
	public void setKbLanguage(String kbLanguage) {
		this.kbLanguage = kbLanguage;
	}
	public String getCbaseId() {
		return cbaseId;
	}
	public void setCbaseId(String cbaseId) {
		this.cbaseId = cbaseId;
	}
	public String getCbaseIdType() {
		return cbaseIdType;
	}
	public void setCbaseIdType(String cbaseIdType) {
		this.cbaseIdType = cbaseIdType;
	}

     
}
