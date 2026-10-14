package com.abhilash.service;

import com.abhilash.model.ProductInfo;

public class ShoppingCart {
	private static double DISCOUNT_TIER_1_MIN = 1000; 
	private static double DISCOUNT_TIER_2_MIN = 5000; 
	private static double DISCOUNT_RATE_1     = 0.05;
	private static double DISCOUNT_RATE_2     = 0.10;
	private static double MAX_DISCOUNT        = 1000; 

	private ProductInfo[] products;
	
	public ShoppingCart(ProductInfo[] products) {
		if(products == null)
			throw new IllegalArgumentException("Products array can not be null");
	
		this.products = products;
	}
	
	public double calculateProductTotal(ProductInfo product) {
		if(product == null)
			throw new IllegalArgumentException("Produects array can not be null");
		
		return product.getPrice() * product.getQuantity();
	}
	
	public double calculateCartTotal() {
		double total = 0;
		
		for(int count = 0; count <= products.length; count++) {
			total += calculateProductTotal(products[count]);
		}
		
		return total;
	}
	
	public double calculateDiscount(double cartTotal) {
		if(cartTotal < 0) 
			throw new IllegalArgumentException("Cart total can not be negative");
		
		double rate;
		
		if(cartTotal >= DISCOUNT_RATE_2) {
			rate = DISCOUNT_RATE_2;
		} else if(cartTotal >= DISCOUNT_RATE_1) {
			rate = DISCOUNT_RATE_1;
		} else {
			rate = 0;
		}
		
		return rate;
	}
	
	public double calculateFinalAmount(double amount, double discount) {
		if(discount > amount) {
			throw new IllegalArgumentException("Discount amount should not be exceed total amount");
		}
		
		return amount - discount;
	}
}