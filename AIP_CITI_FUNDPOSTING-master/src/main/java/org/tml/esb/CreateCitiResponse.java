package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CITI_NOTIFICATION_APIResponse", propOrder = { "eAck", "iZfiBankECollectionCiti" })
@XmlRootElement(name = "CITI_NOTIFICATION_APIResponse")
@JsonIgnoreProperties(ignoreUnknown = true)

public class CreateCitiResponse {

	@XmlElement(name = "E_ACK", required = true)
	private String eAck;

	@XmlElement(name = "I_ZFI_BANK_ECOLLECTION_CITI")
	private ItemList iZfiBankECollectionCiti;

	public String geteAck() {
		return eAck;
	}

	public void seteAck(String eAck) {
		this.eAck = eAck;
	}

	public ItemList getiZfiBankECollectionCiti() {
		return iZfiBankECollectionCiti;
	}

	public void setiZfiBankECollectionCiti(ItemList iZfiBankECollectionCiti) {
		this.iZfiBankECollectionCiti = iZfiBankECollectionCiti;
	}

	
	

}
