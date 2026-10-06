package com.abhilash.account;

public class Account {
	private double balance;
	
	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}
	
	public double getBalance()	{
		return this.balance;
	}
}
