package com.abhilash.error;

public class CustomExceptionPractice0 {
    public static void main(String[] args) {
        try {
            checkout(0);
            System.out.println("Checkout complete");
        } catch (EmptyCartException e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }

    static void checkout(int itemCount) {
    	if(itemCount == 0) {
    		throw new EmptyCartException("Cart has no items");
    	}
    }

    static class EmptyCartException extends RuntimeException {
        EmptyCartException(String message) {
            super(message); 
        }
    }
}