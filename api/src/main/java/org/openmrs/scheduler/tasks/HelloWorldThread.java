/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.scheduler.tasks;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implementation of the stateless task.
 */
public class HelloWorldThread implements Runnable {
	
	// Logger 
	private static Log log = LogFactory.getLog(HelloWorldThread.class);
	
	/**
	 * Public constructor.
	 */
	public HelloWorldThread() {
		log.debug(" *** HelloWorldThread Constructor called");
		log.debug("HelloWorldThread was created at " + new Date());
	}
	
	/**
	 * Illustrates stateless functionality as simply as possible. Not very useful in our system,
	 * except maybe as a polling thread that checks internet connectivity by opening a connection to
	 * an external URL. But even that isn't very useful unless it tells someone or something about
	 * the connectivity (i.e. calls another service method)
	 */
	public void run() {
		log.debug("HelloWorldThread says Hello World!");
	}
}