package com.abhilash.error;

public class Main {
	public static void main(String args[]) {
		System.out.println("Primitive: " + primitiveReturn());
		
	}
	
	public static int primitiveReturn() {
		int value = 1;
		
		try {
			 value = 3;
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}finally {
			value = 999;
		}
		
		return value;
	}
}
