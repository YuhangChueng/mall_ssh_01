package com.mall.bean;

import java.util.List;

public class Orders {
	private int orders_id;
	private int orders_num;
	private String orders_sum;
	private String orders_time;
	private String status;
	private User user;
	private Address address;
	private List<OrdersItem> ordersitem;
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getOrders_num() {
		return orders_num;
	}
	public void setOrders_num(int orders_num) {
		this.orders_num = orders_num;
	}
	public String getOrders_sum() {
		return orders_sum;
	}
	public void setOrders_sum(String orders_sum) {
		this.orders_sum = orders_sum;
	}
	public String getOrders_time() {
		return orders_time;
	}
	public void setOrders_time(String orders_time) {
		this.orders_time = orders_time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<OrdersItem> getOrdersitem() {
		return ordersitem;
	}
	public void setOrdersitem(List<OrdersItem> ordersitem) {
		this.ordersitem = ordersitem;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}