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

public class CamelContextVorMobilityPartsTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getLocforPart")
	protected ProducerTemplate inputEndpoint;
	
	@EndpointInject(uri = "{{locforpart.endpoint}}")
	protected MockEndpoint outputEndpoint;
	
	@Test 
	public void testSimulateConnectionErrorUsingMock() throws Exception
	{          
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                exchange.setException(new Exception("Simulated connection error"));
	            }
	        }); 		
		String body= "{\"part_num\":\"264731200101\",\"user_latitude\":\"19.21\",\"user_longitude\":\"72.97\",\"qty\":\"1\",\"kms_range\":300,\"app_name\":\"com.tatamotors.dvor\"}";
		String result = (String) template.requestBody("direct:getLocforPart", body, String.class);
		
		assertEquals("{\"error\":\"Error Occured. Please check Logs\"}", result);
		assertMockEndpointsSatisfied(); 
		
	}
	
	
	@Test
	public void correctBody() throws Exception {
		String body= "{\"part_num\":\"264731200101\",\"user_latitude\":\"19.21\",\"user_longitude\":\"72.97\",\"qty\":\"1\",\"kms_range\":300,\"app_name\":\"com.tatamotors.dvor\"}";
		
		String result = template.requestBody("direct:getLocforPart", body, String.class);
		
		String response= "{\"data\":[{\"dealer_location_longitude\":\"72.97\",\"part_count\":95.0,\"dealer_id\":\"1-1IJGRE6\",\"dealer_name\":\"AUTO XPERTS\",\"loc_type\":\"division\",\"dealer_location_latitude\":\"19.21\"},{\"dealer_location_longitude\":\"72.976114\",\"part_count\":896.0,\"dealer_id\":\"1-1IJGRE5\",\"dealer_name\":\"AUTO XPERTS\",\"loc_type\":\"division\",\"dealer_location_latitude\":\"19.221188\"},{\"dealer_location_longitude\":\"72.977637\",\"part_count\":5.0,\"dealer_id\":\"1-55I6F0\",\"dealer_name\":\"BAFNA Motors (Mumbai)\",\"loc_type\":\"division\",\"dealer_location_latitude\":\"19.224457\"},{\"dealer_location_longitude\":\"73.051357\",\"part_count\":122.0,\"dealer_id\":\"1-EVO6K5\",\"dealer_name\":\"KAPOOR DIESELS GARAGE PVT LTD\",\"loc_type\":\"division\",\"dealer_location_latitude\":\"19.283183\"}]}";
		
		assertEquals(response, result);
		assertMockEndpointsSatisfied();
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/mobility/locforparts").to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}
}
