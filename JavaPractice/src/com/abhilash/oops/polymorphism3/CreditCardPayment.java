package com.abhilash.oops.polymorphism3;

public class CreditCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("Paid via credit card");
	}
}
