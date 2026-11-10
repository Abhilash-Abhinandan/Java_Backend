package com.abhilash.error;

public class Error0 {
	public static void main(String args[]) {
		// There are mainly 2 type of error
		// 1. OutOfMemoryError -> When heap get full
		// 2. StackOverFlowError -> When stack get full
		
		// Let's see a error
//		int a =  5 / 0;
//		System.out.println(a);
		// Errro -> java.lang.ArithmeticException: / by zero
		// This also a type of error and there is many more errors there
		
		
		// Exception handling
		int num1 = 3;
		int num2 = 0;
		
		methodA(num1, num2);
	}
	
	private static void methodA(int a, int b) {
		methodB(a, b);
	}
	
	private static void methodB(int a, int b) {
		try {
			System.out.println(a / b);
		} catch(ArithmeticException err) {
			System.out.println(err.getMessage());
//			err.printStackTrace();
			System.out.println("Can not be divisible by 0");
		}
		
		// This line is printable because we handle the exception in this mehtod only!
		System.out.println("Print 2");
		
		// if the exception is handled in the calling method then the "Print 2" will not print
		// Because the jvm will ask the calling method if the exception is handled or not if yes then the 
		// exception is handled then the remaining code will be execute in the handled method only.
		// If the exception is also not handled in the method then it will ask for that calling method and other codes
		// will ignored and so on
		// If jvm will not find any excepiton handling in any method then it will create on its own.
		
	}
}
