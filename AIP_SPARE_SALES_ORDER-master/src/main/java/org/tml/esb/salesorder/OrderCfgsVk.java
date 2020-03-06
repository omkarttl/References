package org.tml.esb.salesorder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsVk {
	
	@XmlElement(name = "ConfigId")
	private String configId;
	@XmlElement(name = "InstId")
    private String instId;
	@XmlElement(name = "Vkey")
    private String vkey;
	@XmlElement(name = "Factor")
    private String factor;
	
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
	public String getVkey() {
		return vkey;
	}
	public void setVkey(String vkey) {
		this.vkey = vkey;
	}
	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
    
}
