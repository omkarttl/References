package org.tml.esb.salesorder;

import java.math.BigDecimal;
import java.util.Base64;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.camel.util.Time;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderHeaderIn {

	@XmlElement(name = "Refobjtype")
	private String refObjType;
	@XmlElement(name = "Refobjkey")
	private String refObjKey;
	@XmlElement(name = "Refdoctype")
	private String refDocType;
	@XmlElement(name = "DocType")
	private String docType;
	@XmlElement(name = "CollectNo")
	private String collectNo;
	@XmlElement(name = "SalesOrg")
	private String salesOrg;
	@XmlElement(name = "DistrChan")
	private String distrChan;
	@XmlElement(name = "Division")
	private String division;
	@XmlElement(name = "SalesGrp")
	private String salesGrp;
	@XmlElement(name = "SalesOff")
	private String salesOff;
	@XmlElement(name = "ReqDateH")
	private String reqDateH;
	@XmlElement(name = "DateType")
	private String dateType;
	@XmlElement(name = "PurchDate")
	private String purchDate;
	@XmlElement(name = "PoMethod")
	private String poMethod;
	@XmlElement(name = "PoSupplem")
	private String poSupplem;
	@XmlElement(name = "Ref1")
	private String ref1;
	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "Telephone")
	private String telephone;
	@XmlElement(name = "PriceGrp")
	private String priceGrp;
	@XmlElement(name = "CustGroup")
	private String custGroup;
	@XmlElement(name = "SalesDist")
	private String salesDist;
	@XmlElement(name = "PriceList")
	private String priceList;
	@XmlElement(name = "Incoterms1")
	private String incoTerms1;
	@XmlElement(name = "Incoterms2")
	private String incoTerms2;
	@XmlElement(name = "Pmnttrms")
	private String pmntTrms;
	@XmlElement(name = "DlvBlock")
	private String dlvBlock;
	@XmlElement(name = "BillBlock")
	private String billBlock;
	@XmlElement(name = "OrdReason")
	private String ordReason;
	@XmlElement(name = "ComplDlv")
	private String complDlv;
	@XmlElement(name = "PriceDate")
	private String priceDate;
	@XmlElement(name = "QtValidF")
	private String qtValidF;
	@XmlElement(name = "QtValidT")
	private String qtValidT;
	@XmlElement(name = "CtValidF")
	private String ctValidF;
	@XmlElement(name = "CtValidT")
	private String ctValidT;
	@XmlElement(name = "CustGrp1")
	private String custGrp1;
	@XmlElement(name = "CustGrp2")
	private String custGrp2;
	@XmlElement(name = "CustGrp3")
	private String custGrp3;
	@XmlElement(name = "CustGrp4")
	private String custGrp4;
	@XmlElement(name = "CustGrp5")
	private String custGrp5;
	@XmlElement(name = "PurchNoC")
	private String purchNoC;
	@XmlElement(name = "PurchNoS")
	private String purchNoS;
	@XmlElement(name = "PoDatS")
	private String poDatS;
	@XmlElement(name = "PoMethS")
	private String poMethS;
	@XmlElement(name = "Ref1S")
	private String ref1S;
	@XmlElement(name = "SdDocCat")
	private String sdDocCat;
	@XmlElement(name = "DocDate")
	private String docDate;
	@XmlElement(name = "WarDate")
	private String warDate;
	@XmlElement(name = "ShipCond")
	private String shipCond;
	@XmlElement(name = "PpSearch")
	private String ppSearch;
	@XmlElement(name = "DunCount")
	private String dunCount;
	@XmlElement(name = "DunDate")
	private String dunDate;
	@XmlElement(name = "Dlvschduse")
	private String dlvsChduse;
	@XmlElement(name = "Pldlvstyp")
	private String pldlvsTyp;
	@XmlElement(name = "RefDoc")
	private String refDoc;
	@XmlElement(name = "CompCdeB")
	private String compCdeB;
	@XmlElement(name = "AlttaxCls")
	private String alttaxCls;
	@XmlElement(name = "TaxClass2")
	private String taxClass2;
	@XmlElement(name = "TaxClass3")
	private String taxClass3;
	@XmlElement(name = "TaxClass4")
	private String taxClass4;
	@XmlElement(name = "TaxClass5")
	private String taxClass5;
	@XmlElement(name = "TaxClass6")
	private String taxClass6;
	@XmlElement(name = "TaxClass7")
	private String taxClass7;
	@XmlElement(name = "TaxClass8")
	private String taxClass8;
	@XmlElement(name = "TaxClass9")
	private String taxClass9;
	@XmlElement(name = "RefDocL")
	private String refDocL;
	@XmlElement(name = "AssNumber")
	private String assNumber;
	@XmlElement(name = "RefdocCat")
	private String refdocCat;
	@XmlElement(name = "OrdcombIn")
	private String ordcombIn;
	@XmlElement(name = "BillSched")
	private String billSched;
	@XmlElement(name = "InvoSched")
	private String invoSched;
	@XmlElement(name = "MnInvoice")
	private String mnInvoice;
	@XmlElement(name = "ExrateFi")
	private BigDecimal exrateFi;
	@XmlElement(name = "AddValDy")
	private String addValDy;
	@XmlElement(name = "FixValDy")
	private String fixValDy;
	@XmlElement(name = "PymtMeth")
	private String pymtMeth;
	@XmlElement(name = "AccntAsgn")
	private String accntAsgn;
	@XmlElement(name = "ExchgRate")
	private BigDecimal exchgRate;
	@XmlElement(name = "BillDate")
	private String billDate;
	@XmlElement(name = "ServDate")
	private String servDate;
	@XmlElement(name = "DunnKey")
	private String dunnKey;
	@XmlElement(name = "DunnBlock")
	private String dunnBlock;
	@XmlElement(name = "PmtgarPro")
	private String pmtgarPro;
	@XmlElement(name = "DepartmNo")
	private String departmNo;
	@XmlElement(name = "RecPoint")
	private String recPoint;
	@XmlElement(name = "DocNumFi")
	private String docNumFi;
	@XmlElement(name = "Cstcndgrp1")
	private String cstCndGrp1;
	@XmlElement(name = "Cstcndgrp2")
	private String cstCndGrp2;
	@XmlElement(name = "Cstcndgrp3")
	private String cstCndGrp3;
	@XmlElement(name = "Cstcndgrp4")
	private String cstCndGrp4;
	@XmlElement(name = "Cstcndgrp5")
	private String cstCndGrp5;
	@XmlElement(name = "DlvTime")
	private String dlvTime;
	@XmlElement(name = "Currency")
	private String currency;
	@XmlElement(name = "CurrIso")
	private String currIso;
	@XmlElement(name = "CreatedBy")
	private String createdBy;
	@XmlElement(name = "CondType")
	private String taxdepCty;
	@XmlElement(name = "TaxdepCty")
	private String taxdstCty;
	@XmlElement(name = "EutriDeal")
	private String eutriDeal;
	@XmlElement(name = "MastContr")
	private String mastContr;
	@XmlElement(name = "RefProc")
	private String refProc;
	@XmlElement(name = "Chkprtauth")
	private String chkPrtAuth;
	@XmlElement(name = "CmlqtyDat")
	private String cmlQtyDat;
	@XmlElement(name = "Version")
	private String version;
	@XmlElement(name = "NotifNo")
	private String notifNo;
	@XmlElement(name = "WbsElem")
	private String wbsElem;
	@XmlElement(name = "ExchRateFiV")
	private BigDecimal exchRateFiV;
	@XmlElement(name = "ExchgRateV")
	private BigDecimal exchgRateV;
	@XmlElement(name = "FkkConacct")
	private String fkkConacct;
	@XmlElement(name = "Campaign")
	private Base64 campaign;
	@XmlElement(name = "DocClass")
	private String docClass;
	@XmlElement(name = "HCurr")
	private String hCurr;
	@XmlElement(name = "HCurrIso")
	private String hCurrIso;
	@XmlElement(name = "ShipType")
	private String shipType;
	@XmlElement(name = "SProcInd")
	private String sProcInd;
	@XmlElement(name = "RefDocLLong")
	private String refDocLLong;
	@XmlElement(name = "LineTime")
	private Time lineTime;
	@XmlElement(name = "CalcMotive")
	private String calcMotive;

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

	public String getRefDocType() {
		return refDocType;
	}

	public void setRefDocType(String refDocType) {
		this.refDocType = refDocType;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getCollectNo() {
		return collectNo;
	}

	public void setCollectNo(String collectNo) {
		this.collectNo = collectNo;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getDistrChan() {
		return distrChan;
	}

	public void setDistrChan(String distrChan) {
		this.distrChan = distrChan;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSalesGrp() {
		return salesGrp;
	}

	public void setSalesGrp(String salesGrp) {
		this.salesGrp = salesGrp;
	}

	public String getSalesOff() {
		return salesOff;
	}

	public void setSalesOff(String salesOff) {
		this.salesOff = salesOff;
	}

	public String getReqDateH() {
		return reqDateH;
	}

	public void setReqDateH(String reqDateH) {
		this.reqDateH = reqDateH;
	}

	public String getDateType() {
		return dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getPurchDate() {
		return purchDate;
	}

	public void setPurchDate(String purchDate) {
		this.purchDate = purchDate;
	}

	public String getPoMethod() {
		return poMethod;
	}

	public void setPoMethod(String poMethod) {
		this.poMethod = poMethod;
	}

	public String getPoSupplem() {
		return poSupplem;
	}

	public void setPoSupplem(String poSupplem) {
		this.poSupplem = poSupplem;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPriceGrp() {
		return priceGrp;
	}

	public void setPriceGrp(String priceGrp) {
		this.priceGrp = priceGrp;
	}

	public String getCustGroup() {
		return custGroup;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public String getSalesDist() {
		return salesDist;
	}

	public void setSalesDist(String salesDist) {
		this.salesDist = salesDist;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getIncoTerms1() {
		return incoTerms1;
	}

	public void setIncoTerms1(String incoTerms1) {
		this.incoTerms1 = incoTerms1;
	}

	public String getIncoTerms2() {
		return incoTerms2;
	}

	public void setIncoTerms2(String incoTerms2) {
		this.incoTerms2 = incoTerms2;
	}

	public String getPmntTrms() {
		return pmntTrms;
	}

	public void setPmntTrms(String pmntTrms) {
		this.pmntTrms = pmntTrms;
	}

	public String getDlvBlock() {
		return dlvBlock;
	}

	public void setDlvBlock(String dlvBlock) {
		this.dlvBlock = dlvBlock;
	}

	public String getBillBlock() {
		return billBlock;
	}

	public void setBillBlock(String billBlock) {
		this.billBlock = billBlock;
	}

	public String getOrdReason() {
		return ordReason;
	}

	public void setOrdReason(String ordReason) {
		this.ordReason = ordReason;
	}

	public String getComplDlv() {
		return complDlv;
	}

	public void setComplDlv(String complDlv) {
		this.complDlv = complDlv;
	}

	public String getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(String priceDate) {
		this.priceDate = priceDate;
	}

	public String getQtValidF() {
		return qtValidF;
	}

	public void setQtValidF(String qtValidF) {
		this.qtValidF = qtValidF;
	}

	public String getQtValidT() {
		return qtValidT;
	}

	public void setQtValidT(String qtValidT) {
		this.qtValidT = qtValidT;
	}

	public String getCtValidF() {
		return ctValidF;
	}

	public void setCtValidF(String ctValidF) {
		this.ctValidF = ctValidF;
	}

	public String getCtValidT() {
		return ctValidT;
	}

	public void setCtValidT(String ctValidT) {
		this.ctValidT = ctValidT;
	}

	public String getCustGrp1() {
		return custGrp1;
	}

	public void setCustGrp1(String custGrp1) {
		this.custGrp1 = custGrp1;
	}

	public String getCustGrp2() {
		return custGrp2;
	}

	public void setCustGrp2(String custGrp2) {
		this.custGrp2 = custGrp2;
	}

	public String getCustGrp3() {
		return custGrp3;
	}

	public void setCustGrp3(String custGrp3) {
		this.custGrp3 = custGrp3;
	}

	public String getCustGrp4() {
		return custGrp4;
	}

	public void setCustGrp4(String custGrp4) {
		this.custGrp4 = custGrp4;
	}

	public String getCustGrp5() {
		return custGrp5;
	}

	public void setCustGrp5(String custGrp5) {
		this.custGrp5 = custGrp5;
	}

	public String getPurchNoC() {
		return purchNoC;
	}

	public void setPurchNoC(String purchNoC) {
		this.purchNoC = purchNoC;
	}

	public String getPurchNoS() {
		return purchNoS;
	}

	public void setPurchNoS(String purchNoS) {
		this.purchNoS = purchNoS;
	}

	public String getPoDatS() {
		return poDatS;
	}

	public void setPoDatS(String poDatS) {
		this.poDatS = poDatS;
	}

	public String getPoMethS() {
		return poMethS;
	}

	public void setPoMethS(String poMethS) {
		this.poMethS = poMethS;
	}

	public String getRef1S() {
		return ref1S;
	}

	public void setRef1S(String ref1s) {
		ref1S = ref1s;
	}

	public String getSdDocCat() {
		return sdDocCat;
	}

	public void setSdDocCat(String sdDocCat) {
		this.sdDocCat = sdDocCat;
	}

	public String getDocDate() {
		return docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getWarDate() {
		return warDate;
	}

	public void setWarDate(String warDate) {
		this.warDate = warDate;
	}

	public String getShipCond() {
		return shipCond;
	}

	public void setShipCond(String shipCond) {
		this.shipCond = shipCond;
	}

	public String getPpSearch() {
		return ppSearch;
	}

	public void setPpSearch(String ppSearch) {
		this.ppSearch = ppSearch;
	}

	public String getDunCount() {
		return dunCount;
	}

	public void setDunCount(String dunCount) {
		this.dunCount = dunCount;
	}

	public String getDunDate() {
		return dunDate;
	}

	public void setDunDate(String dunDate) {
		this.dunDate = dunDate;
	}

	public String getDlvsChduse() {
		return dlvsChduse;
	}

	public void setDlvsChduse(String dlvsChduse) {
		this.dlvsChduse = dlvsChduse;
	}

	public String getPldlvsTyp() {
		return pldlvsTyp;
	}

	public void setPldlvsTyp(String pldlvsTyp) {
		this.pldlvsTyp = pldlvsTyp;
	}

	public String getRefDoc() {
		return refDoc;
	}

	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}

	public String getCompCdeB() {
		return compCdeB;
	}

	public void setCompCdeB(String compCdeB) {
		this.compCdeB = compCdeB;
	}

	public String getAlttaxCls() {
		return alttaxCls;
	}

	public void setAlttaxCls(String alttaxCls) {
		this.alttaxCls = alttaxCls;
	}

	public String getTaxClass2() {
		return taxClass2;
	}

	public void setTaxClass2(String taxClass2) {
		this.taxClass2 = taxClass2;
	}

	public String getTaxClass3() {
		return taxClass3;
	}

	public void setTaxClass3(String taxClass3) {
		this.taxClass3 = taxClass3;
	}

	public String getTaxClass4() {
		return taxClass4;
	}

	public void setTaxClass4(String taxClass4) {
		this.taxClass4 = taxClass4;
	}

	public String getTaxClass5() {
		return taxClass5;
	}

	public void setTaxClass5(String taxClass5) {
		this.taxClass5 = taxClass5;
	}

	public String getTaxClass6() {
		return taxClass6;
	}

	public void setTaxClass6(String taxClass6) {
		this.taxClass6 = taxClass6;
	}

	public String getTaxClass7() {
		return taxClass7;
	}

	public void setTaxClass7(String taxClass7) {
		this.taxClass7 = taxClass7;
	}

	public String getTaxClass8() {
		return taxClass8;
	}

	public void setTaxClass8(String taxClass8) {
		this.taxClass8 = taxClass8;
	}

	public String getTaxClass9() {
		return taxClass9;
	}

	public void setTaxClass9(String taxClass9) {
		this.taxClass9 = taxClass9;
	}

	public String getRefDocL() {
		return refDocL;
	}

	public void setRefDocL(String refDocL) {
		this.refDocL = refDocL;
	}

	public String getAssNumber() {
		return assNumber;
	}

	public void setAssNumber(String assNumber) {
		this.assNumber = assNumber;
	}

	public String getRefdocCat() {
		return refdocCat;
	}

	public void setRefdocCat(String refdocCat) {
		this.refdocCat = refdocCat;
	}

	public String getOrdcombIn() {
		return ordcombIn;
	}

	public void setOrdcombIn(String ordcombIn) {
		this.ordcombIn = ordcombIn;
	}

	public String getBillSched() {
		return billSched;
	}

	public void setBillSched(String billSched) {
		this.billSched = billSched;
	}

	public String getInvoSched() {
		return invoSched;
	}

	public void setInvoSched(String invoSched) {
		this.invoSched = invoSched;
	}

	public String getMnInvoice() {
		return mnInvoice;
	}

	public void setMnInvoice(String mnInvoice) {
		this.mnInvoice = mnInvoice;
	}

	public BigDecimal getExrateFi() {
		return exrateFi;
	}

	public void setExrateFi(BigDecimal exrateFi) {
		this.exrateFi = exrateFi;
	}

	public String getAddValDy() {
		return addValDy;
	}

	public void setAddValDy(String addValDy) {
		this.addValDy = addValDy;
	}

	public String getFixValDy() {
		return fixValDy;
	}

	public void setFixValDy(String fixValDy) {
		this.fixValDy = fixValDy;
	}

	public String getPymtMeth() {
		return pymtMeth;
	}

	public void setPymtMeth(String pymtMeth) {
		this.pymtMeth = pymtMeth;
	}

	public String getAccntAsgn() {
		return accntAsgn;
	}

	public void setAccntAsgn(String accntAsgn) {
		this.accntAsgn = accntAsgn;
	}

	public BigDecimal getExchgRate() {
		return exchgRate;
	}

	public void setExchgRate(BigDecimal exchgRate) {
		this.exchgRate = exchgRate;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getServDate() {
		return servDate;
	}

	public void setServDate(String servDate) {
		this.servDate = servDate;
	}

	public String getDunnKey() {
		return dunnKey;
	}

	public void setDunnKey(String dunnKey) {
		this.dunnKey = dunnKey;
	}

	public String getDunnBlock() {
		return dunnBlock;
	}

	public void setDunnBlock(String dunnBlock) {
		this.dunnBlock = dunnBlock;
	}

	public String getPmtgarPro() {
		return pmtgarPro;
	}

	public void setPmtgarPro(String pmtgarPro) {
		this.pmtgarPro = pmtgarPro;
	}

	public String getDepartmNo() {
		return departmNo;
	}

	public void setDepartmNo(String departmNo) {
		this.departmNo = departmNo;
	}

	public String getRecPoint() {
		return recPoint;
	}

	public void setRecPoint(String recPoint) {
		this.recPoint = recPoint;
	}

	public String getDocNumFi() {
		return docNumFi;
	}

	public void setDocNumFi(String docNumFi) {
		this.docNumFi = docNumFi;
	}

	public String getCstCndGrp1() {
		return cstCndGrp1;
	}

	public void setCstCndGrp1(String cstCndGrp1) {
		this.cstCndGrp1 = cstCndGrp1;
	}

	public String getCstCndGrp2() {
		return cstCndGrp2;
	}

	public void setCstCndGrp2(String cstCndGrp2) {
		this.cstCndGrp2 = cstCndGrp2;
	}

	public String getCstCndGrp3() {
		return cstCndGrp3;
	}

	public void setCstCndGrp3(String cstCndGrp3) {
		this.cstCndGrp3 = cstCndGrp3;
	}

	public String getCstCndGrp4() {
		return cstCndGrp4;
	}

	public void setCstCndGrp4(String cstCndGrp4) {
		this.cstCndGrp4 = cstCndGrp4;
	}

	public String getCstCndGrp5() {
		return cstCndGrp5;
	}

	public void setCstCndGrp5(String cstCndGrp5) {
		this.cstCndGrp5 = cstCndGrp5;
	}

	public String getDlvTime() {
		return dlvTime;
	}

	public void setDlvTime(String dlvTime) {
		this.dlvTime = dlvTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrIso() {
		return currIso;
	}

	public void setCurrIso(String currIso) {
		this.currIso = currIso;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getTaxdepCty() {
		return taxdepCty;
	}

	public void setTaxdepCty(String taxdepCty) {
		this.taxdepCty = taxdepCty;
	}

	public String getTaxdstCty() {
		return taxdstCty;
	}

	public void setTaxdstCty(String taxdstCty) {
		this.taxdstCty = taxdstCty;
	}

	public String getEutriDeal() {
		return eutriDeal;
	}

	public void setEutriDeal(String eutriDeal) {
		this.eutriDeal = eutriDeal;
	}

	public String getMastContr() {
		return mastContr;
	}

	public void setMastContr(String mastContr) {
		this.mastContr = mastContr;
	}

	public String getRefProc() {
		return refProc;
	}

	public void setRefProc(String refProc) {
		this.refProc = refProc;
	}

	public String getChkPrtAuth() {
		return chkPrtAuth;
	}

	public void setChkPrtAuth(String chkPrtAuth) {
		this.chkPrtAuth = chkPrtAuth;
	}

	public String getCmlQtyDat() {
		return cmlQtyDat;
	}

	public void setCmlQtyDat(String cmlQtyDat) {
		this.cmlQtyDat = cmlQtyDat;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getNotifNo() {
		return notifNo;
	}

	public void setNotifNo(String notifNo) {
		this.notifNo = notifNo;
	}

	public String getWbsElem() {
		return wbsElem;
	}

	public void setWbsElem(String wbsElem) {
		this.wbsElem = wbsElem;
	}

	public BigDecimal getExchRateFiV() {
		return exchRateFiV;
	}

	public void setExchRateFiV(BigDecimal exchRateFiV) {
		this.exchRateFiV = exchRateFiV;
	}

	public BigDecimal getExchgRateV() {
		return exchgRateV;
	}

	public void setExchgRateV(BigDecimal exchgRateV) {
		this.exchgRateV = exchgRateV;
	}

	public String getFkkConacct() {
		return fkkConacct;
	}

	public void setFkkConacct(String fkkConacct) {
		this.fkkConacct = fkkConacct;
	}

	public Base64 getCampaign() {
		return campaign;
	}

	public void setCampaign(Base64 campaign) {
		this.campaign = campaign;
	}

	public String getDocClass() {
		return docClass;
	}

	public void setDocClass(String docClass) {
		this.docClass = docClass;
	}

	public String gethCurr() {
		return hCurr;
	}

	public void sethCurr(String hCurr) {
		this.hCurr = hCurr;
	}

	public String gethCurrIso() {
		return hCurrIso;
	}

	public void sethCurrIso(String hCurrIso) {
		this.hCurrIso = hCurrIso;
	}

	public String getShipType() {
		return shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	public String getsProcInd() {
		return sProcInd;
	}

	public void setsProcInd(String sProcInd) {
		this.sProcInd = sProcInd;
	}

	public String getRefDocLLong() {
		return refDocLLong;
	}

	public void setRefDocLLong(String refDocLLong) {
		this.refDocLLong = refDocLLong;
	}

	public Time getLineTime() {
		return lineTime;
	}

	public void setLineTime(Time lineTime) {
		this.lineTime = lineTime;
	}

	public String getCalcMotive() {
		return calcMotive;
	}

	public void setCalcMotive(String calcMotive) {
		this.calcMotive = calcMotive;
	}

}
