package com.kk.strutscrud.actions;

import com.kk.strutscrud.dao.Admin;
import com.kk.strutscrud.dao.AdminImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{

	private static final long serialVersionUID = -146601914103585418L;
	private String emp_email;
	private String msg;
	Admin dao = new AdminImpl();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteUserDetails(emp_email);
			if (isDeleted > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
