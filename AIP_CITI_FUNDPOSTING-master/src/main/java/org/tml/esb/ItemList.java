package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "I_ZFI_BANK_ECOLLECTION_CITI", propOrder = { "item" })
@XmlRootElement(name="I_ZFI_BANK_ECOLLECTION_CITI")

public class ItemList {

	@XmlElement(name = "item")
	private ItemObj item;
	
	public ItemObj getItem() {
		return item;
	}

	public void setItem(ItemObj item) {
		this.item = item;
	}
	
}
