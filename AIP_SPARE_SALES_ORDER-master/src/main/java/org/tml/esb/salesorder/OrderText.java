package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderText {
	

	@XmlElement(name = "DocNumber")
	private String docNumber;
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
    @XmlElement(name = "TextId")
    private String textId;
    @XmlElement(name = "Langu")
    private String langu;
    @XmlElement(name = "LanguIso")
    private String languISO;
    @XmlElement(name = "FormatCol")
    private String formatCol;
    @XmlElement(name = "TextLine")
    private String textLine;
    @XmlElement(name = "Function")
    private String function;
    
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
	public String getTextId() {
		return textId;
	}
	public void setTextId(String textId) {
		this.textId = textId;
	}
	public String getLangu() {
		return langu;
	}
	public void setLangu(String langu) {
		this.langu = langu;
	}
	public String getLanguISO() {
		return languISO;
	}
	public void setLanguISO(String languISO) {
		this.languISO = languISO;
	}
	public String getFormatCol() {
		return formatCol;
	}
	public void setFormatCol(String formatCol) {
		this.formatCol = formatCol;
	}
	public String getTextLine() {
		return textLine;
	}
	public void setTextLine(String textLine) {
		this.textLine = textLine;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

}
