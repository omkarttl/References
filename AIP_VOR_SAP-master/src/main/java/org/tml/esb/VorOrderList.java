package org.tml.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class VorOrderList {

	@XmlElement(name = "Matnr")
	private String  matnr;
	
	@XmlElement(name = "Werks")
	private String werks;
	
	@XmlElement(name = "Labst")
	private String pLabst;

	@XmlElement(name = "Lgort")
	private String lgort;
	
	@XmlElement(name = "Maktx")
	private String maktx;
	
	@XmlElement(name = "Name1")
	private String name1;
	
	@XmlElement(name = "Name2")
	private String name2;
	
	@XmlElement(name = "Stras")
	private String stras;
	
	@XmlElement(name = "Pstlz")
	private String pstlz;

	@XmlElement(name = "Ort01")
	private String ort01;
	
	@XmlElement(name = "Land1")
	private String land1;
	
	@XmlElement(name = "Regio")
	private String regio;

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public String getpLabst() {
		return pLabst;
	}

	public void setpLabst(String pLabst) {
		this.pLabst = pLabst;
	}

	public String getLgort() {
		return lgort;
	}

	public void setLgort(String lgort) {
		this.lgort = lgort;
	}

	public String getMaktx() {
		return maktx;
	}

	public void setMaktx(String maktx) {
		this.maktx = maktx;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getStras() {
		return stras;
	}

	public void setStras(String stras) {
		this.stras = stras;
	}

	public String getPstlz() {
		return pstlz;
	}

	public void setPstlz(String pstlz) {
		this.pstlz = pstlz;
	}

	public String getOrt01() {
		return ort01;
	}

	public void setOrt01(String ort01) {
		this.ort01 = ort01;
	}

	public String getLand1() {
		return land1;
	}

	public void setLand1(String land1) {
		this.land1 = land1;
	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}
	
	
}
