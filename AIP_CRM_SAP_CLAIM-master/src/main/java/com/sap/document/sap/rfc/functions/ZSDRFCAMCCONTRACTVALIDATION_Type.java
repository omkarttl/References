
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
 *         &lt;element name="CHASSIS_NO" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="CHASSIS_PL" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="CONTRACT_NO" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CRM_SALE_DATE" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="IT_AMC" type="{urn:sap-com:document:sap:rfc:functions}TABLE_OF_ZSD_AMC_LINE_ITEM"/&gt;
 *         &lt;element name="KMS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "chassisno",
    "chassispl",
    "contractno",
    "crmsaledate",
    "itamc",
    "kms"
})
@XmlRootElement(name = "ZSDRFC_AMC_CONTRACT_VALIDATION")
public class ZSDRFCAMCCONTRACTVALIDATION_Type {

    @XmlElement(name = "CHASSIS_NO", required = true)
    protected String chassisno;
    @XmlElement(name = "CHASSIS_PL", required = true)
    protected String chassispl;
    @XmlElement(name = "CONTRACT_NO", required = true)
    protected String contractno;
    @XmlElement(name = "CRM_SALE_DATE", required = true)
    protected String crmsaledate;
    @XmlElement(name = "IT_AMC", required = true)
    protected TABLEOFZSDAMCLINEITEM itamc;
    @XmlElement(name = "KMS")
    protected int kms;

    /**
     * Gets the value of the chassisno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHASSISNO() {
        return chassisno;
    }

    /**
     * Sets the value of the chassisno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHASSISNO(String value) {
        this.chassisno = value;
    }

    /**
     * Gets the value of the chassispl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHASSISPL() {
        return chassispl;
    }

    /**
     * Sets the value of the chassispl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHASSISPL(String value) {
        this.chassispl = value;
    }

    /**
     * Gets the value of the contractno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTNO() {
        return contractno;
    }

    /**
     * Sets the value of the contractno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTNO(String value) {
        this.contractno = value;
    }

    /**
     * Gets the value of the crmsaledate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMSALEDATE() {
        return crmsaledate;
    }

    /**
     * Sets the value of the crmsaledate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMSALEDATE(String value) {
        this.crmsaledate = value;
    }

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
     * Gets the value of the kms property.
     * 
     */
    public int getKMS() {
        return kms;
    }

    /**
     * Sets the value of the kms property.
     * 
     */
    public void setKMS(int value) {
        this.kms = value;
    }

}
