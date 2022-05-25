package com.ab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {
	
	private int orderId;
	
	@Autowired
	@Qualifier("product2")
	private Product product;
	
	
	// I'm writing this constructor to demonstrate DI using @Autowired
	public Order(int orderId) {
		this.orderId = orderId;
	}

	
	
	public Order(int orderId, Product product) {
		super();
		this.orderId = orderId;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + "]";
	}
	
	
	

}
