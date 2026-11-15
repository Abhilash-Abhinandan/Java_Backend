package com.abhilash.error;

// Checking the order of the flow with no exception 
public class FinallyNoException {
	public static void main(String args[]) {
		System.out.println("Before try");
		
		try {
			System.out.println("in try");
		} catch (RuntimeException e) {
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
		}
		
		System.out.println("After");
	}
}
