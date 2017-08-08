package com.mall.bean;

import java.util.List;

public class User {
	private int user_id;
	private int user_tel;
	private String user_name;
	private String user_psw;
	private String user_email;
	private List<Address> address;
	private List<Orders> orders;
	private List<Comment> comments;
	
}
