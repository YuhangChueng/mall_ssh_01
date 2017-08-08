package com.mall.bean;

public class Comment {
	private int comm_id;
	private int comm_num;
	private String comm_detail;
	private User user;
	private Product product;
	public int getComm_id() {
		return comm_id;
	}
	public void setComm_id(int comm_id) {
		this.comm_id = comm_id;
	}
	public int getComm_num() {
		return comm_num;
	}
	public void setComm_num(int comm_num) {
		this.comm_num = comm_num;
	}
	public String getComm_detail() {
		return comm_detail;
	}
	public void setComm_detail(String comm_detail) {
		this.comm_detail = comm_detail;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
