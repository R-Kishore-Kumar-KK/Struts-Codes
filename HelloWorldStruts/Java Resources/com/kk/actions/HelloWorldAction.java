package com.kk.actions;

public class HelloWorldAction {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloWorldAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloWorldAction(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorldAction [name=" + name + "]";
	}

	public String execute() throws Exception {
		return "Success";
	}
}
