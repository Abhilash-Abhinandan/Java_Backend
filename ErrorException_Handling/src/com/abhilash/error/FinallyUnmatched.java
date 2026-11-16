package com.abhilash.error;

public class FinallyUnmatched {
	public static void main(String args[]) {
		System.out.println("Before try");
		
		try {
			System.out.println("In try");
			throw new RuntimeException("Real problem");
		} catch (ArithmeticException e) {
			System.out.println("In catch(this won't run)");
		} finally {
			System.out.println("In finally");
		}
		
		System.out.println("After");
	}
}

// Before try
// In try
// In finally
// Error thrown with stack trace