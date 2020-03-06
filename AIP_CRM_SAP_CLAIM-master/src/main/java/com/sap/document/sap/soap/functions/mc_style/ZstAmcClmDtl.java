
package com.sap.document.sap.soap.functions.mc_style;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZstAmcClmDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZstAmcClmDtl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mandt" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="ClaimNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Mjahr" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="ItemInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ItemCode" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="ItemQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="MatCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Qty" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Discount" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Rate" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Zamount" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="RejReason" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Message" type="{urn:sap-com:document:sap:rfc:functions}char80"/&gt;
 *         &lt;element name="RejComment" type="{urn:sap-com:document:sap:rfc:functions}char180"/&gt;
 *         &lt;element name="LabourAmtCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="MaterialAmtCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="LubChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="SplChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="TotalChargeCrm" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="HsnSac" type="{urn:sap-com:document:sap:soap:functions:mc-style}char16"/&gt;
 *         &lt;element name="JoigRate" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr11.2"/&gt;
 *         &lt;element name="JoigVal" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr13.2"/&gt;
 *         &lt;element name="JocgRate" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr11.2"/&gt;
 *         &lt;element name="JocgVal" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr13.2"/&gt;
 *         &lt;element name="JosgRate" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr11.2"/&gt;
 *         &lt;element name="JosgVal" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr13.2"/&gt;
 *         &lt;element name="JougRate" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr11.2"/&gt;
 *         &lt;element name="JougVal" type="{urn:sap-com:document:sap:soap:functions:mc-style}curr13.2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZstAmcClmDtl", propOrder = {
    "mandt",
    "claimNo",
    "item",
    "mjahr",
    "itemInd",
    "itemCode",
    "itemQty",
    "itemUnit",
    "matCat",
    "qty",
    "discount",
    "rate",
    "zamount",
    "status",
    "rejReason",
    "message",
    "rejComment",
    "labourAmtCrm",
    "materialAmtCrm",
    "lubChargeCrm",
    "splChargeCrm",
    "totalChargeCrm",
    "hsnSac",
    "joigRate",
    "joigVal",
    "jocgRate",
    "jocgVal",
    "josgRate",
    "josgVal",
    "jougRate",
    "jougVal"
})
public class ZstAmcClmDtl {

    @XmlElement(name = "Mandt", required = true)
    protected String mandt;
    @XmlElement(name = "ClaimNo", required = true)
    protected String claimNo;
    @XmlElement(name = "Item")
    protected short item;
    @XmlElement(name = "Mjahr", required = true)
    protected String mjahr;
    @XmlElement(name = "ItemInd", required = true)
    protected String itemInd;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlElement(name = "ItemQty")
    protected int itemQty;
    @XmlElement(name = "ItemUnit", required = true)
    protected String itemUnit;
    @XmlElement(name = "MatCat", required = true)
    protected String matCat;
    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Zamount", required = true)
    protected BigDecimal zamount;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "RejReason", required = true)
    protected String rejReason;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "RejComment", required = true)
    protected String rejComment;
    @XmlElement(name = "LabourAmtCrm", required = true)
    protected BigDecimal labourAmtCrm;
    @XmlElement(name = "MaterialAmtCrm", required = true)
    protected BigDecimal materialAmtCrm;
    @XmlElement(name = "LubChargeCrm", required = true)
    protected BigDecimal lubChargeCrm;
    @XmlElement(name = "SplChargeCrm", required = true)
    protected BigDecimal splChargeCrm;
    @XmlElement(name = "TotalChargeCrm", required = true)
    protected BigDecimal totalChargeCrm;
    @XmlElement(name = "HsnSac", required = true)
    protected String hsnSac;
    @XmlElement(name = "JoigRate", required = true)
    protected BigDecimal joigRate;
    @XmlElement(name = "JoigVal", required = true)
    protected BigDecimal joigVal;
    @XmlElement(name = "JocgRate", required = true)
    protected BigDecimal jocgRate;
    @XmlElement(name = "JocgVal", required = true)
    protected BigDecimal jocgVal;
    @XmlElement(name = "JosgRate", required = true)
    protected BigDecimal josgRate;
    @XmlElement(name = "JosgVal", required = true)
    protected BigDecimal josgVal;
    @XmlElement(name = "JougRate", required = true)
    protected BigDecimal jougRate;
    @XmlElement(name = "JougVal", required = true)
    protected BigDecimal jougVal;

    /**
     * Gets the value of the mandt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * Sets the value of the mandt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandt(String value) {
        this.mandt = value;
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
     * Gets the value of the item property.
     * 
     */
    public short getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     */
    public void setItem(short value) {
        this.item = value;
    }

    /**
     * Gets the value of the mjahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjahr() {
        return mjahr;
    }

    /**
     * Sets the value of the mjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjahr(String value) {
        this.mjahr = value;
    }

    /**
     * Gets the value of the itemInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemInd() {
        return itemInd;
    }

    /**
     * Sets the value of the itemInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemInd(String value) {
        this.itemInd = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemQty property.
     * 
     */
    public int getItemQty() {
        return itemQty;
    }

    /**
     * Sets the value of the itemQty property.
     * 
     */
    public void setItemQty(int value) {
        this.itemQty = value;
    }

    /**
     * Gets the value of the itemUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnit() {
        return itemUnit;
    }

    /**
     * Sets the value of the itemUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnit(String value) {
        this.itemUnit = value;
    }

    /**
     * Gets the value of the matCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatCat() {
        return matCat;
    }

    /**
     * Sets the value of the matCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatCat(String value) {
        this.matCat = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the zamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZamount() {
        return zamount;
    }

    /**
     * Sets the value of the zamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZamount(BigDecimal value) {
        this.zamount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rejReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejReason() {
        return rejReason;
    }

    /**
     * Sets the value of the rejReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejReason(String value) {
        this.rejReason = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the rejComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejComment() {
        return rejComment;
    }

    /**
     * Sets the value of the rejComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejComment(String value) {
        this.rejComment = value;
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
     * Gets the value of the hsnSac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsnSac() {
        return hsnSac;
    }

    /**
     * Sets the value of the hsnSac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsnSac(String value) {
        this.hsnSac = value;
    }

    /**
     * Gets the value of the joigRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJoigRate() {
        return joigRate;
    }

    /**
     * Sets the value of the joigRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJoigRate(BigDecimal value) {
        this.joigRate = value;
    }

    /**
     * Gets the value of the joigVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJoigVal() {
        return joigVal;
    }

    /**
     * Sets the value of the joigVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJoigVal(BigDecimal value) {
        this.joigVal = value;
    }

    /**
     * Gets the value of the jocgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJocgRate() {
        return jocgRate;
    }

    /**
     * Sets the value of the jocgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJocgRate(BigDecimal value) {
        this.jocgRate = value;
    }

    /**
     * Gets the value of the jocgVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJocgVal() {
        return jocgVal;
    }

    /**
     * Sets the value of the jocgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJocgVal(BigDecimal value) {
        this.jocgVal = value;
    }

    /**
     * Gets the value of the josgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJosgRate() {
        return josgRate;
    }

    /**
     * Sets the value of the josgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJosgRate(BigDecimal value) {
        this.josgRate = value;
    }

    /**
     * Gets the value of the josgVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJosgVal() {
        return josgVal;
    }

    /**
     * Sets the value of the josgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJosgVal(BigDecimal value) {
        this.josgVal = value;
    }

    /**
     * Gets the value of the jougRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJougRate() {
        return jougRate;
    }

    /**
     * Sets the value of the jougRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJougRate(BigDecimal value) {
        this.jougRate = value;
    }

    /**
     * Gets the value of the jougVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJougVal() {
        return jougVal;
    }

    /**
     * Sets the value of the jougVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJougVal(BigDecimal value) {
        this.jougVal = value;
    }

}
