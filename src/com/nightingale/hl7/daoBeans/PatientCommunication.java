package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
	    tableName="pat_communication",
	    primaryKeys={"accountid","patientcommid"}
)
public class PatientCommunication {

	private int accountid;
	private int patientcommid;
	@PatientID
	private int patientid;
	private int typecode;
	private String telnum;
	private String extnum;
	private String ipaddress;
	private Date created;
	private String createdby;
	private Date lastupdated;
	private String updatedby;
	
	@AccountID
    public int getAccountid() {
		return accountid;
	}
	@AccountID
    public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getPatientcommid() {
		return patientcommid;
	}
	public void setPatientcommid(int patientcommid) {
		this.patientcommid = patientcommid;
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
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getExtnum() {
		return extnum;
	}
	public void setExtnum(String extnum) {
		this.extnum = extnum;
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
	
}
