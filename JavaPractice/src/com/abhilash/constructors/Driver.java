package com.abhilash.constructors;

public class Driver {
	public static void main(String args[]) {
		AccountHolder acc = new AccountHolder();
		
		AccountHolder acc1 = new AccountHolder(2000, "Abhilash");
		System.out.println(acc1.name + acc1.amount);
	}
	
}