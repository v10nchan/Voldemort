package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.DBTableMap;

public class ImmunizationCptInfo {

	  private String cpt_code;
	  private String cpt_description;
	  private int cvx;
	  private String vaccine_name;
	  private String cpt_status;
	  private String comments;
	  Date lastupdated;
	 // private int patientimmunizationid;
	  
	  
	public String getCpt_code() {
		return cpt_code;
	}
	public void setCpt_code(String cpt_code) {
		this.cpt_code = cpt_code;
	}
	public String getCpt_description() {
		return cpt_description;
	}
	public void setCpt_description(String cpt_description) {
		this.cpt_description = cpt_description;
	}
	public int getCvx() {
		return cvx;
	}
	public void setCvx(int cvx) {
		this.cvx = cvx;
	}
	public String getVaccine_name() {
		return vaccine_name;
	}
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	public String getCpt_status() {
		return cpt_status;
	}
	public void setCpt_status(String cpt_status) {
		this.cpt_status = cpt_status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	/*public int getPatientimmunizationid() {
		return patientimmunizationid;
	}
	public void setPatientimmunizationid(int patientimmunizationid) {
		this.patientimmunizationid = patientimmunizationid;
	}*/
}
