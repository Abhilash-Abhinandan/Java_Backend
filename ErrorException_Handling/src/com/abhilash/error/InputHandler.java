package com.abhilash.error;

// Multi-Catch: Combining Types in One Block
public class InputHandler {
	public static void main(String args[]) {
		String[] cart = {"Mug", "Plate", "Bowl"};
		String priceText = "twelve";
		int slot = 1;
		
		try {
			String item = cart[slot];
			double price = Double.parseDouble(priceText);
			System.out.println("Item" + " at $" + price);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please check your input and try again. ");
		}
	}
}
