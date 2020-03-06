package org.tml.esb.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.tml.esb.ItemList;
//import org.tml.esb.ItemObj;
import org.junit.Assert;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class TmlYesExceptionTest extends CamelSpringTestSupport {

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://localhost:8080/api/custValidation").to(outputEndpoint);
			}
		};
	}

	@Produce(uri = "direct:restYesCustVal")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:cxf:bean:sapEndpoint")
	protected MockEndpoint outputEndpoint;

	
	Map<String, Object> hmap = new HashMap<String, Object>();
	
	@Test
	public void testRouteException() throws Exception {

		hmap.put("Content-Type", "application/json");
		hmap.put("Accept", "application/json");
		
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.setException(new Exception("Simulated connection error"));
			}
		});

		String result = (String) template.requestBodyAndHeaders("direct:restYesCustVal","{\"I_KUNNR\":\"123\"}",hmap);

		assertEquals("{\"error\":\"Exception Occurred\"}", result);
		assertMockEndpointsSatisfied();

	}

}
