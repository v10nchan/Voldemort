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
package com.nightinagle.hl7.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.medrium.persistence.PersistentManager;
import com.nightingale.hl7.dao.HL7PopulatorDao;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.HL7Bean;
import com.nightingale.hl7.dto.HL7Type;
import com.nightingale.hl7.service.HL7BeanPopulator;
/**
 * This class is responsible for populated the HL7Bean with the DB 
 * depending upon type
 * @author sudhakars
 */
public class ImmunizationHL7BeanPopulator implements HL7BeanPopulator{

	private final static Logger LOGGER = LoggerFactory.getLogger(ImmunizationHL7BeanPopulator.class);
	
	private PersistentManager _persistentManager;
	private HL7Type type;
	
	public ImmunizationHL7BeanPopulator(PersistentManager persistentManager, HL7Type type) {
		LOGGER.info("\n Entering to ImmunizationHL7BeanPopulator method");
		this._persistentManager = persistentManager;
		this.type = type;
		LOGGER.info("\n Exiting from ImmunizationHL7BeanPopulator method");
	}

	@Override
	public HL7Bean getHL7Bean(int patientId, int accountId, int patientimmunizationid, int flag) {
		LOGGER.info("\n Entering to getHL7Bean method");
		if(_persistentManager == null){
			LOGGER.debug("_persistentManager is not injected properly>>>>>>>>>>>>");
		}
		HL7PopulatorDao dao = new HL7PopulatorDao(_persistentManager, type);
		DBDataBean dataBean =  dao.getDBDataBean(patientId, accountId, patientimmunizationid, type);
		Hl7BeanMapper mapper = new Hl7BeanMapper();
		LOGGER.info("\n Exiting from getHL7Bean method");
		return mapper.mapToHL7Bean(dataBean, flag);
	}

}
