package com.kk.strutscrud.beans;

public class EmployeeBean {

	private int emp_id;
	
	private String emp_name;
	
	private String emp_email;
	
	private String emp_pass;
	
	private String emp_deg;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBean(int emp_id, String emp_name, String emp_email, String emp_pass, String emp_deg) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_pass = emp_pass;
		this.emp_deg = emp_deg;
	}

	@Override
	public String toString() {
		return "EmployeeBean [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_email=" + emp_email + ", emp_pass="
				+ emp_pass + ", emp_deg=" + emp_deg + "]";
	}
	
	
}
