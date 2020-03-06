package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class ExtensionIn {
	
	@XmlElement(name = "Structure")
	private String structure;
	@XmlElement(name = "ValuePart1")
	private String valuePart1;
	@XmlElement(name = "ValuePart2")
    private String valuePart2;
	@XmlElement(name = "ValuePart3")
    private String valuePart3;
	@XmlElement(name = "ValuePart4")
    private String valuePart4;
    
    
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getValuePart1() {
		return valuePart1;
	}
	public void setValuePart1(String valuePart1) {
		this.valuePart1 = valuePart1;
	}
	public String getValuePart2() {
		return valuePart2;
	}
	public void setValuePart2(String valuePart2) {
		this.valuePart2 = valuePart2;
	}
	public String getValuePart3() {
		return valuePart3;
	}
	public void setValuePart3(String valuePart3) {
		this.valuePart3 = valuePart3;
	}
	public String getValuePart4() {
		return valuePart4;
	}
	public void setValuePart4(String valuePart4) {
		this.valuePart4 = valuePart4;
	}
    
    

}
