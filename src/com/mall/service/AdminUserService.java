package com.mall.service;

import java.util.List;

import com.mall.bean.AdminUser;

public interface AdminUserService {
	public List<AdminUser> findAdminUserList();
	public void saveAdminUser();
	public void updateAdminUser();
	public void deleteAdminUser();
}
