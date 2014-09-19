package com.nightingale.hl7.daoBeans;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
	    tableName="pat_socialhistory_race",
	    primaryKeys={"accountid", "patientid", "socialhistoryid", "socialhistoryraceid"}
)
public class RaceInfo {

	private int accountid;
	@PatientID
	private int patientid;
	private int socialhistoryid;
	private int socialhistoryraceid;
	private int race;
	private String raceother;

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

	public int getSocialhistoryraceid() {
		return socialhistoryraceid;
	}

	public void setSocialhistoryraceid(int socialhistoryraceid) {
		this.socialhistoryraceid = socialhistoryraceid;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public String getRaceother() {
		return raceother;
	}

	public void setRaceother(String raceother) {
		this.raceother = raceother;
	}

}
