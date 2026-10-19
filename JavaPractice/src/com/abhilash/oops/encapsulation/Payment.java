package com.abhilash.oops.encapsulation;

public class Payment {
	private double balance;
	
	public Payment(double balance) {
		super();
		this.balance = balance;
	}
	
	public void doDebit(int amount) {
		 balance -= amount;
	}
	
	public void doCredit(int amount) {
		balance += amount;
	}
	
	// Getters
	public double getBalance() {
		return this.balance;
	}
}
