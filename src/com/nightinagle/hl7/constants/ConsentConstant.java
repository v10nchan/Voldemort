package com.nightinagle.hl7.constants;

public class ConsentConstant {
	// Consent Constant
	    public static final int NO_CONSENT_REQUIRED_CODE = 1;
	    public static final int ONE_TIME_CONSENT_CODE = 2;
	    public static final int ONE_TIME_CONSENT_PENDING_CODE = 3;
	   // public static final int VERBAL_CONSENT_CODE = 4;
	    
	// Consent Value
	    public static final String NO_CONSENT_REQUIRED_VALUE = "Print(30 days)";
		public static final String ONE_TIME_CONSENT_CODE_VALUE = "E-Sign & save(30 days)";
		public static final String ONE_TIME_CONSENT_PENDING_CODE_VALUE = "Upload & save(30 days)";
		//public static final String VERBAL_CONSENT_CODE_VALUE = "V";
}
