package org.tml.esb.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
class OrderConditionsIn {
	
	@XmlElement(name = "ItmNumber")
	private String itmNumber;
	@XmlElement(name = "CondStNo")
	private String condStNo;
	@XmlElement(name = "CondCount")
	private String conditionCount;
	@XmlElement(name = "CondType")
	private String conditionType;
	@XmlElement(name = "Condtype")
	private String condType;
	@XmlElement(name = "CondValue")
	private String conditionValue;
	@XmlElement(name = "Currency")
	private String currency;
	@XmlElement(name = "CondUnit")
	private String condUnit;
	@XmlElement(name = "CondPUnt")
	private String condPUnt;
	@XmlElement(name = "CurrIso")
	private String currIso;
	@XmlElement(name = "CdUntIso")
	private String cdUntIso;
	@XmlElement(name = "Refobjtype")
	private String refobjtype;
	@XmlElement(name = "Refobjkey")
	private String refobjkey;
	@XmlElement(name = "Reflogsys")
	private String reflogsys;
	@XmlElement(name = "Applicatio")
	private String application;
	@XmlElement(name = "Conpricdat")
	private String conpricDat;
	@XmlElement(name = "Calctypcon")
	private String calcTypCon;
	@XmlElement(name = "Conbaseval")
	private String conBaseVal;
	@XmlElement(name = "Conexchrat")
	private String conexChrat;
	@XmlElement(name = "Numconvert")
	private String numConvert;
	@XmlElement(name = "Denominato")
	private String denominator;
	@XmlElement(name = "StatCon")
	private String statCon;
	@XmlElement(name = "Scaletype")
	private String scaleType;
	@XmlElement(name = "Accruals")
	private String accruals;
	@XmlElement(name = "Coninvolst")
	private String conInvolst;
	@XmlElement(name = "Condorigin")
	private String condOrigin;
	@XmlElement(name = "Groupcond")
	private String groupCond;
	@XmlElement(name = "CondUpdat")
	private String condUpdat;
	@XmlElement(name = "AccessSeq")
	private String accessSeq;
	@XmlElement(name = "Roundoffdi")
	private String roundOffDi;
	@XmlElement(name = "Condvalue")
	private String condValue;
	@XmlElement(name = "Condcount")
	private String condCount;
	@XmlElement(name = "Currency2")
	private String currency2;
	@XmlElement(name = "CurrIso2")
	private String currIso2;
	@XmlElement(name = "Condcntrl")
	private String condCntrl;
	@XmlElement(name = "Condisacti")
	private String condIsacti;
	@XmlElement(name = "Condclass")
	private String condClass;
	@XmlElement(name = "Factbasval")
	private float factBasval;
	@XmlElement(name = "Scalebasin")
	private String scaleBasin;
	@XmlElement(name = "Scalbasval")
	private String scalBasval;
	@XmlElement(name = "Unitmeasur")
	private String unitMeasur;
	@XmlElement(name = "IsoUnit")
	private String isoUnit;
	@XmlElement(name = "Currenckey")
	private String currencKey;
	@XmlElement(name = "Curreniso")
	private String currenIso;
	@XmlElement(name = "Condincomp")
	private String condinComp;
	@XmlElement(name = "Condconfig")
	private String condConfig;
	@XmlElement(name = "Condchaman")
	private String condChaman;
	@XmlElement(name = "CondNo")
	private String condNo;
	@XmlElement(name = "TaxCode")
	private String taxCode;
	@XmlElement(name = "Varcond")
	private String varCond;
	@XmlElement(name = "Accountkey")
	private String accountKey;
	@XmlElement(name = "AccountKe")
	private String accountKe;
	@XmlElement(name = "WtWithcd")
	private String wtWithcd;
	@XmlElement(name = "Structcond")
	private String structCond;
	@XmlElement(name = "Factconbas")
	private float factConBas;
	@XmlElement(name = "Condcoinhd")
	private String condCoinhd;
	public String getItmNumber() {
		return itmNumber;
	}
	public void setItmNumber(String itmNumber) {
		this.itmNumber = itmNumber;
	}
	public String getCondStNo() {
		return condStNo;
	}
	public void setCondStNo(String condStNo) {
		this.condStNo = condStNo;
	}
	public String getConditionCount() {
		return conditionCount;
	}
	public void setConditionCount(String conditionCount) {
		this.conditionCount = conditionCount;
	}
	public String getConditionType() {
		return conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}
	public String getCondType() {
		return condType;
	}
	public void setCondType(String condType) {
		this.condType = condType;
	}
	public String getConditionValue() {
		return conditionValue;
	}
	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCondUnit() {
		return condUnit;
	}
	public void setCondUnit(String condUnit) {
		this.condUnit = condUnit;
	}
	public String getCondPUnt() {
		return condPUnt;
	}
	public void setCondPUnt(String condPUnt) {
		this.condPUnt = condPUnt;
	}
	public String getCurrIso() {
		return currIso;
	}
	public void setCurrIso(String currIso) {
		this.currIso = currIso;
	}
	public String getCdUntIso() {
		return cdUntIso;
	}
	public void setCdUntIso(String cdUntIso) {
		this.cdUntIso = cdUntIso;
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
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getConpricDat() {
		return conpricDat;
	}
	public void setConpricDat(String conpricDat) {
		this.conpricDat = conpricDat;
	}
	public String getCalcTypCon() {
		return calcTypCon;
	}
	public void setCalcTypCon(String calcTypCon) {
		this.calcTypCon = calcTypCon;
	}
	public String getConBaseVal() {
		return conBaseVal;
	}
	public void setConBaseVal(String conBaseVal) {
		this.conBaseVal = conBaseVal;
	}
	public String getConexChrat() {
		return conexChrat;
	}
	public void setConexChrat(String conexChrat) {
		this.conexChrat = conexChrat;
	}
	public String getNumConvert() {
		return numConvert;
	}
	public void setNumConvert(String numConvert) {
		this.numConvert = numConvert;
	}
	public String getDenominator() {
		return denominator;
	}
	public void setDenominator(String denominator) {
		this.denominator = denominator;
	}
	public String getStatCon() {
		return statCon;
	}
	public void setStatCon(String statCon) {
		this.statCon = statCon;
	}
	public String getScaleType() {
		return scaleType;
	}
	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
	}
	public String getAccruals() {
		return accruals;
	}
	public void setAccruals(String accruals) {
		this.accruals = accruals;
	}
	public String getConInvolst() {
		return conInvolst;
	}
	public void setConInvolst(String conInvolst) {
		this.conInvolst = conInvolst;
	}
	public String getCondOrigin() {
		return condOrigin;
	}
	public void setCondOrigin(String condOrigin) {
		this.condOrigin = condOrigin;
	}
	public String getGroupCond() {
		return groupCond;
	}
	public void setGroupCond(String groupCond) {
		this.groupCond = groupCond;
	}
	public String getCondUpdat() {
		return condUpdat;
	}
	public void setCondUpdat(String condUpdat) {
		this.condUpdat = condUpdat;
	}
	public String getAccessSeq() {
		return accessSeq;
	}
	public void setAccessSeq(String accessSeq) {
		this.accessSeq = accessSeq;
	}
	public String getRoundOffDi() {
		return roundOffDi;
	}
	public void setRoundOffDi(String roundOffDi) {
		this.roundOffDi = roundOffDi;
	}
	public String getCondValue() {
		return condValue;
	}
	public void setCondValue(String condValue) {
		this.condValue = condValue;
	}
	public String getCondCount() {
		return condCount;
	}
	public void setCondCount(String condCount) {
		this.condCount = condCount;
	}
	public String getCurrency2() {
		return currency2;
	}
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}
	public String getCurrIso2() {
		return currIso2;
	}
	public void setCurrIso2(String currIso2) {
		this.currIso2 = currIso2;
	}
	public String getCondCntrl() {
		return condCntrl;
	}
	public void setCondCntrl(String condCntrl) {
		this.condCntrl = condCntrl;
	}
	public String getCondIsacti() {
		return condIsacti;
	}
	public void setCondIsacti(String condIsacti) {
		this.condIsacti = condIsacti;
	}
	public String getCondClass() {
		return condClass;
	}
	public void setCondClass(String condClass) {
		this.condClass = condClass;
	}
	public float getFactBasval() {
		return factBasval;
	}
	public void setFactBasval(float factBasval) {
		this.factBasval = factBasval;
	}
	public String getScaleBasin() {
		return scaleBasin;
	}
	public void setScaleBasin(String scaleBasin) {
		this.scaleBasin = scaleBasin;
	}
	public String getScalBasval() {
		return scalBasval;
	}
	public void setScalBasval(String scalBasval) {
		this.scalBasval = scalBasval;
	}
	public String getUnitMeasur() {
		return unitMeasur;
	}
	public void setUnitMeasur(String unitMeasur) {
		this.unitMeasur = unitMeasur;
	}
	public String getIsoUnit() {
		return isoUnit;
	}
	public void setIsoUnit(String isoUnit) {
		this.isoUnit = isoUnit;
	}
	public String getCurrencKey() {
		return currencKey;
	}
	public void setCurrencKey(String currencKey) {
		this.currencKey = currencKey;
	}
	public String getCurrenIso() {
		return currenIso;
	}
	public void setCurrenIso(String currenIso) {
		this.currenIso = currenIso;
	}
	public String getCondinComp() {
		return condinComp;
	}
	public void setCondinComp(String condinComp) {
		this.condinComp = condinComp;
	}
	public String getCondConfig() {
		return condConfig;
	}
	public void setCondConfig(String condConfig) {
		this.condConfig = condConfig;
	}
	public String getCondChaman() {
		return condChaman;
	}
	public void setCondChaman(String condChaman) {
		this.condChaman = condChaman;
	}
	public String getCondNo() {
		return condNo;
	}
	public void setCondNo(String condNo) {
		this.condNo = condNo;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getVarCond() {
		return varCond;
	}
	public void setVarCond(String varCond) {
		this.varCond = varCond;
	}
	public String getAccountKey() {
		return accountKey;
	}
	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}
	public String getAccountKe() {
		return accountKe;
	}
	public void setAccountKe(String accountKe) {
		this.accountKe = accountKe;
	}
	public String getWtWithcd() {
		return wtWithcd;
	}
	public void setWtWithcd(String wtWithcd) {
		this.wtWithcd = wtWithcd;
	}
	public String getStructCond() {
		return structCond;
	}
	public void setStructCond(String structCond) {
		this.structCond = structCond;
	}
	public float getFactConBas() {
		return factConBas;
	}
	public void setFactConBas(float factConBas) {
		this.factConBas = factConBas;
	}
	public String getCondCoinhd() {
		return condCoinhd;
	}
	public void setCondCoinhd(String condCoinhd) {
		this.condCoinhd = condCoinhd;
	}
}
