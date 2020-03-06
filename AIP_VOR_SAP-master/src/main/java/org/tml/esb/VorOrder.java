package org.tml.esb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class VorOrder {

	@XmlElement(name = "item")
	private List<VorOrderList> item;

	public List<VorOrderList> getItem() {
		return item;
	}

	public void setItem(List<VorOrderList> item) {
		this.item = item;
	}
	
}
