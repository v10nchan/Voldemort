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
package com.medrium.hl7.Populater.Single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.RXRBean;

/**
 * Class to populate RXR Bean
 * @author ajayr
 */
public class RXRBeanPopulaterSingle {
	private final static Logger LOGGER = LoggerFactory.getLogger(RXRBeanPopulaterSingle.class);
	public RXRBean populateRXRBeanSingle(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering into populateRXRBean method");
		RXRBean rxrBean = new RXRBean();

		int j=0;
		for(int i=0; i<dataBean.getPatientImmunizationsList().size(); i++) {
				j++;
		}
		j--;
		if(dataBean.getImmunizationViewInfoList1()!=null && dataBean.getImmunizationViewInfoList1().size()!=0) {
		  //TODO: Need to change condition condition should be applied on route text
	      //need to uncomment when data is available in view
		  if(dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite()!=null) {
		    if(dataBean.getPatientImmunizationRXAInfoList()!=null && dataBean.getPatientImmunizationRXAInfoList().size()!=0) {
		        rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
		    }
		    rxrBean.setRouteText("Intramuscular");
		    //set site and site identifier
            if((dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite()).trim().contains("Left")){
                rxrBean.setAdminSiteIdentifier("LD");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite());
            }else if((dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite()).trim().contains("Right")){
                rxrBean.setAdminSiteIdentifier("RD");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite());
            }
            else{
                rxrBean.setAdminSiteIdentifier("UN");
                rxrBean.setAdminSiteText(dataBean.getImmunizationViewInfoList1().get(dataBean.getImmunizationViewInfoList1().size()-1).getSite());
            }
            rxrBean.setAdminSiteNCS(HL7GeneratorConstant.ADMIN_SITE_NCS);
        }
		}
		
		LOGGER.info("\n Exiting from populateRXRBean method");
		return rxrBean;
	}
}
