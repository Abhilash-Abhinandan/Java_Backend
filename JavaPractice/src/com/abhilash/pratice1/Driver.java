package com.abhilash.pratice1;

public class Driver {
	public static void main(String args[]) {
		Account acc  = new Account();
//		System.out.println(acc.name, acc.amount);
		
		Account acc1 = new Account(2000, "Akash");
		System.out.println(acc1.name + acc1.amount);
	}
}
