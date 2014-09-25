package com.nightinagle.hl7.util;

import com.nightinagle.hl7.constants.ConsentConstant;
import com.nightinagle.hl7.constants.CountryConstant;
import com.nightinagle.hl7.constants.DosageConstant;
import com.nightinagle.hl7.constants.EthinicityConstant;
import com.nightinagle.hl7.constants.FundingEligibilityConstant;
import com.nightinagle.hl7.constants.PatientStatusConstant;
import com.nightinagle.hl7.constants.RaceConstants;
import com.nightinagle.hl7.constants.RelationshipConstant;
import com.nightinagle.hl7.constants.TitleConstant;

public class HL7Util {
	
	public static String getRaceIdentifier(int raceId){
		switch(raceId){
			case RaceConstants.RACE_AMERICAN_INDIAN: 
				return RaceConstants.CCD_RACE_AMERICAN_INDIAN;
			case RaceConstants.RACE_ASIAN:
				return RaceConstants.CCD_RACE_ASIAN;
			case RaceConstants.RACE_BLACK:
				return RaceConstants.CCD_RACE_BLACK;
			case RaceConstants.RACE_HAWAIIAN:
				return RaceConstants.CCD_RACE_HAWAIIAN;
			case RaceConstants.RACE_OTHER:
				return RaceConstants.CCD_RACE_OTHER;
			case RaceConstants.RACE_WHITE:
				return RaceConstants.CCD_RACE_WHITE;
		}
		return null;
	}
	
	public static String getRaceDescription(int raceId){
		
		switch(raceId){
			case RaceConstants.RACE_AMERICAN_INDIAN: 
				return RaceConstants.RACE_AMERICAN_INDIAN_VALUE;
			case RaceConstants.RACE_ASIAN:
				return RaceConstants.RACE_ASIAN_VALUE;
			case RaceConstants.RACE_BLACK:
				return RaceConstants.RACE_BLACK_VALUE;
			case RaceConstants.RACE_HAWAIIAN:
				return RaceConstants.RACE_HAWAIIAN_VALUE;
			case RaceConstants.RACE_OTHER:
				return RaceConstants.RACE_OTHER_VALUE;
			case RaceConstants.RACE_WHITE:
				return RaceConstants.RACE_WHITE_VALUE;
		}
		return null;
	}
	
	public static String getEthinicityDescription(int ehinicityId){
		
		switch(ehinicityId){
			case EthinicityConstant.ETHINICITY_HISPANIC: 
				return EthinicityConstant.ETHINICITY_HISPANIC_VALUE;
			case EthinicityConstant.ETHINICITY_NON_HISPANIC:
				return EthinicityConstant.ETHINICITY_NON_HISPANIC_VALUE;
		}
		return null;
	}
	
	public static String getRelationship(int relationshipId){
		
		switch(relationshipId){
			case RelationshipConstant.MOTHER_ID: 
				return RelationshipConstant.MOTHER_ID_VALUE;
			case RelationshipConstant.FATHAER_ID:
				return RelationshipConstant.FATHAER_ID_VALUE;
			case RelationshipConstant.SISTER_ID:
				return RelationshipConstant.SISTER_ID_VALUE;
			case RelationshipConstant.BROTHER_ID:
				return RelationshipConstant.BROTHER_ID_VALUE;
			case RelationshipConstant.DAUGHTER_ID:
				return RelationshipConstant.DAUGHTER_ID_VALUE;
			case RelationshipConstant.SON_ID:
				return RelationshipConstant.SON_ID_VALUE;
			case RelationshipConstant.FRIEND_ID:
				return RelationshipConstant.FRIEND_ID_VALUE;
		}
		return null;
	}
	
	public static String getDosageDescription(int dosageId){
		
		switch(dosageId){
			case DosageConstant.DOSAGE_CC_ID: 
				return DosageConstant.DOSAGE_CC_VALUE;
			case DosageConstant.DOSAGE_ML_ID:
				return DosageConstant.DOSAGE_ML_VALUE;
			case DosageConstant.DOSAGE_L_ID:
				return DosageConstant.DOSAGE_L_VALUE;
			case DosageConstant.DOSAGE_UNITS_ID:
				return DosageConstant.DOSAGE_UNITS_VALUE;
			case DosageConstant.DOSAGE_MG_ID:
				return DosageConstant.DOSAGE_MG_VALUE;
			case DosageConstant.DOSAGE_G_ID:
				return DosageConstant.DOSAGE_G_VALUE;
		}
		return null;
	}
	
	public static String getPatientStatus(int statusId){
		
		switch(statusId){
			case PatientStatusConstant.ACTIVE_ID: 
				return PatientStatusConstant.ACTIVE_VALUE;
			case PatientStatusConstant.INACTIVE_ID:
				return PatientStatusConstant.INACTIVE_VALUE;
			case PatientStatusConstant.DECEASED_ID:
				return PatientStatusConstant.DECEASED_VALUE;
		}
		return null;
	}
	
	public static String getFundingDescription(int fundingEligibilityId){
		
		switch(fundingEligibilityId){
			case FundingEligibilityConstant.MEDICAL_ELIGIBILITY: 
				return FundingEligibilityConstant.MEDICAL_ELIGIBILITY_VALUE;
			case FundingEligibilityConstant.UNINSURED:
				return FundingEligibilityConstant.UNINSURED_VALUE;
			case FundingEligibilityConstant.AMERICAN_INDIAN:
				return FundingEligibilityConstant.AMERICAN_INDIAN_VALUE;
			case FundingEligibilityConstant.NOT_ELIGIBLE:
				return FundingEligibilityConstant.NOT_ELIGIBLE_VALUE;
			case FundingEligibilityConstant.VARICELLA_INFECTION:
                return FundingEligibilityConstant.VARICELLA_INFECTION_VALUE;
			case FundingEligibilityConstant.VFC_ELIGIBLE:
                return FundingEligibilityConstant.VFC_ELIGIBLE_VALUE;
		}
		return null;
	}
	
	public static String getCountryName(int countryId){
      // TODO: Need to add more switch case  
        switch(countryId){
            case CountryConstant.USA_ID: 
                return CountryConstant.USA_VALUE;
            case CountryConstant.CHINA_ID: 
                return CountryConstant.CHINA_VALUE;
            case CountryConstant.CANADA_ID: 
                return CountryConstant.CANADA_VALUE;
            case CountryConstant.AALAND_ID: 
                return CountryConstant.AALAND_VALUE;
            case CountryConstant.AFGHANISTAN_ID: 
                return CountryConstant.AFGHANISTAN_VALUE;
            case CountryConstant.ALBANIA_ID: 
                return CountryConstant.ALBANIA_VALUE;
            case CountryConstant.ALGERIA_ID: 
                return CountryConstant.ALGERIA_VALUE;
            case CountryConstant.AMERICA_SAMOA_ID: 
                return CountryConstant.AMERICA_SAMOA_VALUE;
            case CountryConstant.ANDORRA_ID: 
                return CountryConstant.ANDORRA_VALUE;
            case CountryConstant.ANGOLA_ID: 
                return CountryConstant.ANGOLA_VALUE;
            case CountryConstant.ANGUILLA_ID: 
                return CountryConstant.ANGUILLA_VALUE;
            case CountryConstant.ANTARCTICA_ID: 
                return CountryConstant.ANTARCTICA_VALUE;
            case CountryConstant.ANTIGUA_BAR_ID: 
                return CountryConstant.ANTIGUA_BAR_VALUE;
            case CountryConstant.ARGENTINA_ID: 
                return CountryConstant.ARGENTINA_VALUE;
            case CountryConstant.ARMENIA_ID: 
                return CountryConstant.ARMENIA_VALUE;
            case CountryConstant.AUSTRALIA_ID: 
                return CountryConstant.AUSTRALIA_VALUE;
            case CountryConstant.AUSTRIA_ID: 
                return CountryConstant.AUSTRIA_VALUE;
            case CountryConstant.AZERBAIJAN_ID: 
                return CountryConstant.AZERBAIJAN_VALUE;
            case CountryConstant.BAHAMAS_ID: 
                return CountryConstant.BAHAMAS_VALUE;
            case CountryConstant.BAHRAIN_ID: 
                return CountryConstant.BAHRAIN_VALUE;
            case CountryConstant.ARUBA_ID: 
                return CountryConstant.ARUBA_VALUE;
            case CountryConstant.INDIA_ID: 
                return CountryConstant.INDIA_VALUE;
            case CountryConstant.PAKISTAN_ID: 
                return CountryConstant.PAKISTAN_VALUE;
        }
        return null;
    }
public static String getTitleDescription(int titleId){
        
        switch(titleId){
            case TitleConstant.TITLE_MR_CODE: 
                return TitleConstant.TITLE_MR_VALUE;
            case TitleConstant.TITLE_MS_CODE:
                return TitleConstant.TITLE_MS_VALUE;
            case TitleConstant.TITLE_MRS_CODE:
                return TitleConstant.TITLE_MRS_VALUE;
            case TitleConstant.TITLE_MISS_CODE:
                return TitleConstant.TITLE_MISS_VALUE;
            case TitleConstant.TITLE_DR_CODE:
                return TitleConstant.TITLE_DR_VALUE;
        }
        return null;
    }
public static String getConsentDescription(int consentId){
    
    switch(consentId){
        case ConsentConstant.NO_CONSENT_REQUIRED_CODE: 
            return ConsentConstant.NO_CONSENT_REQUIRED_VALUE;
        case ConsentConstant.ONE_TIME_CONSENT_CODE:
            return ConsentConstant.ONE_TIME_CONSENT_CODE_VALUE;
        case ConsentConstant.ONE_TIME_CONSENT_PENDING_CODE:
            return ConsentConstant.ONE_TIME_CONSENT_PENDING_CODE_VALUE;
    }
    return null;
}

}
