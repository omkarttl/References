package org.tml.esb.salesorder;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )

public class SAPResponse {
	
		@XmlElement(name = "Extensionin")
		private List<ExtensionIn> extensionIn;
		@XmlElement(name = "OrderCcard")
		private List<OrderCcard> orderCcard;
		@XmlElement(name = "OrderCfgsBlob")
		private List<OrderCfgsBlob> cfgBlob;
		@XmlElement(name = "OrderCfgsInst")
		private List<OrderCfgsInst> cfgInst;
		@XmlElement(name = "OrderCfgsPartOf")
		private List<OrderCfgsPartOf> cfgPartOf;
		@XmlElement(name = "OrderCfgsRef")
		private List<OrderCfgsRef> cfgsRef;
		@XmlElement(name = "OrderCfgsRefinst")
		private List<OrderCfgsRefInst> cfgsRefinst;
		@XmlElement(name = "OrderCfgsValue")
		private List<OrderCfgsValue> cfgsValue;
		@XmlElement(name = "OrderCfgsVk")
		private List<OrderCfgsVk> cfgsVk;
		@XmlElement(name = "OrderConditionsIn")
		private List<OrderConditionsIn> conditionsIn;
		@XmlElement(name = "OrderConditionsInx")
		private List<OrderConditionsInx> conditionsInx;
		@XmlElement(name = "OrderItemsIn")
		private List<OrderItemsIn> itemsIn;
		@XmlElement(name = "OrderItemsInx")
		private List<OrderItemsInx> itemsInx;
		@XmlElement(name = "OrderKeys")
		private List<OrderKeys> keys;
		@XmlElement(name="OrderPartners")
		private List<OrderPartners> partners;
		@XmlElement(name = "OrderSchedulesIn")
		private List<OrderSchedulesIn> schedulesIn;
		@XmlElement(name = "OrderSchedulesInx")
		private List<OrderSchedulesInx> schedulesInx;
		@XmlElement(name = "OrderText")
		private List<OrderText> orderText;
		@XmlElement(name = "Partneraddresses")
		private List<PartnerAddresses> partnerAddresses;
		@XmlElement(name = "Return")
		private List<ReturnDetails> returnDetails;
		@XmlElement(name = "Salesdocument")
		private String salesDocuments;
		public List<ExtensionIn> getExtensionIn() {
			return extensionIn;
		}
		public void setExtensionIn(List<ExtensionIn> extensionIn) {
			this.extensionIn = extensionIn;
		}
		public List<OrderCcard> getOrderCcard() {
			return orderCcard;
		}
		public void setOrderCcard(List<OrderCcard> orderCcard) {
			this.orderCcard = orderCcard;
		}
		public List<OrderCfgsBlob> getCfgBlob() {
			return cfgBlob;
		}
		public void setCfgBlob(List<OrderCfgsBlob> cfgBlob) {
			this.cfgBlob = cfgBlob;
		}
		public List<OrderCfgsInst> getCfgInst() {
			return cfgInst;
		}
		public void setCfgInst(List<OrderCfgsInst> cfgInst) {
			this.cfgInst = cfgInst;
		}
		public List<OrderCfgsPartOf> getCfgPartOf() {
			return cfgPartOf;
		}
		public void setCfgPartOf(List<OrderCfgsPartOf> cfgPartOf) {
			this.cfgPartOf = cfgPartOf;
		}
		public List<OrderCfgsRef> getCfgsRef() {
			return cfgsRef;
		}
		public void setCfgsRef(List<OrderCfgsRef> cfgsRef) {
			this.cfgsRef = cfgsRef;
		}
		public List<OrderCfgsRefInst> getCfgsRefinst() {
			return cfgsRefinst;
		}
		public void setCfgsRefinst(List<OrderCfgsRefInst> cfgsRefinst) {
			this.cfgsRefinst = cfgsRefinst;
		}
		public List<OrderCfgsValue> getCfgsValue() {
			return cfgsValue;
		}
		public void setCfgsValue(List<OrderCfgsValue> cfgsValue) {
			this.cfgsValue = cfgsValue;
		}
		public List<OrderCfgsVk> getCfgsVk() {
			return cfgsVk;
		}
		public void setCfgsVk(List<OrderCfgsVk> cfgsVk) {
			this.cfgsVk = cfgsVk;
		}
		public List<OrderConditionsIn> getConditionsIn() {
			return conditionsIn;
		}
		public void setConditionsIn(List<OrderConditionsIn> conditionsIn) {
			this.conditionsIn = conditionsIn;
		}
		public List<OrderConditionsInx> getConditionsInx() {
			return conditionsInx;
		}
		public void setConditionsInx(List<OrderConditionsInx> conditionsInx) {
			this.conditionsInx = conditionsInx;
		}
		public List<OrderItemsIn> getItemsIn() {
			return itemsIn;
		}
		public void setItemsIn(List<OrderItemsIn> itemsIn) {
			this.itemsIn = itemsIn;
		}
		public List<OrderItemsInx> getItemsInx() {
			return itemsInx;
		}
		public void setItemsInx(List<OrderItemsInx> itemsInx) {
			this.itemsInx = itemsInx;
		}
		public List<OrderKeys> getKeys() {
			return keys;
		}
		public void setKeys(List<OrderKeys> keys) {
			this.keys = keys;
		}
		public List<OrderPartners> getPartners() {
			return partners;
		}
		public void setPartners(List<OrderPartners> partners) {
			this.partners = partners;
		}
		public List<OrderSchedulesIn> getSchedulesIn() {
			return schedulesIn;
		}
		public void setSchedulesIn(List<OrderSchedulesIn> schedulesIn) {
			this.schedulesIn = schedulesIn;
		}
		public List<OrderSchedulesInx> getSchedulesInx() {
			return schedulesInx;
		}
		public void setSchedulesInx(List<OrderSchedulesInx> schedulesInx) {
			this.schedulesInx = schedulesInx;
		}
		public List<OrderText> getOrderText() {
			return orderText;
		}
		public void setOrderText(List<OrderText> orderText) {
			this.orderText = orderText;
		}
		public List<PartnerAddresses> getPartnerAddresses() {
			return partnerAddresses;
		}
		public void setPartnerAddresses(List<PartnerAddresses> partnerAddresses) {
			this.partnerAddresses = partnerAddresses;
		}
		public List<ReturnDetails> getReturnDetails() {
			return returnDetails;
		}
		public void setReturnDetails(List<ReturnDetails> returnDetails) {
			this.returnDetails = returnDetails;
		}
		public String getSalesDocuments() {
			return salesDocuments;
		}
		public void setSalesDocuments(String salesDocuments) {
			this.salesDocuments = salesDocuments;
		}
	
	
}
