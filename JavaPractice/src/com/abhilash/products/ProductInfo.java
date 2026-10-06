package com.abhilash.products;

public class ProductInfo {
	public String productName;
	public double price;
	public String productDesc;
	public int quntity;
	
	public ProductInfo() {
		System.out.println("Inside the no args constructor");
	}
	
	public ProductInfo(String _productName, double _price, String _productDesc, int _quantity ) {
		this.productName = _productName;
		this.price = _price;
		this.productDesc = _productDesc;
		this.quntity = _quantity;
	}
	
	public ProductInfo(String _productName, String _productDesc) {
		this.productName = _productName;
		this.productDesc = _productDesc;
	}
}
