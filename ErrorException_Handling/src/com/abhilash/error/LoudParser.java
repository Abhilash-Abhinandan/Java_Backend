package com.abhilash.error;

// Fix for the Swallowing the Stack Trace
public class LoudParser {
    public static void main(String[] args) {
        String userInput = "twenty";
        
        try {
            int discount = Integer.parseInt(userInput);
            System.out.println("Discount: " + discount);
        } catch (NumberFormatException e) {
        	// Fix: at minimum, print the exception so the failure is visible. In real applications, log it through a real logging framework, and decide explicitly whether to recover or to re-throw.
            System.err.println("Could not parse discount '" + userInput + "': " + e.getMessage());
        }
  
        System.out.println("Done.");
    }
}