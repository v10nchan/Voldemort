/*
 * 
 * Copyright 2013 by Medrium, Inc., All rights reserved.
 * 
 * This software is the confidential and proprietary information of Nightingale Informatix Corp.
 * 
 * @author sudhakars
 */
package com.nightinagle.hl7.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.medrium.persistence.PersistentManager;
import com.nightingale.annotation.db.Nexia;
import com.nightingale.hl7.dto.HL7Bean;
import com.nightingale.hl7.dto.HL7Type;
import com.nightingale.hl7.service.AbstractHL7Generator;
import com.nightingale.hl7.service.HL7BeanPopulator;
import com.nightingale.hl7.service.HL7BeanPopulatorFactory;
import com.nightingale.hl7.service.HL7GeneratorFactory;

/**
 * A test class to test the HL7 generation.
 * 
 * @author sudhakars
 */
public class TestHL7 {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestHL7.class);
    @Inject @Nexia private PersistentManager persistentManager;

    public static void main(String[] args) {
        LOGGER.info("Enter in main Method");
        try{
            Injector injector = Guice.createInjector(new HL7ServiceInjector());
            if(injector != null){
                TestHL7 test = injector.getInstance(TestHL7.class);
                if(test.persistentManager == null){
                    LOGGER.debug("\n manager is null");
                }
                HL7BeanPopulator hl7BeanPopulator = HL7BeanPopulatorFactory
                        .getHL7BeanPopulator(HL7Type.IMMUNIZATION,
                                test.persistentManager);
                // Input patientId and accountId
                HL7Bean hl7Bean = hl7BeanPopulator.getHL7Bean(31980, 1004578, 25, 2);
                // generate HL7.
                AbstractHL7Generator abstractHL7Generator = HL7GeneratorFactory
                        .getHL7GeneratorInstace(HL7Type.IMMUNIZATION);
                abstractHL7Generator.generateHL7Message(hl7Bean,
                        HL7Type.IMMUNIZATION);
            }else{
                LOGGER.debug(" \n Value of injector is null ");
            }
        }catch (Exception e){
            LOGGER.error("\n Exception in main class :: " + e);
            e.printStackTrace();
        }
        LOGGER.info("Exiting from main Method");
    }
}
