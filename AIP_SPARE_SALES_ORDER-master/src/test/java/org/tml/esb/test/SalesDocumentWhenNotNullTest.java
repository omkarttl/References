package org.tml.esb.test;



import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalesDocumentWhenNotNullTest extends CamelSpringTestSupport{
			
		@EndpointInject(uri = "mock:cxf:bean:sapSalesOrderEndpoint")
		protected MockEndpoint outputEndpoint;
		
		
		@Test 
		public void testWhenOrdrRsnDAMUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z1</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed insufficient data </Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAKKOM</MessageV1>\n" + 
					"        <MessageV2></MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z2</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed </Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAPKOM</MessageV1>\n" + 
					"        <MessageV2>000001</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_ITEM_IN</Parameter>\n" + 
					"        <Row>1</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"</Return>\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>TMPC</BU>\n	"  +
					"			  <OrderReason>DAM</OrderReason>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "RequestedDate";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			
			assertTrue(result.contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		
		@Test 
		public void testWhenBUTMPCTypeWUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z1</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed insufficient data </Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAKKOM</MessageV1>\n" + 
					"        <MessageV2></MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z2</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed </Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAPKOM</MessageV1>\n" + 
					"        <MessageV2>000001</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_ITEM_IN</Parameter>\n" + 
					"        <Row>1</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"</Return>\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>TMPC</BU>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "Order Not Placed insufficient data  Order Not Placed";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			
			assertTrue(result.contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		
		@Test 
		public void testWhenBUTMPCTypeSUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V4</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>SALES_HEADER_IN has been processed successfully</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAKKOM</MessageV1>\n" + 
					"        <MessageV2></MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V4</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>SALES_ITEM_IN has been processed successfully</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAPKOM</MessageV1>\n" + 
					"        <MessageV2>000001</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_ITEM_IN</Parameter>\n" + 
					"        <Row>1</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V1</Id>\n" + 
					"        <Number>311</Number>\n" + 
					"        <Message>Parts VOR Order 31862684 has been saved</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>Parts VOR Order</MessageV1>\n" + 
					"        <MessageV2>31862684</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"</Return>\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>TMPC</BU>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "Parts VOR Order 31862684 has been saved";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			
			assertTrue(result.contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		@Test 
		public void testWhenBUTMPCTypeSWUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z1</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed insufficient data</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAKKOM</MessageV1>\n" + 
					"        <MessageV2></MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>W</Type>\n" + 
					"        <Id>Z2</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>Order Not Placed </Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAPKOM</MessageV1>\n" + 
					"        <MessageV2>000001</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_ITEM_IN</Parameter>\n" + 
					"        <Row>1</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V1</Id>\n" + 
					"        <Number>311</Number>\n" + 
					"        <Message>Parts VOR Order 31862684 has been saved</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>Parts VOR Order</MessageV1>\n" + 
					"        <MessageV2>31862684</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"</Return>\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>TMPC</BU>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "Order Not Placed insufficient data Order Not Placed  Parts VOR Order 31862684 has been saved";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			assertTrue(result.trim().contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		@Test 
		public void testWhenBUCVBUUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"            <Return>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V4</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>SALES_HEADER_IN has been processed successfully</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAKKOM</MessageV1>\n" + 
					"        <MessageV2></MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V4</Id>\n" + 
					"        <Number>233</Number>\n" + 
					"        <Message>SALES_ITEM_IN has been processed successfully</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>VBAPKOM</MessageV1>\n" + 
					"        <MessageV2>000001</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_ITEM_IN</Parameter>\n" + 
					"        <Row>1</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"    <item>\n" + 
					"        <Type>S</Type>\n" + 
					"        <Id>V1</Id>\n" + 
					"        <Number>311</Number>\n" + 
					"        <Message>Parts VOR Order 31862684 has been saved</Message>\n" + 
					"        <LogNo></LogNo>\n" + 
					"        <LogMsgNo>000000</LogMsgNo>\n" + 
					"        <MessageV1>Parts VOR Order</MessageV1>\n" + 
					"        <MessageV2>31862684</MessageV2>\n" + 
					"        <MessageV3></MessageV3>\n" + 
					"        <MessageV4></MessageV4>\n" + 
					"        <Parameter>SALES_HEADER_IN</Parameter>\n" + 
					"        <Row>0</Row>\n" + 
					"        <Field></Field>\n" + 
					"        <System>LOGSYS500</System>\n" + 
					"    </item>\n" + 
					"</Return>\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>CVBU</BU>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "SALES_HEADER_IN has been processed successfully";
		
			String result = template.requestBody("cxf:bean:createSalesOrderEndpoint?dataFormat=MESSAGE", request, String.class);
			
			assertTrue(result.contains(expectedIntMsg));
			assertMockEndpointsSatisfied(); 
			
		}
		@Test 
		public void testWhenReturnIsEmptyUsingMock() throws Exception
		{    
			String body="<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
					"    <soap-env:Header />\n" + 
					"    <soap-env:Body>\n" + 
					"        <n0:ZsdrfcCreateSalesOrderResponse xmlns:n0=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n" + 
					"<Salesdocument>0031862684</Salesdocument>" + 
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
					"			  <BU>TMPC</BU>\n	"  +
					"                 <OrderHeaderIn>\n" + 
					"                    <DocType>ZPGO</DocType>\n" + 
					"                    <CollectNo></CollectNo>\n" + 
					"                    <SalesOrg>5000</SalesOrg>\n" + 
					"                 </OrderHeaderIn>\n" + 
					"        </sal:ZsdrfcCreateSalesOrder>\n" + 
					"    </soapenv:Body>\n" + 
					"</soapenv:Envelope>";
			
			String expectedIntMsg = "SALES_HEADER_IN has been processed successfully";
		
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
