/**
 * 
 */
package org.tml.jdgrepo;

import java.util.Date;
import org.apache.camel.Exchange;

/**
 * @author Soumya
 *
 */
public interface JdgConnectionManager {

	/*
	 * Override this method to put single entry in JDG Cache
	 */
	public boolean put(String key, Exchange value);

	/*
	 * Update or add value to index map
	 */
	public boolean updateOrAddIndex(Date startDate, Date endDate, boolean isStartDate) throws Exception;

}