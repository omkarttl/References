package org.tml.esb.salesorder;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class TableOfExtensionIn {
	
	private List<ExtensionIn> item;

	public List<ExtensionIn> getItem() {
		return item;
	}

	public void setItem(List<ExtensionIn> item) {
		this.item = item;
	}
	
	

}
