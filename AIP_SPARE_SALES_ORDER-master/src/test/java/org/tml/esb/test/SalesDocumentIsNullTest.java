package org.tml.esb.test;

import static org.junit.Assert.assertEquals;

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

public class SalesDocumentIsNullTest extends CamelSpringTestSupport{
			
		@EndpointInject(uri = "mock:cxf:bean:sapSalesOrderEndpoint")
		protected MockEndpoint outputEndpoint;

		@Test 
		public void testWhenSalesDocumentIsNullUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"                <item>\n" + 
					"                    <Type>E</Type>\n" + 
					"                    <Id>CZ</Id>\n" + 
					"                    <Number>115</Number>\n" + 
					"                    <Message>Sales area 4000 20 4 does not exist</Message>\n" + 
					"                    <LogNo />\n" + 
					"                    <LogMsgNo>000000</LogMsgNo>\n" + 
					"                    <MessageV1>4000</MessageV1>\n" + 
					"                    <MessageV2>20</MessageV2>\n" + 
					"                    <MessageV3>4</MessageV3>\n" + 
					"                    <MessageV4 />\n" + 
					"                    <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"                    <Row>0</Row>\n" + 
					"                    <Field />\n" + 
					"                    <System>LOGSYS250</System>\n" + 
					"                </item>\n" + 
					"                <item>\n" + 
					"                    <Type>E</Type>\n" + 
					"                    <Id>V4</Id>\n" + 
					"                    <Number>219</Number>\n" + 
					"                    <Message>Sales document was not changed</Message>\n" + 
					"                    <LogNo />\n" + 
					"                    <LogMsgNo>000000</LogMsgNo>\n" + 
					"                    <MessageV1 />\n" + 
					"                    <MessageV2>20</MessageV2>\n" + 
					"                    <MessageV3>4</MessageV3>\n" + 
					"                    <MessageV4 />\n" + 
					"                    <Parameter />\n" + 
					"                    <Row>0</Row>\n" + 
					"                    <Field />\n" + 
					"                    <System>LOGSYS250</System>\n" + 
					"                </item>\n" + 
					"            </Return>\n" + 
					"            <Salesdocument />\n" + 
					"        </n0:ZsdrfcCreateSalesOrderResponse>\n" + 
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
			
			String expectedIntMsg = "E : Sales document was not changedE : Sales area 4000 20 4 does not exist";
		
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
