package com.nightingale.hl7.dto;

public class MSHBean {
	
	public static final String FIELD_SEPARATOR = "|";
	public static final String ENCODING_CHARACTERS = "^~\\&";
	public static final String SENDING_APP_NAMESPACE_ID = "NexiaEHR";
	public static final String MESSAGE_CODE = "VXU";
	public static final String MESSAGE_EVENT_TYPE ="V04";
	public static final String MESSAGE_STRUCTURE = "VXU_V04";
	public static final String VERSION_ID = "2.5.1";
	
	private String sendingAppNamespaceId;
	private String sendingAppUnivId;
	private String sendingAppUnivIdType;
	private String sendingFacilityNamespaceId;
	private String sendingFacilityUnivId;
	private String sendingFacilityUnivIdType;
	private String receivingAppNamespaceId;
	private String receivingAppUnivId;
	private String receivingAppUnivIdType;
	private String receivingFaclityNamespaceId;
	private String receivingFaclityUnivId;
	private String receivingFaclityUnivIdType;
	private String dateTimeOfMessage;
	private String messageControlId;
	private String processingId;
	private String acceptAckType;
	private String appAckType;
	
	public String getSendingAppNamespaceId() {
		return sendingAppNamespaceId;
	}
	public void setSendingAppNamespaceId(String sendingAppNamespaceId) {
		this.sendingAppNamespaceId = sendingAppNamespaceId;
	}
	public String getSendingAppUnivId() {
		return sendingAppUnivId;
	}
	public void setSendingAppUnivId(String sendingAppUnivId) {
		this.sendingAppUnivId = sendingAppUnivId;
	}
	public String getSendingAppUnivIdType() {
		return sendingAppUnivIdType;
	}
	public void setSendingAppUnivIdType(String sendingAppUnivIdType) {
		this.sendingAppUnivIdType = sendingAppUnivIdType;
	}
	public String getSendingFacilityNamespaceId() {
		return sendingFacilityNamespaceId;
	}
	public void setSendingFacilityNamespaceId(String sendingFacilityNamespaceId) {
		this.sendingFacilityNamespaceId = sendingFacilityNamespaceId;
	}
	public String getSendingFacilityUnivId() {
		return sendingFacilityUnivId;
	}
	public void setSendingFacilityUnivId(String sendingFacilityUnivId) {
		this.sendingFacilityUnivId = sendingFacilityUnivId;
	}
	public String getSendingFacilityUnivIdType() {
		return sendingFacilityUnivIdType;
	}
	public void setSendingFacilityUnivIdType(String sendingFacilityUnivIdType) {
		this.sendingFacilityUnivIdType = sendingFacilityUnivIdType;
	}
	public String getReceivingAppNamespaceId() {
		return receivingAppNamespaceId;
	}
	public void setReceivingAppNamespaceId(String receivingAppNamespaceId) {
		this.receivingAppNamespaceId = receivingAppNamespaceId;
	}
	public String getReceivingAppUnivId() {
		return receivingAppUnivId;
	}
	public void setReceivingAppUnivId(String receivingAppUnivId) {
		this.receivingAppUnivId = receivingAppUnivId;
	}
	public String getReceivingAppUnivIdType() {
		return receivingAppUnivIdType;
	}
	public void setReceivingAppUnivIdType(String receivingAppUnivIdType) {
		this.receivingAppUnivIdType = receivingAppUnivIdType;
	}
	public String getReceivingFaclityNamespaceId() {
		return receivingFaclityNamespaceId;
	}
	public void setReceivingFaclityNamespaceId(String receivingFaclityNamespaceId) {
		this.receivingFaclityNamespaceId = receivingFaclityNamespaceId;
	}
	public String getReceivingFaclityUnivId() {
		return receivingFaclityUnivId;
	}
	public void setReceivingFaclityUnivId(String receivingFaclityUnivId) {
		this.receivingFaclityUnivId = receivingFaclityUnivId;
	}
	public String getReceivingFaclityUnivIdType() {
		return receivingFaclityUnivIdType;
	}
	public void setReceivingFaclityUnivIdType(String receivingFaclityUnivIdType) {
		this.receivingFaclityUnivIdType = receivingFaclityUnivIdType;
	}
	public String getDateTimeOfMessage() {
		return dateTimeOfMessage;
	}
	public void setDateTimeOfMessage(String dateTimeOfMessage) {
		this.dateTimeOfMessage = dateTimeOfMessage;
	}
	public String getMessageControlId() {
		return messageControlId;
	}
	public void setMessageControlId(String messageControlId) {
		this.messageControlId = messageControlId;
	}
	public String getProcessingId() {
		return processingId;
	}
	public void setProcessingId(String processingId) {
		this.processingId = processingId;
	}
	public String getAcceptAckType() {
		return acceptAckType;
	}
	public void setAcceptAckType(String acceptAckType) {
		this.acceptAckType = acceptAckType;
	}
	public String getAppAckType() {
		return appAckType;
	}
	public void setAppAckType(String appAckType) {
		this.appAckType = appAckType;
	}
	
}
