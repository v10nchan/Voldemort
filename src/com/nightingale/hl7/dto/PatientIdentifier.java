package com.nightingale.hl7.dto;

public class PatientIdentifier {
	
	private String IdNumber;
	private String assignAuthNamespaceId;
	private String assignAuthUnivId;
	private String assignAuthUnivIdType;
	private String identifierTypeCode;
	
	public String getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}
	public String getAssignAuthNamespaceId() {
		return assignAuthNamespaceId;
	}
	public void setAssignAuthNamespaceId(String assignAuthNamespaceId) {
		this.assignAuthNamespaceId = assignAuthNamespaceId;
	}
	public String getAssignAuthUnivId() {
		return assignAuthUnivId;
	}
	public void setAssignAuthUnivId(String assignAuthUnivId) {
		this.assignAuthUnivId = assignAuthUnivId;
	}
	public String getAssignAuthUnivIdType() {
		return assignAuthUnivIdType;
	}
	public void setAssignAuthUnivIdType(String assignAuthUnivIdType) {
		this.assignAuthUnivIdType = assignAuthUnivIdType;
	}
	public String getIdentifierTypeCode() {
		return identifierTypeCode;
	}
	public void setIdentifierTypeCode(String identifierTypeCode) {
		this.identifierTypeCode = identifierTypeCode;
	}
	
}
