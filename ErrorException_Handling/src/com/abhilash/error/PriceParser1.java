package com.abhilash.error;

public class PriceParser1 {
	public static double readPrice(String raw) {
		double price = 0.0;
		
		try {
			price = Double.parseDouble(raw);
			System.out.println("Parsed price: " + price);
		} catch(NumberFormatException e) {
			System.out.println("Parsed failed for '" + raw + "' , using fallback");
			price = 9.99;
		} finally {
			System.out.println("Final price decided: " + price);
			// We also can use finally like this not only for cleanup 
		}
		
		return price;
	}
	
	public static void main(String args[]) {
		double finalPrice = readPrice("40.00");
		System.out.println(finalPrice);
	}
}
