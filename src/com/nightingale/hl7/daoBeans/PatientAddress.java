package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBSerialField;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
	    tableName="pat_address",
	    primaryKeys={"accountid","patientaddressid"}
)
public class PatientAddress {
	
	private int accountid;
	private int patientaddressid;
	@PatientID
	private int patientid;
	private int typecode;
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String county;
	private String ipaddress;
	private Date created;
	private String createdby;
	private Date lastupdated;
	private String updatedby;
	private boolean active;
	
	@AccountID
    public int getAccountid() {
		return accountid;
	}
	@AccountID
    public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	@DBSerialField(prefix="pat_address_patientaddressid_seq")
	public int getPatientaddressid() {
		return patientaddressid;
	}
	public void setPatientaddressid(int patientaddressid) {
		this.patientaddressid = patientaddressid;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getTypecode() {
		return typecode;
	}
	public void setTypecode(int typecode) {
		this.typecode = typecode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
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
