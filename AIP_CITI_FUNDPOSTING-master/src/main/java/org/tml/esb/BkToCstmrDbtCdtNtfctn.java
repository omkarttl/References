package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BkToCstmrDbtCdtNtfctn", propOrder = { "grpHdr", "ntfctn" })


public class BkToCstmrDbtCdtNtfctn {

	@XmlElement(name = "GrpHdr")
	private GrpHdrObject grpHdr;

	@XmlElement(name = "Ntfctn")
	private NtfctnObject ntfctn;

	public GrpHdrObject getGrpHdr() {
		return grpHdr;
	}

	public void setGrpHdr(GrpHdrObject grpHdr) {
		this.grpHdr = grpHdr;
	}

	public NtfctnObject getNtfctn() {
		return ntfctn;
	}

	public void setNtfctn(NtfctnObject ntfctn) {
		this.ntfctn = ntfctn;
	}

}
