/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author ajayr
 */
package com.medrium.hl7.Populater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.RXRBean;

/**
 * Class to populate RXR Bean
 * @author ajayr
 */
public class RXRBeanPopulater {
	private final static Logger LOGGER = LoggerFactory.getLogger(RXRBeanPopulater.class);
	public RXRBean populateRXRBean(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering into populateRXRBean method");
		RXRBean rxrBean = new RXRBean();

		/*int j=0;
		for(int i=0; i<dataBean.getPatientImmunizationsList().size(); i++) {
				j++;
		}
		j--;*/
		if(dataBean.getImmunizationViewInfoList()!=null && dataBean.getImmunizationViewInfoList().size()!=0) {
		  //TODO: Need to change condition condition should be applied on route text
	      //need to uncomment when data is available in view
		  if(dataBean.getImmunizationViewInfoList().get(count).getSite()!=null) {
		    if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
		        rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
		    }
		    rxrBean.setRouteText("Intramuscular");
		    //set site and site identifier
            if((dataBean.getImmunizationViewInfoList().get(count).getSite()).trim().contains("Left")){
                rxrBean.setAdminSiteIdentifier("LD");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList().get(count).getSite());
            }else if((dataBean.getImmunizationViewInfoList().get(count).getSite()).trim().contains("Right")){
                rxrBean.setAdminSiteIdentifier("RD");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList().get(count).getSite());
            }
            else{
                rxrBean.setAdminSiteIdentifier("UN");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList().get(count).getSite());
            }
            rxrBean.setAdminSiteNCS(HL7GeneratorConstant.ADMIN_SITE_NCS);
        }
		}
		
		LOGGER.info("\n Exiting from populateRXRBean method");
		return rxrBean;
	}
}
