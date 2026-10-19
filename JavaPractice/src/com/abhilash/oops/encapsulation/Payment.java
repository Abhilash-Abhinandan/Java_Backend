package com.abhilash.oops.encapsulation;

public class Payment {
	private double balance;
	
	public Payment(double balance) {
		super();
		this.balance = balance;
	}
	
	// Setters
	public void doDebit(int amount) {
		 balance -= amount;
	}
	
	public void doCredit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	// Getters
	public double getBalance() {
		return this.balance;
	}
}
