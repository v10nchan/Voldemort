package com.nightingale.hl7.dto;

import java.util.ArrayList;
import java.util.List;

public class RXABean {
	
	public static final String ID_COUNTER = "0";
	public static final String ADMIN_ID_COUNTER = "1";
	//Name Of Coding System
	public static final String ADMIN_CODE_NCS = "CVX";
	
	private String adminstrationStartDateTime;
	private String adminstrationEndDateTime;
	private String adminsteredCodeIdentifier;
	private String adminsteredCodeText;
	private String adminsteredCodeAltIdentifier;
	private String adminsteredCodeAltText;
	private String adminsteredCodeAltNCS;
	private String adminsteredAmt;
	private String adminsteredUnitIdentifier;
	private String adminsteredUnitText;
	private String adminsteredUnitNCS;
	private String adminsteredUnitAltIdentifier;
	private String adminsteredUnitAltText;
	private String adminsteredUnitAltNCS;
	private List<AdministrationNotes> administrationNoteList = new ArrayList<AdministrationNotes>();
	private String adminProvIdNumber;
	private String adminProvSurname;
	private String adminProvGivenName;
	private String adminProvInitial;
	private String adminProvNamespaceId;
	private String adminProvUnivId;
	private String adminProvUnivIdType;
	private String adminAtFacility;
	private String adminAtNamespaceId;
	private String adminAtUnivId;
	private String adminAtUnivIdType;
	private List<String> lotNumberList = new ArrayList<String>();
	private String expirationDate;
	private List<ManufecturerName> manufecturerNameList = new ArrayList<ManufecturerName>();
	private List<RefusalReason> refusalReasonList = new ArrayList<RefusalReason>();
	private String completionStatus;
	private String actionCode;
	
	public String getAdminstrationStartDateTime() {
		return adminstrationStartDateTime;
	}
	public void setAdminstrationStartDateTime(String adminstrationStartDateTime) {
		this.adminstrationStartDateTime = adminstrationStartDateTime;
	}
	public String getAdminstrationEndDateTime() {
		return adminstrationEndDateTime;
	}
	public void setAdminstrationEndDateTime(String adminstrationEndDateTime) {
		this.adminstrationEndDateTime = adminstrationEndDateTime;
	}
	public String getAdminsteredCodeIdentifier() {
		return adminsteredCodeIdentifier;
	}
	public void setAdminsteredCodeIdentifier(String adminsteredCodeIdentifier) {
		this.adminsteredCodeIdentifier = adminsteredCodeIdentifier;
	}
	public String getAdminsteredCodeText() {
		return adminsteredCodeText;
	}
	public void setAdminsteredCodeText(String adminsteredCodeText) {
		this.adminsteredCodeText = adminsteredCodeText;
	}
	public String getAdminsteredCodeAltIdentifier() {
		return adminsteredCodeAltIdentifier;
	}
	public void setAdminsteredCodeAltIdentifier(String adminsteredCodeAltIdentifier) {
		this.adminsteredCodeAltIdentifier = adminsteredCodeAltIdentifier;
	}
	public String getAdminsteredCodeAltText() {
		return adminsteredCodeAltText;
	}
	public void setAdminsteredCodeAltText(String adminsteredCodeAltText) {
		this.adminsteredCodeAltText = adminsteredCodeAltText;
	}
	public String getAdminsteredCodeAltNCS() {
		return adminsteredCodeAltNCS;
	}
	public void setAdminsteredCodeAltNCS(String adminsteredCodeAltNCS) {
		this.adminsteredCodeAltNCS = adminsteredCodeAltNCS;
	}
	public String getAdminsteredAmt() {
		return adminsteredAmt;
	}
	public void setAdminsteredAmt(String adminsteredAmt) {
		this.adminsteredAmt = adminsteredAmt;
	}
	public String getAdminsteredUnitIdentifier() {
		return adminsteredUnitIdentifier;
	}
	public void setAdminsteredUnitIdentifier(String adminsteredUnitIdentifier) {
		this.adminsteredUnitIdentifier = adminsteredUnitIdentifier;
	}
	public String getAdminsteredUnitText() {
		return adminsteredUnitText;
	}
	public void setAdminsteredUnitText(String adminsteredUnitText) {
		this.adminsteredUnitText = adminsteredUnitText;
	}
	public String getAdminsteredUnitNCS() {
		return adminsteredUnitNCS;
	}
	public void setAdminsteredUnitNCS(String adminsteredUnitNCS) {
		this.adminsteredUnitNCS = adminsteredUnitNCS;
	}
	public String getAdminsteredUnitAltIdentifier() {
		return adminsteredUnitAltIdentifier;
	}
	public void setAdminsteredUnitAltIdentifier(String adminsteredUnitAltIdentifier) {
		this.adminsteredUnitAltIdentifier = adminsteredUnitAltIdentifier;
	}
	public String getAdminsteredUnitAltText() {
		return adminsteredUnitAltText;
	}
	public void setAdminsteredUnitAltText(String adminsteredUnitAltText) {
		this.adminsteredUnitAltText = adminsteredUnitAltText;
	}
	public String getAdminsteredUnitAltNCS() {
		return adminsteredUnitAltNCS;
	}
	public void setAdminsteredUnitAltNCS(String adminsteredUnitAltNCS) {
		this.adminsteredUnitAltNCS = adminsteredUnitAltNCS;
	}
	public List<AdministrationNotes> getAdministrationNoteList() {
		return administrationNoteList;
	}
	public void setAdministrationNoteList(
			List<AdministrationNotes> administrationNoteList) {
		this.administrationNoteList = administrationNoteList;
	}
	public String getAdminProvIdNumber() {
		return adminProvIdNumber;
	}
	public void setAdminProvIdNumber(String adminProvIdNumber) {
		this.adminProvIdNumber = adminProvIdNumber;
	}
	public String getAdminProvSurname() {
		return adminProvSurname;
	}
	public void setAdminProvSurname(String adminProvSurname) {
		this.adminProvSurname = adminProvSurname;
	}
	public String getAdminProvGivenName() {
		return adminProvGivenName;
	}
	public void setAdminProvGivenName(String adminProvGivenName) {
		this.adminProvGivenName = adminProvGivenName;
	}
	public String getAdminProvInitial() {
		return adminProvInitial;
	}
	public void setAdminProvInitial(String adminProvInitial) {
		this.adminProvInitial = adminProvInitial;
	}
	public String getAdminProvNamespaceId() {
		return adminProvNamespaceId;
	}
	public void setAdminProvNamespaceId(String adminProvNamespaceId) {
		this.adminProvNamespaceId = adminProvNamespaceId;
	}
	public String getAdminProvUnivId() {
		return adminProvUnivId;
	}
	public void setAdminProvUnivId(String adminProvUnivId) {
		this.adminProvUnivId = adminProvUnivId;
	}
	public String getAdminProvUnivIdType() {
		return adminProvUnivIdType;
	}
	public void setAdminProvUnivIdType(String adminProvUnivIdType) {
		this.adminProvUnivIdType = adminProvUnivIdType;
	}
	public String getAdminAtFacility() {
		return adminAtFacility;
	}
	public void setAdminAtFacility(String adminAtFacility) {
		this.adminAtFacility = adminAtFacility;
	}
	public String getAdminAtNamespaceId() {
		return adminAtNamespaceId;
	}
	public void setAdminAtNamespaceId(String adminAtNamespaceId) {
		this.adminAtNamespaceId = adminAtNamespaceId;
	}
	public String getAdminAtUnivId() {
		return adminAtUnivId;
	}
	public void setAdminAtUnivId(String adminAtUnivId) {
		this.adminAtUnivId = adminAtUnivId;
	}
	public String getAdminAtUnivIdType() {
		return adminAtUnivIdType;
	}
	public void setAdminAtUnivIdType(String adminAtUnivIdType) {
		this.adminAtUnivIdType = adminAtUnivIdType;
	}
	public List<String> getLotNumberList() {
		return lotNumberList;
	}
	public void setLotNumberList(List<String> lotNumberList) {
		this.lotNumberList = lotNumberList;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public List<ManufecturerName> getManufecturerNameList() {
		return manufecturerNameList;
	}
	public void setManufecturerNameList(List<ManufecturerName> manufecturerNameList) {
		this.manufecturerNameList = manufecturerNameList;
	}
	public List<RefusalReason> getRefusalReasonList() {
		return refusalReasonList;
	}
	public void setRefusalReasonList(List<RefusalReason> refusalReasonList) {
		this.refusalReasonList = refusalReasonList;
	}
	public String getCompletionStatus() {
		return completionStatus;
	}
	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	
}
