package com.nightingale.hl7.dto;

public class Race {
	
	//Race->NameOfCodingSystem
	public static final String RACE_NCS = "HL70005";
	private String identifier;
	private String text;
	private String altIdentifier;
	private String altText;
	private String altRaceNCS;
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAltIdentifier() {
		return altIdentifier;
	}
	public void setAltIdentifier(String altIdentifier) {
		this.altIdentifier = altIdentifier;
	}
	public String getAltText() {
		return altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}
	public String getAltRaceNCS() {
		return altRaceNCS;
	}
	public void setAltRaceNCS(String altRaceNCS) {
		this.altRaceNCS = altRaceNCS;
	}
	
}
