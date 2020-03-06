package org.tml.esb.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class AccountExtractRestTest extends CamelSpringTestSupport {

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context-test.xml");
	}

	protected RouteBuilder createRouteBuilder() throws Exception {
		return new RouteBuilder() {
			public void configure() throws Exception {
				from("jetty:http://0.0.0.0:8080/api/accountExtract").to(outputEndpoint);
			}

		};
	}

	@Produce(uri = "direct:getAccountDataRest")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:sqlComponent:${header.CamelSqlQuery}")
	protected MockEndpoint outputEndpoint;

	@Test
	public void testEndToEndApplication() throws Exception {

		String invcNum = "1234";
		String invcDt = "1234";
		String statusCd = "New";

		AccountExtractResponse acct = new AccountExtractResponse(invcNum, invcDt, statusCd);
		String result = "{\"invcNum\":\"1234\",\"invcDt\":\"1234\", \"statusCd\":\"New\"}";

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"IBEESO1920000005\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"\",\n"
				+ "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);
		outputEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().setBody(acct);
			}
		});
		assertEquals("{\"invcNum\":\"1234\",\"invcDt\":\"1234\", \"statusCd\":\"New\"}", result);

		assertMockEndpointsSatisfied();
	}

	@Test
	public void testRouteInvcNo() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"IBEESO1920000005\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"\",\n"
				+ "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);
		outputEndpoint.message(0).header("dbFlag").isEqualTo("invNoData");
		assertMockEndpointsSatisfied();
	}

	@Test
	public void testRouteChassisNo() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"\",\n"
				+ "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"MAT476125K0A01380\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("chassisData");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteSalesOrder() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"\",\n"
				+ "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n"
				+ "  \"salesOrder\": \"SO-BeeGee-1920-000002\",\n" + "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("salesOrdData");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteSingleDate() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"01-Apr-2019\",\n" + "  \"invoiceEndDate\": \"\",\n"
				+ "  \"invoiceMonth\": \"\",\n" + "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("singleDate");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceStartEndDateStatus() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"01-Apr-2019\",\n" + "  \"invoiceEndDate\": \"10-Apr-2019\",\n"
				+ "  \"invoiceMonth\": \"\",\n" + "  \"invoiceYear\": \"\",\n" + "  \"status\": \"New\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateStatus");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceStartEndDate() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"01-Apr-2019\",\n" + "  \"invoiceEndDate\": \"10-Apr-2019\",\n"
				+ "  \"invoiceMonth\": \"\",\n" + "  \"invoiceYear\": \"\",\n" + "  \"status\": \"\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateFromTo");

		assertMockEndpointsSatisfied();

	}

	@Test
	public void testRouteInvoiceMonthYear() throws Exception {

		String requestBody = "{\n" + "  \"invoiceType\": \"Standard\",\n" + "  \"invoiceNo\": \"\",\n"
				+ "  \"invoiceDate\": \"\",\n" + "  \"invoiceEndDate\": \"\",\n" + "  \"invoiceMonth\": \"Apr\",\n"
				+ "  \"invoiceYear\": \"2018\",\n" + "  \"status\": \"New\",\n"
				+ "  \"divisionCode\": \"1000030-Sales-Solan-BeeGee\",\n" + "  \"salesOrder\": \"\",\n"
				+ "  \"chassisNo\": \"\"\n" + "}";

		template.requestBody("direct:getAccountDataRest", requestBody, String.class);

		outputEndpoint.message(0).header("dbFlag").isEqualTo("dateStatus");

		assertMockEndpointsSatisfied();

	}

}
