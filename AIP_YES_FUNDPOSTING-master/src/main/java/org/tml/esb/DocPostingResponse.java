package org.tml.esb;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ZFIRFC_YES_BANK_DOC_POSTINGResponse", propOrder = {
	"eAck"
})
@XmlRootElement(name="ZFIRFC_YES_BANK_DOC_POSTINGResponse")
public class DocPostingResponse {
	
	@XmlElement(name = "E_ACKMNT")
	private String eAck;

	public String geteAck() {
		return eAck;
	}

	public void seteAck(String eAck) {
		this.eAck = eAck;
	}
	
	
	
}
