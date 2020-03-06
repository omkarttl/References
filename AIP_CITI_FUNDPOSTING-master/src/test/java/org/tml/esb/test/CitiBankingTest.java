package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CitiBankingTest extends CamelSpringTestSupport {

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	@Produce(uri = "direct:cxf:bean:CitiEndpoint")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:SAP")
	protected MockEndpoint outputEndpoint;

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8000/citiBanking").to(outputEndpoint);
			}
		};
	}

	@Test
	public void testRouteException() throws Exception {
		
			String body = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/citi/api/1.0\">\n"
					+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:CITI_NOTIFICATION_API>\n"
					+ "         <!--Optional:-->\n" + "         <Document>\n" + "     <BkToCstmrDbtCdtNtfctn>\n"
					+ "						<GrpHdr>\n" + "							<MsgId>4024253</MsgId>\n"
					+ "							<CreDtTm>2019-12-30T05:08:48</CreDtTm>\n"
					+ "						</GrpHdr>\n" + "                    <Ntfctn>\n"
					+ "                        <Id>1957262340000002</Id>\n"
					+ "                        <CreDtTm>2019-12-30T05:08:48</CreDtTm>\n"
					+ "                        <Acct>\n" + "                            <Id>\n"
					+ "                                <Othr>\n"
					+ "                                    <Id>161XXX2</Id>\n"
					+ "                                </Othr>\n" + "                            </Id>\n"
					+ "                            <Svcr>\n" + "                                <FinInstnId>\n"
					+ "                                    <ClrSysMmbId>\n"
					+ "                                        <MmbId>835</MmbId>\n"
					+ "                                    </ClrSysMmbId>\n"
					+ "                                </FinInstnId>\n" + "                            </Svcr>\n"
					+ "                        </Acct>\n" + "                        <Ntry>\n"
					+ "                            <Amt Ccy=\"INR\">10</Amt>\n"
					+ "                            <CdtDbtInd>CRDT</CdtDbtInd>\n"
					+ "                            <Sts>BOOK</Sts>\n" + "                            <ValDt>\n"
					+ "                                <Dt>2019-12-27</Dt>\n" + "                            </ValDt>\n"
					+ "                            <BkTxCd>\n" + "                                <Prtry>\n"
					+ "                                    <Cd>CRDT</Cd>\n"
					+ "                                </Prtry>\n" + "                            </BkTxCd>\n"
					+ "                            <NtryDtls>\n" + "                                <TxDtls>\n"
					+ "                                    <Refs>\n"
					+ "                                        <AcctSvcrRef>1957262340000002</AcctSvcrRef>\n"
					+ "                                        <EndToEndId>L8004000000</EndToEndId>\n"
					+ "                                    </Refs>\n" + "									<RmtInf>\n"
					+ "										<Ustrd></Ustrd>\n"
					+ "									</RmtInf>\n" + "                                </TxDtls>\n"
					+ "                            </NtryDtls>\n"
					+ "                            <AddtlNtryInf>CVTML8004000000                UTR 1957262340000002 ROHIT R MODI            /BOOKING AMOUNT BY PAYANY1 THRO //U</AddtlNtryInf>\n"
					+ "                        </Ntry>\n" + "                    </Ntfctn>\n"
					+ "                </BkToCstmrDbtCdtNtfctn>\n" + "                </Document>\n"
					+ "      </ns:CITI_NOTIFICATION_API>\n" + "   </soapenv:Body>\n" + "</soapenv:Envelope>";

			String result = template.requestBody("direct:cxf:bean:CitiEndpoint", body, String.class);
			String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					+ "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" "
					+ "xmlns:ns=\"https://tatamotors.com/citi/api/1.0\">"
					+ "<soap:Header/>"
					+ "<soap:Body>"
					+ "<ns:CITI_NOTIFICATION_APIResponse>"
					+ "<E_ACK/>"
					+ "<I_ZFI_BANK_ECOLLECTION_CITI>"
					+ "<item>\n\t\t\t\t"
					+ "<HDFC_REF>CSBKR92018010910000329</HDFC_REF>"
					+ "\n\t\t\t\t<BANK_ACC>HCVTML11E4150</BANK_ACC>\n\t\t\t\t"
					+ "<AMOUNT>100.34</AMOUNT>\n\t\t\t\t"
					+ "<DOC_DATE>2018-05-21</DOC_DATE>\n\t\t\t\t"
					+ "<DEALER>2105500</DEALER>\n\t\t\t\t"
					+ "<BUSTYP>HCVTML</BUSTYP>\n\t\t\t\t"
					+ "<STATUS>1</STATUS>\n\t\t\t\t"
					+ "<UTR_NO>CSBKR92018010910000329</UTR_NO>\n\t\t\t\t"
					+ "<REMARK>0000105500 is not valid</REMARK>\n\t\t\t\t"
					+ "<DEALERD>0000105500</DEALERD>\n\t\t\t\t"
					+ "</item>"
					+ "</I_ZFI_BANK_ECOLLECTION_CITI>"
					+ "</ns:CITI_NOTIFICATION_APIResponse>"
					+ "</soap:Body>"
					+ "</soap:Envelope>";
			assertEquals(response, result);
			assertMockEndpointsSatisfied();

		}
	}


