package com.abhilash.oops.polymorphism3;

public class Client {
	public static void main(String args[]) {
		Payment client1 = new CreditCardPayment();
		client1.doPayment();
	}
}
