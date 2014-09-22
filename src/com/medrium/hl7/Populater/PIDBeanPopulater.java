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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.constants.EthinicityConstant;
import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightinagle.hl7.util.HL7Util;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.PatientAddress;
import com.nightingale.hl7.daoBeans.PatientCommunication;
import com.nightingale.hl7.daoBeans.PatientImmunization;
import com.nightingale.hl7.daoBeans.RaceInfo;
import com.nightingale.hl7.dto.Address;
import com.nightingale.hl7.dto.Name;
import com.nightingale.hl7.dto.PIDBean;
import com.nightingale.hl7.dto.PatientIdentifier;
import com.nightingale.hl7.dto.Phone;
import com.nightingale.hl7.dto.Race;

/**
 * Class to populate PID Bean
 * @author ajayr
 */
public class PIDBeanPopulater {

	private final static Logger LOGGER = LoggerFactory.getLogger(PIDBeanPopulater.class);
	
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
	
	public PIDBean populatePIDBean(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering into populatePIDBean method");
		PIDBean pidBean = new PIDBean();
		//Require condition to populate PID Segment
		if(dataBean.getPatientInformation().getFirstName()!=null || dataBean.getPatientInformation().getDob()!=null) {
			//set patient id
		    PatientIdentifier patientIdentifier = new PatientIdentifier();
			for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList())
			{
				patientIdentifier.setIdNumber(String.valueOf(patientImmunization.getPatientid()));
				patientIdentifier.setAssignAuthNamespaceId(HL7GeneratorConstant.ASSIGN_AUTH_NAMESPACE_ID);
				if(dataBean.getPatientInformation().getTitle()!=null) {
				    patientIdentifier.setIdentifierTypeCode(HL7Util.getTitleDescription(Integer.parseInt(dataBean.getPatientInformation().getTitle()))); 
				}
				pidBean.addPatientIdentifier(patientIdentifier);
			}
			
			//Second patient identifier
			patientIdentifier = new PatientIdentifier();
	        patientIdentifier.setIdNumber(String.valueOf(dataBean.getPatientInformation().getPatientId()));
	        patientIdentifier.setAssignAuthNamespaceId(HL7GeneratorConstant.ASSIGN_AUTH_NAMESPACE_ID);
	        patientIdentifier.setIdentifierTypeCode(HL7GeneratorConstant.IDENTIFIER_TYPE_SS);

	        pidBean.addPatientIdentifier(patientIdentifier);
	        
			// set patient Name
			Name name = new Name();
			name.setSurname(dataBean.getPatientInformation().getLastName());
			name.setGivenName(dataBean.getPatientInformation().getFirstName());
			name.setSecondNameOrInitial(dataBean.getPatientInformation().getMi());
			name.setNameTypeCode(HL7GeneratorConstant.TYPE_CODE);

			pidBean.addPatientName(name);
			// Set Family Information
			if(dataBean.getPatientContactList()!=null && dataBean.getPatientContactList().size()!=0) {
			    if(dataBean.getPatientContactList().get(count).getLastname()!=null) {
	                pidBean.setMotherSurname(dataBean.getPatientContactList().get(count).getLastname());
	                pidBean.setMotherGivenName(dataBean.getPatientContactList().get(count).getFirstname());
	            }
			}
			//set dob and sex
			pidBean.setAdministrativeSex(dataBean.getPatientInformation().getSex());
            String dob = sdf.format(dataBean.getPatientInformation().getDob());
            pidBean.setDateOfBirth(dob);
            
			// set race
			for (RaceInfo raceInfo : dataBean.getRaceInfoList()) {
				Race race = new Race();
				race.setText(HL7Util.getRaceDescription(raceInfo.getRace()));
				race.setIdentifier(HL7Util.getRaceIdentifier(raceInfo.getRace()));
				pidBean.addRace(race);
			}
			// set patient Address
			for (PatientAddress patientAddress : dataBean.getPatientAddressList()) {
				LOGGER.info("Populating address >>>>>>>>>>>>>>");
				Address address = new Address();
				address.setStreetAddress(patientAddress.getAddr1() + patientAddress.getAddr2());
				address.setCity(patientAddress.getCity());
				address.setState(patientAddress.getState());
				if(patientAddress.getCountry()!=null) {
				    address.setCountry(HL7Util.getCountryName(Integer.parseInt(patientAddress.getCountry())));
				}
				address.setZip(patientAddress.getZip());
				address.setAddressType(HL7GeneratorConstant.TYPE_CODE);

				pidBean.addPatientAddress(address);
			}
			// set contact information
			if((dataBean.getContactList() != null) && (dataBean.getContactList().size() !=0)) {
				for (PatientCommunication contact : dataBean.getContactList()) {
					LOGGER.info(">>>>>>>>>get contact info >>>>>>>>>");
					Phone phone = new Phone();
					if(dataBean.getPatientInformation()!=null) {
					    if(dataBean.getPatientInformation().getEmail()!=null  && !"".equalsIgnoreCase(dataBean.getPatientInformation().getEmail())) {
	                        Phone phone1 = new Phone();
	                        pidBean.addPatientPhone(phone1);
	                        phone.setTelecomUseCode(HL7GeneratorConstant.TELECOM_USE_CODE_NET);
	                        phone.setEmailAdd(dataBean.getPatientInformation().getEmail());
	                    }
					    else {
					        if((contact.getExtnum()!=null  && !"".equalsIgnoreCase(contact.getExtnum())) || (contact.getTelnum()!=null  && !"".equalsIgnoreCase(contact.getTelnum()))) {
					            phone.setTelecomUseCode(HL7GeneratorConstant.TELECOM_USE_CODE);
	                            phone.setTelecomEquipType(HL7GeneratorConstant.TELECOM_EQUIP_TYPE);
	                            phone.setAreaOrCityCode(contact.getExtnum());
	                            phone.setLocalNumber(contact.getTelnum());
					        }
	                    }
					}
					pidBean.addPatientPhone(phone);
				}
			}
			else {
				Phone phone = new Phone();
				if(dataBean.getPatientInformation()!=null) {
				    if(dataBean.getPatientInformation().getEmail()!=null && !"".equalsIgnoreCase(dataBean.getPatientInformation().getEmail())) {
	                    Phone phone1 = new Phone();
	                    pidBean.addPatientPhone(phone1);
	                    phone.setTelecomUseCode(HL7GeneratorConstant.TELECOM_USE_CODE_NET);
	                    phone.setEmailAdd(dataBean.getPatientInformation().getEmail());
	                }
				}
				pidBean.addPatientPhone(phone);
			}
			// set Ethinicity
			if(dataBean.getPatientSocialHistoryList()!=null && dataBean.getPatientSocialHistoryList().size()!=0) {
			    if((EthinicityConstant.ETHINICITY_HISPANIC_VALUE).equalsIgnoreCase(HL7Util.getEthinicityDescription(dataBean.getPatientSocialHistoryList().get(count).getEthnicity()))) {
	                pidBean.setEthnicGrpIdentifier("2135-2");
	                pidBean.setEthnicGrpText(EthinicityConstant.ETHINICITY_HISPANIC_VALUE);
	            }
	            else if((EthinicityConstant.ETHINICITY_NON_HISPANIC_VALUE).equalsIgnoreCase(HL7Util.getEthinicityDescription(dataBean.getPatientSocialHistoryList().get(count).getEthnicity()))) {
	                pidBean.setEthnicGrpIdentifier("2186-5");
	                pidBean.setEthnicGrpText(EthinicityConstant.ETHINICITY_NON_HISPANIC_VALUE);
	            }
	            else if((EthinicityConstant.DONT_KNOW_VALUE).equalsIgnoreCase(HL7Util.getEthinicityDescription(dataBean.getPatientSocialHistoryList().get(count).getEthnicity()))) {
	                pidBean.setEthnicGrpIdentifier("");
	                pidBean.setEthnicGrpText(EthinicityConstant.DONT_KNOW_VALUE);
	            }
	            else if((EthinicityConstant.DONT_WANT_TO_ANSWER_VALUE).equalsIgnoreCase(HL7Util.getEthinicityDescription(dataBean.getPatientSocialHistoryList().get(count).getEthnicity()))) {
	                pidBean.setEthnicGrpIdentifier("");
	                pidBean.setEthnicGrpText(EthinicityConstant.DONT_WANT_TO_ANSWER_VALUE);
	            }
	            else if((EthinicityConstant.DECLINED_VALUE).equalsIgnoreCase(HL7Util.getEthinicityDescription(dataBean.getPatientSocialHistoryList().get(count).getEthnicity()))) {
	                pidBean.setEthnicGrpIdentifier("");
	                pidBean.setEthnicGrpText(EthinicityConstant.DECLINED_VALUE);
	            }
	            else {
	                pidBean.setEthnicGrpIdentifier("");
	                pidBean.setEthnicGrpText("");
	            }
			}
		}
		LOGGER.info("\n Exiting from populatePIDBean method");
		return pidBean;
	}
}
