package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ntfctn", propOrder = { "idOne", "creDtTm", "acct" , "ntry"})


public class NtfctnObject {

	
	@XmlElement(name = "Id")
	private String idOne;

	@XmlElement(name = "CreDtTm")
	private String creDtTm;

	@XmlElement(name = "Acct")
	private Acct acct;
	
	@XmlElement(name = "Ntry")
	private NtryObject ntry;
	
	public String getIdOne() {
		return idOne;
	}

	public void setIdOne(String idOne) {
		this.idOne = idOne;
	}

	public String getCreDtTm() {
		return creDtTm;
	}

	public void setCreDtTm(String creDtTm) {
		this.creDtTm = creDtTm;
	}

	public Acct getAcct() {
		return acct;
	}

	public void setAcct(Acct acct) {
		this.acct = acct;
	}

	public NtryObject getNtry() {
		return ntry;
	}

	public void setNtry(NtryObject ntry) {
		this.ntry = ntry;
	}



}
