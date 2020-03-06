package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsRefInst {
	
	
	@XmlElement(name = "Posex")
	private String posex;
	@XmlElement(name = "ConfigId")
	private String configId;
	@XmlElement(name = "InstId")
	private String instId;
	
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
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	
}
