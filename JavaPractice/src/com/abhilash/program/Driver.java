package com.abhilash.program;

public class Driver {
	public static void main(String args[]) {
		Customertype customerType = new Customertype();
		float totalPriceGold = customerType.customerType("GOLD", 20000);
		float totalPriceSilver = customerType.customerType("SILVER", 20000);
		float totalPriceRegular = customerType.customerType("REGULAR", 20000);
		
		
		// Printing Price
		System.out.println("Gold Price : " + totalPriceGold);
		System.out.println("Silver Price : " + totalPriceSilver);
		System.out.println("Regular Price : " + totalPriceRegular);
	}
}

