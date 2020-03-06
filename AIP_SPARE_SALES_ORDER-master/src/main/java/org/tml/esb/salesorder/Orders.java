package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Orders")
public class Orders {
	
	@XmlElement(name="Id")
	private String orderId;
	@XmlElement(name="IntegrationId")
	private String integrationId;
	@XmlElement(name="Status")
	private String status;
	@XmlElement(name="RequestedDate")
	private String requestedDate;
	@XmlElement(name="StatusAsOfDate")
	private String statusAsOfDate;
	@XmlElement(name="IntegrationStatusAsOfDate")
	private String integrationStatusAsOfDate;
	@XmlElement(name="IntegrationMessage")
	private String integrationMessage;
	
	public String getIntegrationId() {
		return integrationId;
	}
	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}
	public String getStatusAsOfDate() {
		return statusAsOfDate;
	}
	public void setStatusAsOfDate(String statusAsOfDate) {
		this.statusAsOfDate = statusAsOfDate;
	}
	public String getIntegrationStatusAsOfDate() {
		return integrationStatusAsOfDate;
	}
	public void setIntegrationStatusAsOfDate(String integrationStatusAsOfDate) {
		this.integrationStatusAsOfDate = integrationStatusAsOfDate;
	}
	public String getIntegrationMessage() {
		return integrationMessage;
	}
	public void setIntegrationMessage(String integrationMessage) {
		this.integrationMessage = integrationMessage;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	
	
}
