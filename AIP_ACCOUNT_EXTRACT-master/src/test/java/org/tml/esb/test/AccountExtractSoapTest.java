package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class AccountExtractSoapTest extends CamelSpringTestSupport {

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8086/accountExtract").to(outputEndpoint);
			}

		};
	}

	@Produce(uri = "cxf:bean:AccountExtractEndpoint")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:sqlComponent:${header.CamelSqlQuery}")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testRouteInvcNo() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n"
				+ "            <Invoice_No>IBEESO1920000005</Invoice_No>\n" + "            <Salesorder></Salesorder>\n"
				+ "            <Status></Status>\n" + "            <Chassis_No></Chassis_No>\n"
				+ "            <Invoice_Date></Invoice_Date>\n" + "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);
		outputEndpoint.message(0).header("dbFlag").isEqualTo("invNoData");
		assertMockEndpointsSatisfied();
	}

	@Test
	public void testRouteChassisNo() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status></Status>\n"
				+ "            <Chassis_No>MAT476125K0A01380</Chassis_No>\n"
				+ "            <Invoice_Date></Invoice_Date>\n" + "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("chassisData");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteSalesOrder() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder>SO-BeeGee-1920-000002</Salesorder>\n" + "            <Status></Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date></Invoice_Date>\n"
				+ "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("salesOrdData");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteSingleDate() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status></Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date>01-Apr-2019</Invoice_Date>\n"
				+ "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("singleDate");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceStartEndDateStatus() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status>New</Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date>01-Apr-2019</Invoice_Date>\n"
				+ "            <Invoice_End_Date>02-Apr-2019</Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateStatus");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceStartEndDate() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status></Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date>01-Apr-2019</Invoice_Date>\n"
				+ "            <Invoice_End_Date>02-Apr-2019</Invoice_End_Date>\n"
				+ "            <Invoice_Month></Invoice_Month>\n" + "            <Invoice_Year></Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateFromTo");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceMonthYear() throws Exception {

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"https://tatamotors.com/api/1.0\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <ns:ACCOUNT_EXTRACT_API>\n"
				+ "         <item>\n" + "            <Division_Code>1000030-Sales-Solan-BeeGee</Division_Code>\n"
				+ "            <Invoice_Type>Standard</Invoice_Type>\n" + "            <Invoice_No></Invoice_No>\n"
				+ "            <Salesorder></Salesorder>\n" + "            <Status>New</Status>\n"
				+ "            <Chassis_No></Chassis_No>\n" + "            <Invoice_Date></Invoice_Date>\n"
				+ "            <Invoice_End_Date></Invoice_End_Date>\n"
				+ "            <Invoice_Month>Apr</Invoice_Month>\n" + "            <Invoice_Year>2019</Invoice_Year>\n"
				+ "         </item>\n" + "      </ns:ACCOUNT_EXTRACT_API>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		template.requestBody("cxf:bean:AccountExtractEndpoint", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateStatus");

		assertMockEndpointsSatisfied();

	}

}
