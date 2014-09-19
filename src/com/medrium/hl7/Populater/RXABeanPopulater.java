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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.constants.DosageConstant;
import com.nightinagle.hl7.constants.FundingEligibilityConstant;
import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightinagle.hl7.util.HL7Util;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.PatientImmunization;
import com.nightingale.hl7.daoBeans.PatientImmunizationRXAInfo;
import com.nightingale.hl7.dto.AdministrationNotes;
import com.nightingale.hl7.dto.ManufecturerName;
import com.nightingale.hl7.dto.RXABean;
import com.nightingale.hl7.dto.RefusalReason;

/*
 * class to populate RXA Bean
 * @author ajayr
 */
public class RXABeanPopulater {
	private final static Logger LOGGER = LoggerFactory.getLogger(RXABeanPopulater.class);
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
	
		public RXABean populateRXABean(DBDataBean dataBean, int count) {
			LOGGER.info("\n Entering into populateRXABean");
			RXABean rxaBean = new RXABean();
			if(dataBean.getPatientImmunizationsList().get(count).getRefuseddate()==null) {
			    if(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility()!=null) {
			        if(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility()))!=null && (FundingEligibilityConstant.VARICELLA_INFECTION_VALUE).equalsIgnoreCase(HL7Util.getFundingDescription(Integer.parseInt(dataBean.getPatientImmunizationsList().get(count).getFundingeligibility())))) {

	                    Date date = dataBean.getPatientImmunizationsList().get(count).getAdministrationdate();
	                    String startDate = sdf.format(date);
	                    rxaBean.setAdminstrationStartDateTime(startDate);
	                    if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
	                        rxaBean.setAdminsteredCodeIdentifier(String.valueOf(dataBean.getPatientImmunizationsList().get(count).getProductcode()));
	                        rxaBean.setAdminsteredCodeText(dataBean.getPatientImmunizationsList().get(count).getProductname());
	                    }
	                    if((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()==0) {
	                        rxaBean.setAdminsteredAmt("999");
	                    }
	                    else {
	                        rxaBean.setAdminsteredAmt(String.valueOf((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()));
	                    }
	                    rxaBean.setCompletionStatus(HL7GeneratorConstant.REFUSED_STATUS_NA);
	                
	                }
			    }
			    else {
	                if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
	                    //Required for RXA Segment
	                    if(dataBean.getPatientImmunizationsList().get(count).getAdministrationdate()!=null) {
	                        Date date = dataBean.getPatientImmunizationsList().get(count).getAdministrationdate();
	                        String startDate = sdf.format(date);
	                        rxaBean.setAdminstrationStartDateTime(startDate);
	                        if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
	                            rxaBean.setAdminsteredCodeIdentifier(String.valueOf(dataBean.getPatientImmunizationsList().get(count).getProductcode()));
	                            rxaBean.setAdminsteredCodeText(dataBean.getPatientImmunizationsList().get(count).getProductname());
	                        }
	                        // raw code need to remove
	                        if((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()==0) {
	                            rxaBean.setAdminsteredAmt(String.valueOf(dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()));
	                        } 
	                        else {
	                            rxaBean.setAdminsteredAmt(String.valueOf((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()));
	                        }
	                        //end
	                        rxaBean.setAdminsteredUnitIdentifier(dataBean.getImmunizationViewInfoList().get(count).getDosageunit());
	                        // set dosage unit
	                        if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10736".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_CC_VALUE);
	                        }else if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10737".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_ML_VALUE);
	                        }else if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10738".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_L_VALUE);
	                        }else if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10739".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_UNITS_VALUE);
	                        }else if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10740".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_MG_VALUE);
	                        }else if((dataBean .getPatientImmunizationsList().get(count).getAdministeredunits()!=null) && ("10741".equalsIgnoreCase(dataBean.getPatientImmunizationsList().get(count).getAdministeredunits()))){
	                            rxaBean.setAdminsteredUnitText(DosageConstant.DOSAGE_G_VALUE);
	                        }
	                        else {
	                            rxaBean.setAdminsteredUnitText("");
	                        }
	                        
	                        rxaBean.setAdminsteredUnitNCS(HL7GeneratorConstant.ADMINSTERED_UNIT_NCS);

	                        List<AdministrationNotes> administrationNoteList = new ArrayList<AdministrationNotes>();
	                        AdministrationNotes administrationNotes = new AdministrationNotes();
	                        // set Notes for a patient
	                        // commented as per curent senario
	                        /*if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("New immunization record".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("00");
	                            administrationNotes.setText("New immunization record");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - source unspecified".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("01");
	                            administrationNotes.setText("Historical information - source unspecified");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from other provider".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("02");
	                            administrationNotes.setText("Historical information - from other provider");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from parent's written record".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("03");
	                            administrationNotes.setText("Historical information - from parent's written record");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from parent's recall".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("04");
	                            administrationNotes.setText("Historical information - from parent's recall");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from other registry".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("05");
	                            administrationNotes.setText("Historical information - from other registry");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from birth certificate".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("06");
	                            administrationNotes.setText("Historical information - from birth certificate");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from school record".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("07");
	                            administrationNotes.setText("Historical information - from school record");
	                        }else if((dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()!=null) && ("Historical information - from public agency".equalsIgnoreCase(dataBean.getPatientImmunizationRXAInfoList().get(count).getNotes()))){
	                            administrationNotes.setIdentifier("08");
	                            administrationNotes.setText("Historical information - from public agency");
	                        }
	                        else {
	                            administrationNotes.setIdentifier("00");
	                            administrationNotes.setText("New immunization record");
	                        }*/
	                        
	                        //set notes for a patient
	                        if(dataBean.getPatientNoteInfoList()!=null && dataBean.getPatientNoteInfoList().size()!=0) {
	                            if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("New immunization record".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("00");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - source unspecified".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("01");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from other provider".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("02");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from parent's written record".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("03");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from parent's recall".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("04");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from other registry".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("05");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from birth certificate".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("06");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from school record".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("07");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }else if((dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()!=null) && ("Historical information - from public agency".equalsIgnoreCase(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote()))){
	                                administrationNotes.setIdentifier("08");
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }
	                            else {
	                                administrationNotes.setIdentifier(String.valueOf(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNotetypeid()));
	                                administrationNotes.setText(dataBean.getPatientNoteInfoList().get(dataBean.getPatientNoteInfoList().size()-1).getNote());
	                            }
	                        }
	                        
	                        
	                        administrationNoteList.add(administrationNotes);
	                        rxaBean.setAdministrationNoteList(administrationNoteList);
	                        //set provider
	                        if(dataBean.getPatientProviderInfoList()!=null && dataBean.getPatientProviderInfoList().size()!=0) {
	                            rxaBean.setAdminProvIdNumber(String.valueOf(dataBean.getPatientProviderInfoList().get(count).getProvid()));
	                            rxaBean.setAdminProvSurname(dataBean.getPatientProviderInfoList().get(count).getLastname());
	                            rxaBean.setAdminProvInitial(dataBean.getPatientProviderInfoList().get(count).getMiddlename());
	                            rxaBean.setAdminProvGivenName(dataBean.getPatientProviderInfoList().get(count).getFirstname());
	                        }
	                        rxaBean.setAdminProvNamespaceId(HL7GeneratorConstant.NAMESPACE_ID);
	                        rxaBean.setAdminAtNamespaceId(HL7GeneratorConstant.SENDING_FACILITY_NAMESPACE_ID);

	                        List<String> lotNumberList = new ArrayList<String>();
	                        if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
	                            //set lot Number
	                            for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList()) {
	                                if(patientImmunization.getLotnumber()!=null) {
	                                    lotNumberList.add(patientImmunization.getLotnumber());
	                                }
	                                else {
	                                    lotNumberList.add("NA");
	                                }
	                            }
	                            rxaBean.setLotNumberList(lotNumberList);
	                            if(dataBean.getPatientImmunizationsList().get(count).getExpirydate()!=null) {
	                                date = dataBean.getPatientImmunizationsList().get(count).getExpirydate();
	                                String expDate = sdf.format(date);
	                                rxaBean.setExpirationDate(expDate);
	                            }
	                            // set Manufacturer
	                            List<ManufecturerName> manufecturerNameList = new ArrayList<ManufecturerName>();
	                            for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList()) {
	                                ManufecturerName name = new ManufecturerName();
	                                if(patientImmunization.getManufacturercode()!=null) {
	                                    name.setIdentifier(patientImmunization.getManufacturercode());
	                                }
	                                else {
	                                    name.setIdentifier("");
	                                }
	                               if(patientImmunization.getManufacturername()!=null) {
	                                   name.setText(patientImmunization.getManufacturername());
	                               }
	                               else {
	                                   name.setText("");
	                               }
	                                manufecturerNameList.add(name);
	                            }
	                            rxaBean.setManufecturerNameList(manufecturerNameList);
	                        }
	                        rxaBean.setCompletionStatus(HL7GeneratorConstant.COMPLETION_STATUS);
	                        rxaBean.setActionCode(HL7GeneratorConstant.ACTION_CODE);
	                    }
	                }
			    }
			}
			else {
                Date date = dataBean.getPatientImmunizationsList().get(count).getRefuseddate();
                String startDate = sdf.format(date);
                rxaBean.setAdminstrationStartDateTime(startDate);
                if(dataBean.getPatientImmunizationsList()!=null && dataBean.getPatientImmunizationsList().size()!=0) {
                    rxaBean.setAdminsteredCodeIdentifier(String.valueOf(dataBean.getPatientImmunizationsList().get(count).getImmunizationcode()));
                    rxaBean.setAdminsteredCodeText(dataBean.getPatientImmunizationsList().get(count).getImmunizationname());
                }
                if((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()==0) {
                    rxaBean.setAdminsteredAmt("999");
                }
                else {
                    rxaBean.setAdminsteredAmt(String.valueOf((int)dataBean.getPatientImmunizationsList().get(count).getAdministeredamount()));
                }
                List<RefusalReason> refusalReasonList = new ArrayList<RefusalReason>();
               // for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList()) {
                    RefusalReason refusalReason = new RefusalReason();
                    refusalReason.setIdentifier("00");
                    refusalReason.setText("Refused By Patient");
                    refusalReason.setNcs("NIP002");
                    refusalReasonList.add(refusalReason);
                //}
                rxaBean.setRefusalReasonList(refusalReasonList);
                
                rxaBean.setCompletionStatus(HL7GeneratorConstant.REFUSED_STATUS);
            
			}
			LOGGER.info("\n Exiting from populateRXABean");
			return rxaBean;
		}
}
