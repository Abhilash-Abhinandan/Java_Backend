package com.abhilash.oops.staticPractice;

public class Driver2 {
	private long balance;
	
	public Driver2(int initialBalance) {
		if(initialBalance < 0) 
			throw new IllegalArgumentException("Can not be negative amount!");
		
		this.balance =  initialBalance;
	}
	
	public void deposite(long amount) {
		if(amount < 0)
			throw new IllegalArgumentException("Can not be negative amount!");
		
		balance += amount;
	}
	
	public void withdraw(long amount) {
		if(amount > balance) 
			throw new IllegalArgumentException("Withdraw amount should not exceed balance!");
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}
