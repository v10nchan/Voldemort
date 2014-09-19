package com.nightingale.hl7.dto;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.medrium.annotation.AccountID;
import com.medrium.annotation.DBSerialField;
import com.medrium.annotation.DBTableMap;
import com.nightingale.annotation.PatientID;


@DBTableMap (
    tableName="pat_info",
    primaryKeys={"accountid","patientid"}
)
public class PatientInformation implements IsSerializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private int _accountid;
	@PatientID
	private int _patientid;
	private String _lastname;
	private String _firstname;
	private String _mi;
	private Date _dob;
	private String _sex;
	private String _title;
	private String _suffix;
	private String _alias1;
	private String _alias2;
	private String _email;
	private String _maritalstatus;
	private int _status;
	private Date _statusdate;
	private int _statusinactivationreason;
	private int _prematureduration;
	private String _prematuremeasure;
	private int _internalstatusflags;
	private int _responsibleprovid;
	private boolean _primarycareprov;
	private int _primarylocation;
	private String _chartnum;
	private String _comments;
	private String _ipaddress;
	private Date _created;
	private String _createdby;
	private Date _lastupdated;
	private String _updatedby;
	private String _healthcardnumber;
	private String _reason;
	private String _hcnversion;
	private Date _expirydate;
	private boolean _newborn;
	private String _healthcardprovince;
	private int _patientexternalid;
	private String _metaphonelastname;
	private String _metaphonefirstname;
	private String _metaphonealias1;
	private String _metaphonealias2;
	private String _soundexlastname;
	private String _soundexfirstname;
	private String _searchstring1;
	private String _searchstring2;
	private String _searchstringsoundslike;
	private int _patientdisplayid;
	private Date _laststatementdate;
	private int _portalstatus;

	@AccountID
    public int getAccountId() {
		return _accountid;
	}

	@AccountID
    public void setAccountId(int accountId) {
		this._accountid = accountId;
	}

	@DBSerialField(prefix="pat_info_patientid_seq")
	public int getPatientId() {
		return _patientid;
	}

	public void setPatientId(int patientId) {
		this._patientid = patientId;
	}

	public String getLastName() {
		return _lastname;
	}

	public void setLastName(String lastName) {
		this._lastname = lastName;
	}

	public String getFirstName() {
		return _firstname;
	}

	public void setFirstName(String firstName) {
		this._firstname = firstName;
	}

	public Date getDob() {
		return _dob;
	}

	public String getMi() {
		return _mi;
	}

	public void setMi(String _mi) {
		this._mi = _mi;
	}

	public void setDob(Date dob) {
		this._dob = dob;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		this._sex = sex;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public String getSuffix() {
		return _suffix;
	}

	public void setSuffix(String suffix) {
		this._suffix = suffix;
	}

	public String getAlias1() {
		return _alias1;
	}

	public void setAlias1(String alias1) {
		this._alias1 = alias1;
	}

	public String getAlias2() {
		return _alias2;
	}

	public void setAlias2(String alias2) {
		this._alias2 = alias2;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		this._email = email;
	}

	public String getMaritalStatus() {
		return _maritalstatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this._maritalstatus = maritalStatus;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		this._status = status;
	}

	public Date getStatusDate() {
		return _statusdate;
	}

	public void setStatusDate(Date statusDate) {
		this._statusdate = statusDate;
	}

	public int getStatusInactivationReason() {
		return _statusinactivationreason;
	}

	public void setStatusInactivationReason(int statusInactivationReason) {
		this._statusinactivationreason = statusInactivationReason;
	}

	public int getPrematureDuration() {
		return _prematureduration;
	}

	public void setPrematureDuration(int prematureDuration) {
		this._prematureduration = prematureDuration;
	}

	public String getPrematureMeasure() {
		return _prematuremeasure;
	}

	public void setPrematureMeasure(String prematureMeasure) {
		this._prematuremeasure = prematureMeasure;
	}

	public int getInternalStatusFlags() {
		return _internalstatusflags;
	}

	public void setInternalStatusFlags(int internalStatusFlags) {
		this._internalstatusflags = internalStatusFlags;
	}

	public int getResponsibleProvid() {
		return _responsibleprovid;
	}

	public void setResponsibleProvid(int responsibleProvid) {
		this._responsibleprovid = responsibleProvid;
	}

	public boolean isPrimaryCareProv() {
		return _primarycareprov;
	}

	public void setPrimaryCareProv(boolean primaryCareProv) {
		this._primarycareprov = primaryCareProv;
	}

	public int getPrimaryLocation() {
		return _primarylocation;
	}

	public void setPrimaryLocation(int primaryLocation) {
		this._primarylocation = primaryLocation;
	}

	public String getChartNum() {
		return _chartnum;
	}

	public void setChartNum(String chartNum) {
		this._chartnum = chartNum;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		this._comments = comments;
	}

	public String getIpAddress() {
		return _ipaddress;
	}

	public void setIpAddress(String ipAddress) {
		this._ipaddress = ipAddress;
	}

	public Date getCreated() {
		return _created;
	}

	public void setCreated(Date created) {
		this._created = created;
	}

	public String getCreatedBy() {
		return _createdby;
	}

	public void setCreatedBy(String createdBy) {
		this._createdby = createdBy;
	}

	public Date getLastUpdated() {
		return _lastupdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this._lastupdated = lastUpdated;
	}

	public String getUpdatedBy() {
		return _updatedby;
	}

	public void setUpdatedBy(String updatedBy) {
		this._updatedby = updatedBy;
	}

	public String getHealthCardNumber() {
		return _healthcardnumber;
	}

	public void setHealthCardNumber(String healthCardNumber) {
		this._healthcardnumber = healthCardNumber;
	}

	public String getReason() {
		return _reason;
	}

	public void setReason(String reason) {
		this._reason = reason;
	}

	public String getHcnVersion() {
		return _hcnversion;
	}

	public void setHcnVersion(String hcnVersion) {
		this._hcnversion = hcnVersion;
	}

	public Date getExpiryDate() {
		return _expirydate;
	}

	public void setExpiryDate(Date expiryDate) {
		this._expirydate = expiryDate;
	}

	public boolean isNewBorn() {
		return _newborn;
	}

	public void setNewBorn(boolean newBorn) {
		this._newborn = newBorn;
	}

	public String getHealthCardProvince() {
		return _healthcardprovince;
	}

	public void setHealthCardProvince(String healthCardProvince) {
		this._healthcardprovince = healthCardProvince;
	}

	public int getPatientExternalId() {
		return _patientexternalid;
	}

	public void setPatientExternalId(int patientExternalId) {
		this._patientexternalid = patientExternalId;
	}

	public String getMetaPhoneLastName() {
		return _metaphonelastname;
	}

	public void setMetaPhoneLastName(String metaPhoneLastName) {
		this._metaphonelastname = metaPhoneLastName;
	}

	public String getMetaPhoneFirstName() {
		return _metaphonefirstname;
	}

	public void setMetaPhoneFirstName(String metaPhoneFirstName) {
		this._metaphonefirstname = metaPhoneFirstName;
	}

	public String getMetaPhoneAlias1() {
		return _metaphonealias1;
	}

	public void setMetaPhoneAlias1(String metaPhoneAlias1) {
		this._metaphonealias1 = metaPhoneAlias1;
	}

	public String getMetaPhoneAlias2() {
		return _metaphonealias2;
	}

	public void setMetaPhoneAlias2(String metaPhoneAlias2) {
		this._metaphonealias2 = metaPhoneAlias2;
	}

	public String getSoundexLastName() {
		return _soundexlastname;
	}

	public void setSoundexLastName(String soundexLastName) {
		this._soundexlastname = soundexLastName;
	}

	public String getSoundexFirstName() {
		return _soundexfirstname;
	}

	public void setSoundexFirstName(String soundexFirstName) {
		this._soundexfirstname = soundexFirstName;
	}

	public String getSearchString1() {
		return _searchstring1;
	}

	public void setSearchString1(String searchString1) {
		this._searchstring1 = searchString1;
	}

	public String getSearchString2() {
		return _searchstring2;
	}

	public void setSearchString2(String searchString2) {
		this._searchstring2 = searchString2;
	}

	public String getSearchStringSoundsLike() {
		return _searchstringsoundslike;
	}

	public void setSearchStringSoundsLike(String searchStringSoundsLike) {
		this._searchstringsoundslike = searchStringSoundsLike;
	}

	public int getPatientDisplayId() {
		return _patientdisplayid;
	}

	public void setPatientDisplayId(int patientDisplayId) {
		this._patientdisplayid = patientDisplayId;
	}

	public Date getLastStatementDate() {
		return _laststatementdate;
	}

	public void setLastStatementDate(Date lastStatementDate) {
		this._laststatementdate = lastStatementDate;
	}

	public int getPortalStatus() {
		return _portalstatus;
	}

	public void setPortalStatus(int portalStatus) {
		this._portalstatus = portalStatus;
	}

}
