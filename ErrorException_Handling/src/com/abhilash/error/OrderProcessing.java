package com.abhilash.error;

public class OrderProcessing {
	public static void main(String args[]) {
		placeOrder("Macbook M5 Pro", -2);
		System.out.println("After place order");
	}
	
	public static void placeOrder(String productName, int quantity) {
		try {
			validate(productName, quantity);
			System.out.println("Order placed for " + productName);
		} catch(IllegalArgumentException e) {
			System.out.println("Could not place order :" + e.getMessage());
		}
	}
	
	private static void validate(String productName, int quantity) {
		if(quantity <= 0) {
			throw new IllegalArgumentException("Quantity must be positive, got :" + quantity);
		}
	}
}
