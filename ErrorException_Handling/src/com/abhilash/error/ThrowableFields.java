package com.abhilash.error;

public class ThrowableFields {
	public static void main(String args[]) {
		try {
			Integer.parseInt("not-a-number");
		} catch(NumberFormatException err) {
			System.out.println("Message : " + err.getMessage());
			System.out.println("Class : " + err.getClass().getName());
			System.out.println("Cause : " + err.getCause()); 
			System.out.println("Frames: " + err.getStackTrace().length);
		}
	}
}