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
		        if("C28161".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
		            rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
	                rxrBean.setRouteText("Intramuscular");
		        }else if("C38192".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
		            rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Auricular(OTIC)");
		        }else if("C38193".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Buccal");
                }else if("C38194".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Conjunctival");
                }else if("C38197".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Dentail");
                }else if("C38198".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Soft Tissuc");
                }else if("C38200".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Hemodialysis");
                }else if("C38203".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Iontophonesis");
                }else if("C38205".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Endocenvical");
                }else if("C38206".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Endosinusial");
                }else if("C38207".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Intrathracic");
                }else if("C38208".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Endotracheal");
                }else if("C38209".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Enteral");
                }else if("C38210".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Epidural");
                }else if("C38211".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Extra-Amniotic");
                }else if("C38212".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Extracorporeal");
                }else if("C38215".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Infiltration");
                }else if("C38216".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Respiratory(Inhalation)");
                }else if("C38217".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Intracononal, Dental");
                }else if("C38218".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Intracononary");
                }else if("C38219".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Interstitial");
                }else if("C38220".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getRoutecode())) {
                    rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
                    rxrBean.setRouteText("Intra-Abdominal");
                }else{
		            rxrBean.setRouteIdentifier(dataBean.getPatientImmunizationsList().get(count).getRoutecode());
	                rxrBean.setRouteText("Intramuscular");
		        }
		    }
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
