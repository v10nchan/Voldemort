package com.nightingale.hl7.dto;

public class RefusalReason {
	
	private String identifier;
	private String text;
	private String ncs;
	private String altIdentifier;
	private String altText;
	private String altNCS;
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
	public String getNcs() {
		return ncs;
	}
	public void setNcs(String ncs) {
		this.ncs = ncs;
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
	public String getAltNCS() {
		return altNCS;
	}
	public void setAltNCS(String altNCS) {
		this.altNCS = altNCS;
	}
	
}
