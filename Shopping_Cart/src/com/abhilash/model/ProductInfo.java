package com.abhilash.model;

public class ProductInfo {
	private static int nextId = 1001;

	private String productId;
	private String productName;
	private double price;
	private int quantity;
	
	public ProductInfo(String _productName, double _price, int _quantity) {
		// Validation
		if(_productName == null || _productName.isBlank()) {
			throw new IllegalArgumentException("Product name required!");
		}
		
		if(_price < 0 || Double.isFinite(_price)) {
			throw new IllegalArgumentException("Product price can not be -ve");
		}
		
		if(_quantity < 1) {
			throw new IllegalArgumentException("Product quantity should be 1 or more");
		}
		
		// Auto generated product id
		this.productId = "PRD" + nextId;
		nextId++;
	
		// Assigning values
		this.productName = _productName;
		this.price = _price;
		this.quantity = _quantity;
	}
	
	// Getter methods
	public String getProductId() {
		return productId;
	}
		
	public String getProductName() {
		return productName;
	}		
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}
