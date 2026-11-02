package com.abhilash.oops.interface3;

public class Driver3 {
	// This is the Lamda expression 
	// If in parent class there is 2 abstract methods then we can not archive this
	// So this is why in parenet class there is one one abstract class is needed
	public static void main(String args[]) {
		IAccount account = (name, address, amount) -> {
			System.out.println("Account is opening");
			return "Account opened successfully!";
		};
		
		String result = account.openAccount("Kodewala", "BLR", 0);
		System.out.println(result);
	}
}
