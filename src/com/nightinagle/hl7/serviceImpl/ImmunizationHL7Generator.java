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
package com.nightinagle.hl7.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v251.datatype.CE;
import ca.uhn.hl7v2.model.v251.datatype.CX;
import ca.uhn.hl7v2.model.v251.datatype.DT;
import ca.uhn.hl7v2.model.v251.datatype.ST;
import ca.uhn.hl7v2.model.v251.datatype.XAD;
import ca.uhn.hl7v2.model.v251.datatype.XPN;
import ca.uhn.hl7v2.model.v251.datatype.XTN;
import ca.uhn.hl7v2.model.v251.group.VXU_V04_OBSERVATION;
import ca.uhn.hl7v2.model.v251.group.VXU_V04_ORDER;
import ca.uhn.hl7v2.model.v251.message.VXU_V04;
import ca.uhn.hl7v2.model.v251.segment.MSH;
import ca.uhn.hl7v2.model.v251.segment.NK1;
import ca.uhn.hl7v2.model.v251.segment.OBX;
import ca.uhn.hl7v2.model.v251.segment.ORC;
import ca.uhn.hl7v2.model.v251.segment.PD1;
import ca.uhn.hl7v2.model.v251.segment.PID;
import ca.uhn.hl7v2.model.v251.segment.RXA;
import ca.uhn.hl7v2.model.v251.segment.RXR;
import ca.uhn.hl7v2.parser.Parser;

import com.nightinagle.hl7.exception.SegmentException;
import com.nightingale.hl7.dto.Address;
import com.nightingale.hl7.dto.AdministrationNotes;
import com.nightingale.hl7.dto.HL7Bean;
import com.nightingale.hl7.dto.HL7Type;
import com.nightingale.hl7.dto.MSHBean;
import com.nightingale.hl7.dto.ManufecturerName;
import com.nightingale.hl7.dto.NK1Bean;
import com.nightingale.hl7.dto.Name;
import com.nightingale.hl7.dto.OBXBean;
import com.nightingale.hl7.dto.ORCBean;
import com.nightingale.hl7.dto.OrderBean;
import com.nightingale.hl7.dto.PD1Bean;
import com.nightingale.hl7.dto.PIDBean;
import com.nightingale.hl7.dto.PatientIdentifier;
import com.nightingale.hl7.dto.Phone;
import com.nightingale.hl7.dto.RXABean;
import com.nightingale.hl7.dto.RXRBean;
import com.nightingale.hl7.dto.Race;
import com.nightingale.hl7.dto.RefusalReason;
import com.nightingale.hl7.service.AbstractHL7Generator;

/**
 * Class to populate values set in different segment 
 * @author ajayr
 *
 */
public class ImmunizationHL7Generator implements AbstractHL7Generator {

	private final static Logger LOGGER = LoggerFactory.getLogger(ImmunizationHL7Generator.class);
	//TODO: Possible to generate HL7 message depend on type
	//private HL7Type type;

	public ImmunizationHL7Generator(HL7Type type) {
		//this.type = type;
	}

	/**
	 * This method is for generating the HL7 message.
	 * 
	 * @param patientImmunizationInfo
	 * @throws HL7Exception
	 * @throws IOException
	 */
	@Override
	public String generateHL7Message(HL7Bean hl7Bean, HL7Type type) {
		LOGGER.info("\n Entering to generateHL7Message");
		try {
			//TODO: fix the initialization of the main message bean which should be instantiated depending upon the type.
			VXU_V04 vxu_04 = new VXU_V04();
			vxu_04.initQuickstart("VXU", "V04", "VXU_04");
			
			// Populate the MSH Segment
			try{
				MSH mshSegment = vxu_04.getMSH();
				populateMSHSegment(mshSegment, hl7Bean.getMshBean());
			}catch(NullPointerException ex){
				new SegmentException("Required Segment MSH is missing", ex);
			}
			
			// Populate the PID Segment
			try{
				PID pid = vxu_04.getPID();
				populatePIDSegment(pid, hl7Bean.getPidBean());
			}catch(NullPointerException ex){
				new SegmentException("Required Segment PID is missing", ex);
			}

			// Populate the PD1 Segment
				PD1 pd1 = vxu_04.getPD1();
				if(hl7Bean.getPd1Bean() != null){
					populatePD1Segment(pd1, hl7Bean.getPd1Bean());
				}
			
			// Populate the NK1 Segment
			populateNK1Segmate(vxu_04, hl7Bean.getNk1BeanList());
			
			// Populate ORC Segment
			populateOrderSegments(vxu_04, hl7Bean.getOrderBeanList());
			
			// Now, let's encode the message and look at the output
			HapiContext hapiContext = new DefaultHapiContext();
			Parser parser = hapiContext.getPipeParser();
			String encodedMessage = parser.encode(vxu_04);
			LOGGER.info("\n Printing ER7 Encoded Message:");
			LOGGER.info("\n"+encodedMessage);
			
			return encodedMessage;
			
		} catch (HL7Exception e) {
			LOGGER.error("\n HL7 Exception occures :: "+e);
			e.printStackTrace();
		} catch (IOException e) {
			LOGGER.error("\n IOException occurs :: "+e);
			e.printStackTrace();
		} catch (Exception e) {
			LOGGER.error("\n An Exception occurs in generateHL7Message method :: "+e);
			e.printStackTrace();
		}
		LOGGER.info("\n Exiting from generateHL7Message");
		return null;
	}


	private void populateNK1Segmate(VXU_V04 vxu_04, List<NK1Bean> nk1BeanList) throws HL7Exception {
		LOGGER.info("\n Entering to populateNK1Segmate method");
		int count = 0;
		for(NK1Bean nk1Bean : nk1BeanList) {
			NK1 nk1 = (NK1) vxu_04.insertRepetition("NK1", count);
			populateNK1Segment(nk1, nk1Bean);
			count++;
		}
		LOGGER.info("\n Exiting from populateNK1Segmate method");
	}

	private void populateOrderSegments(VXU_V04 vxu_04, List<OrderBean> orderBeanList) throws HL7Exception {
		LOGGER.info("\n Entering to populateOrderSegments method");
		int count = 0;
		for(OrderBean orderBean : orderBeanList){
			VXU_V04_ORDER order = (VXU_V04_ORDER)vxu_04.insertRepetition("ORDER", count);
			// Populate the ORC Segment need to iterate if multiple ORC in DB
			try {
				ORC orc = order.getORC();
				populateORCSegment(orc, orderBean.getOrcBean());
			}catch(NullPointerException ex){
				new SegmentException("Required Segment ORC is missing", ex);
			}
			// Populate RXA Segment need to iterate if multiple RXA in DB
			try {
				RXA rxa = order.getRXA();
				populateRXASegment(rxa, orderBean.getRxaBean());
			}catch(NullPointerException ex){
				new SegmentException("Required Segment MSH is missing", ex);
			}
			// Populate RXR Segment
			RXR rxr = order.getRXR();
			populateRXRSegment(rxr, orderBean.getRxrBean());

			// Populate OBX Segment
			VXU_V04_OBSERVATION observation = order.getOBSERVATION();
			populateOBXSegment(observation , orderBean.getObxBeanList());
			count++;
			LOGGER.info("\n Exiting from populateOrderSegments method");
		}
		
	}

	private void populateOBXSegment(VXU_V04_OBSERVATION observation, List<OBXBean> obxBeanList) throws HL7Exception {
		LOGGER.info("\n Entering to populateOBXSegment method");
		int count = 0;
		for(OBXBean obxBean : obxBeanList){
			OBX obx = (OBX) observation.insertRepetition("OBX", count);
			obx.getObx1_SetIDOBX().setValue(obxBean.getOccurrenceId());
			obx.getValueType().setValue(obxBean.getValueType());
			obx.getObservationIdentifier().getIdentifier().setValue(obxBean.getObservationId());
			obx.getObservationIdentifier().getText().setValue(obxBean.getObservationText());
			obx.getObservationIdentifier().getNameOfCodingSystem().setValue(obxBean.getObservationNCS());
			obx.getObservationSubID().setValue(obxBean.getObservationSubId());
			
			/**
			 * OBX.5 needs to be implemented as the API needs customization because of variance in different versions. 
			 */
			if(obxBean.getObservationValueIdentifier() != null){
				CE ce = new CE(obx.getMessage());
				ce.getIdentifier().setValue(obxBean.getObservationValueIdentifier());
				ce.getText().setValue(obxBean.getObservationValueText());
				ce.getNameOfCodingSystem().setValue(obxBean.getObservationValueNCS());
				
				obx.getObservationValue(0).setData(ce);
			}else{
				DT dt = new DT(obx.getMessage());
				dt.setValue(obxBean.getObservationValueText());
				obx.getObservationValue(0).setData(dt);
			}
			
			obx.getObservationResultStatus().setValue(obxBean.getObservationResultStatus());
			
 			if(count == 0){
				obx.getDateTimeOfTheObservation().getTime().setValue(obxBean.getObservationDateTime());
				obx.getObservationMethod(0).getIdentifier().setValue(obxBean.getObservMethodId());
				obx.getObservationMethod(0).getText().setValue(obxBean.getObservMethodText());
				if(obxBean.getObservMethodText()!=null) {
				    obx.getObservationMethod(0).getNameOfCodingSystem().setValue(OBXBean.OBSERV_METHOD_NCS);
				}
 			}
			count++;
		}
		LOGGER.info("\n Exiting from populateOBXSegment method");
	}

	private void populateRXRSegment(RXR rxr, RXRBean rxrBean) throws DataTypeException {
		LOGGER.info("\n Entering to populateRXRSegment method");
		rxr.getRoute().getIdentifier().setValue(rxrBean.getRouteIdentifier());
		rxr.getRoute().getText().setValue(rxrBean.getRouteText());
		if(rxrBean.getAdminSiteText()!=null) {
			rxr.getRoute().getNameOfCodingSystem().setValue(RXRBean.ROUTE_NCS);
		}
		rxr.getAdministrationSite().getIdentifier().setValue(rxrBean.getAdminSiteIdentifier());
		rxr.getAdministrationSite().getText().setValue(rxrBean.getAdminSiteText());
		rxr.getAdministrationSite().getNameOfCodingSystem().setValue(rxrBean.getAdminSiteNCS());
		LOGGER.info("\n Exiting from populateRXRSegment method");
	}

	private void populateRXASegment(RXA rxa, RXABean rxaBean) throws HL7Exception {
		LOGGER.info("\n Entering to populateRXASegment method");
		if(rxaBean.getAdminstrationStartDateTime()!=null) {
		    rxa.getGiveSubIDCounter().setValue(RXABean.ID_COUNTER);
	        rxa.getAdministrationSubIDCounter().setValue(RXABean.ADMIN_ID_COUNTER);
		}
		rxa.getDateTimeStartOfAdministration().getTs1_Time().setValue(rxaBean.getAdminstrationStartDateTime());
		rxa.getAdministeredCode().getIdentifier().setValue(rxaBean.getAdminsteredCodeIdentifier());
		rxa.getAdministeredCode().getText().setValue(rxaBean.getAdminsteredCodeText());
		if(rxaBean.getAdminsteredCodeIdentifier()!=null || rxaBean.getAdminsteredCodeText()!=null) {
		    rxa.getAdministeredCode().getNameOfCodingSystem().setValue(RXABean.ADMIN_CODE_NCS);
		}
		rxa.getAdministeredAmount().setValue(rxaBean.getAdminsteredAmt());
		rxa.getAdministeredUnits().getIdentifier().setValue(rxaBean.getAdminsteredUnitIdentifier());
		if(rxaBean.getAdminsteredUnitIdentifier()!=null) {
		    rxa.getAdministeredUnits().getText().setValue(rxaBean.getAdminsteredUnitText());
	        rxa.getAdministeredUnits().getNameOfCodingSystem().setValue(rxaBean.getAdminsteredUnitNCS());
		}
		
		int count = 0;
		
		for(AdministrationNotes note : rxaBean.getAdministrationNoteList()){
			
			rxa.getAdministrationNotes(count).getCe1_Identifier().setValue(note.getIdentifier());
			rxa.getAdministrationNotes(count).getCe2_Text().setValue(note.getText());
			if(note.getIdentifier()!=null || note.getText()!=null){
				rxa.getAdministrationNotes(count).getCe3_NameOfCodingSystem().setValue(AdministrationNotes.NCS);
			}
			count++;
		}
		
		count = 0;
		
		rxa.getAdministeringProvider(count).getIDNumber().setValue(rxaBean.getAdminProvIdNumber());
		rxa.getAdministeringProvider(count).getFamilyName().getSurname().setValue(rxaBean.getAdminProvSurname());
		rxa.getAdministeringProvider(count).getGivenName().setValue(rxaBean.getAdminProvGivenName());
		rxa.getAdministeringProvider(count).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(rxaBean.getAdminProvInitial());
		rxa.getAdministeringProvider(count).getAssigningAuthority().getNamespaceID().setValue(rxaBean.getAdminProvNamespaceId());
		rxa.getAdministeredAtLocation().getFacility().getNamespaceID().setValue(rxaBean.getAdminAtNamespaceId());
		
		for(String lotNmber : rxaBean.getLotNumberList()){
			ST st = rxa.insertSubstanceLotNumber(count);
			st.setValue(lotNmber);
			count++;
		}
		
		count = 0;
		
		rxa.getSubstanceExpirationDate(count).getTime().setValue(rxaBean.getExpirationDate());
		
		for(ManufecturerName name : rxaBean.getManufecturerNameList()){
			
			rxa.getSubstanceManufacturerName(count).getIdentifier().setValue(name.getIdentifier());
			rxa.getSubstanceManufacturerName(count).getText().setValue(name.getText());
			if(name.getIdentifier()!=null || name.getText()!=null) {
				rxa.getSubstanceManufacturerName(count).getNameOfCodingSystem().setValue(ManufecturerName.NCS);
			}
			count++;
		}
		count = 0;
		
		for(RefusalReason refusalReason : rxaBean.getRefusalReasonList()){
			
			rxa.getRxa18_SubstanceTreatmentRefusalReason(count).getIdentifier().setValue(refusalReason.getIdentifier());
			rxa.getRxa18_SubstanceTreatmentRefusalReason(count).getText().setValue(refusalReason.getText());
			rxa.getRxa18_SubstanceTreatmentRefusalReason(count).getNameOfCodingSystem().setValue(refusalReason.getNcs());;
			
			count++;
		}
		
		count = 0;
		
		rxa.getCompletionStatus().setValue(rxaBean.getCompletionStatus());
		rxa.getActionCodeRXA().setValue(rxaBean.getActionCode());
		LOGGER.info("\n Exiting from populateRXASegment method");
	}

	private void populateORCSegment(ORC orc, ORCBean orcBean) throws DataTypeException {

		LOGGER.info("\n Entering to populateORCSegment method");
		int count = 0;
		
		orc.getOrderControl().setValue(ORCBean.ORDER_CONTROL);
		orc.getFillerOrderNumber().getEntityIdentifier().setValue(orcBean.getFillerOrderEntityIdentifier());
		orc.getFillerOrderNumber().getNamespaceID().setValue(orcBean.getFillerOrderNamespaceId());
		orc.getEnteredBy(count).getIDNumber().setValue(orcBean.getEnteredByIdNumber());
		orc.getEnteredBy(count).getFamilyName().getSurname().setValue(orcBean.getEnteredBySurname());
		orc.getEnteredBy(count).getGivenName().setValue(orcBean.getEnteredByGivenName());
		orc.getEnteredBy(count).getSecondAndFurtherGivenNamesOrInitialsThereof()
				.setValue(orcBean.getEnteredByInitial());
		orc.getEnteredBy(count).getAssigningAuthority().getNamespaceID()
				.setValue(orcBean.getEnteredByNamespaceId());
		orc.getOrderingProvider(count).getIDNumber().setValue(orcBean.getOrderingProvIdNumber());
		orc.getOrderingProvider(count).getFamilyName().getSurname()
				.setValue(orcBean.getOrderingProvSurname());
		orc.getOrderingProvider(count).getGivenName().setValue(orcBean.getOrderingProvGivenName());
		orc.getOrderingProvider(count).getAssigningAuthority().getNamespaceID()
				.setValue(orcBean.getOrderingProvNamespaceId());
		orc.getOrderingProvider(count).getNameTypeCode().setValue(orcBean.getNameTypeCode());
		LOGGER.info("\n Exiting from populateORCSegment method");
	}

	private void populateNK1Segment(NK1 nk1, NK1Bean nk1Bean) throws HL7Exception {
		
		LOGGER.info("\n Entering to populateNK1Segment method");
		nk1.getSetIDNK1().setValue(nk1Bean.getNk1Id());
		
		int count = 0;
		
		for(Name name : nk1Bean.getKinNameList()){
			XPN xpn = nk1.insertNk12_Name(count);
			xpn.getFamilyName().getSurname().setValue(name.getSurname());
			xpn.getGivenName().setValue(name.getGivenName());
			xpn.getNameTypeCode().setValue(name.getNameTypeCode());
			
			count++;
		}
		
		count = 0;
		
		nk1.getNk13_Relationship().getIdentifier().setValue(nk1Bean.getRelationshipIdentifier());
		nk1.getNk13_Relationship().getText().setValue(nk1Bean.getRelationshipText());
		nk1.getNk13_Relationship().getNameOfCodingSystem().setValue(NK1Bean.RELATIONSHIP_NCS);

		for(Address address : nk1Bean.getAddressList()){
			
			XAD xad = nk1.insertNk14_Address(count);

			xad.getStreetAddress().getStreetOrMailingAddress().setValue(address.getStreetAddress());
			xad.getCity().setValue(address.getCity());
			xad.getStateOrProvince().setValue(address.getState());
			xad.getZipOrPostalCode().setValue(address.getZip());
			xad.getCountry().setValue(address.getCountry());
			xad.getAddressType().setValue(address.getAddressType());
	
			count++;
		}
		
		count = 0;
		
		for(Phone phone : nk1Bean.getPhoneList()){
			
			XTN xtn = nk1.insertNk15_PhoneNumber(count);
		
			xtn.getTelecommunicationUseCode().setValue(phone.getTelecomUseCode());
			xtn.getTelecommunicationEquipmentType().setValue(phone.getTelecomEquipType());
			xtn.getAreaCityCode().setValue(phone.getAreaOrCityCode());
			xtn.getLocalNumber().setValue(phone.getLocalNumber());
			
			count++;
		}
		
		count = 0;
		LOGGER.info("\n Exiting from populateNK1Segment method");
	}

	private void populatePD1Segment(PD1 pd1, PD1Bean pd1Bean) throws DataTypeException {LOGGER.info("\n Entering to populatePD1Segment method");
    if(pd1Bean.getProtectionIndicator() == null) {
        pd1.getPublicityCode().getIdentifier().setValue(pd1Bean.getPublicityCodeIdentifier());
        pd1.getPublicityCode().getText().setValue(pd1Bean.getPublicityCodeText());
        if((pd1Bean.getPublicityCodeText()!=null) || (pd1Bean.getPublicityCodeIdentifier()!=null) || (pd1Bean.getImmunizationRegStatus()!=null)) {
               pd1.getPublicityCode().getNameOfCodingSystem().setValue(PD1Bean.PUBLICITY_CODE_NCS);
        }
        pd1.getImmunizationRegistryStatus().setValue(pd1Bean.getImmunizationRegStatus());
        pd1.getImmunizationRegistryStatusEffectiveDate().setValue(pd1Bean.getImmunizationRegStatusEffectiveDate());
        pd1.getPublicityCodeEffectiveDate().setValue(pd1Bean.getPublicityCodeEffectiveDate());
    }else{
        pd1.getProtectionIndicator().setValue(pd1Bean.getProtectionIndicator());
        pd1.getProtectionIndicatorEffectiveDate().setValue(pd1Bean.getProtectionIndicatorEffectiveDate());
    }
 LOGGER.info("\n Exiting from populatePD1Segment method");
}

	private void populatePIDSegment(PID pid, PIDBean pidBean) throws HL7Exception {
		LOGGER.info("\n Entering to populatePIDSegment method");
		//PID1
		if(pidBean.getPatientNameList()!=null && pidBean.getPatientNameList().size()!=0) {
		    pid.getSetIDPID().setValue(PIDBean.PID_ID);
		}
		// PID-3
		int count=0;
		for(PatientIdentifier patientIdentifier : pidBean.getPatientIdentifierList()){
			
			CX cx = pid.insertPatientIdentifierList(count);
			
			cx.getIDNumber().setValue(patientIdentifier.getIdNumber());	
			cx.getAssigningAuthority().getNamespaceID().setValue(patientIdentifier.getAssignAuthNamespaceId());
			cx.getIdentifierTypeCode().setValue(patientIdentifier.getIdentifierTypeCode());
			
			count++;
		}
		
		// PID-5
		count = 0;
		
		for(Name name :pidBean.getPatientNameList()){
			
			XPN xpn = pid.insertPatientName(count);
			
			xpn.getFamilyName().getSurname().setValue(name.getSurname());
			xpn.getGivenName().setValue(name.getGivenName());
			xpn.getSecondAndFurtherGivenNamesOrInitialsThereof()
					.setValue(name.getSecondNameOrInitial());
			xpn.getNameTypeCode().setValue(name.getNameTypeCode());
				
			count++;
		}
		
		// PID-6
		
		pid.getMotherSMaidenName(0).getFamilyName().getSurname()
				.setValue(pidBean.getMotherSurname());
		pid.getMotherSMaidenName(0).getGivenName().setValue(pidBean.getMotherGivenName());
		// PID-7
		pid.getDateTimeOfBirth().getTime().setValue(pidBean.getDateOfBirth());
		// PID-8
		pid.getAdministrativeSex().setValue(pidBean.getAdministrativeSex());
		// PID-10
		count = 0;
		for(Race race : pidBean.getRaceList()){
			
			CE ce = pid.insertRace(count);
			
			ce.getIdentifier().setValue(race.getIdentifier());
			ce.getText().setValue(race.getText());
			ce.getNameOfCodingSystem().setValue(Race.RACE_NCS);
				
			count++;
		}
		// PID-11
		count = 0;
		for(Address address : pidBean.getPatientAddressList()){
			
			XAD xad = pid.insertPatientAddress(count);
			
			xad.getStreetAddress().getStreetOrMailingAddress().setValue(address.getStreetAddress());
			xad.getCity().setValue(address.getCity());
			xad.getStateOrProvince().setValue(address.getState());
			xad.getZipOrPostalCode().setValue(address.getZip());
			xad.getCountry().setValue(address.getCountry());
			xad.getAddressType().setValue(address.getAddressType());
				
			count++;
		}
		// PID-13
		count = 0;
		for(Phone phone : pidBean.getPatientPhoneList()){
			
			XTN  xtn = pid.insertPhoneNumberHome(count);
			
			xtn.getTelecommunicationUseCode().setValue(phone.getTelecomUseCode());
			xtn.getTelecommunicationEquipmentType().setValue(phone.getTelecomEquipType());
			xtn.getAreaCityCode().setValue(phone.getAreaOrCityCode());
			xtn.getLocalNumber().setValue(phone.getLocalNumber());
			xtn.getEmailAddress().setValue(phone.getEmailAdd());
				
			count++;
		}
		// PID-22
		pid.getEthnicGroup(0).getIdentifier().setValue(pidBean.getEthnicGrpIdentifier());
		pid.getEthnicGroup(0).getText().setValue(pidBean.getEthnicGrpText());
		if(!"".equalsIgnoreCase(pidBean.getEthnicGrpIdentifier())) {
		    if(pidBean.getEthnicGrpIdentifier()!=null) {
		        pid.getEthnicGroup(0).getNameOfCodingSystem().setValue(PIDBean.ETHENIC_GRP_NCS);
		    }
		}
		LOGGER.info("\n Exiting from populatePIDSegment method");
	}

	private void populateMSHSegment(MSH mshSegment, MSHBean mshBean) throws DataTypeException {

		LOGGER.info("\n Entering to populateMSHSegment method");
		mshSegment.getSendingApplication().getNamespaceID()
				.setValue(mshBean.getSendingAppNamespaceId());
		mshSegment.getSendingFacility().getNamespaceID().setValue(mshBean.getSendingFacilityNamespaceId());
		mshSegment.getReceivingFacility().getNamespaceID()
				.setValue(mshBean.getReceivingFaclityNamespaceId());
		mshSegment.getDateTimeOfMessage().getTime().setValue(mshBean.getDateTimeOfMessage());
		mshSegment.getMessageControlID().setValue(mshBean.getMessageControlId());
		mshSegment.getProcessingID().getProcessingID().setValue(mshBean.getProcessingId());
		mshSegment.getVersionID().getVersionID().setValue(MSHBean.VERSION_ID);
		mshSegment.getAcceptAcknowledgmentType().setValue(mshBean.getAcceptAckType());
		mshSegment.getApplicationAcknowledgmentType().setValue(mshBean.getAppAckType());
		LOGGER.info("\n Exiting from populateMSHSegment method");
	}
	 
}
