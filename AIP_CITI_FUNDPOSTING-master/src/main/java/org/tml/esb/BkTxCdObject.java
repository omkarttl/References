package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BkTxCd", propOrder = { "prtry" })

public class BkTxCdObject {

	@XmlElement(name = "Prtry")
	private PrtryObject prtry;

	public PrtryObject getPrtry() {
		return prtry;
	}

	public void setPrtry(PrtryObject prtry) {
		this.prtry = prtry;
	}

}
