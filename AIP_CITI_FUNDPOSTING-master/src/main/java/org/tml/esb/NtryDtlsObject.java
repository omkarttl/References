package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NtryDtls", propOrder = { "txDtls" })

public class NtryDtlsObject {

	@XmlElement(name = "TxDtls")
	private TxDtlsObject txDtls;

	public TxDtlsObject getTxDtls() {
		return txDtls;
	}

	public void setTxDtls(TxDtlsObject txDtls) {
		this.txDtls = txDtls;
	}

}
