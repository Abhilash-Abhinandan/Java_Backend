package com.abhilash.oops.encapsulation;

public class Payment {
	public double balance;
	
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
}
