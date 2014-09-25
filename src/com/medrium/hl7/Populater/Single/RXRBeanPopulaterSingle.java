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

                if("C28161".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intramuscular");
                }else if("C38192".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Auricular(OTIC)");
                }else if("C38193".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Buccal");
                }else if("C38194".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Conjunctival");
                }else if("C38197".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Dentail");
                }else if("C38198".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Soft Tissuc");
                }else if("C38200".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Hemodialysis");
                }else if("C38203".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Iontophonesis");
                }else if("C38205".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Endocenvical");
                }else if("C38206".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Endosinusial");
                }else if("C38207".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intrathracic");
                }else if("C38208".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Endotracheal");
                }else if("C38209".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Enteral");
                }else if("C38210".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Epidural");
                }else if("C38211".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Extra-Amniotic");
                }else if("C38212".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Extracorporeal");
                }else if("C38215".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Infiltration");
                }else if("C38216".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Respiratory(Inhalation)");
                }else if("C38217".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intracononal, Dental");
                }else if("C38218".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intracononary");
                }else if("C38219".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Interstitial");
                }else if("C38220".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intra-Abdominal");
                }else{
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getImmunizationViewInfoList1().size()-1).getRoutecode());
                    rxrBean.setRouteText("Intramuscular");
                }
            
		    }
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
