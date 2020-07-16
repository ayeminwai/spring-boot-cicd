package com.amw.java.springbootcicd.controller.req;

public class MainReqAPI {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public MainReqAPI(String msg) {
		this.message = msg;
	}
}
