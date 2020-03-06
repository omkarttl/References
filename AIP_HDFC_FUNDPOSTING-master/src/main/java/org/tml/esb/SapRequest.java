package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZFIRFC_BANK_ECOLLECTION_CITI", propOrder = { "I_ZFI_BANK_ECOLLECTION_CITI" })
@XmlRootElement(name="ZFIRFC_BANK_ECOLLECTION_CITI")

public class SapRequest {

	@XmlElement(name = "I_ZFI_BANK_ECOLLECTION_CITI")
	private ItemList bankEcollection;

	public ItemList getbankEcollection() {
		return bankEcollection;
	}

	public void setbankEcollection(ItemList bankEcollection) {
		this.bankEcollection = bankEcollection;
	}

}
