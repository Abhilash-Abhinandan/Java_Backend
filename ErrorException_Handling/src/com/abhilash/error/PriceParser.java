package com.abhilash.error;

// NumberFormatException
public class PriceParser {
	public static void main(String args[]) {
		String userInput = "twenty";
		
		try {
			double price = Double.parseDouble(userInput);
			System.out.println("Parsed price : " + price);
		} catch(NumberFormatException err) {
			System.out.println("That does not look like a price");
		}
	}
}
