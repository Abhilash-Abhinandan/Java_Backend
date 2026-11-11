package com.abhilash.error;

// Custom Exceptions
public class Error4 {
	public static void main(String args[]) {
		try {
			checkEligible(-1);
		} catch(Exception err) {
			System.out.println(err.getMessage());
		}
		
	}
	
	private static void checkEligible(int age) throws InvalidAgeException {
		if(age <= 0) {
			throw new InvalidAgeException("Age can not be zero / negative");
		}
		
		if(age < 18) {
			System.out.println("Not eligible for vote");
		}
		
		if(age >= 18) {
			System.out.println("Eligible for vote");
		}
	}
}

// Custom exception for invalid age
class InvalidAgeException extends Exception { // We can also write extends RuntimeException
	// In the above we can use both "Exception" and "RuntimeException"
	/*
	 * Difference between using "Exception" and "RuntimeException"
	 * -----------------------------------------------------------
	 * "Exception"
	 * ----------
	 * java internally treats our custom exception as checked exception when you extend from Exception
	 * so again we need to handle immediatly or if we do not want to handle in the particular mothod then we have to
	 * add throws InvalidAgeException to that method and let the calling method handle the exception.
	 * 
	 * "RuntimeException"
	 * ------------------
	 * java internally treats out coutum exception as unchecked exception when we extends from RuntimeException
	 * so it does not show any error and we do not need to add thow InvalidAgeExcepiton to the method.
	 */
	public InvalidAgeException(String message) {
		super(message);
	}
}
