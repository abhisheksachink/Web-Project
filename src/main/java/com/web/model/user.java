package com.web.model;

public class user {
	private String userId;
	private String phone;
	
	
	public user(String userId, String phone) {
		super();
		this.userId = userId;
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
