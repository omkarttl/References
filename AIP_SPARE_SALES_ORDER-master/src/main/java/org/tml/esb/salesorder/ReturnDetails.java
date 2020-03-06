package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReturnDetails {

	@XmlElement(name="Type")
    private String type;
	@XmlElement(name="Id")
    private String id;
	@XmlElement(name="Number")
    private String number;
	@XmlElement(name="Message")
    private String message;
	@XmlElement(name="LogNo")
    private String logNo;
	@XmlElement(name="LogMsgNo")
    private String logMsgNo;
	@XmlElement(name="MessageV1")
    private String messageV1;
	@XmlElement(name="MessageV2")
    private String messageV2;
	@XmlElement(name="MessageV3")
    private String messageV3;
	@XmlElement(name="MessageV4")
    private String messageV4;
	@XmlElement(name="Parameter")
    private String parameter;
	@XmlElement(name="Row")
    private int row;
	@XmlElement(name="Field")
    private String field;
	@XmlElement(name="System")
    private String system;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLogNo() {
		return logNo;
	}
	public void setLogNo(String logNo) {
		this.logNo = logNo;
	}
	public String getLogMsgNo() {
		return logMsgNo;
	}
	public void setLogMsgNo(String logMsgNo) {
		this.logMsgNo = logMsgNo;
	}
	public String getMessageV1() {
		return messageV1;
	}
	public void setMessageV1(String messageV1) {
		this.messageV1 = messageV1;
	}
	public String getMessageV2() {
		return messageV2;
	}
	public void setMessageV2(String messageV2) {
		this.messageV2 = messageV2;
	}
	public String getMessageV3() {
		return messageV3;
	}
	public void setMessageV3(String messageV3) {
		this.messageV3 = messageV3;
	}
	public String getMessageV4() {
		return messageV4;
	}
	public void setMessageV4(String messageV4) {
		this.messageV4 = messageV4;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
    

}
