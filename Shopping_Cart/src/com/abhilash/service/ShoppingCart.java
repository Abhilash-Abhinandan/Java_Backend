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
		
		if (products.length == 0) {
	        throw new IllegalArgumentException("Shopping cart cannot be empty");
		}
		
		for (int count = 0; count < products.length; count++) {
			if(products[count] == null) 
				throw new IllegalArgumentException("Product can not be null!");
		}
	
		this.products = new ProductInfo[products.length];
		
		for(int count = 0; count < products.length; count++) {
			this.products[count] = products[count];
		}
	}
	
	public double calculateProductTotal(ProductInfo product) {
		if(product == null)
			throw new IllegalArgumentException("Products can not be null");
		
		return product.getPrice() * product.getQuantity();
	}
	
	public double calculateCartTotal() {
		double total = 0;
		
		for(int count = 0; count < products.length; count++) {
			total += calculateProductTotal(products[count]);
		}
		
		return total;
	}
	
	public double calculateDiscount(double cartTotal) {
		if(!Double.isFinite(cartTotal)|| cartTotal < 0)
			throw new IllegalArgumentException("Cart total can not be negative");
		
		double rate;
		
		if(cartTotal >= DISCOUNT_TIER_2_MIN) {
			rate = DISCOUNT_RATE_2;
		} else if(cartTotal >= DISCOUNT_TIER_1_MIN ) {
			rate = DISCOUNT_RATE_1;
		} else {
			rate = 0;
		}
		
		double discount = cartTotal * rate;
		return Math.min(discount, MAX_DISCOUNT);
	}
	
	public double calculateFinalAmount(double amount, double discount) {
		if(!Double.isFinite(amount) || amount < 0) {
			throw new IllegalArgumentException("Amount should be nonnegative amount");
		}
		
		if(!Double.isFinite(discount) || discount < 0) {
			throw new IllegalArgumentException("Discount amount should be nononegative amount");
		}
		
		if(discount > amount) {
			throw new IllegalArgumentException("Discount amount should not be exceed total amount");
		}
		
		return amount - discount;
	}
	
	public void printReceipt() {
        System.out.println("============= SHOPPING CART =============");

        for (ProductInfo product : products) {
            System.out.printf("%s | %-15s | %8.2f x %-3d = %10.2f%n",
                    product.getProductId(),
                    product.getProductName(),
                    product.getPrice(),
                    product.getQuantity(),
                    calculateProductTotal(product));
        }

        double cartTotal = calculateCartTotal();
        double discount  = calculateDiscount(cartTotal);
        double finalAmt  = calculateFinalAmount(cartTotal, discount);

        System.out.println("-----------------------------------------");
        System.out.printf("Cart Total     : %10.2f%n", cartTotal);
        System.out.printf("Discount       : %10.2f%n", discount);
        System.out.printf("Final Amount   : %10.2f%n", finalAmt);
        System.out.println("=========================================");
    }
}