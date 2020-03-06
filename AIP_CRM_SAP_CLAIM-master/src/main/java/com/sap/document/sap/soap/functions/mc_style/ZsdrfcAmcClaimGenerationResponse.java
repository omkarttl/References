
package com.sap.document.sap.soap.functions.mc_style;

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
 *         &lt;element name="ClaimItem" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZstAmcClmDtl"/&gt;
 *         &lt;element name="ClaimNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiret2"/&gt;
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
    "claimItem",
    "claimNo",
    "_return"
})
@XmlRootElement(name = "ZsdrfcAmcClaimGenerationResponse")
public class ZsdrfcAmcClaimGenerationResponse {

    @XmlElement(name = "ClaimItem", required = true)
    protected TableOfZstAmcClmDtl claimItem;
    @XmlElement(name = "ClaimNo", required = true)
    protected String claimNo;
    @XmlElement(name = "Return", required = true)
    protected TableOfBapiret2 _return;

    /**
     * Gets the value of the claimItem property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZstAmcClmDtl }
     *     
     */
    public TableOfZstAmcClmDtl getClaimItem() {
        return claimItem;
    }

    /**
     * Sets the value of the claimItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZstAmcClmDtl }
     *     
     */
    public void setClaimItem(TableOfZstAmcClmDtl value) {
        this.claimItem = value;
    }

    /**
     * Gets the value of the claimNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNo() {
        return claimNo;
    }

    /**
     * Sets the value of the claimNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNo(String value) {
        this.claimNo = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public TableOfBapiret2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public void setReturn(TableOfBapiret2 value) {
        this._return = value;
    }

}
