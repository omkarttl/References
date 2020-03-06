package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class QueryCheckLogicTest extends CamelSpringTestSupport {


	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8080/api/accountExtract").to(outputEndpoint);
			}

		};
	}

	@Produce(uri = "direct:getAccountDataRest")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:check")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testQueryFlagDb() throws Exception {

		String requestBody = "{\n" + 
				"  \"invoiceType\": \"Standard\",\n" + 
				"  \"invoiceNo\": \"\",\n" + 
				"  \"invoiceDate\": \"01-Apr-2019\",\n" + 
				"  \"invoiceEndDate\": \"10-Apr-2019\",\n" + 
				"  \"invoiceMonth\": \"\",\n" + 
				"  \"invoiceYear\": \"\",\n" + 
				"  \"status\": \"New\",\n" + 
				"  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + 
				"  \"salesOrder\": \"\",\n" + 
				"  \"chassisNo\": \"\"\n" + 
				"}";
		template.requestBody("direct:getAccountDataRest", requestBody, String.class);
		
		outputEndpoint.message(0).header("QueryFlag").isEqualTo("drDB");
		assertMockEndpointsSatisfied();
	}
	
	@Test
	public void testQueryFlagJdg() throws Exception {

		String requestBody = "{\n" + 
				"  \"invoiceType\": \"Standard\",\n" + 
				"  \"invoiceNo\": \"\",\n" + 
				"  \"invoiceDate\": \"01-Feb-2020\",\n" + 
				"  \"invoiceEndDate\": \"10-Feb-2020\",\n" + 
				"  \"invoiceMonth\": \"\",\n" + 
				"  \"invoiceYear\": \"\",\n" + 
				"  \"status\": \"New\",\n" + 
				"  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + 
				"  \"salesOrder\": \"\",\n" + 
				"  \"chassisNo\": \"\"\n" + 
				"}";
		template.requestBody("direct:getAccountDataRest", requestBody, String.class);
		
		outputEndpoint.message(0).header("QueryFlag").isEqualTo("jdg");
		assertMockEndpointsSatisfied();
	}
	
	
}