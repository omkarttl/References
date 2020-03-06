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

public class SimulateExceptionJdgTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getAccountDataRest")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:JDG")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testSimulateExceptionTestUsingMock() throws Exception {
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.setException(new Exception("Simulated connection error"));
			}
		});
		String msg = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"Feb\",\n"
				+ "  \"invoiceYear\": \"2020\",\n" + "  \"status\": \"N\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		String result = template.requestBody("direct:getAccountDataRest", msg, String.class);
		assertEquals("\"{\\\"error:\\\"Exception occurred while calling JDG\\\"}\"", result);
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
