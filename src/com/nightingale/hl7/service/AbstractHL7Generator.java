package com.nightingale.hl7.service;

import com.nightingale.hl7.dto.HL7Bean;
import com.nightingale.hl7.dto.HL7Type;

public interface AbstractHL7Generator {
	
	public String generateHL7Message(HL7Bean hl7Bean, HL7Type type);
	
}
