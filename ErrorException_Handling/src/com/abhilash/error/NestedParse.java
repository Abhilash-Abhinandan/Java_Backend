package com.abhilash.error;


// Nested try-catch 
public class NestedParse {
	public static void main(String args[]) {
		String quntityInput = "3";
		String priceInput = "twenty";
		
		try {
			int quantity = Integer.parseInt(quntityInput);
			System.out.println("Quantity : " + quantity);
			
			try {
				double price = Double.parseDouble(priceInput);
				System.out.println("Price: $" + price);
                System.out.println("Subtotal: $" + (quantity * price));
			} catch(NumberFormatException err) {
				System.out.println("Price was not a valid number: " + err.getMessage());
			}
			
		} catch (NumberFormatException err) {
			System.out.println("Price was not a valid number: " + err.getMessage());
		}
	}
}
