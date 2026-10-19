package com.abhilash.oops.encapsulation;

public class Driver {

	public static void main(String args[]) {
		Payment payment = new Payment(1000);
		
		payment.doDebit(500);
		System.out.println(payment.balance);
		
		payment.doCredit(4000);
		System.out.println(payment.balance);
	}
}
