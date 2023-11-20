package com.kk.actions;

import com.kk.admin.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction {

	private int id;
	private String name;
	private String email;
	private String city;
	
	public String execute() throws Exception {

		int var = Admin.register(this);
		if (var > 0) {
			return "SUCCESS";
		} else {
			return "input";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public RegisterAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterAction(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}

	@Override
	public String toString() {
		return "RegisterAction [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
