package com.nightingale.hl7.service;

import com.medrium.persistence.PersistentManager;
import com.nightinagle.hl7.serviceImpl.ImmunizationHL7BeanPopulator;
import com.nightingale.hl7.dto.HL7Type;

public abstract class HL7BeanPopulatorFactory {
	public static HL7BeanPopulator getHL7BeanPopulator(HL7Type type, PersistentManager persistentManager){
		if(HL7Type.IMMUNIZATION.equals(type)){
			return new ImmunizationHL7BeanPopulator(persistentManager, type);
		}
		return null;
	}
}
