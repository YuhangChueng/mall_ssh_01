package com.mall.bean;

public class AdminUser {
	private int admin_id;
	private String admin_name;
	private String admin_psw;
	private String lastLoginTime;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_psw() {
		return admin_psw;
	}
	public void setAdmin_psw(String admin_psw) {
		this.admin_psw = admin_psw;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
}
