package com.amw.java.springbootcicd.controller.res;

public class MainResAPI {
	private String code;
	private String message;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getSuccessResponse() {
		this.code = "000";
		this.message  = "Success";
	}
	
	public void getFailResponse() {
		this.code = "004";
		this.message  = "Fail";
	}
}
