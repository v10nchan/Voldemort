package com.nightingale.hl7.dto;

public class Phone {
	
	private String telecomUseCode;
	private String telecomEquipType;
	private String emailAdd;
	private String areaOrCityCode;
	private String localNumber;
	
	public String getTelecomUseCode() {
		return telecomUseCode;
	}
	public void setTelecomUseCode(String telecomUseCode) {
		this.telecomUseCode = telecomUseCode;
	}
	public String getTelecomEquipType() {
		return telecomEquipType;
	}
	public void setTelecomEquipType(String telecomEquipType) {
		this.telecomEquipType = telecomEquipType;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getAreaOrCityCode() {
		return areaOrCityCode;
	}
	public void setAreaOrCityCode(String areaOrCityCode) {
		this.areaOrCityCode = areaOrCityCode;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	
}
