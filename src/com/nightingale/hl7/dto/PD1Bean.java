package com.nightingale.hl7.dto;

public class PD1Bean {
	//Name Of Coding System
	public static final String PUBLICITY_CODE_NCS = "HL70215";
	
	private String publicityCodeIdentifier;
	private String publicityCodeText;
	private String publicityCodeAltIdentifier;
	private String publicityCodeAltText;
	private String publicityCodeAltNCS;
	private String protectionIndicator;
	private String protectionIndicatorEffectiveDate;
	private String immunizationRegStatus;
	private String immunizationRegStatusEffectiveDate;
	private String publicityCodeEffectiveDate;
	
	public String getPublicityCodeIdentifier() {
		return publicityCodeIdentifier;
	}
	public void setPublicityCodeIdentifier(String publicityCodeIdentifier) {
		this.publicityCodeIdentifier = publicityCodeIdentifier;
	}
	public String getPublicityCodeText() {
		return publicityCodeText;
	}
	public void setPublicityCodeText(String publicityCodeText) {
		this.publicityCodeText = publicityCodeText;
	}
	public String getPublicityCodeAltIdentifier() {
		return publicityCodeAltIdentifier;
	}
	public void setPublicityCodeAltIdentifier(String publicityCodeAltIdentifier) {
		this.publicityCodeAltIdentifier = publicityCodeAltIdentifier;
	}
	public String getPublicityCodeAltText() {
		return publicityCodeAltText;
	}
	public void setPublicityCodeAltText(String publicityCodeAltText) {
		this.publicityCodeAltText = publicityCodeAltText;
	}
	public String getPublicityCodeAltNCS() {
		return publicityCodeAltNCS;
	}
	public void setPublicityCodeAltNCS(String publicityCodeAltNCS) {
		this.publicityCodeAltNCS = publicityCodeAltNCS;
	}
	public String getProtectionIndicator() {
		return protectionIndicator;
	}
	public void setProtectionIndicator(String protectionIndicator) {
		this.protectionIndicator = protectionIndicator;
	}
	public String getProtectionIndicatorEffectiveDate() {
		return protectionIndicatorEffectiveDate;
	}
	public void setProtectionIndicatorEffectiveDate(
			String protectionIndicatorEffectiveDate) {
		this.protectionIndicatorEffectiveDate = protectionIndicatorEffectiveDate;
	}
	public String getImmunizationRegStatus() {
		return immunizationRegStatus;
	}
	public void setImmunizationRegStatus(String immunizationRegStatus) {
		this.immunizationRegStatus = immunizationRegStatus;
	}
	public String getImmunizationRegStatusEffectiveDate() {
		return immunizationRegStatusEffectiveDate;
	}
	public void setImmunizationRegStatusEffectiveDate(
			String immunizationRegStatusEffectiveDate) {
		this.immunizationRegStatusEffectiveDate = immunizationRegStatusEffectiveDate;
	}
	public String getPublicityCodeEffectiveDate() {
		return publicityCodeEffectiveDate;
	}
	public void setPublicityCodeEffectiveDate(String publicityCodeEffectiveDate) {
		this.publicityCodeEffectiveDate = publicityCodeEffectiveDate;
	}
	
}
