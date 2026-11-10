package com.abhilash.error;

public class Error0 {
	public static void main(String args[]) {
		// There are mainly 2 type of error
		// 1. OutOfMemoryError -> When heap get full
		// 2. StackOverFlowError -> When stack get full
		
		// Let's see a error
		int a =  5 / 0;
		System.out.println(a);
		// Errro -> java.lang.ArithmeticException: / by zero
		// This also a type of error and there is many more errors there
	}
}
