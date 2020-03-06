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

public class SimulateExceptionDbTest extends CamelSpringTestSupport {

	@Produce(uri = "cxf:bean:AccountExtractEndpoint")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:sqlComponent:${header.CamelSqlQuery}")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testSimulateExceptionTestUsingMock() throws Exception {
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.setException(new Exception("Simulated connection error"));
			}
		});
		String msg = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status>New</Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date></Invoice_Date>\n"
				+ "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month>Apr</Invoice_Month>\n" + "            <Invoice_Year>2019</Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		String result = template.requestBody("cxf:bean:AccountExtractEndpoint", msg, String.class);
		assertEquals("Exception occurred. Please check logs.", result);
		assertMockEndpointsSatisfied();

	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8086/accountExtract").to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

}
