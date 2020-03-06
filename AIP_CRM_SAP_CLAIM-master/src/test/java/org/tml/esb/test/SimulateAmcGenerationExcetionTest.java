package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimulateAmcGenerationExcetionTest extends CamelSpringTestSupport {

	@EndpointInject(uri = "mock:sap_generation")
	protected MockEndpoint outputEndpoint;

	@Test 
		public void testSimulateGenericExceptionUsingMock() throws Exception
		{          
			outputEndpoint.whenAnyExchangeReceived(new Processor() {
		            public void process(Exchange exchange) throws Exception {
		                exchange.setException(new Exception("Simulated Generic Exception"));
		            }
		        });

		
		String msg = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:sap-com:document:sap:soap:functions:mc-style\">\n"
				+

				"   <soapenv:Header/>\n" +

				"   <soapenv:Body>\n" +

				"      <urn:ZsdrfcAmcClaimGeneration>\n" +

				"         <ChassiNo>MAT403713AND04249</ChassiNo>\n" +

				"         <ChassisPl>SAFARI DICOR 2.2 LX 4X2 MFL</ChassisPl>\n" +

				"         <ClaimItem>\n" +

				"            <item>\n" +

				"               <Mandt></Mandt>\n" +

				"               <ClaimNo></ClaimNo>\n" +

				"               <Item>1</Item>\n" +

				"               <Mjahr></Mjahr>\n" +

				"               <ItemInd>J</ItemInd>\n" +

				"               <ItemCode>013000</ItemCode>\n" +

				"               <ItemQty>1</ItemQty>\n" +

				"               <ItemUnit></ItemUnit>\n" +

				"               <MatCat></MatCat>\n" +

				"               <Qty></Qty>\n" +

				"               <Discount></Discount>\n" +

				"               <Rate></Rate>\n" +

				"              <Zamount></Zamount>\n" +

				"               <Status></Status>\n" +

				"               <RejReason></RejReason>\n" +

				"               <Message></Message>\n" +

				"               <RejComment></RejComment>\n" +

				"               <LabourAmtCrm>75</LabourAmtCrm>\n" +

				"               <MaterialAmtCrm></MaterialAmtCrm>\n" +

				"               <LubChargeCrm>0</LubChargeCrm>\n" +

				"               <SplChargeCrm></SplChargeCrm>\n" +

				"               <TotalChargeCrm>75</TotalChargeCrm>\n" +

				"               <HsnSac></HsnSac>\n" +

				"               <JoigRate></JoigRate>\n" +

				"               <JoigVal></JoigVal>\n" +

				"               <JocgRate></JocgRate>\n" +

				"               <JocgVal></JocgVal>\n" +

				"               <JosgRate></JosgRate>\n" +

				"               <JosgVal></JosgVal>\n" +

				"               <JougRate></JougRate>\n" +

				"               <JougVal></JougVal>\n" +

				"            </item>\n" +

				"         </ClaimItem>\n" +

				"         <ClaimType>P</ClaimType>\n" +

				"         <ContractAndItem>82006406570010</ContractAndItem>\n" +

				"         <ContractNo>8200640657</ContractNo>\n" +

				"         <CrmClaimNo>1-25869854892</CrmClaimNo>\n" +

				"         <CrmSaleDate>2019-08-01</CrmSaleDate>\n" +

				"         <DealerCode>0003000380</DealerCode>\n" +

				"         <JobCardDate>2019-12-04</JobCardDate>\n" +

				"         <JobCardNo>JC-Fortune-N-1920-000450</JobCardNo>\n" +

				"         <JobClosDate>2019-12-04</JobClosDate>\n" +

				"         <JobClosDateI>2019-12-04</JobClosDateI>\n" +

				"         <KmRead>20001</KmRead>\n" +

				"         <LabourAmtCrm>5000</LabourAmtCrm>\n" +

				"         <LubChargeCrm>0</LubChargeCrm>\n" +

				"         <MaterialAmtCrm>0</MaterialAmtCrm>\n" +

				"         <Return>\n" +

				"            <item>\n" +

				"               <Type></Type>\n" +

				"               <Id>1-BVU8RSK</Id>\n" +

				"               <Number></Number>\n" +

				"               <Message></Message>\n" +

				"               <LogNo></LogNo>\n" +

				"               <LogMsgNo></LogMsgNo>\n" +

				"               <MessageV1></MessageV1>\n" +

				"               <MessageV2></MessageV2>\n" +

				"               <MessageV3></MessageV3>\n" +

				"               <MessageV4></MessageV4>\n" +

				"               <Parameter></Parameter>\n" +

				"               <Row></Row>\n" +

				"               <Field></Field>\n" +

				"               <System></System>\n" +

				"            </item>\n" +

				"         </Return>\n" +

				"         <SaveData>V</SaveData>\n" +

				"         <SplChargeCrm>0</SplChargeCrm>\n" +

				"         <TotalChargeCrm>88.5</TotalChargeCrm>\n" +

				"         <ZauthNo></ZauthNo>\n" +

				"      </urn:ZsdrfcAmcClaimGeneration>\n" +

				"   </soapenv:Body>\n" +

				"</soapenv:Envelope>";

		String result = template.requestBody("cxf:bean:amcClaimGen", msg, String.class);

		assertEquals("Error Occurred. Please check Logs.", result);
		assertMockEndpointsSatisfied();
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8086/amcClaimGeneration").to(outputEndpoint);
			}
		};
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

}
