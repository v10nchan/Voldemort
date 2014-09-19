package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;
@DBTableMap (
	    tableName="pat_communication",
	    primaryKeys={"accountid" , "patientid" , "socialhistoryid" }
)
public class PatientSocialHistory {

	  private int accountid;
	  @PatientID
	  private int patientid;
	  private int socialhistoryid;
	  private String preferredlanguage;
	  private boolean languageinterpreterrequired;
	  private String languageinterpreter;
	  private String languageinterpreterservice;
	  private int ethnicity;
	  private int religion;
	  private String religionother;
	  private int citizenship;
	  private String citizenshipother;
	  private boolean homeless;
	  private int homelesstypeid;
	  private boolean ssi;
	  private boolean poverty;
	  private boolean rural;
	  private boolean aboriginalpeoples;
	  private boolean racialized;
	  private int agegroupid;
	  private int educationlevelid;
	  private String educationlevelother;
	  private int householdincomeid;
	  private int numpeoplesupported;
	  private String languageorigin;
	  private String countryorigin;
	  private int arrivalyear;
	  private int arrivalmonth;
	  private int arrivalday;
	  private String parentethnicity;
	  private String studentstatusid;
	  private String officiallanguage;
	  private int livingarrangementid;
	  private int employmentstatusid;
	  private String joboccupation;
	  private String comments;
	  private String ipaddress;
	  private Date created;
	  private String createdby;
	  private Date lastupdated;
	  private String updatedby;
	  private String ethnicityother;
	  private String parentethnicityother;
	  private int jobcodeid;
	  private int numpeoplesupportedid;
	  
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
	public int getSocialhistoryid() {
		return socialhistoryid;
	}
	public void setSocialhistoryid(int socialhistoryid) {
		this.socialhistoryid = socialhistoryid;
	}
	public String getPreferredlanguage() {
		return preferredlanguage;
	}
	public void setPreferredlanguage(String preferredlanguage) {
		this.preferredlanguage = preferredlanguage;
	}
	public boolean isLanguageinterpreterrequired() {
		return languageinterpreterrequired;
	}
	public void setLanguageinterpreterrequired(boolean languageinterpreterrequired) {
		this.languageinterpreterrequired = languageinterpreterrequired;
	}
	public String getLanguageinterpreter() {
		return languageinterpreter;
	}
	public void setLanguageinterpreter(String languageinterpreter) {
		this.languageinterpreter = languageinterpreter;
	}
	public String getLanguageinterpreterservice() {
		return languageinterpreterservice;
	}
	public void setLanguageinterpreterservice(String languageinterpreterservice) {
		this.languageinterpreterservice = languageinterpreterservice;
	}
	public int getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(int ethnicity) {
		this.ethnicity = ethnicity;
	}
	public int getReligion() {
		return religion;
	}
	public void setReligion(int religion) {
		this.religion = religion;
	}
	public String getReligionother() {
		return religionother;
	}
	public void setReligionother(String religionother) {
		this.religionother = religionother;
	}
	public int getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(int citizenship) {
		this.citizenship = citizenship;
	}
	public String getCitizenshipother() {
		return citizenshipother;
	}
	public void setCitizenshipother(String citizenshipother) {
		this.citizenshipother = citizenshipother;
	}
	public boolean isHomeless() {
		return homeless;
	}
	public void setHomeless(boolean homeless) {
		this.homeless = homeless;
	}
	public int getHomelesstypeid() {
		return homelesstypeid;
	}
	public void setHomelesstypeid(int homelesstypeid) {
		this.homelesstypeid = homelesstypeid;
	}
	public boolean isSsi() {
		return ssi;
	}
	public void setSsi(boolean ssi) {
		this.ssi = ssi;
	}
	public boolean isPoverty() {
		return poverty;
	}
	public void setPoverty(boolean poverty) {
		this.poverty = poverty;
	}
	public boolean isRural() {
		return rural;
	}
	public void setRural(boolean rural) {
		this.rural = rural;
	}
	public boolean isAboriginalpeoples() {
		return aboriginalpeoples;
	}
	public void setAboriginalpeoples(boolean aboriginalpeoples) {
		this.aboriginalpeoples = aboriginalpeoples;
	}
	public boolean isRacialized() {
		return racialized;
	}
	public void setRacialized(boolean racialized) {
		this.racialized = racialized;
	}
	public int getAgegroupid() {
		return agegroupid;
	}
	public void setAgegroupid(int agegroupid) {
		this.agegroupid = agegroupid;
	}
	public int getEducationlevelid() {
		return educationlevelid;
	}
	public void setEducationlevelid(int educationlevelid) {
		this.educationlevelid = educationlevelid;
	}
	public String getEducationlevelother() {
		return educationlevelother;
	}
	public void setEducationlevelother(String educationlevelother) {
		this.educationlevelother = educationlevelother;
	}
	public int getHouseholdincomeid() {
		return householdincomeid;
	}
	public void setHouseholdincomeid(int householdincomeid) {
		this.householdincomeid = householdincomeid;
	}
	public int getNumpeoplesupported() {
		return numpeoplesupported;
	}
	public void setNumpeoplesupported(int numpeoplesupported) {
		this.numpeoplesupported = numpeoplesupported;
	}
	public String getLanguageorigin() {
		return languageorigin;
	}
	public void setLanguageorigin(String languageorigin) {
		this.languageorigin = languageorigin;
	}
	public String getCountryorigin() {
		return countryorigin;
	}
	public void setCountryorigin(String countryorigin) {
		this.countryorigin = countryorigin;
	}
	public int getArrivalyear() {
		return arrivalyear;
	}
	public void setArrivalyear(int arrivalyear) {
		this.arrivalyear = arrivalyear;
	}
	public int getArrivalmonth() {
		return arrivalmonth;
	}
	public void setArrivalmonth(int arrivalmonth) {
		this.arrivalmonth = arrivalmonth;
	}
	public int getArrivalday() {
		return arrivalday;
	}
	public void setArrivalday(int arrivalday) {
		this.arrivalday = arrivalday;
	}
	public String getParentethnicity() {
		return parentethnicity;
	}
	public void setParentethnicity(String parentethnicity) {
		this.parentethnicity = parentethnicity;
	}
	public String getStudentstatusid() {
		return studentstatusid;
	}
	public void setStudentstatusid(String studentstatusid) {
		this.studentstatusid = studentstatusid;
	}
	public String getOfficiallanguage() {
		return officiallanguage;
	}
	public void setOfficiallanguage(String officiallanguage) {
		this.officiallanguage = officiallanguage;
	}
	public int getLivingarrangementid() {
		return livingarrangementid;
	}
	public void setLivingarrangementid(int livingarrangementid) {
		this.livingarrangementid = livingarrangementid;
	}
	public int getEmploymentstatusid() {
		return employmentstatusid;
	}
	public void setEmploymentstatusid(int employmentstatusid) {
		this.employmentstatusid = employmentstatusid;
	}
	public String getJoboccupation() {
		return joboccupation;
	}
	public void setJoboccupation(String joboccupation) {
		this.joboccupation = joboccupation;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
	public String getEthnicityother() {
		return ethnicityother;
	}
	public void setEthnicityother(String ethnicityother) {
		this.ethnicityother = ethnicityother;
	}
	public String getParentethnicityother() {
		return parentethnicityother;
	}
	public void setParentethnicityother(String parentethnicityother) {
		this.parentethnicityother = parentethnicityother;
	}
	public int getJobcodeid() {
		return jobcodeid;
	}
	public void setJobcodeid(int jobcodeid) {
		this.jobcodeid = jobcodeid;
	}
	public int getNumpeoplesupportedid() {
		return numpeoplesupportedid;
	}
	public void setNumpeoplesupportedid(int numpeoplesupportedid) {
		this.numpeoplesupportedid = numpeoplesupportedid;
	}
}
