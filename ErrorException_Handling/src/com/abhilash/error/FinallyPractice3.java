package com.abhilash.error;

public class FinallyPractice3 {
    public static void main(String[] args) {
        try {
            parseInvoice();
        } catch (RuntimeException e) {
            System.out.println("caught: " + e.getClass().getSimpleName()
                    + " - " + e.getMessage());
        }

        System.out.println("after main catch");
    }

    static void parseInvoice() {
        try {
            System.out.println("parse invoice INV-9");
            // TODO: throw IllegalStateException with message "bad total 19"
            throw new IllegalStateException("bad total 19");
            
        } finally {
            System.out.println("cleanup invoice INV-9");
            // TODO: throw IllegalArgumentException with message "cleanup failed 42"
            throw new IllegalArgumentException("cleanup failed 42");
        }
    }
    
    // in this code the original exception is IllegalStateException but after finally block the original exception is 
    // ovveridden by IllegalArgumentException which is wrong.
    // This is only to see the flow of code and see the finally exception trap.
}