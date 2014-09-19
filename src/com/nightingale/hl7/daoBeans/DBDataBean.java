package com.nightingale.hl7.daoBeans;

import java.util.ArrayList;
import java.util.List;

import com.nightingale.hl7.dto.PatientInformation;

public class DBDataBean {
	
	private PatientInformation patientInformation;
	private List<PatientImmunization> patientImmunizationsList;
	private List<PatientAddress> patientAddressList;
	private List<PatientCommunication> contactList;
	private List<RaceInfo> raceInfoList;
	private List<PatientInformation> kinInformationList;
	private List<PatientAddress> kinAddressList;
	private List<PatientCommunication> kinContactList;
	private List<PatientProviderInfo> patientProviderInfoList;
	private List<PatientImmunizationViewInfo> immunizationViewInfoList;
	private List<PracticeInfo> practiceInfoList;
	private List<ImmunizationCptInfo> immunizationCptInfoList = new ArrayList<ImmunizationCptInfo>();
	private List<PatientContact> patientContactList = new ArrayList<PatientContact>();
	private List<PatientSocialHistory> patientSocialHistoryList = new ArrayList<PatientSocialHistory>();
	private List<PatientImmunizationRXAInfo> patientImmunizationRXAInfoList = new ArrayList<PatientImmunizationRXAInfo>();
	private List<PatientNoteInfo> patientNoteInfoList = new ArrayList<PatientNoteInfo>();
	private List<PatientImmunizationViewInfo> immunizationViewInfoList1;
	
	public PatientInformation getPatientInformation() {
		return patientInformation;
	}
	public void setPatientInformation(PatientInformation patientInformation) {
		this.patientInformation = patientInformation;
	}
	public List<PatientImmunization> getPatientImmunizationsList() {
		return patientImmunizationsList;
	}
	public void setPatientImmunizationsList(
			List<PatientImmunization> patientImmunizationsList) {
		this.patientImmunizationsList = patientImmunizationsList;
	}
	public List<PatientAddress> getPatientAddressList() {
		return patientAddressList;
	}
	public void setPatientAddressList(List<PatientAddress> patientAddressList) {
		this.patientAddressList = patientAddressList;
	}
	public List<PatientCommunication> getContactList() {
		return contactList;
	}
	public void setContactList(List<PatientCommunication> contactList) {
		this.contactList = contactList;
	}
	public List<RaceInfo> getRaceInfoList() {
		return raceInfoList;
	}
	public void setRaceInfoList(List<RaceInfo> raceInfoList) {
		this.raceInfoList = raceInfoList;
	}
	public List<PatientInformation> getKinInformationList() {
		return kinInformationList;
	}
	public void setKinInformationList(List<PatientInformation> kinInformationList) {
		this.kinInformationList = kinInformationList;
	}
	public List<PatientAddress> getKinAddressList() {
		return kinAddressList;
	}
	public void setKinAddressList(List<PatientAddress> kinAddressList) {
		this.kinAddressList = kinAddressList;
	}
	public List<PatientCommunication> getKinContactList() {
		return kinContactList;
	}
	public void setKinContactList(List<PatientCommunication> kinContactList) {
		this.kinContactList = kinContactList;
	}
	public List<PatientProviderInfo> getPatientProviderInfoList() {
		return patientProviderInfoList;
	}
	public void setPatientProviderInfoList(
			List<PatientProviderInfo> patientProviderInfoList) {
		this.patientProviderInfoList = patientProviderInfoList;
	}
	public List<PatientImmunizationViewInfo> getImmunizationViewInfoList() {
		return immunizationViewInfoList;
	}
	public void setImmunizationViewInfoList(
			List<PatientImmunizationViewInfo> immunizationViewInfoList) {
		this.immunizationViewInfoList = immunizationViewInfoList;
	}
	public List<PracticeInfo> getPracticeInfoList() {
		return practiceInfoList;
	}
	public void setPracticeInfoList(List<PracticeInfo> practiceInfoList) {
		this.practiceInfoList = practiceInfoList;
	}
	public List<ImmunizationCptInfo> getImmunizationCptInfoList() {
		return immunizationCptInfoList;
	}
	public void setImmunizationCptInfoList(
			List<ImmunizationCptInfo> immunizationCptInfoList) {
		this.immunizationCptInfoList = immunizationCptInfoList;
	}
	public List<PatientContact> getPatientContactList() {
		return patientContactList;
	}
	public void setPatientContactList(List<PatientContact> patientContactList) {
		this.patientContactList = patientContactList;
	}
	public List<PatientSocialHistory> getPatientSocialHistoryList() {
		return patientSocialHistoryList;
	}
	public void setPatientSocialHistoryList(
			List<PatientSocialHistory> patientSocialHistoryList) {
		this.patientSocialHistoryList = patientSocialHistoryList;
	}
	public List<PatientImmunizationRXAInfo> getPatientImmunizationRXAInfoList() {
		return patientImmunizationRXAInfoList;
	}
	public void setPatientImmunizationRXAInfoList(
			List<PatientImmunizationRXAInfo> patientImmunizationRXAInfoList) {
		this.patientImmunizationRXAInfoList = patientImmunizationRXAInfoList;
	}
    
    public List<PatientNoteInfo> getPatientNoteInfoList() {
        return patientNoteInfoList;
    }
    public void setPatientNoteInfoList(List<PatientNoteInfo> patientNoteInfoList) {
        this.patientNoteInfoList = patientNoteInfoList;
    }
    
    public List<PatientImmunizationViewInfo> getImmunizationViewInfoList1() {
        return immunizationViewInfoList1;
    }
    
    public void setImmunizationViewInfoList1(List<PatientImmunizationViewInfo> immunizationViewInfoList1) {
        this.immunizationViewInfoList1 = immunizationViewInfoList1;
    }
}
