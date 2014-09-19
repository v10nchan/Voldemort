package com.nightinagle.hl7.constants;

/**
 * Funding Eligibility Constant
 * @author ajayr
 *
 */
public class FundingEligibilityConstant {

    // funding eligibility code
    public static final int MEDICAL_ELIGIBILITY = 1;
    public static final int UNINSURED = 2;
    public static final int AMERICAN_INDIAN = 3;
    public static final int NOT_ELIGIBLE = 4;
    public static final int VARICELLA_INFECTION = 5;
    
    // funding eligibility description
    public static final String MEDICAL_ELIGIBILITY_VALUE = "Medicaid eligible";
    public static final String UNINSURED_VALUE = "Uninsured";
    public static final String AMERICAN_INDIAN_VALUE = "American Indian or Alaska Native";
    public static final String NOT_ELIGIBLE_VALUE = "Not Eligible";
    public static final String VARICELLA_INFECTION_VALUE = "Varicella infection";
}
