package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;

@DBTableMap (
	    tableName="prov_info",
	    primaryKeys={"accountid","provid"}
)
public class PatientProviderInfo {

	  private int accountid;
	  private int provid;
	  private String billingprovider;
	  private String renderingprovider;
	  private String referringprovider;
	  private String supervisingprovider;
	  private int titleid;
	  private String lastname;
	  private String firstname;
	  private String middlename;
	  private String providercode;
	  private String referringcode;
	  private int genderid;
	  private String phone1;
	  private int phone1type;
	  private String phone1ext;
	  private String phone2;
	  private int phone2type;
	  private String phone2ext;
	  private String phone3;
	  private int phone3type;
	  private String phone3ext;
	  private String email;
	  private String statelicnum;
	  private String salutation;
	  private String upin;
	  private boolean isactive;
	  private String taxonomycode;
	  private String credentials;
	  private String npi;
	  private String dea;
	  private int provtypeid;
	  private Date activestarttime;
	  private Date activeendtime;
	  private int prefmethodforreports;
	  private double maximumfte;
	  private double hoursworkedperweek;
	  private Date signaturedate;
	  private String comments;
	  private boolean pecos;
	  private boolean billingexclusion;
	  private String ipaddress;
	  private Date created;
	  private String createdby;
	  private Date lastupdated;
	  private String updatedby;
	  private String license;
	  private String billingnumber;
	  private String secureconnectid;
	  private int supervisorid;
	  private Date supervisorfromdate;
	  private Date supervisortodate;
	  private int lastsupervisorid;
	  private String hcpid;
	  private String directaddress;
	  
	@AccountID
	public int getAccountid() {
		return accountid;
	}
	@AccountID
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getProvid() {
		return provid;
	}
	public void setProvid(int provid) {
		this.provid = provid;
	}
	public String getBillingprovider() {
		return billingprovider;
	}
	public void setBillingprovider(String billingprovider) {
		this.billingprovider = billingprovider;
	}
	public String getRenderingprovider() {
		return renderingprovider;
	}
	public void setRenderingprovider(String renderingprovider) {
		this.renderingprovider = renderingprovider;
	}
	public String getReferringprovider() {
		return referringprovider;
	}
	public void setReferringprovider(String referringprovider) {
		this.referringprovider = referringprovider;
	}
	public String getSupervisingprovider() {
		return supervisingprovider;
	}
	public void setSupervisingprovider(String supervisingprovider) {
		this.supervisingprovider = supervisingprovider;
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
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getProvidercode() {
		return providercode;
	}
	public void setProvidercode(String providercode) {
		this.providercode = providercode;
	}
	public String getReferringcode() {
		return referringcode;
	}
	public void setReferringcode(String referringcode) {
		this.referringcode = referringcode;
	}
	public int getGenderid() {
		return genderid;
	}
	public void setGenderid(int genderid) {
		this.genderid = genderid;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public int getPhone1type() {
		return phone1type;
	}
	public void setPhone1type(int phone1type) {
		this.phone1type = phone1type;
	}
	public String getPhone1ext() {
		return phone1ext;
	}
	public void setPhone1ext(String phone1ext) {
		this.phone1ext = phone1ext;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public int getPhone2type() {
		return phone2type;
	}
	public void setPhone2type(int phone2type) {
		this.phone2type = phone2type;
	}
	public String getPhone2ext() {
		return phone2ext;
	}
	public void setPhone2ext(String phone2ext) {
		this.phone2ext = phone2ext;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public int getPhone3type() {
		return phone3type;
	}
	public void setPhone3type(int phone3type) {
		this.phone3type = phone3type;
	}
	public String getPhone3ext() {
		return phone3ext;
	}
	public void setPhone3ext(String phone3ext) {
		this.phone3ext = phone3ext;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatelicnum() {
		return statelicnum;
	}
	public void setStatelicnum(String statelicnum) {
		this.statelicnum = statelicnum;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getUpin() {
		return upin;
	}
	public void setUpin(String upin) {
		this.upin = upin;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getTaxonomycode() {
		return taxonomycode;
	}
	public void setTaxonomycode(String taxonomycode) {
		this.taxonomycode = taxonomycode;
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
	public int getProvtypeid() {
		return provtypeid;
	}
	public void setProvtypeid(int provtypeid) {
		this.provtypeid = provtypeid;
	}
	public Date getActivestarttime() {
		return activestarttime;
	}
	public void setActivestarttime(Date activestarttime) {
		this.activestarttime = activestarttime;
	}
	public Date getActiveendtime() {
		return activeendtime;
	}
	public void setActiveendtime(Date activeendtime) {
		this.activeendtime = activeendtime;
	}
	public int getPrefmethodforreports() {
		return prefmethodforreports;
	}
	public void setPrefmethodforreports(int prefmethodforreports) {
		this.prefmethodforreports = prefmethodforreports;
	}
	public double getMaximumfte() {
		return maximumfte;
	}
	public void setMaximumfte(double maximumfte) {
		this.maximumfte = maximumfte;
	}
	public double getHoursworkedperweek() {
		return hoursworkedperweek;
	}
	public void setHoursworkedperweek(double hoursworkedperweek) {
		this.hoursworkedperweek = hoursworkedperweek;
	}
	public Date getSignaturedate() {
		return signaturedate;
	}
	public void setSignaturedate(Date signaturedate) {
		this.signaturedate = signaturedate;
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
	public boolean isBillingexclusion() {
		return billingexclusion;
	}
	public void setBillingexclusion(boolean billingexclusion) {
		this.billingexclusion = billingexclusion;
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
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getBillingnumber() {
		return billingnumber;
	}
	public void setBillingnumber(String billingnumber) {
		this.billingnumber = billingnumber;
	}
	public String getSecureconnectid() {
		return secureconnectid;
	}
	public void setSecureconnectid(String secureconnectid) {
		this.secureconnectid = secureconnectid;
	}
	public int getSupervisorid() {
		return supervisorid;
	}
	public void setSupervisorid(int supervisorid) {
		this.supervisorid = supervisorid;
	}
	public Date getSupervisorfromdate() {
		return supervisorfromdate;
	}
	public void setSupervisorfromdate(Date supervisorfromdate) {
		this.supervisorfromdate = supervisorfromdate;
	}
	public Date getSupervisortodate() {
		return supervisortodate;
	}
	public void setSupervisortodate(Date supervisortodate) {
		this.supervisortodate = supervisortodate;
	}
	public int getLastsupervisorid() {
		return lastsupervisorid;
	}
	public void setLastsupervisorid(int lastsupervisorid) {
		this.lastsupervisorid = lastsupervisorid;
	}
	public String getHcpid() {
		return hcpid;
	}
	public void setHcpid(String hcpid) {
		this.hcpid = hcpid;
	}
	public String getDirectaddress() {
		return directaddress;
	}
	public void setDirectaddress(String directaddress) {
		this.directaddress = directaddress;
	}  
}
