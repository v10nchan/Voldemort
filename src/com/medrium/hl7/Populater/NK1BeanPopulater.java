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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.constants.RelationshipConstant;
import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightinagle.hl7.util.HL7Util;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.PatientAddress;
import com.nightingale.hl7.daoBeans.PatientCommunication;
import com.nightingale.hl7.daoBeans.PatientContact;
import com.nightingale.hl7.dto.Address;
import com.nightingale.hl7.dto.NK1Bean;
import com.nightingale.hl7.dto.Name;
import com.nightingale.hl7.dto.PatientInformation;
import com.nightingale.hl7.dto.Phone;

/**
 * Class to populate NK1 Bean
 * @author ajayr
 */
public class NK1BeanPopulater {

	private final static Logger LOGGER = LoggerFactory.getLogger(NK1BeanPopulater.class);

	public List<NK1Bean> populateNK1Bean(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering inside populateNK1Bean");
		List<NK1Bean> nk1BeanList = new ArrayList<NK1Bean>();
		
		if ((dataBean.getPatientContactList() != null) && (dataBean.getPatientContactList().size() != 0)) {
		    int i=0;
		    for(PatientContact patientContact : dataBean.getPatientContactList()) {
		        if(patientContact!=null) {
		            if(patientContact.getFirstname()!=null && patientContact.getAddress1()!=null && patientContact.getCity()!=null && patientContact.getState()!=null && patientContact.getCountry()!=0 && patientContact.getZipcode()!=null && patientContact.getPhone1ext()!=null && patientContact.getPhone1()!=null && dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()!=0) {
		                i++;
		            }
		        }
		    }
		    if(i>0) {
		        NK1Bean nk1Bean = new NK1Bean();
	            List<Name> nameList = new ArrayList<Name>();
	            // set Kin information
	            for (PatientContact guardianInfo : dataBean.getPatientContactList()) {
	                Name name = new Name();
	                name.setGivenName(guardianInfo.getFirstname());
	                name.setSurname(guardianInfo.getLastname());
	                name.setNameTypeCode(HL7GeneratorConstant.TYPE_CODE);
	                nameList.add(name);
	            }
	            nk1Bean.setNk1Id(HL7GeneratorConstant.NK1_ID);
	            // Kin Relationship
	            if ((RelationshipConstant.MOTHER_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.MOTHER_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.MOTHER_ID_VALUE);
	            } else if ((RelationshipConstant.FATHAER_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.FATHAER_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.FATHAER_ID_VALUE);
	            } else if ((RelationshipConstant.SISTER_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.SISTER_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.SISTER_ID_VALUE);
	            } else if ((RelationshipConstant.BROTHER_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.BROTHER_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.BROTHER_ID_VALUE);
	            } else if ((RelationshipConstant.DAUGHTER_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.DAUGHTER_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.DAUGHTER_ID_VALUE);
	            } else if ((RelationshipConstant.SON_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.SON_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.SON_ID_VALUE);
	            } else if ((RelationshipConstant.FRIEND_ID_VALUE).equalsIgnoreCase(HL7Util.getRelationship(dataBean.getPatientContactList().get(dataBean.getPatientContactList().size()-1).getRelationship()))) {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.FRIEND_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.FRIEND_ID_VALUE);
	            } else {
	                nk1Bean.setRelationshipIdentifier(RelationshipConstant.GUARDIAN_CODE);
	                nk1Bean.setRelationshipText(RelationshipConstant.GUARDIAN_VALUE);
	            }
	            nk1Bean.setKinNameList(nameList);

	            List<Address> addressList = new ArrayList<Address>();
	            // kin's guardians Address
	            for (PatientContact guardianAddress : dataBean.getPatientContactList()) {
	                Address address = new Address();
	                address.setAddressType(HL7GeneratorConstant.TYPE_CODE);
	                address.setCity(guardianAddress.getCity());
	                address.setCountry(HL7Util.getCountryName(guardianAddress.getCountry()));
	                address.setState(guardianAddress.getState());
	                address.setStreetAddress(guardianAddress.getAddress1());
	                address.setZip(guardianAddress.getZipcode());
	                addressList.add(address);
	            }
	            nk1Bean.setAddressList(addressList);

	            List<Phone> phoneList = new ArrayList<Phone>();
	            // kin contact info
	            for (PatientContact guardianContact : dataBean.getPatientContactList()) {
	                if((guardianContact.getPhone1ext()!=null  && !"".equalsIgnoreCase(guardianContact.getPhone1ext())) || (guardianContact.getPhone1()!=null  && !"".equalsIgnoreCase(guardianContact.getPhone1()))) {
	                    Phone phone = new Phone();
	                    phone.setTelecomUseCode(HL7GeneratorConstant.TELECOM_USE_CODE);
	                    phone.setTelecomEquipType(HL7GeneratorConstant.TELECOM_EQUIP_TYPE);
	                    phone.setAreaOrCityCode(guardianContact.getPhone1ext());
	                    phone.setLocalNumber(guardianContact.getPhone1());
	                    phoneList.add(phone);
	                }
	            }
	            nk1Bean.setPhoneList(phoneList);
	            nk1BeanList.add(nk1Bean);
		    }
			
		}
		LOGGER.info("\n Exiting from populateNK1Bean");
		return nk1BeanList;
	}
}
