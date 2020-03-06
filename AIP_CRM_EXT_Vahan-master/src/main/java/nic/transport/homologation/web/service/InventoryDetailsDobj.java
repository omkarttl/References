
package nic.transport.homologation.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inventoryDetailsDobj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventoryDetailsDobj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chassisNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="featureCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monthYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unique_model_ref_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryDetailsDobj", propOrder = {
    "chassisNo",
    "colorCode",
    "dealerCode",
    "engineNo",
    "featureCode",
    "monthYear",
    "uniqueModelRefNo"
})
public class InventoryDetailsDobj {

    @XmlElement(required = true)
    protected String chassisNo;
    @XmlElement(required = true)
    protected String colorCode;
    @XmlElement(required = true)
    protected String dealerCode;
    @XmlElement(required = true)
    protected String engineNo;
    @XmlElement(required = true)
    protected String featureCode;
    @XmlElement(required = true)
    protected String monthYear;
    @XmlElement(name = "unique_model_ref_no", required = true)
    protected String uniqueModelRefNo;

    /**
     * Gets the value of the chassisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNo() {
        return chassisNo;
    }

    /**
     * Sets the value of the chassisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNo(String value) {
        this.chassisNo = value;
    }

    /**
     * Gets the value of the colorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Sets the value of the colorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
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
     * Gets the value of the engineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * Sets the value of the engineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNo(String value) {
        this.engineNo = value;
    }

    /**
     * Gets the value of the featureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCode() {
        return featureCode;
    }

    /**
     * Sets the value of the featureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    /**
     * Gets the value of the monthYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthYear() {
        return monthYear;
    }

    /**
     * Sets the value of the monthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthYear(String value) {
        this.monthYear = value;
    }

    /**
     * Gets the value of the uniqueModelRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueModelRefNo() {
        return uniqueModelRefNo;
    }

    /**
     * Sets the value of the uniqueModelRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueModelRefNo(String value) {
        this.uniqueModelRefNo = value;
    }

}
