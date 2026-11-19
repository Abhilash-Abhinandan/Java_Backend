package com.abhilash.error;

import java.util.ArrayList;
import java.util.List;


// Re-throwing Inside a catch
public class CheckoutService {
	public static void checkout(List<String> cart) {
		try {
			validateCart(cart);
			System.out.println("Charging payment");
		} catch(IllegalStateException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("Checkout failed for cart with " + cart.size() + " item(s)");
			throw e;
			// in this case tack trace still point to validateCart();
			// Because here we just catch the exception and throw it again 
			// we are not creating a new Exception here
			
//			throw new IllegalArgumentException(e.getMessage());
			// Here the stack trace will point to checkout() because When Java creates an exception object, it captures the stack trace at the location where the exception is created.
		}
	}
	
	public static void validateCart(List<String> cart) {
		if(cart.isEmpty()) {
			throw new IllegalStateException("Cart must not be empty at checkout");
		}
	}
	
	public static void main(String args[]) {
		List<String> cart = new ArrayList<>();
		checkout(cart);
	}
}
/*
validateCart throws. checkout catches the exception, runs its partial-handling code (printing the diagnostic line), and then re-raises the same exception with throw e;. The exception continues unwinding up to main, which doesn't catch it, so the JVM prints the trace.
*/