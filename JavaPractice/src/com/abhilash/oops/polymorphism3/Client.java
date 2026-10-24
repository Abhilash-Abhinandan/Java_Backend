package com.abhilash.oops.polymorphism3;

public class Client {
	public static void main(String args[]) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		Payment client1 = new CreditCardPayment();
		paymentProcessor.processPayment(client1);
		
		CreditCardPayment cr = (CreditCardPayment) client1;
		cr.isSuccessfull();
	}
}
