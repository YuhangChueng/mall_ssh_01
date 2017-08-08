package com.mall.service.impl;

import java.util.List;

import com.mall.bean.AdminUser;
import com.mall.dao.AdminUserDao;
import com.mall.service.AdminUserService;

public class AdminUserServiceImpl implements AdminUserService{
	
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	@Override
	public List<AdminUser> findAdminUserList() {
		List<AdminUser> ls= adminUserDao.findAdminUserList();
		return ls;
	}

	@Override
	public void saveAdminUser() {
		
		
	}

	@Override
	public void updateAdminUser() {
		
		
	}

	@Override
	public void deleteAdminUser() {
		
		
	}

}
