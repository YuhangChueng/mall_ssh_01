package com.mall.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mall.bean.AdminUser;
import com.mall.dao.AdminUserDao;

public class AdminUserDaoImpl implements AdminUserDao{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public List<AdminUser> findAdminUserList() {
		Query query = getSession().createQuery("from AdminUser");
		return query.list();
	}

}
