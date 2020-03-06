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
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulateExceptionTest extends CamelSpringTestSupport {
			
		@EndpointInject(uri = "mock:parivahanUpload")
		protected MockEndpoint outputEndpoint;

		@Test 
		public void testSimulateExceptionTestUsingMock() throws Exception
		{          
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
		            public void process(Exchange exchange) throws Exception {
		                exchange.setException(new Exception("Simulated Error"));
		            }
		        }); 
			String msg = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.web.homologation.transport.nic/\">\n" + 
					"   <soapenv:Header/>\n" + 
					"   <soapenv:Body>\n" + 
					"      <ser:upload>\n" + 
					"         <userId>matiu1</userId>\n" + 
					"         <transactionId>5</transactionId>\n" + 
					"         <inventoryDetails>\n" + 
					"            <chassisNo>374005KYZ919023</chassisNo>\n" + 
					"            <colorCode>SOLID_GREEN</colorCode>\n" + 
					"            <dealerCode>NA</dealerCode>\n" + 
					"            <engineNo>483DL47KYZ722225</engineNo>\n" + 
					"            <featureCode>NA</featureCode>\n" + 
					"            <monthYear>102001</monthYear>\n" + 
					"            <unique_model_ref_no>A</unique_model_ref_no>\n" + 
					"         </inventoryDetails>\n" + 
					"      </ser:upload>\n" + 
					"   </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
		
			String result = template.requestBody("cxf:bean:vahanRegistration?dataFormat=MESSAGE", msg, String.class);
			assertEquals("Error Occurred. Please check Logs.", result);
			assertMockEndpointsSatisfied(); 
			
		}
		
		
		protected RouteBuilder createRouteBuilder() throws Exception {
			return new RouteBuilder() {
				public void configure() throws Exception {
					from("jetty:http://0.0.0.0:8086/vahanRegistration")
							.to(outputEndpoint);
				}
			};
		}

		@Override
		protected ClassPathXmlApplicationContext createApplicationContext() {
			return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
		}

	}
