package com.abhilash.app;

import com.abhilash.services.BillCalculator;

public class Driver {
	public static void main(String arggs[]) {
		BillCalculator bill = new BillCalculator(700);
		double totalBill = bill.displayBill();
		
		
		System.out.println(totalBill);
	}
}
