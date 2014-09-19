package com.nightingale.hl7.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderBean {

	private ORCBean orcBean;
	private RXABean rxaBean;
	private RXRBean rxrBean;
	private List<OBXBean> obxBeanList = new ArrayList<OBXBean>();
	private NTEBean nteBean;
	
	public ORCBean getOrcBean() {
		return orcBean;
	}
	public void setOrcBean(ORCBean orcBean) {
		this.orcBean = orcBean;
	}
	public RXABean getRxaBean() {
		return rxaBean;
	}
	public void setRxaBean(RXABean rxaBean) {
		this.rxaBean = rxaBean;
	}
	public RXRBean getRxrBean() {
		return rxrBean;
	}
	public void setRxrBean(RXRBean rxrBean) {
		this.rxrBean = rxrBean;
	}
	public List<OBXBean> getObxBeanList() {
		return obxBeanList;
	}
	public void setObxBeanList(List<OBXBean> obxBeanList) {
		this.obxBeanList = obxBeanList;
	}
	public NTEBean getNteBean() {
		return nteBean;
	}
	public void setNteBean(NTEBean nteBean) {
		this.nteBean = nteBean;
	}
	
}
