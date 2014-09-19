package com.nightingale.hl7.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is to be used for getting all the info from the DB,
 * to generate HL7 message
 * @author sudhakars
 * date 23/01/2014
 */
public class HL7Bean {
	
	private MSHBean mshBean;
	private PIDBean pidBean;
	private PD1Bean pd1Bean;
	private List<NK1Bean> nk1BeanList = new ArrayList<NK1Bean>();
	private List<OrderBean> orderBeanList = new ArrayList<OrderBean>();
	
	public MSHBean getMshBean() {
		return mshBean;
	}
	public void setMshBean(MSHBean mshBean) {
		this.mshBean = mshBean;
	}
	public PIDBean getPidBean() {
		return pidBean;
	}
	public void setPidBean(PIDBean pidBean) {
		this.pidBean = pidBean;
	}
	public PD1Bean getPd1Bean() {
		return pd1Bean;
	}
	public void setPd1Bean(PD1Bean pd1Bean) {
		this.pd1Bean = pd1Bean;
	}
	public List<NK1Bean> getNk1BeanList() {
		return nk1BeanList;
	}
	public void setNk1BeanList(List<NK1Bean> nk1BeanList) {
		this.nk1BeanList = nk1BeanList;
	}
	public List<OrderBean> getOrderBeanList() {
		return orderBeanList;
	}
	public void setOrderBeanList(List<OrderBean> orderBeanList) {
		this.orderBeanList = orderBeanList;
	}
	
}
