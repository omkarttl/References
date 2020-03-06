package org.tml.esb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModel {

	@JsonProperty("invoiceType")
	private String invoiceType;
	@JsonProperty("invoiceNo")
	private String invoiceNo;
	@JsonProperty("invoiceDate")
	private String invoiceDate;
	@JsonProperty("invoiceEndDate")
	private String invoiceEndDate;
	@JsonProperty("invoiceMonth")
	private String invoiceMonth;
	@JsonProperty("invoiceYear")
	private String invoiceYear;
	@JsonProperty("status")
	private String status;
	@JsonProperty("divisionCode")
	private String divisionCode;
	@JsonProperty("salesOrder")
	private String salesOrder;
	@JsonProperty("chassisNo")
	private String chassisNo;

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

}
