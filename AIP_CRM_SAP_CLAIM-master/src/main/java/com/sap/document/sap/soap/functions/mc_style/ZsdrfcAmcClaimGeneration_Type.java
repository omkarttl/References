
package com.sap.document.sap.soap.functions.mc_style;

import java.math.BigDecimal;
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
 *         &lt;element name="ChassiNo" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="ChassisPl" type="{urn:sap-com:document:sap:soap:functions:mc-style}char60"/&gt;
 *         &lt;element name="ClaimItem" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZstAmcClmDtl"/&gt;
 *         &lt;element name="ClaimType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ContractAndItem" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="ContractNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CrmClaimNo" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="CrmSaleDate" type="{urn:sap-com:document:sap:soap:functions:mc-style}date10"/&gt;
 *         &lt;element name="DealerCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="JobCardDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="JobCardNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="JobClosDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="JobClosDateI" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="KmRead" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LabourAmtCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="LubChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="MaterialAmtCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiret2"/&gt;
 *         &lt;element name="SaveData" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SplChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="TotalChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="ZauthNo" type="{urn:sap-com:document:sap:soap:functions:mc-style}char64" minOccurs="0"/&gt;
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
    "chassiNo",
    "chassisPl",
    "claimItem",
    "claimType",
    "contractAndItem",
    "contractNo",
    "crmClaimNo",
    "crmSaleDate",
    "dealerCode",
    "jobCardDate",
    "jobCardNo",
    "jobClosDate",
    "jobClosDateI",
    "kmRead",
    "labourAmtCrm",
    "lubChargeCrm",
    "materialAmtCrm",
    "_return",
    "saveData",
    "splChargeCrm",
    "totalChargeCrm",
    "zauthNo"
})
@XmlRootElement(name = "ZsdrfcAmcClaimGeneration")
public class ZsdrfcAmcClaimGeneration_Type {

    @XmlElement(name = "ChassiNo", required = true)
    protected String chassiNo;
    @XmlElement(name = "ChassisPl", required = true)
    protected String chassisPl;
    @XmlElement(name = "ClaimItem", required = true)
    protected TableOfZstAmcClmDtl claimItem;
    @XmlElement(name = "ClaimType", required = true)
    protected String claimType;
    @XmlElement(name = "ContractAndItem", required = true)
    protected String contractAndItem;
    @XmlElement(name = "ContractNo", required = true)
    protected String contractNo;
    @XmlElement(name = "CrmClaimNo", required = true)
    protected String crmClaimNo;
    @XmlElement(name = "CrmSaleDate", required = true)
    protected String crmSaleDate;
    @XmlElement(name = "DealerCode", required = true)
    protected String dealerCode;
    @XmlElement(name = "JobCardDate", required = true)
    protected String jobCardDate;
    @XmlElement(name = "JobCardNo", required = true)
    protected String jobCardNo;
    @XmlElement(name = "JobClosDate", required = true)
    protected String jobClosDate;
    @XmlElement(name = "JobClosDateI", required = true)
    protected String jobClosDateI;
    @XmlElement(name = "KmRead")
    protected int kmRead;
    @XmlElement(name = "LabourAmtCrm", required = true)
    protected BigDecimal labourAmtCrm;
    @XmlElement(name = "LubChargeCrm", required = true)
    protected BigDecimal lubChargeCrm;
    @XmlElement(name = "MaterialAmtCrm", required = true)
    protected BigDecimal materialAmtCrm;
    @XmlElement(name = "Return", required = true)
    protected TableOfBapiret2 _return;
    @XmlElement(name = "SaveData", required = true)
    protected String saveData;
    @XmlElement(name = "SplChargeCrm", required = true)
    protected BigDecimal splChargeCrm;
    @XmlElement(name = "TotalChargeCrm", required = true)
    protected BigDecimal totalChargeCrm;
    @XmlElement(name = "ZauthNo")
    protected String zauthNo;

    /**
     * Gets the value of the chassiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassiNo() {
        return chassiNo;
    }

    /**
     * Sets the value of the chassiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassiNo(String value) {
        this.chassiNo = value;
    }

    /**
     * Gets the value of the chassisPl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisPl() {
        return chassisPl;
    }

    /**
     * Sets the value of the chassisPl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisPl(String value) {
        this.chassisPl = value;
    }

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
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the contractAndItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractAndItem() {
        return contractAndItem;
    }

    /**
     * Sets the value of the contractAndItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractAndItem(String value) {
        this.contractAndItem = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the crmClaimNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmClaimNo() {
        return crmClaimNo;
    }

    /**
     * Sets the value of the crmClaimNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmClaimNo(String value) {
        this.crmClaimNo = value;
    }

    /**
     * Gets the value of the crmSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmSaleDate() {
        return crmSaleDate;
    }

    /**
     * Sets the value of the crmSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmSaleDate(String value) {
        this.crmSaleDate = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the jobCardDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCardDate() {
        return jobCardDate;
    }

    /**
     * Sets the value of the jobCardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCardDate(String value) {
        this.jobCardDate = value;
    }

    /**
     * Gets the value of the jobCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCardNo() {
        return jobCardNo;
    }

    /**
     * Sets the value of the jobCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCardNo(String value) {
        this.jobCardNo = value;
    }

    /**
     * Gets the value of the jobClosDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClosDate() {
        return jobClosDate;
    }

    /**
     * Sets the value of the jobClosDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClosDate(String value) {
        this.jobClosDate = value;
    }

    /**
     * Gets the value of the jobClosDateI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClosDateI() {
        return jobClosDateI;
    }

    /**
     * Sets the value of the jobClosDateI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClosDateI(String value) {
        this.jobClosDateI = value;
    }

    /**
     * Gets the value of the kmRead property.
     * 
     */
    public int getKmRead() {
        return kmRead;
    }

    /**
     * Sets the value of the kmRead property.
     * 
     */
    public void setKmRead(int value) {
        this.kmRead = value;
    }

    /**
     * Gets the value of the labourAmtCrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLabourAmtCrm() {
        return labourAmtCrm;
    }

    /**
     * Sets the value of the labourAmtCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLabourAmtCrm(BigDecimal value) {
        this.labourAmtCrm = value;
    }

    /**
     * Gets the value of the lubChargeCrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLubChargeCrm() {
        return lubChargeCrm;
    }

    /**
     * Sets the value of the lubChargeCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLubChargeCrm(BigDecimal value) {
        this.lubChargeCrm = value;
    }

    /**
     * Gets the value of the materialAmtCrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialAmtCrm() {
        return materialAmtCrm;
    }

    /**
     * Sets the value of the materialAmtCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialAmtCrm(BigDecimal value) {
        this.materialAmtCrm = value;
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

    /**
     * Gets the value of the saveData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveData() {
        return saveData;
    }

    /**
     * Sets the value of the saveData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveData(String value) {
        this.saveData = value;
    }

    /**
     * Gets the value of the splChargeCrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSplChargeCrm() {
        return splChargeCrm;
    }

    /**
     * Sets the value of the splChargeCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSplChargeCrm(BigDecimal value) {
        this.splChargeCrm = value;
    }

    /**
     * Gets the value of the totalChargeCrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalChargeCrm() {
        return totalChargeCrm;
    }

    /**
     * Sets the value of the totalChargeCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalChargeCrm(BigDecimal value) {
        this.totalChargeCrm = value;
    }

    /**
     * Gets the value of the zauthNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZauthNo() {
        return zauthNo;
    }

    /**
     * Sets the value of the zauthNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZauthNo(String value) {
        this.zauthNo = value;
    }

}
