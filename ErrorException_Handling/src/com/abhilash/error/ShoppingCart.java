package com.abhilash.error;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<String> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(String 	productName) {
		items.add(productName);
	}
	
	public String removeItem() {
		if(items.isEmpty()) {
			throw new IllegalStateException("Can not remove item from empty cart");
		}
		
		return items.remove(items.size() - 1);
	}
	
	public int size() {
		return items.size();
	}
	
	public static void main(String args[]) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addItem("USB-C cable");
		System.out.println("Removed: " + shoppingCart.removeItem());
        System.out.println("Cart size: " + shoppingCart.size());
        
        shoppingCart.removeItem();
	}
}
