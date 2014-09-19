package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
	    tableName="vwpatientimmunizations",
	    primaryKeys={"accountid" , "practiceid" , "patientimmunizationid" , "userfieldid"}
)
public class PatientImmunizationViewInfo {
	
	private int accountid;
	private int practiceid;
	@PatientID
	private int patientid;
	private int userfieldid;
	private int encounterid;
	private int patientimmunizationid; 
	private int consentnameid;
	private String cpt1;
	private String cpt2;
	private boolean administeredelsewhere;
	private Date administrationdate; 
    private String administeredby;
    private Date expirydate;
    private boolean refusedbypatient;
    private Date refuseddate;
    private int refusalreasoncode;
    private int productcode;
    private String productname;
    private String brandname;
    private String manufacturercode;
    private String lotnumber; 
    private int series1;
    private int series2;
    private String notes;
    private String comments;
    private int immunizationcode;
    private String immunizationname;
    private String immunizationdescription;
    private String routecode;
    private String reaction;
    private String dosageunit;
    private String site; 
    private double administeredamount;
    private String administeredunits;
    private boolean displayedsummary;
    private boolean active; 
    private String reasonofdeletion;
    
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
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getEncounterid() {
		return encounterid;
	}
	public void setEncounterid(int encounterid) {
		this.encounterid = encounterid;
	}
	public int getPatientimmunizationid() {
		return patientimmunizationid;
	}
	public void setPatientimmunizationid(int patientimmunizationid) {
		this.patientimmunizationid = patientimmunizationid;
	}
	public int getConsentnameid() {
		return consentnameid;
	}
	public void setConsentnameid(int consentnameid) {
		this.consentnameid = consentnameid;
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
	public boolean isAdministeredelsewhere() {
		return administeredelsewhere;
	}
	public void setAdministeredelsewhere(boolean administeredelsewhere) {
		this.administeredelsewhere = administeredelsewhere;
	}
	public Date getAdministrationdate() {
		return administrationdate;
	}
	public void setAdministrationdate(Date administrationdate) {
		this.administrationdate = administrationdate;
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
	public boolean isRefusedbypatient() {
		return refusedbypatient;
	}
	public void setRefusedbypatient(boolean refusedbypatient) {
		this.refusedbypatient = refusedbypatient;
	}
	public Date getRefuseddate() {
		return refuseddate;
	}
	public void setRefuseddate(Date refuseddate) {
		this.refuseddate = refuseddate;
	}
	public int getRefusalreasoncode() {
		return refusalreasoncode;
	}
	public void setRefusalreasoncode(int refusalreasoncode) {
		this.refusalreasoncode = refusalreasoncode;
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
	public String getRoutecode() {
		return routecode;
	}
	public void setRoutecode(String routecode) {
		this.routecode = routecode;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getDosageunit() {
		return dosageunit;
	}
	public void setDosageunit(String dosageunit) {
		this.dosageunit = dosageunit;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
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
	public String getReasonofdeletion() {
		return reasonofdeletion;
	}
	public void setReasonofdeletion(String reasonofdeletion) {
		this.reasonofdeletion = reasonofdeletion;
	}
	public int getUserfieldid() {
		return userfieldid;
	}
	public void setUserfieldid(int userfieldid) {
		this.userfieldid = userfieldid;
	}
    
}
