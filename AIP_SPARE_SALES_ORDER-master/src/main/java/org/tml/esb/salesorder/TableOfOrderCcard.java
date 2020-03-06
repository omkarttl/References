package org.tml.esb.salesorder;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType( XmlAccessType.FIELD )
public class TableOfOrderCcard {

	private List<OrderCcard> item;

	public List<OrderCcard> getItem() {
		return item;
	}

	public void setItem(List<OrderCcard> item) {
		this.item = item;
	}
	
	
}
