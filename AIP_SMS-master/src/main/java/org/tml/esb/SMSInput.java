package org.tml.esb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insert", propOrder = {"phoneNumber", "ruleName", "messageText" })
public class SMSInput
{
    @XmlElement(required = true)
    private String phoneNumber;
    @XmlElement(required = true)
    private String ruleName;
    @XmlElement(required = true)
    private String messageText;    
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getRuleName() {
        return this.ruleName;
    }
    
    public void setRuleName(final String ruleName) {
        this.ruleName = ruleName;
    }
    
    public String getMessageText() {
        return this.messageText;
    }
    
    public void setMessageText(final String messageText) {
        this.messageText = messageText;
    }
}
