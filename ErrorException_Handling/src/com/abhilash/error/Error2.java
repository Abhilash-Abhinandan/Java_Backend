package com.abhilash.error;

public class Error2 {
	public static void main(String args[]) {
		// throw
		try {
			checkEligibility(-1);
		} catch(Exception err) {
			System.out.println(err.getMessage());
		}
		
	}
	
	private static void checkEligibility(int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("Age can not be zero / negative");
		}
		
		if(age >= 18) {
			System.out.println("Eligible for vote");
		}
	}
}
