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

public class CitiBankingExceptionTest extends CamelSpringTestSupport {

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
		{
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
				public void process(Exchange exchange) throws Exception {
					exchange.setException(new Exception("Simulated Error"));
				}
			});
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

			assertEquals("{\"error\":\"Exception Occurred\"}", result);
			assertMockEndpointsSatisfied();

		}
	}

}
