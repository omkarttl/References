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

public class AmqRouteBuilderTest extends CamelSpringTestSupport {

	@Produce(uri = "artemis-in:queue:in.mes.dev.queue")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:bean:getNonSr")
	protected MockEndpoint outputEndpoint;

	@Test
	public void successFlow() throws Exception {
		String request = "   <RFC_CALL NAME=\"ZMES_NONSR_DATA\"> \n" + "    <atr_key>116626806</atr_key> \n"
				+ "    <PartNumber>54426000B00001</PartNumber> \n" + "    <Plant>1100</Plant> \n"
				+ "    <ProdLine></ProdLine> \n" + "    <DATE>11/22/2018</DATE> \n" + "    <TIME>07:24:47</TIME> \n"
				+ "    <Quantity>30</Quantity> \n" + "  </RFC_CALL>  ";
		
  String request1 =   "<RFC_CALL NAME=\"ZMES_WELD_DATA\"> \n" +
				 "  <atr_key>116914442</atr_key>  \n" +
				 "   <SerialNumber>6002008</SerialNumber>  \n" + 
				 "   <PartNumber>54426000B00001</PartNumber>  \n" + 
				 "   <IND>W</IND>  '  \n" +
				 "   <LineNumber>17270002</LineNumber>  \n" + 
				 "   <Plant>1100</Plant>  \n" +
				 "   <DATE>2019-12-30</DATE>  \n" + 
				 "   <TIME>14:05:01</TIME>  \n" + 
				 "   <ItemId>3125386</ItemId> \n" + 
				 "   <FiscalDate>2019-12-28</FiscalDate> \n" + 
				 "  </RFC_CALL>  " ; 
  
		String result = template.requestBody("direct:in.mes.dev.queue", request1, String.class);
		System.out.println("Result :: " + result);

		String response = "<RFC_CALL NAME=\"ZMES_NONSR_DATA\">" + "<atr_key>116626806</atr_key>"
				+ "<Response>2</Response>" + "<Remarks>DUPLICATE ENTRY</Remarks>" + "</RFC_CALL>";
		
		String response1 = "<RFC_CALL NAME=\"ZMES_WELD_DATA\">" + "<atr_key>116914442</atr_key>"
				+ "<Response>2</Response>" + "<Remarks>DUPLICATE ENTRY</Remarks>" + "</RFC_CALL>";


		assertEquals(response1, result);
		assertMockEndpointsSatisfied();
	}

	@Test
	public void testSimulateConnectionErrorUsingMock() throws Exception {
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.setException(new Exception("Simulated connection error"));
			}
		});
		String request = "   <RFC_CALL NAME=\"ZMES_NONSR_DATA\"> \n" + "    <atr_key>116626806</atr_key> \n"
				+ "    <PartNumber>54426000B00001</PartNumber> \n" + "    <Plant>1100</Plant> \n"
				+ "    <ProdLine></ProdLine> \n" + "    <DATE>11/22/2018</DATE> \n" + "    <TIME>07:24:47</TIME> \n"
				+ "    <Quantity>30</Quantity> \n" + "  </RFC_CALL>  ";

		String result = template.requestBody("direct:in.mes.dev.queue", request, String.class);
		System.out.println("result ::: "+result);
	    //inputEndpoint.setExpectedMessageCount(1);
		// assertEquals(response, result);
		assertMockEndpointsSatisfied();

	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("artemis-in:queue:in.mes.dev.queue").to("mock:sap-srfc-destination:rfcDest:ZMES_NONSR_DATA");
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

}