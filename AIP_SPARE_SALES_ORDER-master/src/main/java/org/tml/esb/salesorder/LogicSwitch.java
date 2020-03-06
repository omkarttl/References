package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class LogicSwitch {
	

	@XmlElement(name = "Pricing")
	private String pricing;
	
	@XmlElement(name = "AtpWrkmod")
	private String atpWrkmod;
	
	@XmlElement(name = "Scheduling")
	private String scheduling;
	
	@XmlElement(name = "NoStructure")
	private String noStructure;
	
	@XmlElement(name = "CondHandl")
	private String condHandl;
	
	
	public String getPricing() {
		return pricing;
	}
	public void setPricing(String pricing) {
		this.pricing = pricing;
	}
	public String getAtpWrkmod() {
		return atpWrkmod;
	}
	public void setAtpWrkmod(String atpWrkmod) {
		this.atpWrkmod = atpWrkmod;
	}
	public String getScheduling() {
		return scheduling;
	}
	public void setScheduling(String scheduling) {
		this.scheduling = scheduling;
	}
	public String getNoStructure() {
		return noStructure;
	}
	public void setNoStructure(String noStructure) {
		this.noStructure = noStructure;
	}
	public String getCondHandl() {
		return condHandl;
	}
	public void setCondHandl(String condHandl) {
		this.condHandl = condHandl;
	}
	
}
