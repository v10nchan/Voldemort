package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
	    tableName="pat_immunizations",
	    primaryKeys={"accountid" , "practiceid" , "patientimmunizationid"}
	)
public class PatientImmunization {

	private int accountid;
	private int practiceid;
	private int patientimmunizationid;
	@PatientID
	private int patientid;
	private Date administrationdate;
	private int administrationdateentered;
	private Date refuseddate;
	private String administeredby;
	private Date expirydate;
	private String routecode;
	private int productcode;
	private String productname;
	private String brandname;
	private String manufacturercode;
	private String lotnumber;
	private int refusalreasoncode;
	private int series1;
	private int series2;
	private int sitecode;
	private int consentcode;
	private int consentnameid;
	private int reactionid;
	private int dosageunitid;
	private int siteid;
	private int reactioncode;
	private String cpt1;
	private String cpt2;
	private int itemstatusid;
	private int itemworkstatusid;
	private String notes;
	private String comments;
	private int immunizationcode;
	private String immunizationname;
	private String immunizationdescription;
	private boolean administeredelsewhere;
	private boolean refusedbypatient;
	private double administeredamount;
	private String administeredunits;
	private boolean displayedsummary;
	private boolean active;
	private Date created;
	private String createdby;
	private Date lastupdated;
	private String updatedby;
	private String ipaddress;
	private String reasonofdeletion;
	private int administrationdateyear;
	private int administrationdatemonth;
	private int administrationdateday;
	private int expirydateyear;
	private int expirydatemonth;
	private int expirydateday;
	private boolean updatedfromsummary;
	private boolean summaryhistory;
	private int dinid;
	private String manufacturername;
	private String fundingeligibility;
	
	@AccountID
    public int getAccountid() {
		return accountid;
	}
	@AccountID
    public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getPracticeid() {
		return practiceid;
	}
	public void setPracticeid(int practiceid) {
		this.practiceid = practiceid;
	}
	public int getPatientimmunizationid() {
		return patientimmunizationid;
	}
	public void setPatientimmunizationid(int patientimmunizationid) {
		this.patientimmunizationid = patientimmunizationid;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public Date getAdministrationdate() {
		return administrationdate;
	}
	public void setAdministrationdate(Date administrationdate) {
		this.administrationdate = administrationdate;
	}
	public int getAdministrationdateentered() {
		return administrationdateentered;
	}
	public void setAdministrationdateentered(int administrationdateentered) {
		this.administrationdateentered = administrationdateentered;
	}
	public Date getRefuseddate() {
		return refuseddate;
	}
	public void setRefuseddate(Date refuseddate) {
		this.refuseddate = refuseddate;
	}
	public String getAdministeredby() {
		return administeredby;
	}
	public void setAdministeredby(String administeredby) {
		this.administeredby = administeredby;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public String getRoutecode() {
		return routecode;
	}
	public void setRoutecode(String routecode) {
		this.routecode = routecode;
	}
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getManufacturercode() {
		return manufacturercode;
	}
	public void setManufacturercode(String manufacturercode) {
		this.manufacturercode = manufacturercode;
	}
	public String getLotnumber() {
		return lotnumber;
	}
	public void setLotnumber(String lotnumber) {
		this.lotnumber = lotnumber;
	}
	public int getRefusalreasoncode() {
		return refusalreasoncode;
	}
	public void setRefusalreasoncode(int refusalreasoncode) {
		this.refusalreasoncode = refusalreasoncode;
	}
	public int getSeries1() {
		return series1;
	}
	public void setSeries1(int series1) {
		this.series1 = series1;
	}
	public int getSeries2() {
		return series2;
	}
	public void setSeries2(int series2) {
		this.series2 = series2;
	}
	public int getSitecode() {
		return sitecode;
	}
	public void setSitecode(int sitecode) {
		this.sitecode = sitecode;
	}
	public int getConsentcode() {
		return consentcode;
	}
	public void setConsentcode(int consentcode) {
		this.consentcode = consentcode;
	}
	public int getConsentnameid() {
		return consentnameid;
	}
	public void setConsentnameid(int consentnameid) {
		this.consentnameid = consentnameid;
	}
	public int getReactionid() {
		return reactionid;
	}
	public void setReactionid(int reactionid) {
		this.reactionid = reactionid;
	}
	public int getDosageunitid() {
		return dosageunitid;
	}
	public void setDosageunitid(int dosageunitid) {
		this.dosageunitid = dosageunitid;
	}
	public int getSiteid() {
		return siteid;
	}
	public void setSiteid(int siteid) {
		this.siteid = siteid;
	}
	public int getReactioncode() {
		return reactioncode;
	}
	public void setReactioncode(int reactioncode) {
		this.reactioncode = reactioncode;
	}
	public String getCpt1() {
		return cpt1;
	}
	public void setCpt1(String cpt1) {
		this.cpt1 = cpt1;
	}
	public String getCpt2() {
		return cpt2;
	}
	public void setCpt2(String cpt2) {
		this.cpt2 = cpt2;
	}
	public int getItemstatusid() {
		return itemstatusid;
	}
	public void setItemstatusid(int itemstatusid) {
		this.itemstatusid = itemstatusid;
	}
	public int getItemworkstatusid() {
		return itemworkstatusid;
	}
	public void setItemworkstatusid(int itemworkstatusid) {
		this.itemworkstatusid = itemworkstatusid;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getImmunizationcode() {
		return immunizationcode;
	}
	public void setImmunizationcode(int immunizationcode) {
		this.immunizationcode = immunizationcode;
	}
	public String getImmunizationname() {
		return immunizationname;
	}
	public void setImmunizationname(String immunizationname) {
		this.immunizationname = immunizationname;
	}
	public String getImmunizationdescription() {
		return immunizationdescription;
	}
	public void setImmunizationdescription(String immunizationdescription) {
		this.immunizationdescription = immunizationdescription;
	}
	public boolean isAdministeredelsewhere() {
		return administeredelsewhere;
	}
	public void setAdministeredelsewhere(boolean administeredelsewhere) {
		this.administeredelsewhere = administeredelsewhere;
	}
	public boolean isRefusedbypatient() {
		return refusedbypatient;
	}
	public void setRefusedbypatient(boolean refusedbypatient) {
		this.refusedbypatient = refusedbypatient;
	}
	public double getAdministeredamount() {
		return administeredamount;
	}
	public void setAdministeredamount(double administeredamount) {
		this.administeredamount = administeredamount;
	}
	public String getAdministeredunits() {
		return administeredunits;
	}
	public void setAdministeredunits(String administeredunits) {
		this.administeredunits = administeredunits;
	}
	public boolean isDisplayedsummary() {
		return displayedsummary;
	}
	public void setDisplayedsummary(boolean displayedsummary) {
		this.displayedsummary = displayedsummary;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public String getReasonofdeletion() {
		return reasonofdeletion;
	}
	public void setReasonofdeletion(String reasonofdeletion) {
		this.reasonofdeletion = reasonofdeletion;
	}
	public int getAdministrationdateyear() {
		return administrationdateyear;
	}
	public void setAdministrationdateyear(int administrationdateyear) {
		this.administrationdateyear = administrationdateyear;
	}
	public int getAdministrationdatemonth() {
		return administrationdatemonth;
	}
	public void setAdministrationdatemonth(int administrationdatemonth) {
		this.administrationdatemonth = administrationdatemonth;
	}
	public int getAdministrationdateday() {
		return administrationdateday;
	}
	public void setAdministrationdateday(int administrationdateday) {
		this.administrationdateday = administrationdateday;
	}
	public int getExpirydateyear() {
		return expirydateyear;
	}
	public void setExpirydateyear(int expirydateyear) {
		this.expirydateyear = expirydateyear;
	}
	public int getExpirydatemonth() {
		return expirydatemonth;
	}
	public void setExpirydatemonth(int expirydatemonth) {
		this.expirydatemonth = expirydatemonth;
	}
	public int getExpirydateday() {
		return expirydateday;
	}
	public void setExpirydateday(int expirydateday) {
		this.expirydateday = expirydateday;
	}
	public boolean isUpdatedfromsummary() {
		return updatedfromsummary;
	}
	public void setUpdatedfromsummary(boolean updatedfromsummary) {
		this.updatedfromsummary = updatedfromsummary;
	}
	public boolean isSummaryhistory() {
		return summaryhistory;
	}
	public void setSummaryhistory(boolean summaryhistory) {
		this.summaryhistory = summaryhistory;
	}
	public String getFundingeligibility() {
		return fundingeligibility;
	}
	public int getDinid() {
		return dinid;
	}
	public void setDinid(int dinid) {
		this.dinid = dinid;
	}
	public String getManufacturername() {
		return manufacturername;
	}
	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}
	public void setFundingeligibility(String fundingeligibility) {
		this.fundingeligibility = fundingeligibility;
	}
}
