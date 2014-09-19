package com.nightingale.hl7.dto;

public class Name {
	
	private String surname;
	private String givenName;
	private String secondNameOrInitial;
	private String nameTypeCode;
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getSecondNameOrInitial() {
		return secondNameOrInitial;
	}
	public void setSecondNameOrInitial(String secondNameOrInitial) {
		this.secondNameOrInitial = secondNameOrInitial;
	}
	public String getNameTypeCode() {
		return nameTypeCode;
	}
	public void setNameTypeCode(String nameTypeCode) {
		this.nameTypeCode = nameTypeCode;
	}
	
}
