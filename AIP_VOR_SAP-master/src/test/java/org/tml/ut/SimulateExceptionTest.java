package org.tml.ut;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulateExceptionTest extends CamelSpringTestSupport {
			
		@EndpointInject(uri = "mock:cxf:bean:sapVorOrderEndpoint")
		protected MockEndpoint outputEndpoint;

		@Test 
		public void testSimulateExceptionTestUsingMock() throws Exception
		{          
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
		            public void process(Exchange exchange) throws Exception {
		                exchange.setException(new Exception("Simulated Error"));
		            }
		        }); 
			String msg = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"   <soapenv:Header/>\n" + 
					"   <soapenv:Body>\n" + 
					"      <urn:ZsdcrmVorSalesOrder>\n" + 
					"         <Matnr>264731200101</Matnr>\n" + 
					"         <PLabst>1</PLabst>\n" + 
					"         <<Werks/>\n" + 
					"      </urn:ZsdcrmVorSalesOrder>\n" + 
					"   </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
		
			String result = template.requestBody("cxf:bean:getPlantEndpoint?dataFormat=MESSAGE", msg, String.class);
			assertEquals("Exception Occurred.Please check logs", result);
			assertMockEndpointsSatisfied(); 
			
		}
		
		
		protected RouteBuilder createRouteBuilder() throws Exception {
			return new RouteBuilder() {
				public void configure() throws Exception {
					from("jetty:http://0.0.0.0:8086/getPlantDetails")
							.to(outputEndpoint);
				}
			};
		}

		@Override
		protected ClassPathXmlApplicationContext createApplicationContext() {
			return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
		}

	}