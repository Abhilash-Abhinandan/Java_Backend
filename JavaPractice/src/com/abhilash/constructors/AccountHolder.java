package com.abhilash.constructors;

public class AccountHolder {
	
	int amount;
	String name;
	
	public AccountHolder() {
		System.out.println("Inside the default constructor");
	}
	
	public AccountHolder(int _amount, String _name) {
		this.amount = _amount;
		this.name = _name;
	}
}