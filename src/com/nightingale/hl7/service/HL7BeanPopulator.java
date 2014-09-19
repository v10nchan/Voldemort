package com.nightingale.hl7.service;

import com.nightingale.hl7.dto.HL7Bean;

public interface HL7BeanPopulator {
	public abstract HL7Bean getHL7Bean(int patientId, int accountId, int patientimmunizationid, int flag);
}
