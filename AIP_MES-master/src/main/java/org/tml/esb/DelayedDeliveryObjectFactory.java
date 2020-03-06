package org.tml.esb;

import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import org.apache.camel.component.sjms2.jms.Jms2ObjectFactory;
import javax.jms.JMSException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelayedDeliveryObjectFactory extends Jms2ObjectFactory {
	 private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);
	
	@Override
	public MessageProducer createMessageProducer(Session session, Destination destination, boolean persistent, long ttl) {
		MessageProducer ret = null;
		
		try {
			ret = super.createMessageProducer(session, destination, persistent, ttl);
			ret.setDeliveryDelay(900000);
		}
		catch (JMSException e){
			logger.error("JMS Exception Occurred ::"+e);
		
		}
		catch (Exception e) {
			logger.error("Exception Occurred ::"+e);
		}
		return ret;
	}
}
