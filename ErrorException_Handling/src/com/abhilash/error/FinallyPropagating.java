package com.abhilash.error;

public class FinallyPropagating {
	public static void main(String args[]) {
		System.out.println("Before try");
		
		try {
			System.out.println("In try");
			throw new RuntimeException("Missing field");
		} finally {
			System.out.println("In finally");
		}
		
		//System.out.println("After");
	}
}
