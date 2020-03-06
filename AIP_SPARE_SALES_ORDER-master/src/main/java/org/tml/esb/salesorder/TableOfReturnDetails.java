package org.tml.esb.salesorder;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType( XmlAccessType.FIELD )
public class TableOfReturnDetails {
	private List<ReturnDetails> item;

	public List<ReturnDetails> getItem() {
		
		return item;
	}

}
