package com.nightingale.hl7.daoBeans;

import java.util.Date;

import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;

@DBTableMap (
        tableName="pat_note",
        primaryKeys={"accountid","patientid","noteid"}
)
public class PatientNoteInfo {
    
    private int accountid;
    @PatientID
    private int patientid;
    private int noteid;
    private int notetypeid;
    private String note;
    private Date notedate;
    private Date followupdate;
    private String officeaction;
    private String ipaddress;
    private Date created;
    private String createdby;
    private Date lastupdated;
    private String updatedby;
    private int practiceid;
    private boolean active;
    
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
    
    public int getNoteid() {
        return noteid;
    }
    
    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }
    
    public int getNotetypeid() {
        return notetypeid;
    }
    
    public void setNotetypeid(int notetypeid) {
        this.notetypeid = notetypeid;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public Date getNotedate() {
        return notedate;
    }
    
    public void setNotedate(Date notedate) {
        this.notedate = notedate;
    }
    
    public Date getFollowupdate() {
        return followupdate;
    }
    
    public void setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
    }
    
    public String getOfficeaction() {
        return officeaction;
    }
    
    public void setOfficeaction(String officeaction) {
        this.officeaction = officeaction;
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
    
    public int getPracticeid() {
        return practiceid;
    }
    
    public void setPracticeid(int practiceid) {
        this.practiceid = practiceid;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
}
