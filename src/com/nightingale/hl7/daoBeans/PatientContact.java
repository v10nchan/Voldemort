package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;
@DBTableMap (
	    tableName="pat_contact",
	    primaryKeys={"accountid" , "patientid" , "contactid"}
	)
public class PatientContact {
	private int contactid;
	private int accountid;
	@PatientID
	private int patientid;
	private int relationship;
	private int titleid;
	private String lastname;
	private String firstname;
	private String suffix;
	private int phone1type;
	private String phone1;
	private String phone1ext;
	private int phone2type;
	private String phone2;
	private String phone2ext;
	private int phone3type;
	private String phone3;
	private String phone3ext;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private int country;
	private String email;
	private String comment;
	private String language;
	private String ipaddress;
	private Date created;
	private String createdby;
	private Date lastupdated;
	private String updatedby;
	private boolean active;

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	@AccountID
    public int getAccountid() {
		return accountid;
	}

	@AccountID
    public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getRelationship() {
		return relationship;
	}

	public void setRelationship(int relationship) {
		this.relationship = relationship;
	}

	public int getTitleid() {
		return titleid;
	}

	public void setTitleid(int titleid) {
		this.titleid = titleid;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getPhone1type() {
		return phone1type;
	}

	public void setPhone1type(int phone1type) {
		this.phone1type = phone1type;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone1ext() {
		return phone1ext;
	}

	public void setPhone1ext(String phone1ext) {
		this.phone1ext = phone1ext;
	}

	public int getPhone2type() {
		return phone2type;
	}

	public void setPhone2type(int phone2type) {
		this.phone2type = phone2type;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone2ext() {
		return phone2ext;
	}

	public void setPhone2ext(String phone2ext) {
		this.phone2ext = phone2ext;
	}

	public int getPhone3type() {
		return phone3type;
	}

	public void setPhone3type(int phone3type) {
		this.phone3type = phone3type;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getPhone3ext() {
		return phone3ext;
	}

	public void setPhone3ext(String phone3ext) {
		this.phone3ext = phone3ext;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
