package com.nightingale.hl7.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.medrium.exception.PersistentException;
import com.medrium.persistence.PersistentManager;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.ImmunizationCptInfo;
import com.nightingale.hl7.daoBeans.PatientAddress;
import com.nightingale.hl7.daoBeans.PatientCommunication;
import com.nightingale.hl7.daoBeans.PatientContact;
import com.nightingale.hl7.daoBeans.PatientImmunization;
import com.nightingale.hl7.daoBeans.PatientImmunizationRXAInfo;
import com.nightingale.hl7.daoBeans.PatientImmunizationViewInfo;
import com.nightingale.hl7.daoBeans.PatientNoteInfo;
import com.nightingale.hl7.daoBeans.PatientProviderInfo;
import com.nightingale.hl7.daoBeans.PatientSocialHistory;
import com.nightingale.hl7.daoBeans.PracticeInfo;
import com.nightingale.hl7.daoBeans.RaceInfo;
import com.nightingale.hl7.dto.HL7Type;
import com.nightingale.hl7.dto.PatientInformation;
/**
 *This class contains db related information 
 * @author sudhakars
 */
public class HL7PopulatorDao {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(HL7PopulatorDao.class);
	
	private PersistentManager persistentManager;
	//private HL7Type type;
	
	public HL7PopulatorDao(PersistentManager _persistentManager, HL7Type type) {
		LOGGER.debug("\n Inside the constructor of HL7PopulaterDao method ");
		if(persistentManager != null){
			throw new IllegalStateException("persistence manager is not injected properly>>>>>>>");
		}
		this.persistentManager = _persistentManager;
		//this.type = type;
	}
	
	/*
	 * Method to get data bean
	 */
	public DBDataBean getDBDataBean(int patientId, int accountId, int patientimmunizationid, HL7Type type){
		LOGGER.info(" \n Entering to get databeans");
		ArrayList<Object> patIdInfo = new ArrayList<Object>();
		patIdInfo.add(accountId);
		patIdInfo.add(patientId);
		
		DBDataBean dataBean = new DBDataBean();
		
		PatientInformation patientInformation = new PatientInformation();;
		List<PatientImmunization> patientImmunizationsList = new ArrayList<PatientImmunization>();;
		List<PatientAddress> patientAddressList = new ArrayList<PatientAddress>();
		List<PatientCommunication> contactList = new ArrayList<PatientCommunication>();
		List<RaceInfo> raceInfoList  = new ArrayList<RaceInfo>();
		List<PatientInformation> kinInformationList = new ArrayList<PatientInformation>();
		List<PatientAddress> kinAddressList = new ArrayList<PatientAddress>();;
		List<PatientCommunication> kinContactList = new ArrayList<PatientCommunication>();
		List<PatientImmunizationViewInfo> immunizationViewInfoList = new ArrayList<PatientImmunizationViewInfo>();
		List<PracticeInfo> practiceInfoList =new ArrayList<PracticeInfo>();
		List<ImmunizationCptInfo> immunizationCptInfoList = new ArrayList<ImmunizationCptInfo>();
		List<PatientContact> patientContactList = new ArrayList<PatientContact>();
		List<PatientSocialHistory> patientSocialHistoryList = new ArrayList<PatientSocialHistory>();
		List<PatientImmunizationRXAInfo> patientImmunizationRXAInfoList = new ArrayList<PatientImmunizationRXAInfo>();
		List<PatientNoteInfo> patientNoteInfoList = new ArrayList<PatientNoteInfo>();
		List<PatientImmunizationViewInfo> immunizationViewInfoList1 = new ArrayList<PatientImmunizationViewInfo>();
		List<PatientProviderInfo> patientProviderInfoList = new ArrayList<PatientProviderInfo>();
		//HashMap<Integer, Integer> immuCptMap = new HashMap<Integer, Integer>();
		
		try {
			
			patientInformation.setAccountId(accountId);
			patientInformation.setPatientId(patientId);
			
			String addressQuery = "select * from pat_address where accountid=?"+" and patientid=?";
			String communicationQuery = "select * from pat_communication where accountid=?"+" and patientid=?";
			String raceQuery = "select * from pat_socialhistory_race where accountid=?"+" and patientid=?";
			String query = "select * from pat_immunizations where accountid=?"+" and patientid=?";
			
			String kinPatIdQuery = "select patientfamilymemberid from pat_family_member where accountid =?"+" and patientid =?";
			
			String contactQuery = "select * from pat_contact where accountid=?"+" and patientid=?";
			String socialHistoryQuery = "select * from pat_socialhistory where accountid=?"+" and patientid=?";
			String patientNoteQuery = "select * from pat_note where accountid=?"+" and patientid=?";
			String immunizationsViewQuery = "select * from vwpatientimmunizations where accountid =?"+" and patientid =?";
			
			
			
			patientInformation = persistentManager.retrieve(patientInformation);
			patientAddressList = persistentManager.retrieveSet(PatientAddress.class, addressQuery, patIdInfo, null);
			contactList = persistentManager.retrieveSet(PatientCommunication.class, communicationQuery, patIdInfo, null);
			raceInfoList = persistentManager.retrieveSet(RaceInfo.class, raceQuery, patIdInfo, null);
			patientImmunizationsList = persistentManager.retrieveSet(PatientImmunization.class, query, patIdInfo, null);
			
			patientContactList = persistentManager.retrieveSet(PatientContact.class, contactQuery, patIdInfo, null);
			patientSocialHistoryList = persistentManager.retrieveSet(PatientSocialHistory.class, socialHistoryQuery, patIdInfo, null);
			patientNoteInfoList = persistentManager.retrieveSet(PatientNoteInfo.class, patientNoteQuery, patIdInfo, null);
			immunizationViewInfoList = persistentManager.retrieveSet(PatientImmunizationViewInfo.class, immunizationsViewQuery, patIdInfo, null);

			//Retrieve Kin related data.
			int kinPatId = persistentManager.retrieveInt(kinPatIdQuery, patIdInfo);
			LOGGER.info("\n kinPatId >>>>>>>>>>>>> "+kinPatId);
			patIdInfo = new ArrayList<Object>();
			patIdInfo.add(kinPatId);
			patIdInfo.add(patientId);
			String kinQuery = "select * from pat_info where patientid =?"+" and (patientid !=?"+" or patientid is NULL)";
			kinInformationList = persistentManager.retrieveSet(PatientInformation.class, kinQuery, patIdInfo, null);
			
			patIdInfo = new ArrayList<Object>();
			patIdInfo.add(accountId);
			patIdInfo.add(kinPatId);
			String kinAddressQuery = "select * from pat_address where accountid=?"+" and patientid=?"+" and active=TRUE";
			String kinContactQuery = "select * from pat_communication where accountid=?"+" and patientid=?";

			kinAddressList = persistentManager.retrieveSet(PatientAddress.class, kinAddressQuery, patIdInfo, null);
			kinContactList = persistentManager.retrieveSet(PatientCommunication.class, kinContactQuery, patIdInfo, null);
			
			patIdInfo = new ArrayList<Object>();
			patIdInfo.add(accountId);
			//String providerQuery = "select * from prov_info where accountid=?";
			String practiceQuery = "select * from practice where accountid=?";
			//providerInfoList = persistentManager.retrieveSet(PatientProviderInfo.class, providerQuery, patIdInfo, null);
			practiceInfoList = persistentManager.retrieveSet(PracticeInfo.class, practiceQuery, patIdInfo, null);
			
			patIdInfo = new ArrayList<Object>();
			patIdInfo.add(accountId);
			patIdInfo.add(patientId);
			patIdInfo.add(patientimmunizationid);

			// Repeated query to generate latest data for a bean
			String immunizationQuery = "select * from pat_immunizations where accountid=?"+" and patientid=?"+"and patientimmunizationid=?";
			String immunizationCptQuery = "select distinct(ic.*) from immunization_cpt ic inner join pat_immunizations pi on ic.vaccine_name=pi.productname where ("+"pi.accountid=?"+"and pi.patientid=?"+")"+"and patientimmunizationid=?";
			String immunizationsViewQuery1 = "select * from vwpatientimmunizations where accountid =?"+" and patientid =?"+"and patientimmunizationid=?";
			
			
			patientImmunizationRXAInfoList = persistentManager.retrieveSet(PatientImmunizationRXAInfo.class, immunizationQuery, patIdInfo, null);
			immunizationCptInfoList = persistentManager.retrieveSet(ImmunizationCptInfo.class, immunizationCptQuery, patIdInfo, null);
			immunizationViewInfoList1 = persistentManager.retrieveSet(PatientImmunizationViewInfo.class, immunizationsViewQuery1, patIdInfo, null);
			
			//get provider info
			patIdInfo = new ArrayList<Object>();
			patIdInfo.add(accountId);
			patIdInfo.add(patientInformation.getResponsibleProvid());
			String providerQuery = "select * FROM prov_info WHERE accountID =?"+"and provID =?";
			patientProviderInfoList = persistentManager.retrieveSet(PatientProviderInfo.class, providerQuery, patIdInfo, null);
			
		} catch (PersistentException e) {
			LOGGER.error("Exception occurred in HL7PopulatorDao::populatePIDBean>>>>>>>>>> \n"+e);
			e.printStackTrace();
		}
		
		dataBean.setContactList(contactList);
		dataBean.setPatientAddressList(patientAddressList);
		dataBean.setPatientImmunizationsList(patientImmunizationsList);
		dataBean.setPatientInformation(patientInformation);
		dataBean.setRaceInfoList(raceInfoList);
		dataBean.setKinInformationList(kinInformationList);
		dataBean.setKinAddressList(kinAddressList);
		dataBean.setKinContactList(kinContactList);
		dataBean.setPatientProviderInfoList(patientProviderInfoList);
		dataBean.setImmunizationViewInfoList(immunizationViewInfoList);
		dataBean.setPracticeInfoList(practiceInfoList);
		dataBean.setImmunizationCptInfoList(immunizationCptInfoList);
		dataBean.setPatientContactList(patientContactList);
		dataBean.setPatientSocialHistoryList(patientSocialHistoryList);
		dataBean.setPatientImmunizationRXAInfoList(patientImmunizationRXAInfoList);
		dataBean.setPatientNoteInfoList(patientNoteInfoList);
		dataBean.setImmunizationViewInfoList1(immunizationViewInfoList1);
		
		LOGGER.info("\n Exiting from DBDataBean method \n"+dataBean);
		return dataBean;
	}
}
