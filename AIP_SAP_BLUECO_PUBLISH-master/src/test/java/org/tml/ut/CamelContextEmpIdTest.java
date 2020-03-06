package org.tml.ut;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.camel.util.StringHelper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;


public class CamelContextEmpIdTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getEmpDataEmpId")
	protected ProducerTemplate inputEndpoint;
	
	@EndpointInject(uri = "mock:getEmpDataEmpId")
	protected MockEndpoint beanEndpoint;
	
	@EndpointInject(uri = "mock:sap-srfc-destination:rfcDest:zfpa0025")
	protected MockEndpoint outputEndpoint;

	
	HashMap<String, Object> hmap = new HashMap<String, Object>();
	

	@Test
	public void headerMissing() throws Exception {

		hmap.put("smartcard_id_no", "");
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataEmpId", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header parameter is missing or null\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	
	@Test
	public void headerParaSize() throws Exception {

		hmap.put("smartcard_id_no", "12345678900");

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataEmpId", "IN PROGRESS", hmap);


		assertEquals("{\"error\":\"Header parameter size exceeded beyond limit\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	@Test 
	public void testSimulateConnectionErrorUsingMock() throws Exception
	{          
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                exchange.setException(new Exception("Simulated connection error"));
	            }
	        }); 
		hmap.put("smartcard_id_no", "123");
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataEmpId", "Simulated Error", hmap);
		
		assertEquals("Error Occured. Please check Logs.", result);
		assertMockEndpointsSatisfied(); 
		
	}
	
	@Test
	public void correctBody() throws Exception {

		hmap.put("smartcard_id_no", "123");
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataEmpId", "SUCCESS", hmap);

		assertEquals("SUCCESS", result);
		assertMockEndpointsSatisfied();
	}
	
	

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/employees/empId/{smartcard_id_no}").to(beanEndpoint).to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}
}