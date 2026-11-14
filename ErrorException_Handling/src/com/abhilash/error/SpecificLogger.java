package com.abhilash.error;

// Each handler reaches for context the other one wouldn't have. Combining them would force one shared message that fits neither case well.
public class SpecificLogger {
	public static void main(String agrgs[]) {
		String[] cart = {"Mug", "Plate"};
		String priceText = "twelve";
		int slot = 5;
		
		try {
			String item = cart[slot];
			double price = Double.parseDouble(priceText);
			System.out.println(item + " at $" + price);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bad slot: " + slot + " (cart size is " + cart.length + ")");
		} catch (NumberFormatException e) {
			System.out.println("Bad price text: \"" + priceText + "\"");
		}
	}
}
