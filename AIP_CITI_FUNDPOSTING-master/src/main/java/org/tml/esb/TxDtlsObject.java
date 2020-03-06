package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxDtls", propOrder = { "refs", "rmtInf" })

public class TxDtlsObject {

	@XmlElement(name = "Refs")
	private RefsObject refs;

	@XmlElement(name = "RmtInf")
	private RmtInf rmtInf;

	
	public RmtInf getRmtInf() {
		return rmtInf;
	}

	public void setRmtInf(RmtInf rmtInf) {
		this.rmtInf = rmtInf;
	}

	public RefsObject getRefs() {
		return refs;
	}

	public void setRefs(RefsObject refs) {
		this.refs = refs;
	}

}
