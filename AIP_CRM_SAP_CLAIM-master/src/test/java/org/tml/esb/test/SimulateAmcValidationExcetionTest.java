package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulateAmcValidationExcetionTest extends CamelSpringTestSupport {

	@EndpointInject(uri = "mock:sap_validation")
	protected MockEndpoint outputEndpoint;

	@Test 
	public void testSimulateGenericExceptionUsingMock() throws Exception
	{          
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                exchange.setException(new Exception("Simulated Generic Exception"));
	            }
	        }); 
		String msg = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.web.homologation.transport.nic/\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "    "
				+ "  <ZSDRFC_AMC_CONTRACT_VALIDATION>\n" +
				"        <CONTRACT_NO>8200640657</CONTRACT_NO>\n" +
				"        <CHASSIS_NO>MAT403713AND04249</CHASSIS_NO>\n" +
				"        <CHASSIS_PL>SAFARI DICOR 2.2 LX 4X2 MFL</CHASSIS_PL>\n" +
				"        <IT_AMC>\n" +
				"            <item>\n" +
				"                <ITEM_TYPE>J</ITEM_TYPE>\n" +
				"                <ITEM_ID>1-BVU8RSK</ITEM_ID>\n" +
				"                <MATERIAL>013000</MATERIAL>\n" +
				"                <QTY>1</QTY>\n" +
				"                <FLAG></FLAG>\n" +
				"                <REMARKS></REMARKS>\n" +
				"            </item>\n" +
				"        </IT_AMC>\n" +
				"        <CRM_SALE_DATE>2019-08-01</CRM_SALE_DATE>\n" +
				"        <KMS>20001</KMS>\n" +
				"    </ZSDRFC_AMC_CONTRACT_VALIDATION>\n" + "</soapenv:Body>\n" +
				"	</soapenv:Envelope>";

		String result = template.requestBody("cxf:bean:amcClaimVal", msg, String.class);

		assertEquals("Error Occurred. Please check Logs.", result);
		assertMockEndpointsSatisfied(); 

	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8086/amcClaimVal").to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

}
