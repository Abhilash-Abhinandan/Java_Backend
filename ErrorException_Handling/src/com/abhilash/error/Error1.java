package com.abhilash.error;

public class Error1 {
	public static void main(String args[]) {
		int a = 3;
		int b = 0;
		
		try {
			System.out.println(a / b);
		} catch (ArithmeticException err) {
			System.out.println(err.getMessage());
		}
	}
}
