
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

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightinagle.hl7.util.HL7Util;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.PD1Bean;

/**
* class to generate PD1 Bean
* @author ajayr
*/
public class PD1BeanPopulater {

    private final static Logger LOGGER = LoggerFactory.getLogger(PD1BeanPopulater.class);
    private SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");

    public PD1Bean populatePD1Bean(DBDataBean dataBean, int count) {
        LOGGER.info("\n Entering into populatePD1Bean method ");
        PD1Bean pd1Bean = new PD1Bean();
        if(dataBean.getPatientImmunizationsList() != null && dataBean.getPatientImmunizationsList().size() != 0){
            if(dataBean.getPatientImmunizationRXAInfoList().get(count).getConsentcode() != 0 || dataBean.getPatientImmunizationRXAInfoList().get(count).getConsentnameid() != 0){
                pd1Bean.setProtectionIndicator(HL7Util.getConsentDescription(dataBean.getPatientImmunizationRXAInfoList().get(count).getConsentcode()));
                pd1Bean.setProtectionIndicatorEffectiveDate(sdf.format(new Date()));
            }
            else{
                pd1Bean.setPublicityCodeIdentifier("02");
                pd1Bean.setPublicityCodeText(HL7GeneratorConstant.PUBLICITY_CODE_TEXT);
                if(dataBean.getPatientInformation() != null){
                    pd1Bean.setImmunizationRegStatus(HL7Util.getPatientStatus(dataBean.getPatientInformation().getStatus()));
                }
                if(dataBean.getPatientImmunizationRXAInfoList() != null && dataBean.getPatientImmunizationRXAInfoList().size() != 0){
                    Date date = dataBean.getPatientImmunizationRXAInfoList().get(count).getCreated();
                    if(dataBean.getPatientInformation().getStatusDate()!=null) {
                        pd1Bean.setImmunizationRegStatusEffectiveDate(sdf.format(dataBean.getPatientInformation().getStatusDate()));
                    }
                    if(dataBean.getPatientImmunizationRXAInfoList().get(count).getAdministrationdate() != null){
                        date = dataBean.getPatientImmunizationRXAInfoList().get(count).getAdministrationdate();
                        String adminDate = sdf.format(date);
                        pd1Bean.setPublicityCodeEffectiveDate(adminDate);
                    }
                }
            }
        }
        LOGGER.info("\n Exiting from populatePD1Bean method ");
        return pd1Bean;
    }
}
