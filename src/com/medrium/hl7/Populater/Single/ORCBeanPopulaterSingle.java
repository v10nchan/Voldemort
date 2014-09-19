/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author ajayr
 */
package com.medrium.hl7.Populater.Single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nightinagle.hl7.util.HL7GeneratorConstant;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.dto.ORCBean;

/**
 * Class to populate ORC Bean
 * @author ajayr
 */
public class ORCBeanPopulaterSingle {

	private final static Logger LOGGER = LoggerFactory.getLogger(ORCBeanPopulaterSingle.class);
	public ORCBean populateORCBeanSingle(DBDataBean dataBean, int count) {
		LOGGER.info("\n Entering into populateORCBean method");
		ORCBean orcBean = new ORCBean();
		int i=0;
		// fetching provider for patient
		if(dataBean.getPatientProviderInfoList()!=null || dataBean.getPatientProviderInfoList().size()!=0) {
			for(int j=0; j<dataBean.getPatientProviderInfoList().size(); j++) {
				i++;
			}
			i--;
			orcBean.setFillerOrderEntityIdentifier(HL7GeneratorConstant.FILLER_ORDER_ENTITY_IDENTIFIER+System.currentTimeMillis());
			orcBean.setFillerOrderNamespaceId(HL7GeneratorConstant.FILLER_ORDER_NAMESPACE_ID);
			if(dataBean.getPatientProviderInfoList()!=null && dataBean.getPatientProviderInfoList().size()!=0) {
				orcBean.setEnteredByIdNumber(String.valueOf(dataBean.getPatientProviderInfoList().get(i).getProvid()));
				orcBean.setEnteredBySurname(dataBean.getPatientProviderInfoList().get(i).getLastname());
				orcBean.setEnteredByGivenName(dataBean.getPatientProviderInfoList().get(i).getFirstname());
				orcBean.setEnteredByInitial(dataBean.getPatientProviderInfoList().get(i).getMiddlename());
				orcBean.setOrderingProvIdNumber(String.valueOf(dataBean.getPatientProviderInfoList().get(i).getProvid()));
				orcBean.setOrderingProvSurname(dataBean.getPatientProviderInfoList().get(i).getLastname());
				orcBean.setOrderingProvGivenName(dataBean.getPatientProviderInfoList().get(i).getFirstname());
			}
			
			orcBean.setEnteredByNamespaceId(HL7GeneratorConstant.NAMESPACE_ID);
			orcBean.setOrderingProvNamespaceId(HL7GeneratorConstant.NAMESPACE_ID);
			orcBean.setNameTypeCode(HL7GeneratorConstant.TYPE_CODE);
		}
		
		LOGGER.info("\n Exiting from populateORCBean method");
		return orcBean;
	}
}
