package com.abhilash.error;

public class Error1 {
	public static void main(String args[]) {
		int a = 3;
		int b = 0;
		
		try {
			System.out.println(a / b); // new ArithmeticException(" / by zero "); 
		}
		
//		catch (ArithmeticException err) {
//			System.out.println(err.getMessage());
//		}
		// We know that parent class reference variable can point the child class object.
		// Above in catch() we right ArithmethicException which is exact excption we could get
		// We can also write RuntimeException instead of ArithmethicException because RutimeException is parent class
		// of ArithmeticException
//		catch (RuntimeException err) {
//			System.out.println(err.getMessage());
//		}
		// Again we can write "Exception" instead of "RuntimeException" because "Exception" is the parent class of
		// "RuntimeException"
		
//		catch(Exception err) {  // We use this most of the time
//			System.out.println(err.getMessage());
//		}
		// Instead of "Exception" we can write "Throwable" because it is the parent class of "Exception" .
		// But this is not recommended because "Throwable" is not only the parent call of "Exception" but also parent
		//  class of "Error" so writting "Throwable" can also catch Error also which can be dangerious .
		
		catch(Throwable err) { // Not recommended
			System.out.println(err.getMessage());
		}
	}
}
