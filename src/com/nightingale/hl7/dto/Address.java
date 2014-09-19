package com.nightingale.hl7.dto;

public class Address {

	private String streetAddress;
	private String otherDesignation;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String addressType;
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getOtherDesignation() {
		return otherDesignation;
	}
	public void setOtherDesignation(String otherDesignation) {
		this.otherDesignation = otherDesignation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
}
