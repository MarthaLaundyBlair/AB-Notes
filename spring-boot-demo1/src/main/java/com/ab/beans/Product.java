package com.ab.beans;

public class Product {
	
	private int productId;
	
	private String productTitle;
	
	public Product() {}

	public Product(int productId, String productTitle) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + "]";
	}
	

}
