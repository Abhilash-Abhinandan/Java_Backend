package com.abhilash.pratice1;

public class Account {
	int amount;
	String name;
	
	Account() {
		System.out.println("Inside Account()");
	}
	
	Account(int _amount, String _name){
		this.amount = _amount;
		this.name = _name;
	}
}
