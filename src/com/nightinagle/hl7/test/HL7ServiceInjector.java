/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author sudhakars
 */

package com.nightinagle.hl7.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.AbstractModule;

public class HL7ServiceInjector extends AbstractModule{
	private final static Logger LOGGER = LoggerFactory.getLogger(HL7ServiceInjector.class);
	//Method to inject HL7 Services
	@Override
	protected void configure() {
		LOGGER.info("\n Entering to configure method");
		bind(javax.sql.DataSource.class).toProvider(com.nightinagle.hl7.test.NexiaSQLDataSourceProvider.class);		
		bind(com.medrium.persistence.PersistentManager.class).annotatedWith(com.nightingale.annotation.db.Nexia.class)
        .to(com.medrium.persistence.PersistentManager.class);
        //expose(com.medrium.persistence.PersistentManager.class).annotatedWith(com.nightingale.annotation.db.Nexia.class);
		LOGGER.info("\n Exting from configure method");
		
	}
}
