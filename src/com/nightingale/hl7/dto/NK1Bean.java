package com.nightingale.hl7.dto;

import java.util.ArrayList;
import java.util.List;

public class NK1Bean {
	
	public static final String RELATIONSHIP_NCS = "HL70063";
	private String nk1Id;
	private List<Name> kinNameList = new ArrayList<Name>();
	private String relationshipIdentifier;
	private String relationshipText;
	private String relationshipAltIdentifier;
	private String relationshipAltText;
	private String relationshipAltNCS;
	private List<Address> addressList = new ArrayList<Address>();
	private List<Phone> phoneList = new ArrayList<Phone>();
	
	public String getNk1Id() {
		return nk1Id;
	}
	public void setNk1Id(String nk1Id) {
		this.nk1Id = nk1Id;
	}
	public List<Name> getKinNameList() {
		return kinNameList;
	}
	public void setKinNameList(List<Name> kinNameList) {
		this.kinNameList = kinNameList;
	}
	public String getRelationshipIdentifier() {
		return relationshipIdentifier;
	}
	public void setRelationshipIdentifier(String relationshipIdentifier) {
		this.relationshipIdentifier = relationshipIdentifier;
	}
	public String getRelationshipText() {
		return relationshipText;
	}
	public void setRelationshipText(String relationshipText) {
		this.relationshipText = relationshipText;
	}
	public String getRelationshipAltIdentifier() {
		return relationshipAltIdentifier;
	}
	public void setRelationshipAltIdentifier(String relationshipAltIdentifier) {
		this.relationshipAltIdentifier = relationshipAltIdentifier;
	}
	public String getRelationshipAltText() {
		return relationshipAltText;
	}
	public void setRelationshipAltText(String relationshipAltText) {
		this.relationshipAltText = relationshipAltText;
	}
	public String getRelationshipAltNCS() {
		return relationshipAltNCS;
	}
	public void setRelationshipAltNCS(String relationshipAltNCS) {
		this.relationshipAltNCS = relationshipAltNCS;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public List<Phone> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}
	
}
