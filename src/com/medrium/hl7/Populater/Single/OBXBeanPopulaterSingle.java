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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.constants.FundingEligibilityConstant;
import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightinagle.hl7.util.HL7Util;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.PatientImmunization;
import com.nightingale.hl7.dto.OBXBean;

/**
 * Class to populate OBX Bean
 * @author ajayr
 */
public class OBXBeanPopulaterSingle {
	private final static Logger LOGGER = LoggerFactory.getLogger(OBXBeanPopulaterSingle.class);
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	public List<OBXBean> populateOBXBeanSingle(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering into populateOBXBean method");
		List<OBXBean> obxBeanList = new ArrayList<OBXBean>();
		int h=0;
		for(int b=0; b<dataBean.getPatientImmunizationsList().size(); b++) {
			if(dataBean.getPatientImmunizationsList().get(b).getFundingeligibility()!=null) {
				h++;
			}
		}
		if(h>0) {
		    if(dataBean.getPatientImmunizationRXAInfoList()!=null && dataBean.getPatientImmunizationRXAInfoList().size()!=0) {
		        if(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()!=null) {
		            if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && (FundingEligibilityConstant.VARICELLA_INFECTION_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))) {
	                    OBXBean obxBean = new OBXBean();
	                    obxBean.setOccurrenceId("1");
	                    obxBean.setValueType("CE");
	                    obxBean.setObservationId("59784-9");
	                    obxBean.setObservationText("Disease with presumed immunity");
	                    obxBean.setObservationNCS("LN");
	                    obxBean.setObservationSubId("1");
	                    obxBean.setObservationValueText(FundingEligibilityConstant.VARICELLA_INFECTION_VALUE);
	                    obxBean.setObservationValueIdentifier("38907003");
	                    obxBean.setObservationValueNCS("SCT");
	                    obxBean.setObservationResultStatus("F");
	                    
	                    obxBeanList.add(obxBean);
	                }
	                else {
	                    // need discussion on it
	                   /* if((dataBean.getPatientImmunizationsList() !=null) && (dataBean.getPatientImmunizationsList().size() !=0) && (dataBean.getPatientImmunizationsList().size() >=4)) {
	                        for(int i=0; i<=count; i++) {
	                            int j=1;
	                            int k=0;
	                            int p=1;
	                            int l=1;
	                            for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList()) {
	                                OBXBean obxBean = new OBXBean();
	                                obxBean.setOccurrenceId(String.valueOf(p));
	                                if(p<3) {
	                                    obxBean.setValueType("CE");
	                                    if(p>1) {
	                                        obxBean.setObservationId("30956-7");
	                                        obxBean.setObservationText("vaccine type");
	                                    }
	                                }
	                                obxBean.setObservationNCS(HL7GeneratorConstant.OBSERVATION_NCS);
	                                    if(k==0) {
	                                        obxBean.setObservationId("64994-7");
	                                        obxBean.setObservationText("Vaccine funding program eligibility category");
	                                        obxBean.setObservationSubId(String.valueOf(j));
	                                        obxBean.setObservMethodId("VXC40");
	                                    } 
	                                    else {
	                                        if(l<=3) {
	                                            if(l>=2) {
	                                                obxBean.setValueType("TS");
	                                                obxBean.setObservationText("Date vaccine information statement published");
	                                                if(l==2) {
	                                                    obxBean.setObservationId("29768-9");
	                                                }
	                                                else {
	                                                    obxBean.setObservationId("29769-7");
	                                                }
	                                            }
	                                            obxBean.setObservationSubId(String.valueOf(j));
	                                            j--;
	                                            l++;
	                                        }
	                                        else {
	                                            j++;
	                                            obxBean.setValueType("CE");
	                                            obxBean.setObservationText("vaccine type");
	                                            obxBean.setObservationId("30956-7");
	                                            obxBean.setObservationSubId(String.valueOf(j));
	                                            j--;
	                                            l=2;
	                                        }
	                                    }
	                                // set funding Eligibility
	                                if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && (FundingEligibilityConstant.MEDICAL_ELIGIBILITY_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText(FundingEligibilityConstant.MEDICAL_ELIGIBILITY_VALUE);
	                                    obxBean.setObservationValueIdentifier("V01");
	                                    obxBean.setObservationValueNCS("HL70064");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && (FundingEligibilityConstant.UNINSURED_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText(FundingEligibilityConstant.UNINSURED_VALUE);
	                                    obxBean.setObservationValueIdentifier("V02");
	                                    obxBean.setObservationValueNCS("HL70064");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && (FundingEligibilityConstant.AMERICAN_INDIAN_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText(FundingEligibilityConstant.AMERICAN_INDIAN_VALUE);
	                                    obxBean.setObservationValueIdentifier("V03");
	                                    obxBean.setObservationValueNCS("HL70064");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && (FundingEligibilityConstant.NOT_ELIGIBLE_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText(FundingEligibilityConstant.NOT_ELIGIBLE_VALUE);
	                                    obxBean.setObservationValueIdentifier("V04");
	                                    obxBean.setObservationValueNCS("HL70064");
	                                }
	                                else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Influenza, unspecified formulation".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Influenza, unspecified formulation");
	                                    obxBean.setObservationValueIdentifier("88");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null &&  "Hepatitis A".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Hepatitis A");
	                                    obxBean.setObservationValueIdentifier("85");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Td(adult) unspecified formulation".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Td(adult) unspecified formulation");
	                                    obxBean.setObservationValueIdentifier("139");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }
	                                else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "DTaP".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("DTaP");
	                                    obxBean.setObservationValueIdentifier("107");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Polio".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Polio");
	                                    obxBean.setObservationValueIdentifier("89");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Hib".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Hib");
	                                    obxBean.setObservationValueIdentifier("17");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }
	                                else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Hep B, unspecified formulation".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Hep B, unspecified formulation");
	                                    obxBean.setObservationValueIdentifier("45");
	                                    obxBean.setObservationValueNCS("CVX");
	                                }
	                                else if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()))!=null && "Varicella infection".equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                                    obxBean.setObservationValueText("Varicella infection");
	                                    obxBean.setObservationValueIdentifier("38907003");
	                                    obxBean.setObservationValueNCS("SCT");
	                                }
	                                else {
	                                    Date date = new Date();
	                                    obxBean.setObservationValueText(sdf.format(date));
	                                    obxBean.setObservationValueIdentifier("");
	                                    obxBean.setObservationValueNCS("");
	                                }
	                                    
	                                obxBean.setObservationResultStatus(HL7GeneratorConstant.OBSERVATION_RESULT_STATUS);
	                                obxBean.setObservationDateTime(sdf.format(new Date()));
	                                obxBean.setObservMethodText(HL7GeneratorConstant.OBSERVATION_METHOD_TEXT);
	                                obxBean.setObservMethodNCS(HL7GeneratorConstant.OBSERVATION_METHOD_NCS);
	                                obxBeanList.add(obxBean);
	                                j++;
	                                k++;
	                                p++;
	                            }
	                        }
	                }*/
	               // else {
	                    OBXBean obxBean = new OBXBean();
	                    obxBean.setOccurrenceId("1");
	                    obxBean.setValueType("CE");
	                    obxBean.setObservationId("64994-7");
	                    obxBean.setObservationText("Vaccine funding program eligibility category");
	                    obxBean.setObservationNCS("LN");
	                    obxBean.setObservationSubId("1");
	                    if(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()!=null && (FundingEligibilityConstant.MEDICAL_ELIGIBILITY_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                        obxBean.setObservationValueText(FundingEligibilityConstant.MEDICAL_ELIGIBILITY_VALUE);
	                        obxBean.setObservationValueIdentifier("V01");
	                        obxBean.setObservationValueNCS("HL70064");
	                    }else if(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()!=null && (FundingEligibilityConstant.UNINSURED_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                        obxBean.setObservationValueText(FundingEligibilityConstant.UNINSURED_VALUE);
	                        obxBean.setObservationValueIdentifier("V02");
	                        obxBean.setObservationValueNCS("HL70064");
	                    }else if(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()!=null && (FundingEligibilityConstant.AMERICAN_INDIAN_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                        obxBean.setObservationValueText(FundingEligibilityConstant.AMERICAN_INDIAN_VALUE);
	                        obxBean.setObservationValueIdentifier("V03");
	                        obxBean.setObservationValueNCS("HL70064");
	                    }else if(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility()!=null && (FundingEligibilityConstant.NOT_ELIGIBLE_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getFundingeligibility())))){
	                        obxBean.setObservationValueText(FundingEligibilityConstant.NOT_ELIGIBLE_VALUE);
	                        obxBean.setObservationValueIdentifier("V04");
	                        obxBean.setObservationValueNCS("HL70064");
	                    }else if(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility()!=null && (FundingEligibilityConstant.VFC_ELIGIBLE_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility())))){
                            obxBean.setObservationValueText(FundingEligibilityConstant.VFC_ELIGIBLE_VALUE);
                            obxBean.setObservationValueIdentifier("V05");
                            obxBean.setObservationValueNCS("HL70064");
                        }else if(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility()!=null && (FundingEligibilityConstant.VARICELLA_INFECTION_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility())))){
                            obxBean.setObservationValueText(FundingEligibilityConstant.VARICELLA_INFECTION_VALUE);
                            obxBean.setObservationValueIdentifier("38907003");
                            obxBean.setObservationValueNCS("SCT");
                        }else {
	                        obxBean.setObservationValueText("");
	                        obxBean.setObservationValueIdentifier("");
	                        obxBean.setObservationValueNCS("");
	                    }
	                    obxBean.setObservationResultStatus("F");
	                    obxBean.setObservationDateTime(sdf.format(new Date()));
	                    obxBean.setObservMethodId("VXC40");
	                    obxBean.setObservMethodText("Eligibility captured at the immunization level");
	                    obxBean.setObservMethodNCS("CDCPHINVS");
	                    
	                    obxBeanList.add(obxBean);
	                    
	                    OBXBean obxBean2 = new OBXBean();
	                    obxBean2.setOccurrenceId("2");
	                    obxBean2.setValueType("CE");
	                    obxBean2.setObservationId("30956-7");
	                    obxBean2.setObservationText("vaccine type");
	                    obxBean2.setObservationNCS("LN");
	                    obxBean2.setObservationSubId("2");
	                    // need to be remove
	                    if("Hep A, adult".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getProductname())) {
	                        obxBean2.setObservationValueIdentifier("85");
                        }
	                    else {
	                        obxBean2.setObservationValueIdentifier("88"); 
	                    }
	                    //end
	                    obxBean2.setObservationValueText("Influenza, unspecified formulation");
	                    obxBean2.setObservationValueNCS("CVX");
	                    obxBean2.setObservationResultStatus("F");
	                    
	                    obxBeanList.add(obxBean2);
	                    
	                    OBXBean obxBean3 = new OBXBean();
	                    obxBean3.setOccurrenceId("3");
	                    obxBean3.setValueType("TS");
	                    obxBean3.setObservationId("29768-9");
	                    obxBean3.setObservationText("Date vaccine information statement published");
	                    obxBean3.setObservationNCS("LN");
	                    obxBean3.setObservationSubId("2");
	                    //need to be remove
	                    if("Hep A, adult".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getProductname())) {
	                        obxBean3.setObservationValueText("20111025");
	                         
	                    }
	                    else if("Influenza, seasonal, injectable".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getProductname())) {
	                        obxBean3.setObservationValueText("20120702");
	                    }
	                    else {
	                        obxBean3.setObservationValueText(sdf.format(dataBean.getPatientImmunizationRXAInfoList().get(dataBean.getPatientImmunizationRXAInfoList().size()-1).getLastupdated()));
	                        
	                    }
	                    //end
	                    obxBean3.setObservationResultStatus("F");
	                    
	                    obxBeanList.add(obxBean3);
	                    
	                    OBXBean obxBean4 = new OBXBean();
	                    obxBean4.setOccurrenceId("4");
	                    obxBean4.setValueType("TS");
	                    obxBean4.setObservationId("29769-7");
	                    obxBean4.setObservationText("Date vaccine information statement presented");
	                    obxBean4.setObservationNCS("LN");
	                    obxBean4.setObservationSubId("2");
	                    obxBean4.setObservationValueText(sdf.format(new Date()));
	                    obxBean4.setObservationResultStatus("F");
	                    
	                    obxBeanList.add(obxBean4);
	                //}
	              }
		        }
		     }		
	}
		LOGGER.info("\n Exiting from populateOBXBean method");
		return obxBeanList;
	}
}
