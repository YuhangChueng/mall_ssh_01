package com.mall.bean;

import java.util.List;

public class Product {
	private int product_id;
	private int product_price;
	private String product_name;
	private String product_detail;
	private String producti_pic;
	private List<OrdersItem> ordersitem;
	private List<Comment> comment;
	private Adervise adervise;
	private ProductType productType;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_detail() {
		return product_detail;
	}
	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}
	public String getProducti_pic() {
		return producti_pic;
	}
	public void setProducti_pic(String producti_pic) {
		this.producti_pic = producti_pic;
	}
	public List<OrdersItem> getOrdersitem() {
		return ordersitem;
	}
	public void setOrdersitem(List<OrdersItem> ordersitem) {
		this.ordersitem = ordersitem;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public Adervise getAdervise() {
		return adervise;
	}
	public void setAdervise(Adervise adervise) {
		this.adervise = adervise;
	}
	public ProductType getProducttype() {
		return productType;
	}
	public void setProducttype(ProductType producttype) {
		this.productType = producttype;
	}
	
}
