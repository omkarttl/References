package org.tml.esb.salesorder;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCfgsValue {
	
	@XmlElement(name = "ConfigId")
	private String configId;
	@XmlElement(name = "InstId")
	private String instId;
	@XmlElement(name = "Charc")
    private String charc;
	@XmlElement(name = "CharcTxt")
    private String charcTxt;
	@XmlElement(name = "Value")
    private String value;
	@XmlElement(name = "ValueTxt")
    private String valueTxt;
	@XmlElement(name = "Author")
    private String author;
	@XmlElement(name = "ValueTo")
    private String valueTo;
	@XmlElement(name = "Valcode")
    private String valCode;   
    
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
	public String getCharc() {
		return charc;
	}
	public void setCharc(String charc) {
		this.charc = charc;
	}
	public String getCharcTxt() {
		return charcTxt;
	}
	public void setCharcTxt(String charcTxt) {
		this.charcTxt = charcTxt;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValueTxt() {
		return valueTxt;
	}
	public void setValueTxt(String valueTxt) {
		this.valueTxt = valueTxt;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getValueTo() {
		return valueTo;
	}
	public void setValueTo(String valueTo) {
		this.valueTo = valueTo;
	}
	public String getValCode() {
		return valCode;
	}
	public void setValCode(String valCode) {
		this.valCode = valCode;
	}

    
    
}
