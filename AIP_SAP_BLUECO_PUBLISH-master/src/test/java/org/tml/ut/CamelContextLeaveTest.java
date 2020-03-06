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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;
public class CamelContextLeaveTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getEmpDataLeave")
	protected ProducerTemplate inputEndpoint;
	
	@EndpointInject(uri = "mock:getEmpDataLeave")
	protected MockEndpoint beanEndpoint;
	
	@EndpointInject(uri = "mock:sap-srfc-destination:rfcDest:ZFTM0009")
	protected MockEndpoint outputEndpoint;

	HashMap<String, Object> hmap = new HashMap<String, Object>();

	@Test
	public void headerMissing() throws Exception {

		hmap.put("pernr_001", "123");
		// hmap.put("subty_006",null);
		//hmap.put("endda_008", "123");
		// hmap.put("begda_007",null);
		// hmap.put("full_first_sec",null);
		// hmap.put("simulation",null);
		// hmap.put("deletion",null);
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataLeave", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header parameter is missing or null\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	
	@Test
	public void headerParaSize() throws Exception {

		hmap.put("pernr_001", "123");
		hmap.put("subty_006","123");
		hmap.put("endda_008", "123");
		hmap.put("begda_007","A");
		// hmap.put("full_first_sec",null);
		hmap.put("simulation","AB");
		// hmap.put("deletion",null);

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataLeave", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header parameter size exceeded beyond limit\"}", result);
		assertMockEndpointsSatisfied();
	}
	
	@Test
	public void headerDateType() throws Exception {

		hmap.put("pernr_001", "12345678");
		hmap.put("subty_006","123");
		hmap.put("endda_008", "123");
		hmap.put("begda_007","A");
		//hmap.put("full_first_sec",null);
		//hmap.put("simulation",null);
		//hmap.put("deletion",null);

		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataLeave", "IN PROGRESS", hmap);

		assertEquals("{\"error\":\"Header begda_007/endda_008 should have date format dd/mm/yyyy\"}", result);
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
		hmap.put("pernr_001", "12345678");
		hmap.put("begda_007","12/04/2019");
		hmap.put("endda_008", "12/04/2019");
		hmap.put("subty_006","A");
		hmap.put("full_first_sec","Y");
		hmap.put("simulation","Y");
		hmap.put("deletion","Y");	
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataLeave", "Simulated Error", hmap);
		
		assertEquals("Error Occured. Please check Logs.", result);
		assertMockEndpointsSatisfied(); 
		
	}
	
	@Test
	public void correctBody() throws Exception {

		hmap.put("pernr_001", "12345678");
		hmap.put("begda_007","12/04/2019");
		hmap.put("endda_008", "12/04/2019");
		hmap.put("subty_006","A");
		hmap.put("full_first_sec","Y");
		hmap.put("simulation","Y");
		hmap.put("deletion","Y");
		
		String result = (String) template.requestBodyAndHeaders("direct:getEmpDataLeave", "SUCCESS", hmap);

		assertEquals("SUCCESS", result);
		assertMockEndpointsSatisfied();
	}
	
	

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/employees/leaves").to(beanEndpoint).to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}
}