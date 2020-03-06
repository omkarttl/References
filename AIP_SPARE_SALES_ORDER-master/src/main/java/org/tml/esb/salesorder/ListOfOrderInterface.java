package org.tml.esb.salesorder;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ListOfOrders")
public class ListOfOrderInterface {
	
	@XmlElement(name="Orders")
	private Orders orderIntf;

	public Orders getOrderIntf() {
		return orderIntf;
	}

	public void setOrderIntf(Orders orderIntf) {
		this.orderIntf = orderIntf;
	}

	
	
}
