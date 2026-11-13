package com.abhilash.error;

public class ClassNameDemo {
	public static void main(String args[]) {
		String[] cart = {"Pen", "Notebook"};
		
		try {
			String item = cart[5];
			System.out.println(item);
		} catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("Failure type: " + err.getClass().getSimpleName());
            System.out.println("Detail: " + err.getMessage());
		}
		/*
		 * getClass().getSimpleName() returns the unqualified class name of the exception. It's useful for logging what kind of failure happened without dumping a full stack trace, and without writing out the package name every time.
		 * The first line names the exception type. The second line names the specific problem. Together they give a log reader almost everything they need.
		 */
	}
}
