package com.nightingale.hl7.service;

import com.nightinagle.hl7.serviceImpl.ImmunizationHL7Generator;
import com.nightingale.hl7.dto.HL7Type;

public abstract class HL7GeneratorFactory {
	
	public static AbstractHL7Generator getHL7GeneratorInstace(HL7Type type){
		if(HL7Type.IMMUNIZATION.equals(type)){
			return new ImmunizationHL7Generator(type);
		}
		return null;
	}
}
