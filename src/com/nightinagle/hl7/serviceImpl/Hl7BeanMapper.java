/*
 *
 * Copyright 2013 by Medrium, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Nightingale Informatix Corp.
 *
 * @author sudhakars
 */
package com.nightinagle.hl7.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.medrium.hl7.Populater.MSHBeanPopulater;
import com.medrium.hl7.Populater.NK1BeanPopulater;
import com.medrium.hl7.Populater.OBXBeanPopulater;
import com.medrium.hl7.Populater.ORCBeanPopulater;
import com.medrium.hl7.Populater.PD1BeanPopulater;
import com.medrium.hl7.Populater.PIDBeanPopulater;
import com.medrium.hl7.Populater.RXABeanPopulater;
import com.medrium.hl7.Populater.RXRBeanPopulater;
import com.medrium.hl7.Populater.Single.OBXBeanPopulaterSingle;
import com.medrium.hl7.Populater.Single.ORCBeanPopulaterSingle;
import com.medrium.hl7.Populater.Single.RXABeanPopulaterSingle;
import com.medrium.hl7.Populater.Single.RXRBeanPopulaterSingle;
import com.nightingale.hl7.daoBeans.DBDataBean;
import com.nightingale.hl7.daoBeans.PatientImmunization;
import com.nightingale.hl7.dto.HL7Bean;
import com.nightingale.hl7.dto.MSHBean;
import com.nightingale.hl7.dto.NK1Bean;
import com.nightingale.hl7.dto.OBXBean;
import com.nightingale.hl7.dto.ORCBean;
import com.nightingale.hl7.dto.OrderBean;
import com.nightingale.hl7.dto.PD1Bean;
import com.nightingale.hl7.dto.PIDBean;
import com.nightingale.hl7.dto.RXABean;
import com.nightingale.hl7.dto.RXRBean;

/**
 * Class to invoke different bean populater
 * @author ajayr
 *
 */
public class Hl7BeanMapper {

	private final static Logger LOGGER = LoggerFactory.getLogger(Hl7BeanMapper.class);
	
	public HL7Bean mapToHL7Bean(DBDataBean dataBean, int flag) {
		
		LOGGER.info("\n Inside MapToHL7Bean Method");

		HL7Bean hl7Bean = new HL7Bean();
		int count = 0;

		MSHBeanPopulater mshBeanPopulater = new MSHBeanPopulater();
		MSHBean mshBean = mshBeanPopulater.populateMSHBean(dataBean, count);
		hl7Bean.setMshBean(mshBean);

		PIDBeanPopulater pidBeanPopulater =new PIDBeanPopulater();
		PIDBean pidBean = pidBeanPopulater.populatePIDBean(dataBean, count);
		hl7Bean.setPidBean(pidBean);

		PD1BeanPopulater pd1BeanPopulater = new PD1BeanPopulater();
		PD1Bean pd1Bean = pd1BeanPopulater.populatePD1Bean(dataBean, count);
		hl7Bean.setPd1Bean(pd1Bean);

		NK1BeanPopulater nk1BeanPopulater = new NK1BeanPopulater();
		List<NK1Bean> nk1BeanList = nk1BeanPopulater.populateNK1Bean(dataBean, count);
		hl7Bean.setNk1BeanList(nk1BeanList);
		
		if(flag == 1) {
		    List<OrderBean> orderBeanList = populateOderBeanList(dataBean);
	        hl7Bean.setOrderBeanList(orderBeanList);
		}
		else {
		    List<OrderBean> orderBeanListSingle = populateOderBeanListSingle(dataBean);
            hl7Bean.setOrderBeanList(orderBeanListSingle);
		}

		return hl7Bean;
	}

	private List<OrderBean> populateOderBeanList(DBDataBean dataBean) {

		LOGGER.info("\n Inside PopulateOderBeanList Method");
		
		List<OrderBean> orderBeanList = new ArrayList<OrderBean>();
		int count = 0;
		// condition for mutiple Immunization
		for(PatientImmunization patientImmunization : dataBean.getPatientImmunizationsList()){
			
			OrderBean orderBean = new OrderBean();
	
			ORCBeanPopulater orcBeanPopulater = new ORCBeanPopulater();
			ORCBean orcBean = orcBeanPopulater.populateORCBean(dataBean, count);
			orderBean.setOrcBean(orcBean);
	
			RXABeanPopulater rxaBeanPopulater = new RXABeanPopulater();
			RXABean rxaBean = rxaBeanPopulater.populateRXABean(dataBean, count);
			orderBean.setRxaBean(rxaBean);
	
			RXRBeanPopulater rxrBeanPopulater = new RXRBeanPopulater();
			RXRBean rxrBean = rxrBeanPopulater.populateRXRBean(dataBean, count);
			orderBean.setRxrBean(rxrBean);
	
			OBXBeanPopulater obxBeanPopulater = new OBXBeanPopulater();
			List<OBXBean> obxBeanList = obxBeanPopulater.populateOBXBean(dataBean, count);
			orderBean.setObxBeanList(obxBeanList);
	
			orderBeanList.add(orderBean);
			count++;
		}
		return orderBeanList;
	}

	private List<OrderBean> populateOderBeanListSingle(DBDataBean dataBean) {

        LOGGER.info("\n Inside PopulateOderBeanList Method");
        
        List<OrderBean> orderBeanList = new ArrayList<OrderBean>();
        int count = 0;
            
            OrderBean orderBean = new OrderBean();
    
            ORCBeanPopulaterSingle orcBeanPopulaterSingle = new ORCBeanPopulaterSingle();
            ORCBean orcBeanSingle = orcBeanPopulaterSingle.populateORCBeanSingle(dataBean, count);
            orderBean.setOrcBean(orcBeanSingle);
    
            RXABeanPopulaterSingle rxaBeanPopulaterSingle = new RXABeanPopulaterSingle();
            RXABean rxaBeanSingle = rxaBeanPopulaterSingle.populateRXABeanSingle(dataBean, count);
            orderBean.setRxaBean(rxaBeanSingle);
    
            RXRBeanPopulaterSingle rxrBeanPopulaterSingle = new RXRBeanPopulaterSingle();
            RXRBean rxrBeanSingle = rxrBeanPopulaterSingle.populateRXRBeanSingle(dataBean, count);
            orderBean.setRxrBean(rxrBeanSingle);
    
            OBXBeanPopulaterSingle obxBeanPopulaterSingle = new OBXBeanPopulaterSingle();
            List<OBXBean> obxBeanListSingle = obxBeanPopulaterSingle.populateOBXBeanSingle(dataBean, count);
            orderBean.setObxBeanList(obxBeanListSingle);
    
            orderBeanList.add(orderBean);
            count++;
            
        return orderBeanList;
    }
}
