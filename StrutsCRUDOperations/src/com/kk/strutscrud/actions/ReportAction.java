package com.kk.strutscrud.actions;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kk.strutscrud.beans.EmployeeBean;
import com.kk.strutscrud.dao.Admin;
import com.kk.strutscrud.dao.AdminImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{

	private static final long serialVersionUID = 6329394260276112660L;
	ResultSet rs = null;
	EmployeeBean bean = null;
	List<EmployeeBean> beanList = null;
	Admin admin = new AdminImpl();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<EmployeeBean>();
			rs = admin.report();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					bean = new EmployeeBean();
					bean.setEmp_id(i);
					bean.setEmp_name(rs.getString("EMP_NAME"));
					bean.setEmp_email(rs.getString("EMP_EMAIL"));
					bean.setEmp_pass(rs.getString("EMP_PASS").replaceAll("(?s).", "*"));
					bean.setEmp_deg(rs.getString("EMP_DEG"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REPORT";
	}

	public List<EmployeeBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<EmployeeBean> beanList) {
		this.beanList = beanList;
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	
}
