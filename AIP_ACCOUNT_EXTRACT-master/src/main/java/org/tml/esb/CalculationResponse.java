package org.tml.esb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.Exchange;

public class CalculationResponse {

	private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	public void calulateLogic(Exchange exchange) throws Exception {

		try {
			AccountExtractResponse acctRes = exchange.getIn().getBody(AccountExtractResponse.class);
			if (acctRes.getItemDtlAmt() == null || acctRes.getItemDtlAmt().length() == 0) {
				acctRes.setItemDtlAmt("0");
			}
			/* if (acctRes.getAttrib01() == null || acctRes.getAttrib01().length() == 0) {
				acctRes.setAttrib01("0");
			} */
			if (acctRes.getAttrib16() == null || acctRes.getAttrib16().length() == 0) {
				acctRes.setAttrib16("0");
			}
			if (acctRes.getAttrib17() == null || acctRes.getAttrib17().length() == 0) {
				acctRes.setAttrib17("0");
			}
			if (acctRes.getAttrib18() == null || acctRes.getAttrib18().length() == 0) {
				acctRes.setAttrib18("0");
			}
			if (acctRes.getAttrib19() == null || acctRes.getAttrib19().length() == 0) {
				acctRes.setAttrib19("0");
			}
			if (acctRes.getAttrib21() == null || acctRes.getAttrib21().length() == 0) {
				acctRes.setAttrib21("1");
			}
			if (acctRes.getAttrib22() == null || acctRes.getAttrib22().length() == 0) {
				acctRes.setAttrib22("0");
			}
			if (acctRes.getxOrdItmDscntAmt() == null || acctRes.getxOrdItmDscntAmt().length() == 0) {
				acctRes.setxOrdItmDscntAmt("0");
			}
			if (acctRes.getTaxAmt() == null || acctRes.getTaxAmt().length() == 0) {
				acctRes.setTaxAmt("0");
			}
			if (acctRes.getTaxRate() == null || acctRes.getTaxRate().length() == 0) {
				acctRes.setTaxRate("1");
			}

			if (acctRes.getOrderNum() == null || acctRes.getOrderNum().length() == 0) {
				acctRes.setOrderNum("");
			}
			if (acctRes.getxSerialNum() == null || acctRes.getxSerialNum().length() == 0) {
				acctRes.setxSerialNum("");
			}
			if (acctRes.getxEngineNum() == null || acctRes.getxEngineNum().length() == 0) {
				acctRes.setxEngineNum("");
			}
			if (acctRes.getName() == null || acctRes.getName().length() == 0) {
				acctRes.setName("");
			}
			if (acctRes.getxItemColor() == null || acctRes.getxItemColor().length() == 0) {
				acctRes.setxItemColor("");
			}
			if (acctRes.getLogin() == null || acctRes.getLogin().length() == 0) {
				acctRes.setLogin("");
			}
			if (acctRes.getHypothecation() == null || acctRes.getHypothecation().length() == 0) {
				acctRes.setHypothecation("");
			}

			double totalOrderValue = (Double.parseDouble(acctRes.getItemDtlAmt())
					+ Double.parseDouble(acctRes.getAttrib16())
					+ ((Double.parseDouble(acctRes.getAttrib22()) / Double.parseDouble(acctRes.getAttrib21())))
					+ Double.parseDouble(acctRes.getAttrib17()) + Double.parseDouble(acctRes.getAttrib18())
					+ (Double.parseDouble(acctRes.getAttrib19()) - Double.parseDouble(acctRes.getxOrdItmDscntAmt())));

			String narration = "Ord Num -" + acctRes.getOrderNum() + " Chassis -" + acctRes.getxSerialNum()
					+ " Engine -" + acctRes.getxEngineNum() + " Model -" + acctRes.getModel() + " Color -"
					+ acctRes.getxItemColor() + " Sales Person -" + acctRes.getLogin() + " Hyp to -"
					+ acctRes.getSelf() + "" + acctRes.getHypothecation();

			double cgstAssessibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			double sgstAssessibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			double utgstAssessibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			double igstAssessibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			double gstCessAssibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			double kfcAccessibleAmount = ((Double.parseDouble(acctRes.getTaxAmt()) * 100)
					/ Double.parseDouble(acctRes.getTaxRate()));

			String fullName = acctRes.getConFstName() + " " + acctRes.getConMidName() + " " + acctRes.getConLastName();

			acctRes.setTotalOrderValue(String.valueOf(totalOrderValue));
			acctRes.setNarration(narration);
			acctRes.setCgstAssessibleAmount(String.valueOf(cgstAssessibleAmount));
			acctRes.setSgstAssessibleAmount(String.valueOf(sgstAssessibleAmount));
			acctRes.setUtgstAssessibleAmount(String.valueOf(utgstAssessibleAmount));
			acctRes.setIgstAssessibleAmount(String.valueOf(igstAssessibleAmount));
			acctRes.setGstCessAssibleAmount(String.valueOf(gstCessAssibleAmount));
			acctRes.setFullName(fullName);
			acctRes.setOutputCGST(acctRes.getTaxAmt());
			acctRes.setOutputSGST(acctRes.getTaxAmt());
			acctRes.setOutputUTGST(acctRes.getTaxAmt());
			acctRes.setOutputGSTCess(acctRes.getTaxAmt());
			acctRes.setClassficationCGST(acctRes.getTaxRate());
			acctRes.setClassficationSGST(acctRes.getTaxRate());
			acctRes.setClassficationUTGST(acctRes.getTaxRate());
			acctRes.setClassficationIGST(acctRes.getTaxRate());
			acctRes.setKfcAccessibleAmount(String.valueOf(kfcAccessibleAmount));
			acctRes.setKfc(acctRes.getTaxAmt());
			acctRes.setOtherTaxAmount(acctRes.getTaxAmt());
		      //acctRes.setRoadCess(acctRes.getTaxAmt());
			acctRes.setClassficationGSTCess(acctRes.getTaxRate());

			exchange.getOut().setBody(acctRes);

		} catch (Exception e) {

			logger.error("Exception Occurred ::" + e);
		}
	}
}
