package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tml.esb.ItemList;
import org.tml.esb.ItemObj;
import org.junit.Assert;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class TmlHdfcTest extends CamelSpringTestSupport {

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8080/api/tml/fundPosting").to(outputEndpoint);
			}
		};
	}

	@Produce(uri = "direct:restHdfc")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:SAP")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testRoute() throws Exception {
		String body = "{\"dealer\":\"2105500\",\"custName\": \"test\",\"bankAcc\": \"HCVTML11e4150\",\"amount\": \"100.34\",\"creditDateTime\": \"2019-08-17 11:21:29\",\"transactionId\": \"16081940057\",\"utrNo\": \"csbkr92018010910000329\",\"busType\":\"HCVTML\",\"status\":\"\",\"remark\":\"\"}";
		String result = "{\"transactionId\":\"CSBKR92018010910000329\",\"status\":\"1\",\"remark\":\"Not Valid\",\"code\":\"400\"}";

		assertEquals(
				"{\"transactionId\":\"CSBKR92018010910000329\",\"status\":\"1\",\"remark\":\"Not Valid\",\"code\":\"400\"}",
				result);
		assertMockEndpointsSatisfied();

	}

}
