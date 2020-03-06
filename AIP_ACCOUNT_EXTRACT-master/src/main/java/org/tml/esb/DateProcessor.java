package org.tml.esb;

import org.apache.camel.Processor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateProcessor implements Processor {
	private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		try {

			LocalDate convertedDate = LocalDate.parse(exchange.getIn().getHeader("startDate").toString(),
					DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
			convertedDate = convertedDate.withDayOfMonth(convertedDate.getMonth().length(convertedDate.isLeapYear()));
			String endDate = convertedDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")).toString();
			exchange.getIn().setHeader("invoiceEndDate", endDate);
		} catch (Exception e) {

			logger.error("Exception Occurred ::" + e);
		}
	}
}
