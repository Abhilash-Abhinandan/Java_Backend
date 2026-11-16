package com.abhilash.error;

public class FinallySideEffect {
	public static void main(String args[]) {
		System.out.println("Primitive: " + primitiveReturn());
		
		int[] result = objectReturn();
		System.out.println("object: " + result[0]);
	}
	
	public static int primitiveReturn() {
		int value = 1;
		
		try {
			return value;
		} finally {
			value = 999;
		}
	}
	// Here the output will be 1 because before the finally block runs try block runs and inside the try block the value 
	// is captured and return before going to finally
	
	public static int[] objectReturn() {
		int[] cart = {1, 2, 3};
		
		try {
			return cart;
		} finally {
			cart[0] = 999;
//			cart = new int[]{999, 888, 777};
		}
	}
	// Here output will be 999 bcz Java evaluates the return expression and captures the reference to that array.
	// 
}

/*
 * Primitive: 1
	object: 999
*/