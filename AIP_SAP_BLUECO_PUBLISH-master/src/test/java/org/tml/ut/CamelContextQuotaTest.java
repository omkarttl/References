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
public class CamelContextQuotaTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getEmpDataQuota")
	protected ProducerTemplate inputEndpoint;
	
	@EndpointInject(uri = "mock:getEmpDataQuota")
	protected MockEndpoint beanEndpoint;
	
	@EndpointInject(uri = "mock:sap-srfc-destination:rfcDest:ZFTM0007")
	protected MockEndpoint outputEndpoint;


	HashMap<String, Object> hmap = new HashMap<String, Object>();

	@Test
	public void headerMissing() throws Exception {

		hmap.put("pernr_no", "123");
		// hmap.put("begda",null);
		//hmap.put("endda", "123");
		// hmap.put("abwko",null);

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataQuota", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header parameter is missing or null\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	
	@Test
	public void headerParaSize() throws Exception {

		hmap.put("pernr_no", "123456789");
		hmap.put("begda","123");
		hmap.put("endda", "123");
		// hmap.put("abwko",null);

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataQuota", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header parameter size exceeded beyond limit\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	@Test
	public void headerDateType() throws Exception {

		hmap.put("pernr_no", "12345678");
		hmap.put("begda","123");
		hmap.put("endda", "123");
		hmap.put("abwko","A");

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataQuota", "IN PROGRESS", hmap);
		
		System.out.println("Error:-----"+result);
		assertEquals("{\"error\":\"Header begda/endda should have date format dd/mm/yyyy\"}", result);
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
		hmap.put("pernr_no", "12345678");
		hmap.put("begda","12/3/2019");
		hmap.put("endda", "12/3/2019");
		hmap.put("abwko","A");	
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataQuota", "Simulated Error", hmap);
		
		assertEquals("Error Occured. Please check Logs.", result);
		assertMockEndpointsSatisfied(); 
		
	}
	
	
	@Test
	public void correctBody() throws Exception {

		hmap.put("pernr_no", "12345678");
		hmap.put("begda","12/3/2019");
		hmap.put("endda", "12/3/2019");
		hmap.put("abwko","A");
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataQuota", "SUCCESS", hmap);

		assertEquals("SUCCESS", result);
		assertMockEndpointsSatisfied();
	}
	
	

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/employees/quota").to(beanEndpoint).to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}
}