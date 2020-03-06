package org.tml.esb.salesorder;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderItemsIn {
	
	
	@XmlElement(name = "ItmNumber")
	private String itmNumber;
	@XmlElement(name = "HgLvItem")
    private String hgLvItem;
	@XmlElement(name = "PoItmNo")
    private String poItmNo;
	@XmlElement(name = "Material")
    private String material;
	@XmlElement(name = "AltToItm")
    private String altToItm;
	@XmlElement(name = "CustMat22")
    private String custMat22;
    @XmlElement(name = "Batch")
    private String batch;
    @XmlElement(name = "DlvGroup")
    private String dlvGroup;
    @XmlElement(name = "PartDlv")
    private String partDlv;
    @XmlElement(name = "ReasonRej")
    private String reasonRej;
    @XmlElement(name = "BillBlock")
    private String billBlock;
    @XmlElement(name = "BillDate")
    private String billDate;
    @XmlElement(name = "Plant")
    private String plant;
    @XmlElement(name = "StoreLoc")
    private String storeLoc;
    @XmlElement(name = "TargetQty")
    private BigDecimal targetQty;
    @XmlElement(name = "TargetQu")
    private String targetQu;
    @XmlElement(name = "TUnitIso")
    private String tUnitISO;
    @XmlElement(name = "ItemCateg")
    private String itemCateg;
    @XmlElement(name = "ShortText")
    private String shortText;
    @XmlElement(name = "PrcGroup1")
    private String prcGroup1;
    @XmlElement(name = "PrcGroup2")
    private String prcGroup2;
    @XmlElement(name = "PrcGroup3")
    private String prcGroup3;
    @XmlElement(name = "PrcGroup4")
    private String prcGroup4;
    @XmlElement(name = "PrcGroup5")
    private String prcGroup5;
    @XmlElement(name = "ProdHiera")
    private String prodHiera;
    @XmlElement(name = "MatlGroup")
    private String matlGroup;
    @XmlElement(name = "PurchNoC")
    private String purchNoC;
    @XmlElement(name = "PurchDate")
    private String purchDate;
    @XmlElement(name = "PoMethod")
    private String poMethod;
    @XmlElement(name = "Ref1")
    private String ref1;
    @XmlElement(name = "PurchNoS")
    private String purchNoS;
    @XmlElement(name = "PoDatS")
    private String poDatS;
    @XmlElement(name = "PoMethS")
    private String poMethS;
    @XmlElement(name = "Ref1S")
    private String ref1S;
    @XmlElement(name = "PoitmNoS")
    private String poitmNoS;
    @XmlElement(name = "PriceGrp")
    private String priceGrp;
    @XmlElement(name = "CustGroup")
    private String custGroup;
    @XmlElement(name = "SalesDist")
    private String salesDist;
    @XmlElement(name = "PriceList")
    private String priceList;
    @XmlElement(name = "Incoterms1")
    private String incoterms1;
    @XmlElement(name = "Incoterms2")
    private String incoterms2;
    @XmlElement(name = "OrdcompIn")
    private String ordcompIn;
    @XmlElement(name = "BillSched")
    private String billSched;
    @XmlElement(name = "InvoSched")
    private String invoSched;
    @XmlElement(name = "MnInvoice")
    private String mnInvoice;
    @XmlElement(name = "ExRateFi")
    private BigDecimal exRateFi;
    @XmlElement(name = "AddValDy")
    private String addValDy;
    @XmlElement(name = "FixValDy")
    private String fixValDy;
    @XmlElement(name = "Pmnttrms")
    private String pmnttrms;
    @XmlElement(name = "PymtMeth")
    private String pymtMeth;
    @XmlElement(name = "AccntAsgn")
    private String accntAsgn;
    @XmlElement(name = "ExchgRate")
    private BigDecimal exchgRate;
    @XmlElement(name = "PriceDate")
    private String priceDate;
    @XmlElement(name = "ServDate")
    private String servDate;
    @XmlElement(name = "DunnKey")
    private String dunnKey;
    @XmlElement(name = "DunnBlock")
    private String dunnBlock;
    @XmlElement(name = "Promotion")
    private String promotion;
    @XmlElement(name = "PmtgarPro")
    private String pmtgarPro;
    @XmlElement(name = "DocNumFi")
    private String docNumFi;
    @XmlElement(name = "DepartmNo")
    private String departmNo;
    @XmlElement(name = "RecPoint")
    private String recPoint;
    @XmlElement(name = "Cstcndgrp1")
    private String cstcndgrp1;
    @XmlElement(name = "Cstcndgrp2")
    private String cstcndgrp2;
    @XmlElement(name = "Cstcndgrp3")
    private String cstcndgrp3;
    @XmlElement(name = "Cstcndgrp4")
    private String cstcndgrp4;
    @XmlElement(name = "Cstcndgrp5")
    private String cstcndgrp5;
    @XmlElement(name = "DlvTime")
    private String dlvTime;
    @XmlElement(name = "SalesUnit")
    private String salesUnit;
    @XmlElement(name = "SUnitIso")
    private String sUnitIso;
    @XmlElement(name = "TrgQtyNo")
    private BigDecimal trgQtyNo;
    @XmlElement(name = "TrgqtyDen")
    private BigDecimal trgqtyDen;
    @XmlElement(name = "RnddlvQty")
    private BigDecimal rnddlvQty;
    @XmlElement(name = "Maxdevamnt")
    private BigDecimal maxdevamnt;
    @XmlElement(name = "Maxdevper")
    private BigDecimal maxdevper;
    @XmlElement(name = "MaxdevDay")
    private BigDecimal maxdevDay;
    @XmlElement(name = "UsageInd")
    private String usageInd;
    @XmlElement(name = "FixedQuan")
    private String fixedQuan;
    @XmlElement(name = "UnlmtDlv")
    private String unlmtDlv;
    @XmlElement(name = "Overdlvtol")
    private BigDecimal overdlvtol;
    @XmlElement(name = "UnddlvTol")
    private String unddlvTol;
    @XmlElement(name = "Division")
    private String division;
    @XmlElement(name = "Salqtynum")
    private BigDecimal salqtynum;
    @XmlElement(name = "Salqtyden")
    private BigDecimal salqtyden;
    @XmlElement(name = "GrossWght")
    private BigDecimal grossWght;
    @XmlElement(name = "NetWeight")
    private BigDecimal netWeight;
    @XmlElement(name = "UntofWght")
    private String untofWght;
    @XmlElement(name = "UnofWtiso")
    private String unofWtiso;
    @XmlElement(name = "Volume")
    private BigDecimal volume;
    @XmlElement(name = "Volunit")
    private String volunit;
    @XmlElement(name = "Volunitiso")
    private String volunitiso;
    @XmlElement(name = "DlvPrio")
    private String dlvPrio;
    @XmlElement(name = "ShipPoint")
    private String shipPoint;
    @XmlElement(name = "Route")
    private String route;
    @XmlElement(name = "CreatedBy")
    private String createdBy;
    @XmlElement(name = "TaxClass1")
    private String taxClass1;
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
    @XmlElement(name = "MatPrGrp")
    private String matPrGrp;
    @XmlElement(name = "ValType")
    private String valType;
    @XmlElement(name = "FixdatQty")
    private String fixdatQty;
    @XmlElement(name = "BomexplNo")
    private String bomexplNo;
    @XmlElement(name = "Resanalkey")
    private String resanalkey;
    @XmlElement(name = "ReqmtsTyp")
    private String reqmtsTyp;
    @XmlElement(name = "NoGrPost")
    private String noGrPost;
    @XmlElement(name = "BusTranst")
    private String busTranst;
    @XmlElement(name = "OverhdKey")
    private String overhdKey;
    @XmlElement(name = "CstgSheet")
    private String cstgSheet;
    @XmlElement(name = "Matfrgtgrp")
    private String matfrgtgrp;
    @XmlElement(name = "Pldlvshdin")
    private String pldlvshdin;
    @XmlElement(name = "SeqNo")
    private String seqNo;
    @XmlElement(name = "BilForm")
    private String bilForm;
    @XmlElement(name = "DliProfil")
    private String dliProfil;
    @XmlElement(name = "RevType")
    private String revType;
    @XmlElement(name = "BegdemPer")
    private String begdemPer;
    @XmlElement(name = "PrRefMat")
    private String prRefMat;
    @XmlElement(name = "Refobjtype")
    private String refobjtype;
    @XmlElement(name = "Refobjkey")
    private String refobjkey;
    @XmlElement(name = "Reflogsys")
    private String reflogsys;
    @XmlElement(name = "OrderProb")
    private String orderProb;
    @XmlElement(name = "MaxPlDlv")
    private BigDecimal maxPlDlv;
    @XmlElement(name = "CfopCode")
    private String cfopCode;
    @XmlElement(name = "Taxlawicms")
    private String taxlawicms;
    @XmlElement(name = "Taxlawipi")
    private String taxlawipi;
    @XmlElement(name = "SdTaxcode")
    private String sdTaxcode;
    @XmlElement(name = "AssortMod")
    private String assortMod;
    @XmlElement(name = "CompQuant")
    private BigDecimal compQuant;
    @XmlElement(name = "TargetVal")
    private BigDecimal targetVal;
    @XmlElement(name = "Currency")
    private String currency;
    @XmlElement(name = "CurrIso")
    private String currIso;
    @XmlElement(name = "ProfitCtr")
    private String profitCtr;
    @XmlElement(name = "Orderid")
    private String orderid;
    @XmlElement(name = "WbsElem")
    private String wbsElem;
    @XmlElement(name = "DeprecPer")
    private BigDecimal deprecPer;
    @XmlElement(name = "RefDoc")
    private String refDoc;
    @XmlElement(name = "RefDocIt")
    private String refDocIt;
    @XmlElement(name = "RefDocCa")
    private String refDocCa;
    @XmlElement(name = "CustMat35")
    private String custMat35;
    @XmlElement(name = "ExchRateFiV")
    private BigDecimal exchRateFiV;
    @XmlElement(name = "ExchgRateV")
    private BigDecimal exchgRateV;
    @XmlElement(name = "ItemguidAtp")
    private String itemguidAtp;
    @XmlElement(name = "ValContr")
    private String valContr;
    @XmlElement(name = "ValConI")
    private String valConI;
    @XmlElement(name = "ConfigId")
    private String configId;
    @XmlElement(name = "InstId")
    private String instId;
    @XmlElement(name = "MatExt")
    private String matExt;
    @XmlElement(name = "MatGuid")
    private String matGuid;
    @XmlElement(name = "MatVers")
    private String matVers;
    @XmlElement(name = "PMatExt")
    private String pMatExt;
    @XmlElement(name = "PMatGuid")
    private String pMatGuid;
    @XmlElement(name = "PMatVers")
    private String pMatVers;
    @XmlElement(name = "FuncArea")
    private String funcArea;
    @XmlElement(name = "AlternBom")
    private String alternBom;
    @XmlElement(name = "FkkConacct")
    private String fkkConacct;
    @XmlElement(name = "EanUpc")
    private String eanUpc;
    @XmlElement(name = "Prodcat")
    private String prodcat;
    @XmlElement(name = "ShipType")
    private String shipType;
    @XmlElement(name = "SProcInd")
    private String sProcInd;
    @XmlElement(name = "FuncAreaLong")
    private String funcAreaLong;
    @XmlElement(name = "BillRel")
    private String billRel;
    @XmlElement(name = "VwUepos")
    private String vwUepos;
    @XmlElement(name = "Campaign")
    private String campaign;
    @XmlElement(name = "Dlvschduse")
    private String dlvschduse;
    @XmlElement(name = "CfopLong")
    private String cfopLong;
    @XmlElement(name = "Selection")
    private String selection;
    @XmlElement(name = "MatEntrd")
    private String matEntrd;
    @XmlElement(name = "LogSystemOwn")
    private String logSystemOwn;
    @XmlElement(name = "ItmTypeUsage")
    private String itmTypeUsage;
    @XmlElement(name = "Taxlawiss")
    private String taxlawiss;
    @XmlElement(name = "MatEntrdExternal")
    private String matEntrdExternal;
    @XmlElement(name = "MatEntrdGuid")
    private String matEntrdGuid;
    @XmlElement(name = "MatEntrdVersion")
    private String matEntrdVersion;
    @XmlElement(name = "LocTaxcat")
    private String locTaxcat;
    @XmlElement(name = "LocZerovat")
    private String locZerovat;
    @XmlElement(name = "LocActcode")
    private String locActcode;
    @XmlElement(name = "LocDisttype")
    private String locDisttype;
    @XmlElement(name = "LocTxrelclas")
    private String locTxrelclas;
    @XmlElement(name = "CalcMotive")
    private String calcMotive;

    
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getHgLvItem() {
		return hgLvItem;
	}
	public void setHgLvItem(String hgLvItem) {
		this.hgLvItem = hgLvItem;
	}
	public String getPoItmNo() {
		return poItmNo;
	}
	public void setPoItmNo(String poItmNo) {
		this.poItmNo = poItmNo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getAltToItm() {
		return altToItm;
	}
	public void setAltToItm(String altToItm) {
		this.altToItm = altToItm;
	}
	public String getCustMat22() {
		return custMat22;
	}
	public void setCustMat22(String custMat22) {
		this.custMat22 = custMat22;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDlvGroup() {
		return dlvGroup;
	}
	public void setDlvGroup(String dlvGroup) {
		this.dlvGroup = dlvGroup;
	}
	public String getPartDlv() {
		return partDlv;
	}
	public void setPartDlv(String partDlv) {
		this.partDlv = partDlv;
	}
	public String getReasonRej() {
		return reasonRej;
	}
	public void setReasonRej(String reasonRej) {
		this.reasonRej = reasonRej;
	}
	public String getBillBlock() {
		return billBlock;
	}
	public void setBillBlock(String billBlock) {
		this.billBlock = billBlock;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getStoreLoc() {
		return storeLoc;
	}
	public void setStoreLoc(String storeLoc) {
		this.storeLoc = storeLoc;
	}
	public BigDecimal getTargetQty() {
		return targetQty;
	}
	public void setTargetQty(BigDecimal targetQty) {
		this.targetQty = targetQty;
	}
	public String getTargetQu() {
		return targetQu;
	}
	public void setTargetQu(String targetQu) {
		this.targetQu = targetQu;
	}
	public String gettUnitISO() {
		return tUnitISO;
	}
	public void settUnitISO(String tUnitISO) {
		this.tUnitISO = tUnitISO;
	}
	public String getItemCateg() {
		return itemCateg;
	}
	public void setItemCateg(String itemCateg) {
		this.itemCateg = itemCateg;
	}
	public String getShortText() {
		return shortText;
	}
	public void setShortText(String shortText) {
		this.shortText = shortText;
	}
	public String getPrcGroup1() {
		return prcGroup1;
	}
	public void setPrcGroup1(String prcGroup1) {
		this.prcGroup1 = prcGroup1;
	}
	public String getPrcGroup2() {
		return prcGroup2;
	}
	public void setPrcGroup2(String prcGroup2) {
		this.prcGroup2 = prcGroup2;
	}
	public String getPrcGroup3() {
		return prcGroup3;
	}
	public void setPrcGroup3(String prcGroup3) {
		this.prcGroup3 = prcGroup3;
	}
	public String getPrcGroup4() {
		return prcGroup4;
	}
	public void setPrcGroup4(String prcGroup4) {
		this.prcGroup4 = prcGroup4;
	}
	public String getPrcGroup5() {
		return prcGroup5;
	}
	public void setPrcGroup5(String prcGroup5) {
		this.prcGroup5 = prcGroup5;
	}
	public String getProdHiera() {
		return prodHiera;
	}
	public void setProdHiera(String prodHiera) {
		this.prodHiera = prodHiera;
	}
	public String getMatlGroup() {
		return matlGroup;
	}
	public void setMatlGroup(String matlGroup) {
		this.matlGroup = matlGroup;
	}
	public String getPurchNoC() {
		return purchNoC;
	}
	public void setPurchNoC(String purchNoC) {
		this.purchNoC = purchNoC;
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
	public String getRef1() {
		return ref1;
	}
	public void setRef1(String ref1) {
		this.ref1 = ref1;
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
	public String getPoitmNoS() {
		return poitmNoS;
	}
	public void setPoitmNoS(String poitmNoS) {
		this.poitmNoS = poitmNoS;
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
	public String getIncoterms1() {
		return incoterms1;
	}
	public void setIncoterms1(String incoterms1) {
		this.incoterms1 = incoterms1;
	}
	public String getIncoterms2() {
		return incoterms2;
	}
	public void setIncoterms2(String incoterms2) {
		this.incoterms2 = incoterms2;
	}
	public String getOrdcompIn() {
		return ordcompIn;
	}
	public void setOrdcompIn(String ordcompIn) {
		this.ordcompIn = ordcompIn;
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
	public BigDecimal getExRateFi() {
		return exRateFi;
	}
	public void setExRateFi(BigDecimal exRateFi) {
		this.exRateFi = exRateFi;
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
	public String getPmnttrms() {
		return pmnttrms;
	}
	public void setPmnttrms(String pmnttrms) {
		this.pmnttrms = pmnttrms;
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
	public String getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(String priceDate) {
		this.priceDate = priceDate;
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
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getPmtgarPro() {
		return pmtgarPro;
	}
	public void setPmtgarPro(String pmtgarPro) {
		this.pmtgarPro = pmtgarPro;
	}
	public String getDocNumFi() {
		return docNumFi;
	}
	public void setDocNumFi(String docNumFi) {
		this.docNumFi = docNumFi;
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
	public String getCstcndgrp1() {
		return cstcndgrp1;
	}
	public void setCstcndgrp1(String cstcndgrp1) {
		this.cstcndgrp1 = cstcndgrp1;
	}
	public String getCstcndgrp2() {
		return cstcndgrp2;
	}
	public void setCstcndgrp2(String cstcndgrp2) {
		this.cstcndgrp2 = cstcndgrp2;
	}
	public String getCstcndgrp3() {
		return cstcndgrp3;
	}
	public void setCstcndgrp3(String cstcndgrp3) {
		this.cstcndgrp3 = cstcndgrp3;
	}
	public String getCstcndgrp4() {
		return cstcndgrp4;
	}
	public void setCstcndgrp4(String cstcndgrp4) {
		this.cstcndgrp4 = cstcndgrp4;
	}
	public String getCstcndgrp5() {
		return cstcndgrp5;
	}
	public void setCstcndgrp5(String cstcndgrp5) {
		this.cstcndgrp5 = cstcndgrp5;
	}
	public String getDlvTime() {
		return dlvTime;
	}
	public void setDlvTime(String dlvTime) {
		this.dlvTime = dlvTime;
	}
	public String getSalesUnit() {
		return salesUnit;
	}
	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}
	public String getsUnitIso() {
		return sUnitIso;
	}
	public void setsUnitIso(String sUnitIso) {
		this.sUnitIso = sUnitIso;
	}
	public BigDecimal getTrgQtyNo() {
		return trgQtyNo;
	}
	public void setTrgQtyNo(BigDecimal trgQtyNo) {
		this.trgQtyNo = trgQtyNo;
	}
	public BigDecimal getTrgqtyDen() {
		return trgqtyDen;
	}
	public void setTrgqtyDen(BigDecimal trgqtyDen) {
		this.trgqtyDen = trgqtyDen;
	}
	public BigDecimal getRnddlvQty() {
		return rnddlvQty;
	}
	public void setRnddlvQty(BigDecimal rnddlvQty) {
		this.rnddlvQty = rnddlvQty;
	}
	public BigDecimal getMaxdevamnt() {
		return maxdevamnt;
	}
	public void setMaxdevamnt(BigDecimal maxdevamnt) {
		this.maxdevamnt = maxdevamnt;
	}
	public BigDecimal getMaxdevper() {
		return maxdevper;
	}
	public void setMaxdevper(BigDecimal maxdevper) {
		this.maxdevper = maxdevper;
	}
	public BigDecimal getMaxdevDay() {
		return maxdevDay;
	}
	public void setMaxdevDay(BigDecimal maxdevDay) {
		this.maxdevDay = maxdevDay;
	}
	public String getUsageInd() {
		return usageInd;
	}
	public void setUsageInd(String usageInd) {
		this.usageInd = usageInd;
	}
	public String getFixedQuan() {
		return fixedQuan;
	}
	public void setFixedQuan(String fixedQuan) {
		this.fixedQuan = fixedQuan;
	}
	public String getUnlmtDlv() {
		return unlmtDlv;
	}
	public void setUnlmtDlv(String unlmtDlv) {
		this.unlmtDlv = unlmtDlv;
	}
	public BigDecimal getOverdlvtol() {
		return overdlvtol;
	}
	public void setOverdlvtol(BigDecimal overdlvtol) {
		this.overdlvtol = overdlvtol;
	}
	public String getUnddlvTol() {
		return unddlvTol;
	}
	public void setUnddlvTol(String unddlvTol) {
		this.unddlvTol = unddlvTol;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public BigDecimal getSalqtynum() {
		return salqtynum;
	}
	public void setSalqtynum(BigDecimal salqtynum) {
		this.salqtynum = salqtynum;
	}
	public BigDecimal getSalqtyden() {
		return salqtyden;
	}
	public void setSalqtyden(BigDecimal salqtyden) {
		this.salqtyden = salqtyden;
	}
	public BigDecimal getGrossWght() {
		return grossWght;
	}
	public void setGrossWght(BigDecimal grossWght) {
		this.grossWght = grossWght;
	}
	public BigDecimal getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(BigDecimal netWeight) {
		this.netWeight = netWeight;
	}
	public String getUntofWght() {
		return untofWght;
	}
	public void setUntofWght(String untofWght) {
		this.untofWght = untofWght;
	}
	public String getUnofWtiso() {
		return unofWtiso;
	}
	public void setUnofWtiso(String unofWtiso) {
		this.unofWtiso = unofWtiso;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public String getVolunit() {
		return volunit;
	}
	public void setVolunit(String volunit) {
		this.volunit = volunit;
	}
	public String getVolunitiso() {
		return volunitiso;
	}
	public void setVolunitiso(String volunitiso) {
		this.volunitiso = volunitiso;
	}
	public String getDlvPrio() {
		return dlvPrio;
	}
	public void setDlvPrio(String dlvPrio) {
		this.dlvPrio = dlvPrio;
	}
	public String getShipPoint() {
		return shipPoint;
	}
	public void setShipPoint(String shipPoint) {
		this.shipPoint = shipPoint;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getTaxClass1() {
		return taxClass1;
	}
	public void setTaxClass1(String taxClass1) {
		this.taxClass1 = taxClass1;
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
	public String getMatPrGrp() {
		return matPrGrp;
	}
	public void setMatPrGrp(String matPrGrp) {
		this.matPrGrp = matPrGrp;
	}
	public String getValType() {
		return valType;
	}
	public void setValType(String valType) {
		this.valType = valType;
	}
	public String getFixdatQty() {
		return fixdatQty;
	}
	public void setFixdatQty(String fixdatQty) {
		this.fixdatQty = fixdatQty;
	}
	public String getBomexplNo() {
		return bomexplNo;
	}
	public void setBomexplNo(String bomexplNo) {
		this.bomexplNo = bomexplNo;
	}
	public String getResanalkey() {
		return resanalkey;
	}
	public void setResanalkey(String resanalkey) {
		this.resanalkey = resanalkey;
	}
	public String getReqmtsTyp() {
		return reqmtsTyp;
	}
	public void setReqmtsTyp(String reqmtsTyp) {
		this.reqmtsTyp = reqmtsTyp;
	}
	public String getNoGrPost() {
		return noGrPost;
	}
	public void setNoGrPost(String noGrPost) {
		this.noGrPost = noGrPost;
	}
	public String getBusTranst() {
		return busTranst;
	}
	public void setBusTranst(String busTranst) {
		this.busTranst = busTranst;
	}
	public String getOverhdKey() {
		return overhdKey;
	}
	public void setOverhdKey(String overhdKey) {
		this.overhdKey = overhdKey;
	}
	public String getCstgSheet() {
		return cstgSheet;
	}
	public void setCstgSheet(String cstgSheet) {
		this.cstgSheet = cstgSheet;
	}
	public String getMatfrgtgrp() {
		return matfrgtgrp;
	}
	public void setMatfrgtgrp(String matfrgtgrp) {
		this.matfrgtgrp = matfrgtgrp;
	}
	public String getPldlvshdin() {
		return pldlvshdin;
	}
	public void setPldlvshdin(String pldlvshdin) {
		this.pldlvshdin = pldlvshdin;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getBilForm() {
		return bilForm;
	}
	public void setBilForm(String bilForm) {
		this.bilForm = bilForm;
	}
	public String getDliProfil() {
		return dliProfil;
	}
	public void setDliProfil(String dliProfil) {
		this.dliProfil = dliProfil;
	}
	public String getRevType() {
		return revType;
	}
	public void setRevType(String revType) {
		this.revType = revType;
	}
	public String getBegdemPer() {
		return begdemPer;
	}
	public void setBegdemPer(String begdemPer) {
		this.begdemPer = begdemPer;
	}
	public String getPrRefMat() {
		return prRefMat;
	}
	public void setPrRefMat(String prRefMat) {
		this.prRefMat = prRefMat;
	}
	public String getRefobjtype() {
		return refobjtype;
	}
	public void setRefobjtype(String refobjtype) {
		this.refobjtype = refobjtype;
	}
	public String getRefobjkey() {
		return refobjkey;
	}
	public void setRefobjkey(String refobjkey) {
		this.refobjkey = refobjkey;
	}
	public String getReflogsys() {
		return reflogsys;
	}
	public void setReflogsys(String reflogsys) {
		this.reflogsys = reflogsys;
	}
	public String getOrderProb() {
		return orderProb;
	}
	public void setOrderProb(String orderProb) {
		this.orderProb = orderProb;
	}
	public BigDecimal getMaxPlDlv() {
		return maxPlDlv;
	}
	public void setMaxPlDlv(BigDecimal maxPlDlv) {
		this.maxPlDlv = maxPlDlv;
	}
	public String getCfopCode() {
		return cfopCode;
	}
	public void setCfopCode(String cfopCode) {
		this.cfopCode = cfopCode;
	}
	public String getTaxlawicms() {
		return taxlawicms;
	}
	public void setTaxlawicms(String taxlawicms) {
		this.taxlawicms = taxlawicms;
	}
	public String getTaxlawipi() {
		return taxlawipi;
	}
	public void setTaxlawipi(String taxlawipi) {
		this.taxlawipi = taxlawipi;
	}
	public String getSdTaxcode() {
		return sdTaxcode;
	}
	public void setSdTaxcode(String sdTaxcode) {
		this.sdTaxcode = sdTaxcode;
	}
	public String getAssortMod() {
		return assortMod;
	}
	public void setAssortMod(String assortMod) {
		this.assortMod = assortMod;
	}
	public BigDecimal getCompQuant() {
		return compQuant;
	}
	public void setCompQuant(BigDecimal compQuant) {
		this.compQuant = compQuant;
	}
	public BigDecimal getTargetVal() {
		return targetVal;
	}
	public void setTargetVal(BigDecimal targetVal) {
		this.targetVal = targetVal;
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
	public String getProfitCtr() {
		return profitCtr;
	}
	public void setProfitCtr(String profitCtr) {
		this.profitCtr = profitCtr;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getWbsElem() {
		return wbsElem;
	}
	public void setWbsElem(String wbsElem) {
		this.wbsElem = wbsElem;
	}
	public BigDecimal getDeprecPer() {
		return deprecPer;
	}
	public void setDeprecPer(BigDecimal deprecPer) {
		this.deprecPer = deprecPer;
	}
	public String getRefDoc() {
		return refDoc;
	}
	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}
	public String getRefDocIt() {
		return refDocIt;
	}
	public void setRefDocIt(String refDocIt) {
		this.refDocIt = refDocIt;
	}
	public String getRefDocCa() {
		return refDocCa;
	}
	public void setRefDocCa(String refDocCa) {
		this.refDocCa = refDocCa;
	}
	public String getCustMat35() {
		return custMat35;
	}
	public void setCustMat35(String custMat35) {
		this.custMat35 = custMat35;
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
	public String getItemguidAtp() {
		return itemguidAtp;
	}
	public void setItemguidAtp(String itemguidAtp) {
		this.itemguidAtp = itemguidAtp;
	}
	public String getValContr() {
		return valContr;
	}
	public void setValContr(String valContr) {
		this.valContr = valContr;
	}
	public String getValConI() {
		return valConI;
	}
	public void setValConI(String valConI) {
		this.valConI = valConI;
	}
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getMatExt() {
		return matExt;
	}
	public void setMatExt(String matExt) {
		this.matExt = matExt;
	}
	public String getMatGuid() {
		return matGuid;
	}
	public void setMatGuid(String matGuid) {
		this.matGuid = matGuid;
	}
	public String getMatVers() {
		return matVers;
	}
	public void setMatVers(String matVers) {
		this.matVers = matVers;
	}
	public String getpMatExt() {
		return pMatExt;
	}
	public void setpMatExt(String pMatExt) {
		this.pMatExt = pMatExt;
	}
	public String getpMatGuid() {
		return pMatGuid;
	}
	public void setpMatGuid(String pMatGuid) {
		this.pMatGuid = pMatGuid;
	}
	public String getpMatVers() {
		return pMatVers;
	}
	public void setpMatVers(String pMatVers) {
		this.pMatVers = pMatVers;
	}
	public String getFuncArea() {
		return funcArea;
	}
	public void setFuncArea(String funcArea) {
		this.funcArea = funcArea;
	}
	public String getAlternBom() {
		return alternBom;
	}
	public void setAlternBom(String alternBom) {
		this.alternBom = alternBom;
	}
	public String getFkkConacct() {
		return fkkConacct;
	}
	public void setFkkConacct(String fkkConacct) {
		this.fkkConacct = fkkConacct;
	}
	public String getEanUpc() {
		return eanUpc;
	}
	public void setEanUpc(String eanUpc) {
		this.eanUpc = eanUpc;
	}
	public String getProdcat() {
		return prodcat;
	}
	public void setProdcat(String prodcat) {
		this.prodcat = prodcat;
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
	public String getFuncAreaLong() {
		return funcAreaLong;
	}
	public void setFuncAreaLong(String funcAreaLong) {
		this.funcAreaLong = funcAreaLong;
	}
	public String getBillRel() {
		return billRel;
	}
	public void setBillRel(String billRel) {
		this.billRel = billRel;
	}
	public String getVwUepos() {
		return vwUepos;
	}
	public void setVwUepos(String vwUepos) {
		this.vwUepos = vwUepos;
	}
	public String getCampaign() {
		return campaign;
	}

	public String getDlvschduse() {
		return dlvschduse;
	}
	public void setDlvschduse(String dlvschduse) {
		this.dlvschduse = dlvschduse;
	}
	public String getCfopLong() {
		return cfopLong;
	}
	public void setCfopLong(String cfopLong) {
		this.cfopLong = cfopLong;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public String getMatEntrd() {
		return matEntrd;
	}
	public void setMatEntrd(String matEntrd) {
		this.matEntrd = matEntrd;
	}
	public String getLogSystemOwn() {
		return logSystemOwn;
	}
	public void setLogSystemOwn(String logSystemOwn) {
		this.logSystemOwn = logSystemOwn;
	}
	public String getItmTypeUsage() {
		return itmTypeUsage;
	}
	public void setItmTypeUsage(String itmTypeUsage) {
		this.itmTypeUsage = itmTypeUsage;
	}
	public String getTaxlawiss() {
		return taxlawiss;
	}
	public void setTaxlawiss(String taxlawiss) {
		this.taxlawiss = taxlawiss;
	}
	public String getMatEntrdExternal() {
		return matEntrdExternal;
	}
	public void setMatEntrdExternal(String matEntrdExternal) {
		this.matEntrdExternal = matEntrdExternal;
	}
	public String getMatEntrdGuid() {
		return matEntrdGuid;
	}
	public void setMatEntrdGuid(String matEntrdGuid) {
		this.matEntrdGuid = matEntrdGuid;
	}
	public String getMatEntrdVersion() {
		return matEntrdVersion;
	}
	public void setMatEntrdVersion(String matEntrdVersion) {
		this.matEntrdVersion = matEntrdVersion;
	}
	public String getLocTaxcat() {
		return locTaxcat;
	}
	public void setLocTaxcat(String locTaxcat) {
		this.locTaxcat = locTaxcat;
	}
	public String getLocZerovat() {
		return locZerovat;
	}
	public void setLocZerovat(String locZerovat) {
		this.locZerovat = locZerovat;
	}
	public String getLocActcode() {
		return locActcode;
	}
	public void setLocActcode(String locActcode) {
		this.locActcode = locActcode;
	}
	public String getLocDisttype() {
		return locDisttype;
	}
	public void setLocDisttype(String locDisttype) {
		this.locDisttype = locDisttype;
	}
	public String getLocTxrelclas() {
		return locTxrelclas;
	}
	public void setLocTxrelclas(String locTxrelclas) {
		this.locTxrelclas = locTxrelclas;
	}
	public String getCalcMotive() {
		return calcMotive;
	}
	public void setCalcMotive(String calcMotive) {
		this.calcMotive = calcMotive;
	}
    
    
    
    

}
