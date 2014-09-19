package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;

@DBTableMap (
	    tableName="practice",
	    primaryKeys={"accountid","practiceid"}
)
public class PracticeInfo {

	  private int accountid;
	  private int practiceid;
	  private String name;
	  private String ipaddress;
	  private Date created;
	  private String createdby;
	  private Date lastupdated;
	  private String updatedby;
	  private String taxid;
	  private String groupnpi;
	  private int phone1type;
	  private String phone1;
	  private String phone1ext;
	  private int phone2type;
	  private String phone2;
	  private String phone2ext;
	  private int phone3type;
	  private String phone3;
	  private String phone3ext;
	  private String email;
	  private String comment;
	  private String logo;
	  private String addr1;
	  private String addr2;
	  private String city;
	  private String state;
	  private String zip;
	  private String country;
	  private String billingaddr1;
	  private String billingaddr2;
	  private String billingcity;
	  private String billingstate;
	  private String billingzip;
	  private String billingcountry;
	  private boolean active;
	  private String maxinactivitytimenumber;
	  private int maxinactivitytimeunitid;
	  private boolean use24hourtime;
	  private String npinumber;
	  private String billinglocationname;
	  private String mammographycertificationnumber;
	  private boolean schedulingappointments;
	  private boolean locationislab;
	  private String billingstatement;
	  private String clianumber;
	  private double taxrate;
	  private String practicetype;
	  private boolean useappointmenttable;
	  private String secureconnectgroupid;
	  private boolean encodefm;
	  private boolean icpc;
	  private String defaulticd;
	  private boolean locationisarticle16;
	  private boolean article16onsite;
	  private boolean locationisarticle28;
	  private boolean article28onsite;
	  private int servicelevelindicatorid;
	  private int preferredcommunicationtype;
	  private String confidentialitystatement;
	  private String labsoftcustid;
	  
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTaxid() {
		return taxid;
	}
	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	public String getGroupnpi() {
		return groupnpi;
	}
	public void setGroupnpi(String groupnpi) {
		this.groupnpi = groupnpi;
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
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
	public String getBillingaddr1() {
		return billingaddr1;
	}
	public void setBillingaddr1(String billingaddr1) {
		this.billingaddr1 = billingaddr1;
	}
	public String getBillingaddr2() {
		return billingaddr2;
	}
	public void setBillingaddr2(String billingaddr2) {
		this.billingaddr2 = billingaddr2;
	}
	public String getBillingcity() {
		return billingcity;
	}
	public void setBillingcity(String billingcity) {
		this.billingcity = billingcity;
	}
	public String getBillingstate() {
		return billingstate;
	}
	public void setBillingstate(String billingstate) {
		this.billingstate = billingstate;
	}
	public String getBillingzip() {
		return billingzip;
	}
	public void setBillingzip(String billingzip) {
		this.billingzip = billingzip;
	}
	public String getBillingcountry() {
		return billingcountry;
	}
	public void setBillingcountry(String billingcountry) {
		this.billingcountry = billingcountry;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getMaxinactivitytimenumber() {
		return maxinactivitytimenumber;
	}
	public void setMaxinactivitytimenumber(String maxinactivitytimenumber) {
		this.maxinactivitytimenumber = maxinactivitytimenumber;
	}
	public int getMaxinactivitytimeunitid() {
		return maxinactivitytimeunitid;
	}
	public void setMaxinactivitytimeunitid(int maxinactivitytimeunitid) {
		this.maxinactivitytimeunitid = maxinactivitytimeunitid;
	}
	public boolean isUse24hourtime() {
		return use24hourtime;
	}
	public void setUse24hourtime(boolean use24hourtime) {
		this.use24hourtime = use24hourtime;
	}
	public String getNpinumber() {
		return npinumber;
	}
	public void setNpinumber(String npinumber) {
		this.npinumber = npinumber;
	}
	public String getBillinglocationname() {
		return billinglocationname;
	}
	public void setBillinglocationname(String billinglocationname) {
		this.billinglocationname = billinglocationname;
	}
	public String getMammographycertificationnumber() {
		return mammographycertificationnumber;
	}
	public void setMammographycertificationnumber(
			String mammographycertificationnumber) {
		this.mammographycertificationnumber = mammographycertificationnumber;
	}
	public boolean isSchedulingappointments() {
		return schedulingappointments;
	}
	public void setSchedulingappointments(boolean schedulingappointments) {
		this.schedulingappointments = schedulingappointments;
	}
	public boolean isLocationislab() {
		return locationislab;
	}
	public void setLocationislab(boolean locationislab) {
		this.locationislab = locationislab;
	}
	public String getBillingstatement() {
		return billingstatement;
	}
	public void setBillingstatement(String billingstatement) {
		this.billingstatement = billingstatement;
	}
	public String getClianumber() {
		return clianumber;
	}
	public void setClianumber(String clianumber) {
		this.clianumber = clianumber;
	}
	public double getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}
	public String getPracticetype() {
		return practicetype;
	}
	public void setPracticetype(String practicetype) {
		this.practicetype = practicetype;
	}
	public boolean isUseappointmenttable() {
		return useappointmenttable;
	}
	public void setUseappointmenttable(boolean useappointmenttable) {
		this.useappointmenttable = useappointmenttable;
	}
	public String getSecureconnectgroupid() {
		return secureconnectgroupid;
	}
	public void setSecureconnectgroupid(String secureconnectgroupid) {
		this.secureconnectgroupid = secureconnectgroupid;
	}
	public boolean isEncodefm() {
		return encodefm;
	}
	public void setEncodefm(boolean encodefm) {
		this.encodefm = encodefm;
	}
	public boolean isIcpc() {
		return icpc;
	}
	public void setIcpc(boolean icpc) {
		this.icpc = icpc;
	}
	public String getDefaulticd() {
		return defaulticd;
	}
	public void setDefaulticd(String defaulticd) {
		this.defaulticd = defaulticd;
	}
	public boolean isLocationisarticle16() {
		return locationisarticle16;
	}
	public void setLocationisarticle16(boolean locationisarticle16) {
		this.locationisarticle16 = locationisarticle16;
	}
	public boolean isArticle16onsite() {
		return article16onsite;
	}
	public void setArticle16onsite(boolean article16onsite) {
		this.article16onsite = article16onsite;
	}
	public boolean isLocationisarticle28() {
		return locationisarticle28;
	}
	public void setLocationisarticle28(boolean locationisarticle28) {
		this.locationisarticle28 = locationisarticle28;
	}
	public boolean isArticle28onsite() {
		return article28onsite;
	}
	public void setArticle28onsite(boolean article28onsite) {
		this.article28onsite = article28onsite;
	}
	public int getServicelevelindicatorid() {
		return servicelevelindicatorid;
	}
	public void setServicelevelindicatorid(int servicelevelindicatorid) {
		this.servicelevelindicatorid = servicelevelindicatorid;
	}
	public int getPreferredcommunicationtype() {
		return preferredcommunicationtype;
	}
	public void setPreferredcommunicationtype(int preferredcommunicationtype) {
		this.preferredcommunicationtype = preferredcommunicationtype;
	}
	public String getConfidentialitystatement() {
		return confidentialitystatement;
	}
	public void setConfidentialitystatement(String confidentialitystatement) {
		this.confidentialitystatement = confidentialitystatement;
	}
	public String getLabsoftcustid() {
		return labsoftcustid;
	}
	public void setLabsoftcustid(String labsoftcustid) {
		this.labsoftcustid = labsoftcustid;
	}
}
