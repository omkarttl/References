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

public class CamelContextVorMobilityTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:getToken")
	protected ProducerTemplate inputEndpoint;
	
	@EndpointInject(uri = "{{login.endpoint}}")
	protected MockEndpoint outputEndpoint;

	HashMap<String, Object> hmap = new HashMap<String, Object>();

	
	@Test 
	public void testSimulateConnectionErrorUsingMock() throws Exception
	{          
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
	            public void process(Exchange exchange) throws Exception {
	                exchange.setException(new Exception("Simulated connection error"));
	            }
	        }); 		
		String body= "{\"username\":\"sampleuser\",\"password\":\"samplepasswd\",\"device_id\":\"bbb915488\",\"app_version\":\"1.0.0\",\"app_name\":\"com.tatamotors.epc\"}";
		String result = (String) template.requestBody("direct:getToken", body, String.class);
		
		assertEquals("{\"error\":\"Error Occured. Please check Logs\"}", result);
		assertMockEndpointsSatisfied(); 
		
	}
	
	
	@Test
	public void correctBody() throws Exception {

		String body= "{\"username\":\"sampleuser\",\"password\":\"samplepasswd\",\"device_id\":\"bbb915488\",\"app_version\":\"1.0.0\",\"app_name\":\"com.tatamotors.epc\"}";
		
		String result = template.requestBody("direct:getToken", body, String.class);
		
		String response= "{\"token\":{\"access_token\":\"3D8TSc1Qk4GT33At6IyLU8f77Qi3aK\",\"token_type\":\"Bearer\",\"expires_in\":14400,\"refresh_token\":\"OS9YvNlDo9OjvXFSVZiio3XLvDApik\",\"scope\":\"read write\"},\"data\":{\"Contact_No\":null,\"User_ID\":\"PRDUSER1\",\"User_segment_flag\":\"N\",\"User_Name\":\"PRDUSER1-DVOR\",\"Email_ID\":\"PRDUSER1test.com\"}}";
		
		assertEquals(response, result);
		assertMockEndpointsSatisfied();
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/mobility/login").to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}
}