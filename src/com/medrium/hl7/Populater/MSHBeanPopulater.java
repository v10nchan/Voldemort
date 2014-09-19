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
package com.medrium.hl7.Populater;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.MSHBean;

public class MSHBeanPopulater {

	private final static Logger LOGGER = LoggerFactory.getLogger(MSHBeanPopulater.class);
	
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmm");
	
	// Method to populate MSH Bean
	public MSHBean populateMSHBean(DBDataBean dataBean, int count) {

	    LOGGER.info("\n Entering to populate MSH Bean");
	    MSHBean mshBean = new MSHBean();
	    if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) { 
	       
	        mshBean.setSendingAppNamespaceId(HL7GeneratorConstant.SENDING_APP_NAMESPACE_ID);
	        mshBean.setSendingFacilityNamespaceId(HL7GeneratorConstant.SENDING_FACILITY_NAMESPACE_ID);
	        mshBean.setReceivingFaclityNamespaceId(HL7GeneratorConstant.RECEIVING_FACLITY_NAMESPACE_ID);
	        Date date = new Date();
	        String currentDate = sdf.format(date);
	        mshBean.setDateTimeOfMessage(currentDate);
	        mshBean.setMessageControlId(String.valueOf(HL7GeneratorConstant.MESSAGE_CONTROL_ID.replace("XXX.XX", String.valueOf(new Random().nextInt()))));
	        mshBean.setProcessingId(HL7GeneratorConstant.PROCESSING_ID);
	        mshBean.setAcceptAckType(HL7GeneratorConstant.ACCEPT_ACK_TYPE);
	        mshBean.setAppAckType(HL7GeneratorConstant.APP_ACK_TYPE);
	    }
		
		LOGGER.info("\n Exiting from populateMSH Bean Method");
		return mshBean;
	}
}
