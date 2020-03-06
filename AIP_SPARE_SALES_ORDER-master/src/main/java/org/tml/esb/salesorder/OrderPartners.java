package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderPartners {
	
	@XmlElement(name = "PartnRole")
	private String partnRole;
	@XmlElement(name = "PartnNumb")
    private String partnNumb;
	@XmlElement(name = "ItmNumber")
    private String itmNumber;
	@XmlElement(name = "Title")
    private String title;
	@XmlElement(name = "Name")
    private String name;
	@XmlElement(name = "Name2")
    private String name2;
	@XmlElement(name = "Name3")
    private String name3;
	@XmlElement(name = "Name4")
    private String name4;
	@XmlElement(name = "Street")
    private String street;
	@XmlElement(name = "Country")
    private String country;
	@XmlElement(name = "CountrIso")
    private String countrIso;
	@XmlElement(name = "PostlCode")
    private String postlCode;
	@XmlElement(name = "PobxPcd")
    private String pobxPcd;
	@XmlElement(name = "PobxCty")
    private String pobxCty;
	@XmlElement(name = "City")
    private String city;
	@XmlElement(name = "District")
    private String district;
	@XmlElement(name = "Region")
    private String region;
	@XmlElement(name = "PoBox")
	private String poBox;
	@XmlElement(name = "Telephone")
    private String telephone;
	@XmlElement(name = "Telephone2")
    private String telephone2;
	@XmlElement(name = "Telebox")
    private String telebox;
	@XmlElement(name = "FaxNumber")
    private String faxNumber;
	@XmlElement(name = "TeletexNo")
    private String teletexNo;
	@XmlElement(name = "TelexNo")
    private String telexNo;
	@XmlElement(name = "Langu")
    private String langu;
	@XmlElement(name = "LanguIso")
    private String languISO;
	@XmlElement(name = "UnloadPt")
    private String unloadPt;
	@XmlElement(name = "Transpzone")
    private String transpZone;
	@XmlElement(name = "Taxjurcode")
    private String taxjurCode;
	@XmlElement(name = "Address")
    private String address;
	@XmlElement(name = "PrivAddr")
    private String privAddr;
	@XmlElement(name = "AddrType")
    private String addrType;
	@XmlElement(name = "AddrOrig")
    private String addrOrig;
	@XmlElement(name = "AddrLink")
    private String addrLink;
	@XmlElement(name = "Refobjtype")
    private String refObjType;
	@XmlElement(name = "Refobjkey")
    private String refObjKey;
	@XmlElement(name = "Reflogsys")
    private String refLogSys;
    

	public String getPartnRole() {
		return partnRole;
	}
	public void setPartnRole(String partnRole) {
		this.partnRole = partnRole;
	}
	public String getPartnNumb() {
		return partnNumb;
	}
	public void setPartnNumb(String partnNumb) {
		this.partnNumb = partnNumb;
	}
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountrIso() {
		return countrIso;
	}
	public void setCountrIso(String countrIso) {
		this.countrIso = countrIso;
	}
	public String getPostlCode() {
		return postlCode;
	}
	public void setPostlCode(String postlCode) {
		this.postlCode = postlCode;
	}
	public String getPobxPcd() {
		return pobxPcd;
	}
	public void setPobxPcd(String pobxPcd) {
		this.pobxPcd = pobxPcd;
	}
	public String getPobxCty() {
		return pobxCty;
	}
	public void setPobxCty(String pobxCty) {
		this.pobxCty = pobxCty;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPoBox() {
		return poBox;
	}
	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone2() {
		return telephone2;
	}
	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	public String getTelebox() {
		return telebox;
	}
	public void setTelebox(String telebox) {
		this.telebox = telebox;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getTeletexNo() {
		return teletexNo;
	}
	public void setTeletexNo(String teletexNo) {
		this.teletexNo = teletexNo;
	}
	public String getTelexNo() {
		return telexNo;
	}
	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}
	public String getLangu() {
		return langu;
	}
	public void setLangu(String langu) {
		this.langu = langu;
	}
	public String getLanguISO() {
		return languISO;
	}
	public void setLanguISO(String languISO) {
		this.languISO = languISO;
	}
	public String getUnloadPt() {
		return unloadPt;
	}
	public void setUnloadPt(String unloadPt) {
		this.unloadPt = unloadPt;
	}
	public String getTranspZone() {
		return transpZone;
	}
	public void setTranspZone(String transpZone) {
		this.transpZone = transpZone;
	}
	public String getTaxjurCode() {
		return taxjurCode;
	}
	public void setTaxjurCode(String taxjurCode) {
		this.taxjurCode = taxjurCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrivAddr() {
		return privAddr;
	}
	public void setPrivAddr(String privAddr) {
		this.privAddr = privAddr;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public String getAddrOrig() {
		return addrOrig;
	}
	public void setAddrOrig(String addrOrig) {
		this.addrOrig = addrOrig;
	}
	public String getAddrLink() {
		return addrLink;
	}
	public void setAddrLink(String addrLink) {
		this.addrLink = addrLink;
	}
	public String getRefObjType() {
		return refObjType;
	}
	public void setRefObjType(String refObjType) {
		this.refObjType = refObjType;
	}
	public String getRefObjKey() {
		return refObjKey;
	}
	public void setRefObjKey(String refObjKey) {
		this.refObjKey = refObjKey;
	}
	public String getRefLogSys() {
		return refLogSys;
	}
	public void setRefLogSys(String refLogSys) {
		this.refLogSys = refLogSys;
	}
    
}
