package com.abhilash.oops.interface3;

@FunctionalInterface
public interface IAccount {
	
	String openAccount(String name, String address, double amount); // One one abstractn method is there - SAM
	
	// But we can have other methods also but those shuld not be abstract
//	default void addBeni() {
		
//	}
	
	private void fetchDetails () {
		
	}
	
}
