package com.abhilash.error;

public class CheckoutDemo {
	public static void main(String args[]) {
		String cart[] = {"Notebook", "Pen", "Eraser"};
		String priceText = "12.50";
		String customerName = "Abhilash";
		int unitsPerBox = 0;
		
		try {
			String item = cart[1];
			double price = Double.parseDouble(priceText);
			int nameLength = customerName.length();
			
			if(unitsPerBox == 0)
				throw new ArithmeticException("Units per box can't be zero.");
			
			double perUnit = price / unitsPerBox;
			
			System.out.println("Item: " + item + ", price per unit: " + perUnit + ", name length: " + nameLength);
			
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("Customer name is missing");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cart slot is out of range");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
