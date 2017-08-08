package com.mall.bean;

public class Address {
	private String rec_name;
	private String rec_tel;
	private String rec_address;
	private User user;
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public String getRec_tel() {
		return rec_tel;
	}
	public void setRec_tel(String rec_tel) {
		this.rec_tel = rec_tel;
	}
	public String getRec_address() {
		return rec_address;
	}
	public void setRec_address(String rec_address) {
		this.rec_address = rec_address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
