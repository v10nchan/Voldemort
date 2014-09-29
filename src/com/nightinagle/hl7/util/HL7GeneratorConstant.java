package com.nightinagle.hl7.util;

public class HL7GeneratorConstant {

	// Constant for MSH Bean
	public static final String SENDING_APP_NAMESPACE_ID="Nightingale EHR";
	public static final String SENDING_FACILITY_NAMESPACE_ID="X68";
	public static final String RECEIVING_FACLITY_NAMESPACE_ID="Naxia";
	public static final String MESSAGE_CONTROL_ID="NIST-IXZ-TC-VXU-XXX.XX";
	public static final String PROCESSING_ID="P";
	public static final String ACCEPT_ACK_TYPE="AL";
	public static final String APP_ACK_TYPE="ER";
	
	// Constant for PID Bean
	public static final String ASSIGN_AUTH_NAMESPACE_ID="NIST MPI";
	public static final String TYPE_CODE="L";
	public static final String TELECOM_USE_CODE="PRN";
	public static final String TELECOM_EQUIP_TYPE="PH";
	public static final String IDENTIFIER_TYPE_CODE="MR";
	public static final String TELECOM_USE_CODE_NET="NET";
	public static final String IDENTIFIER_TYPE_SS="SS";
	
	// Constant for NK1 Bean
	public static final String NK1_ID="1";
	
	// Constant for PD1 Bean
	//public static final String PUBLICITY_CODE_IDENTIFIER="02";
	public static final String PUBLICITY_CODE_TEXT="Reminder/Recall - any method";
	
	//Constant for ORC Bean
	public static final String FILLER_ORDER_ENTITY_IDENTIFIER="IZ-";
	
	// Constant for RXR Bean
	public static final String NAMESPACE_ID="NIST-AA-1";
	public static final String FILLER_ORDER_NAMESPACE_ID="NDA";
	public static final String ADMIN_SITE_NCS="HL70163";
	
	// Constant for RXA Bean
	public static final String ADMINSTERED_UNIT_NCS="UCUM";
	public static final String COMPLETION_STATUS="CP";
	public static final String ACTION_CODE="A";
	public static final String REFUSED_STATUS="RE";
	public static final String REFUSED_STATUS_NA="NA";
	
	//constant for OBX Bean
	public static final String OBSERVATION_NCS="LN";
	public static final String OBSERVATION_RESULT_STATUS="F";
	public static final String OBSERVATION_METHOD_TEXT="Eligibility captured at the immunization level";
	public static final String OBSERVATION_METHOD_NCS="CDCPHINVS";
	

}
