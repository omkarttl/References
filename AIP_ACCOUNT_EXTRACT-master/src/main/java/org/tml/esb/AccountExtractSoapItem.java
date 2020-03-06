package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", namespace = "https://tatamotors.com/api/1.0", propOrder = { "divisionCode", "invoiceType",
		"invoiceNo", "salesOrder", "status", "chassisNo", "invoiceDate", "invoiceEndDate", "invoiceMonth",
		"invoiceYear" })

@JsonIgnoreProperties(ignoreUnknown = true)

public class AccountExtractSoapItem {

	@XmlElement(name = "Division_Code")
	private String divisionCode;
	@XmlElement(name = "Invoice_Type")
	private String invoiceType;
	@XmlElement(name = "Invoice_No")
	private String invoiceNo;
	@XmlElement(name = "Salesorder")
	private String salesOrder;
	@XmlElement(name = "Status")
	private String status;
	@XmlElement(name = "Chassis_No")
	private String chassisNo;
	@XmlElement(name = "Invoice_Date")
	private String invoiceDate;
	@XmlElement(name = "Invoice_End_Date")
	private String invoiceEndDate;
	@XmlElement(name = "Invoice_Month")
	private String invoiceMonth;
	@XmlElement(name = "Invoice_Year")
	private String invoiceYear;

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceEndDate() {
		return invoiceEndDate;
	}

	public void setInvoiceEndDate(String invoiceEndDate) {
		this.invoiceEndDate = invoiceEndDate;
	}

	public String getInvoiceMonth() {
		return invoiceMonth;
	}

	public void setInvoiceMonth(String invoiceMonth) {
		this.invoiceMonth = invoiceMonth;
	}

	public String getInvoiceYear() {
		return invoiceYear;
	}

	public void setInvoiceYear(String invoiceYear) {
		this.invoiceYear = invoiceYear;
	}

}
