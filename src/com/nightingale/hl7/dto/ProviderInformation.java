package com.nightingale.hl7.dto;

import java.util.Date;

public class ProviderInformation {

	private int accountId;
	private int provId;
	private String billingProvider;
	private String renderingProvider;
	private String referringProvider;
	private String supervisingProvider;
	private int titleId;
	private String lastName;
	private String firstName;
	private String middleName;
	private String providerCode;
	private String referringCode;
	private int genderId;
	private String phone1;
	private int phone1Type;
	private String phone1Ext;
	private String phone2;
	private int phone2Type;
	private String phone2Ext;
	private String phone3;
	private int phone3Type;
	private String phone3Ext;
	private String email;
	private String stateLicNum;
	private String salutation;
	private String uPin;
	private boolean isActive;
	private String taxonomyCode;
	private String credentials;
	private String npi;
	private String dea;
	private int provTypeId;
	private Date activeStartTime;
	private Date activeEndTime;
	private int prefMethodForReports;
	private double maximumFte;
	private double hoursWorkedPerWeek;
	private Date signatureDate;
	private String comments;
	private boolean pecos;
	private boolean billingExclusion;
	private String ipAddress;
	private Date created;
	private String createdBy;
	private Date lastUpdated;
	private String updatedBy;
	private String license;
	private String billingNumber;
	private String secureConnectId;
	private int supervisorId;
	private Date supervisorFromDate;
	private String supervisorToDate;
	private int lastSupervisorId;
	private String hcpiId;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getProvId() {
		return provId;
	}

	public void setProvId(int provId) {
		this.provId = provId;
	}

	public String getBillingProvider() {
		return billingProvider;
	}

	public void setBillingProvider(String billingProvider) {
		this.billingProvider = billingProvider;
	}

	public String getRenderingProvider() {
		return renderingProvider;
	}

	public void setRenderingProvider(String renderingProvider) {
		this.renderingProvider = renderingProvider;
	}

	public String getReferringProvider() {
		return referringProvider;
	}

	public void setReferringProvider(String referringProvider) {
		this.referringProvider = referringProvider;
	}

	public String getSupervisingProvider() {
		return supervisingProvider;
	}

	public void setSupervisingProvider(String supervisingProvider) {
		this.supervisingProvider = supervisingProvider;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getReferringCode() {
		return referringCode;
	}

	public void setReferringCode(String referringCode) {
		this.referringCode = referringCode;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public int getPhone1Type() {
		return phone1Type;
	}

	public void setPhone1Type(int phone1Type) {
		this.phone1Type = phone1Type;
	}

	public String getPhone1Ext() {
		return phone1Ext;
	}

	public void setPhone1Ext(String phone1Ext) {
		this.phone1Ext = phone1Ext;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public int getPhone2Type() {
		return phone2Type;
	}

	public void setPhone2Type(int phone2Type) {
		this.phone2Type = phone2Type;
	}

	public String getPhone2Ext() {
		return phone2Ext;
	}

	public void setPhone2Ext(String phone2Ext) {
		this.phone2Ext = phone2Ext;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public int getPhone3Type() {
		return phone3Type;
	}

	public void setPhone3Type(int phone3Type) {
		this.phone3Type = phone3Type;
	}

	public String getPhone3Ext() {
		return phone3Ext;
	}

	public void setPhone3Ext(String phone3Ext) {
		this.phone3Ext = phone3Ext;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStateLicNum() {
		return stateLicNum;
	}

	public void setStateLicNum(String stateLicNum) {
		this.stateLicNum = stateLicNum;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getuPin() {
		return uPin;
	}

	public void setuPin(String uPin) {
		this.uPin = uPin;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getTaxonomyCode() {
		return taxonomyCode;
	}

	public void setTaxonomyCode(String taxonomyCode) {
		this.taxonomyCode = taxonomyCode;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public String getDea() {
		return dea;
	}

	public void setDea(String dea) {
		this.dea = dea;
	}

	public int getProvTypeId() {
		return provTypeId;
	}

	public void setProvTypeId(int provTypeId) {
		this.provTypeId = provTypeId;
	}

	public Date getActiveStartTime() {
		return activeStartTime;
	}

	public void setActiveStartTime(Date activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public Date getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(Date activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public int getPrefMethodForReports() {
		return prefMethodForReports;
	}

	public void setPrefMethodForReports(int prefMethodForReports) {
		this.prefMethodForReports = prefMethodForReports;
	}

	public double getMaximumFte() {
		return maximumFte;
	}

	public void setMaximumFte(double maximumFte) {
		this.maximumFte = maximumFte;
	}

	public double getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}

	public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public Date getSignatureDate() {
		return signatureDate;
	}

	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isPecos() {
		return pecos;
	}

	public void setPecos(boolean pecos) {
		this.pecos = pecos;
	}

	public boolean isBillingExclusion() {
		return billingExclusion;
	}

	public void setBillingExclusion(boolean billingExclusion) {
		this.billingExclusion = billingExclusion;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getBillingNumber() {
		return billingNumber;
	}

	public void setBillingNumber(String billingNumber) {
		this.billingNumber = billingNumber;
	}

	public String getSecureConnectId() {
		return secureConnectId;
	}

	public void setSecureConnectId(String secureConnectId) {
		this.secureConnectId = secureConnectId;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Date getSupervisorFromDate() {
		return supervisorFromDate;
	}

	public void setSupervisorFromDate(Date supervisorFromDate) {
		this.supervisorFromDate = supervisorFromDate;
	}

	public String getSupervisorToDate() {
		return supervisorToDate;
	}

	public void setSupervisorToDate(String supervisorToDate) {
		this.supervisorToDate = supervisorToDate;
	}

	public int getLastSupervisorId() {
		return lastSupervisorId;
	}

	public void setLastSupervisorId(int lastSupervisorId) {
		this.lastSupervisorId = lastSupervisorId;
	}

	public String getHcpiId() {
		return hcpiId;
	}

	public void setHcpiId(String hcpiId) {
		this.hcpiId = hcpiId;
	}

}
