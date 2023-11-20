package com.kk.strutscrud.actions;

import java.sql.ResultSet;

import com.kk.strutscrud.dao.Admin;
import com.kk.strutscrud.dao.AdminImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{

	private static final long serialVersionUID = -1905974197186620917L;
	private String emp_name = "";
	private String emp_email = "";
	private String emp_pass = "";
	private String emp_deg = "";
	private String emp_emailhidden = "";
	private String msg = "";
	ResultSet rs = null;
	Admin dao = new AdminImpl();
	String submitType;

	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = dao.fetchUserDetails(emp_email.trim());
				if (rs != null) {
					while (rs.next()) {
						emp_name = rs.getString("EMP_NAME");
						emp_email = rs.getString("EMP_EMAIL");
						emp_pass = rs.getString("EMP_PASS");
						emp_deg = rs.getString("EMP_DEG");
					}
				}
			} else {
				int i = dao.updateUserDetails(emp_name, emp_email, emp_pass, emp_deg, emp_emailhidden);
				if (i > 0) {
					msg = "Record Updated Successfuly";
				} else {
					msg = "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_pass() {
		return emp_pass;
	}

	public void setEmp_pass(String emp_pass) {
		this.emp_pass = emp_pass;
	}

	public String getEmp_deg() {
		return emp_deg;
	}

	public void setEmp_deg(String emp_deg) {
		this.emp_deg = emp_deg;
	}

	public String getEmp_emailhidden() {
		return emp_emailhidden;
	}

	public void setEmp_emailhidden(String emp_emailhidden) {
		this.emp_emailhidden = emp_emailhidden;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}
	
	
}
