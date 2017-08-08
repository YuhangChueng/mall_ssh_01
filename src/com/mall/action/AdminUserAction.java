package com.mall.action;

import java.util.List;

import com.mall.bean.AdminUser;
import com.mall.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport{
	
	private AdminUserService adminUserService;

	private List<AdminUser> data;
	
	public List<AdminUser> getData() {
		return data;
	}

	public void setData(List<AdminUser> data) {
		this.data = data;
	}

	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	@Override
	public String execute() throws Exception {
		data = adminUserService.findAdminUserList();
		return SUCCESS;
	}

	
}
