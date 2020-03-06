package org.tml.esb.test;



import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulatedExceptionTest extends CamelSpringTestSupport{
			
		@EndpointInject(uri = "mock:cxf:bean:sapSalesOrderEndpoint")
		protected MockEndpoint outputEndpoint;

		@Test 
		public void testSimulateCustomMessageTestUsingMock() throws Exception
		{          
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
		            public void process(Exchange exchange) throws Exception {
		                exchange.setException(new java.net.SocketTimeoutException("Simulated Error"));
		            }
		        }); 
			
			String request = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sal=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"    <soapenv:Header />\n" + 
					"    <soapenv:Body>\n" + 
					"        <sal:ZsdrfcCreateSalesOrder>\n" + 
					"            <OrderId>123</OrderId>\n" + 
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "Gateway Timeout";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			System.out.println(result);
			assertTrue(result.contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		
		
		protected RouteBuilder createRouteBuilder() throws Exception {
			return new RouteBuilder() {
				public void configure() throws Exception {
					from("jetty:http://0.0.0.0:8086/createSalesOrder")
							.to(outputEndpoint);
				}
			};
		}

		@Override
		protected ClassPathXmlApplicationContext createApplicationContext() {
			return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
		}

	}
