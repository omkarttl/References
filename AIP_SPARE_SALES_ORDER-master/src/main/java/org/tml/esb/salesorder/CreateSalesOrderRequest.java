package org.tml.esb.salesorder;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZsdrfcCreateSalesOrder", propOrder = {
		"businessUnit",
		"orderReason",
		"requestedDate",
		"orderId",
	    "extensionIn",
	    "logicSwitch",
	    "orderCcard",
	    "cfgBlob",
	    "cfgInst",
	    "cfgPartOf",
	    "cfgsRef",
	    "cfgsRefinst",
	    "cfgsValue",
	    "cfgsVk",
	    "conditionsIn",
	    "conditionsInx",
	    "headerIn",
	    "headerInx",
	    "itemsIn",
	    "itemsInx",
	    "keys",
	    "partners",
	    "schedulesIn",
	    "schedulesInx",
	    "orderText",
	    "partnerAddresses",
	    "returnDetails",
	    "salesDocuments",
	    "behaveWhenError",
	    "binaryRelationshipType",
	    "convert",
	    "intNumberAssignment",
	    "sender",
	    "testRun"
	})
public class CreateSalesOrderRequest {
	@XmlElement(required = true, name="BU")
	private String businessUnit;
	@XmlElement(required=true,name="OrderReason")
	private String orderReason;
	@XmlElement(required=true,name="ReqDate")
	private String requestedDate;
	@XmlElement(required=true,name="OrderId")
	private String orderId;
		@XmlElement(name = "Extensionin")
		private TableOfExtensionIn extensionIn;
		@XmlElement(name = "LogicSwitch")
		private LogicSwitch logicSwitch;
		@XmlElement(name = "OrderCcard")
		private TableOfOrderCcard orderCcard;
		@XmlElement(name = "OrderCfgsBlob")
		private TableOfOrderCfgsBlob cfgBlob;
		@XmlElement(name = "OrderCfgsInst")
		private TableOfOrderCfgsInst cfgInst;
		@XmlElement(name = "OrderCfgsPartOf")
		private TableOfOrderCfgsPartOf cfgPartOf;
		@XmlElement(name = "OrderCfgsRef")
		private TableOfOrderCfgsRef cfgsRef;
		@XmlElement(name = "OrderCfgsRefinst")
		private TableOfOrderCfgsRefInst cfgsRefinst;
		@XmlElement(name = "OrderCfgsValue")
		private TableOfOrderCfgsValue cfgsValue;
		@XmlElement(name = "OrderCfgsVk")
		private TableOfOrderCfgsVk cfgsVk;
		@XmlElement(name = "OrderConditionsIn")
		private TableOfOrderConditionsIn conditionsIn;
		@XmlElement(name = "OrderConditionsInx")
		private TableOfOrderConditionsInx conditionsInx;
		@XmlElement(required = true, name="OrderHeaderIn")
		private OrderHeaderIn headerIn;
		@XmlElement(name = "OrderHeaderInx")
		private OrderHeaderInx headerInx;
		@XmlElement(name = "OrderItemsIn")
		private TableOfOrderItemsIn itemsIn;
		@XmlElement(name = "OrderItemsInx")
		private TableOfOrderItemsInx itemsInx;
		@XmlElement(name = "OrderKeys")
		private TableOfOrderKeys keys;
		@XmlElement(required = true, name="OrderPartners")
		private TableOfOrderPartners partners;
		@XmlElement(name = "OrderSchedulesIn")
		private TableOfOrderSchedulesIn schedulesIn;
		@XmlElement(name = "OrderSchedulesInx")
		private TableOfOrderSchedulesInx schedulesInx;
		@XmlElement(name = "OrderText")
		private TableOfOrderText orderText;
		@XmlElement(name = "Partneraddresses")
		private TableOfPartnerAddresses partnerAddresses;
		@XmlElement(name = "Return")
		private TableOfReturnDetails returnDetails;
		@XmlElement(name = "Salesdocumentin")
		private String salesDocuments;
		@XmlElement(name = "BehaveWhenError")
		private String behaveWhenError;
		@XmlElement(name = "BinaryRelationshiptype")
		private String binaryRelationshipType;
		@XmlElement(name = "Convert")
		private String convert;
		@XmlElement(name = "IntNumberAssignment")
		private String intNumberAssignment;
		@XmlElement(name = "Sender")
		private Sender sender;
		@XmlElement(name = "Testrun")
		private String testRun;
		
	
	public TableOfExtensionIn getExtensionIn() {
		return extensionIn;
	}
	public void setExtensionIn(TableOfExtensionIn extensionIn) {
		this.extensionIn = extensionIn;
	}
	public LogicSwitch getLogicSwitch() {
		return logicSwitch;
	}
	public void setLogicSwitch(LogicSwitch logicSwitch) {
		this.logicSwitch = logicSwitch;
	}
	public TableOfOrderCfgsBlob getCfgBlob() {
		return cfgBlob;
	}
	public void setCfgBlob(TableOfOrderCfgsBlob cfgBlob) {
		this.cfgBlob = cfgBlob;
	}
	public TableOfOrderCfgsInst getCfgInst() {
		return cfgInst;
	}
	public void setCfgInst(TableOfOrderCfgsInst cfgInst) {
		this.cfgInst = cfgInst;
	}
	public TableOfOrderCfgsPartOf getCfgPartOf() {
		return cfgPartOf;
	}
	public void setCfgPartOf(TableOfOrderCfgsPartOf cfgPartOf) {
		this.cfgPartOf = cfgPartOf;
	}
	public TableOfOrderCfgsRef getCfgsRef() {
		return cfgsRef;
	}
	public void setCfgsRef(TableOfOrderCfgsRef cfgsRef) {
		this.cfgsRef = cfgsRef;
	}
	public TableOfOrderCfgsRefInst getCfgsRefinst() {
		return cfgsRefinst;
	}
	public void setCfgsRefinst(TableOfOrderCfgsRefInst cfgsRefinst) {
		this.cfgsRefinst = cfgsRefinst;
	}
	public TableOfOrderCfgsValue getCfgsValue() {
		return cfgsValue;
	}
	public void setCfgsValue(TableOfOrderCfgsValue cfgsValue) {
		this.cfgsValue = cfgsValue;
	}
	public TableOfOrderCfgsVk getCfgsVk() {
		return cfgsVk;
	}
	public void setCfgsVk(TableOfOrderCfgsVk cfgsVk) {
		this.cfgsVk = cfgsVk;
	}
	public TableOfOrderConditionsIn getConditionsIn() {
		return conditionsIn;
	}
	public void setConditionsIn(TableOfOrderConditionsIn conditionsIn) {
		this.conditionsIn = conditionsIn;
	}
	public TableOfOrderConditionsInx getConditionsInx() {
		return conditionsInx;
	}
	public void setConditionsInx(TableOfOrderConditionsInx conditionsInx) {
		this.conditionsInx = conditionsInx;
	}
	public OrderHeaderIn getHeaderIn() {
		return headerIn;
	}
	public void setHeaderIn(OrderHeaderIn headerIn) {
		this.headerIn = headerIn;
	}
	public OrderHeaderInx getHeaderInx() {
		return headerInx;
	}
	public void setHeaderInx(OrderHeaderInx headerInx) {
		this.headerInx = headerInx;
	}
	public TableOfOrderItemsIn getItemsIn() {
		return itemsIn;
	}
	public void setItemsIn(TableOfOrderItemsIn itemsIn) {
		this.itemsIn = itemsIn;
	}
	public TableOfOrderItemsInx getItemsInx() {
		return itemsInx;
	}
	public void setItemsInx(TableOfOrderItemsInx itemsInx) {
		this.itemsInx = itemsInx;
	}
	public TableOfOrderKeys getKeys() {
		return keys;
	}
	public void setKeys(TableOfOrderKeys keys) {
		this.keys = keys;
	}
	public TableOfOrderPartners getPartners() {
		return partners;
	}
	public void setPartners(TableOfOrderPartners partners) {
		this.partners = partners;
	}
	public TableOfOrderSchedulesIn getSchedulesIn() {
		return schedulesIn;
	}
	public void setSchedulesIn(TableOfOrderSchedulesIn schedulesIn) {
		this.schedulesIn = schedulesIn;
	}
	public TableOfOrderSchedulesInx getSchedulesInx() {
		return schedulesInx;
	}
	public void setSchedulesInx(TableOfOrderSchedulesInx schedulesInx) {
		this.schedulesInx = schedulesInx;
	}
	public TableOfPartnerAddresses getPartnerAddresses() {
		return partnerAddresses;
	}
	public void setPartnerAddresses(TableOfPartnerAddresses partnerAddresses) {
		this.partnerAddresses = partnerAddresses;
	}
	public TableOfReturnDetails getReturnDetails() {
		return returnDetails;
	}
	public void setReturnDetails(TableOfReturnDetails returnDetails) {
		this.returnDetails = returnDetails;
	}
	public String getSalesDocuments() {
		return salesDocuments;
	}
	public void setSalesDocuments(String salesDocuments) {
		this.salesDocuments = salesDocuments;
	}
	public String getBehaveWhenError() {
		return behaveWhenError;
	}
	public void setBehaveWhenError(String behaveWhenError) {
		this.behaveWhenError = behaveWhenError;
	}
	public String getBinaryRelationshipType() {
		return binaryRelationshipType;
	}
	public void setBinaryRelationshipType(String binaryRelationshipType) {
		this.binaryRelationshipType = binaryRelationshipType;
	}
	public String getConvert() {
		return convert;
	}
	public void setConvert(String convert) {
		this.convert = convert;
	}
	public String getIntNumberAssignment() {
		return intNumberAssignment;
	}
	public void setIntNumberAssignment(String intNumberAssignment) {
		this.intNumberAssignment = intNumberAssignment;
	}
	
	public String getTestRun() {
		return testRun;
	}
	public void setTestRun(String testRun) {
		this.testRun = testRun;
	}
	public TableOfOrderCcard getOrderCcard() {
		return orderCcard;
	}
	public void setOrderCcard(TableOfOrderCcard orderCcard) {
		this.orderCcard = orderCcard;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public TableOfOrderText getOrderText() {
		return orderText;
	}
	public void setOrderText(TableOfOrderText orderText) {
		this.orderText = orderText;
	}
		
	
}
