package com.mall.dao;

import java.util.List;

import com.mall.bean.AdminUser;

public interface AdminUserDao {
	public List<AdminUser> findAdminUserList();
	public void saveAdminUser();
	public void updateAdminUser();
	public void deleteAdminUser();
}
