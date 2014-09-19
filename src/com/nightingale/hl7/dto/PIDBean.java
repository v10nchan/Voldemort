package com.nightingale.hl7.dto;

import java.util.ArrayList;
import java.util.List;

public class PIDBean {
	
	public static final String PID_ID = "1";
	
	public static final String ETHENIC_GRP_NCS = "CDCREC";

	private List<PatientIdentifier> patientIdentifierList = new ArrayList<PatientIdentifier>();
	private List<Name> patientNameList = new ArrayList<Name>();
	private String motherSurname;
	private String motherGivenName;
	private String motherInitial;
	private String motherNameTypeCode;
	private String dateOfBirth;
	private String administrativeSex;
	private List<Race> raceList = new ArrayList<Race>();
	private List<Address> patientAddressList = new ArrayList<Address>();
    private List<Phone> patientPhoneList = new ArrayList<Phone>();
    private String ethnicGrpIdentifier;
    private String ethnicGrpText;
    private String ethnicGrpAltIdentifier;
    private String ethnicGrpAltText;
    private String ethnicGrpAltNCS;
    private String multipleBirthIndicator;
    private String birthOrder;
    private String patientDeathDatetime;
    private String patientDeathIndicator;
    
	public List<PatientIdentifier> getPatientIdentifierList() {
		return patientIdentifierList;
	}
	public void addPatientIdentifier(PatientIdentifier patientIdentifier) {
		this.patientIdentifierList.add(patientIdentifier);
	}
	public List<Name> getPatientNameList() {
		return patientNameList;
	}
	public void addPatientName(Name patientName) {
		this.patientNameList.add(patientName);
	}
	public String getMotherSurname() {
		return motherSurname;
	}
	public void setMotherSurname(String motherSurname) {
		this.motherSurname = motherSurname;
	}
	public String getMotherGivenName() {
		return motherGivenName;
	}
	public void setMotherGivenName(String motherGivenName) {
		this.motherGivenName = motherGivenName;
	}
	public String getMotherInitial() {
		return motherInitial;
	}
	public void setMotherInitial(String motherInitial) {
		this.motherInitial = motherInitial;
	}
	public String getMotherNameTypeCode() {
		return motherNameTypeCode;
	}
	public void setMotherNameTypeCode(String motherNameTypeCode) {
		this.motherNameTypeCode = motherNameTypeCode;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAdministrativeSex() {
		return administrativeSex;
	}
	public void setAdministrativeSex(String administrativeSex) {
		this.administrativeSex = administrativeSex;
	}
	public List<Race> getRaceList() {
		return raceList;
	}
	public void addRace(Race race) {
		this.raceList.add(race);
	}
	public List<Address> getPatientAddressList() {
		return patientAddressList;
	}
	public void addPatientAddress(Address patientAddress) {
		this.patientAddressList.add(patientAddress);
	}
	public List<Phone> getPatientPhoneList() {
		return patientPhoneList;
	}
	public void addPatientPhone(Phone patientPhone) {
		this.patientPhoneList.add(patientPhone);
	}
	public String getEthnicGrpIdentifier() {
		return ethnicGrpIdentifier;
	}
	public void setEthnicGrpIdentifier(String ethnicGrpIdentifier) {
		this.ethnicGrpIdentifier = ethnicGrpIdentifier;
	}
	public String getEthnicGrpText() {
		return ethnicGrpText;
	}
	public void setEthnicGrpText(String ethnicGrpText) {
		this.ethnicGrpText = ethnicGrpText;
	}
	public String getEthnicGrpAltIdentifier() {
		return ethnicGrpAltIdentifier;
	}
	public void setEthnicGrpAltIdentifier(String ethnicGrpAltIdentifier) {
		this.ethnicGrpAltIdentifier = ethnicGrpAltIdentifier;
	}
	public String getEthnicGrpAltText() {
		return ethnicGrpAltText;
	}
	public void setEthnicGrpAltText(String ethnicGrpAltText) {
		this.ethnicGrpAltText = ethnicGrpAltText;
	}
	public String getEthnicGrpAltNCS() {
		return ethnicGrpAltNCS;
	}
	public void setEthnicGrpAltNCS(String ethnicGrpAltNCS) {
		this.ethnicGrpAltNCS = ethnicGrpAltNCS;
	}
	public String getMultipleBirthIndicator() {
		return multipleBirthIndicator;
	}
	public void setMultipleBirthIndicator(String multipleBirthIndicator) {
		this.multipleBirthIndicator = multipleBirthIndicator;
	}
	public String getBirthOrder() {
		return birthOrder;
	}
	public void setBirthOrder(String birthOrder) {
		this.birthOrder = birthOrder;
	}
	public String getPatientDeathDatetime() {
		return patientDeathDatetime;
	}
	public void setPatientDeathDatetime(String patientDeathDatetime) {
		this.patientDeathDatetime = patientDeathDatetime;
	}
	public String getPatientDeathIndicator() {
		return patientDeathIndicator;
	}
	public void setPatientDeathIndicator(String patientDeathIndicator) {
		this.patientDeathIndicator = patientDeathIndicator;
	}
    
}
