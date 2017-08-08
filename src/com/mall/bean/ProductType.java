package com.mall.bean;

import java.util.List;

public class ProductType {
	private int productType_id;
	private String productType_name;
	private List<Product> product;
	public int getProductType_id() {
		return productType_id;
	}
	public void setProductType_id(int productType_id) {
		this.productType_id = productType_id;
	}
	public String getProductType_name() {
		return productType_name;
	}
	public void setProductType_name(String productType_name) {
		this.productType_name = productType_name;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
}
