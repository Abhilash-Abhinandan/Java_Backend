package com.abhilash.error;

public class FinallyCaught {
	public static void main(String args[]) {
		System.out.println("Before try");
		
		try {
			System.out.println("In try");
			throw new RuntimeException("Bad cart");
		} catch (RuntimeException e) {
			System.out.println("In catch: " + e.getMessage());
		} finally {
			System.out.println("In finally");
		}
		
		System.out.println("After");
	}
}

// Before try
// In try
// Bad cart
// In finally
// After
