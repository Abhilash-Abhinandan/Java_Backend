package com.abhilash.oops.staticPractice;

public class Driver2 {
	private long balance;
	
	public Driver2(int initialBalance) {
		if(initialBalance < 0) 
			throw new IllegalArgumentException("Can not be negative amount!");
		
		this.balance =  initialBalance;
	}
	
	public void deposite(long amount) {
		balance += amount;
	}
}
