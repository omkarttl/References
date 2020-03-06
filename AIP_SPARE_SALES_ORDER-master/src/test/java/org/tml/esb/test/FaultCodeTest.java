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
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FaultCodeTest extends CamelSpringTestSupport{
			
		@EndpointInject(uri = "mock:cxf:bean:sapSalesOrderEndpoint")
		protected MockEndpoint outputEndpoint;

		@Test 
		public void testSimulateFaultCodeTestUsingMock() throws Exception
		{    
			String body = "<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <soap-env:Fault>\n" + 
					"            <faultcode>soap-env:Server</faultcode>\n" + 
					"            <faultstring xml:lang=\"en\">Web service processing error; more details in the web service error log on provider side (UTC timestamp 20200203155236; Transaction ID 65A8F447DCBF0010E005DEB2956F67BF)</faultstring>\n" + 
					"            <detail />\n" + 
					"        </soap-env:Fault>\n" + 
					"    </soap-env:Body>\n" + 
					"</soap-env:Envelope>";
			
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
		            public void process(Exchange exchange) throws Exception {
		                exchange.getOut().setBody(body);
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
			
			String expectedIntMsg = "Web service processing error";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			
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
