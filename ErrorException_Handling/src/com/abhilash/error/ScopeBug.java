package com.abhilash.error;

public class ScopeBug {
	public static void main(String args[]) {
		double price = 0.0;
		try {
			//double price = Double.parseDouble("23.00"); 
			// This is the bug because price variable lives inside the block only.
			// fix : declare and define the variable out side of the try block
			price = Double.parseDouble("22.44");
		} catch(NumberFormatException err) {
			System.out.println(err.getClass().getSimpleName());
			System.out.println(err.getMessage());
		}
		
		System.out.println("Price is $" + price);
	}
}
