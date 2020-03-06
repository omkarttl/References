
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IT_AMC" type="{urn:sap-com:document:sap:rfc:functions}TABLE_OF_ZSD_AMC_LINE_ITEM"/&gt;
 *         &lt;element name="REMARKS" type="{urn:sap-com:document:sap:rfc:functions}char100"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itamc",
    "remarks"
})
@XmlRootElement(name = "ZSDRFC_AMC_CONTRACT_VALIDATIONResponse")
public class ZSDRFCAMCCONTRACTVALIDATIONResponse {

    @XmlElement(name = "IT_AMC", required = true)
    protected TABLEOFZSDAMCLINEITEM itamc;
    @XmlElement(name = "REMARKS", required = true)
    protected String remarks;

    /**
     * Gets the value of the itamc property.
     * 
     * @return
     *     possible object is
     *     {@link TABLEOFZSDAMCLINEITEM }
     *     
     */
    public TABLEOFZSDAMCLINEITEM getITAMC() {
        return itamc;
    }

    /**
     * Sets the value of the itamc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TABLEOFZSDAMCLINEITEM }
     *     
     */
    public void setITAMC(TABLEOFZSDAMCLINEITEM value) {
        this.itamc = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

}
