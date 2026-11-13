package com.abhilash.error;

public class QuietParser {
    public static void main(String[] args) {
        String userInput = "twenty";
        try {
            int discount = Integer.parseInt(userInput);
            System.out.println("Discount: " + discount);
        } catch (NumberFormatException e) {
            // ignore
        	/*
        	 * The program prints Done. and ends with exit code 0. From the outside, nothing went wrong. From the inside, the NumberFormatException happened, got caught, and was thrown away. There is no log, no message, no stack trace, and no way for anyone debugging later to know that the parse failed.

If userInput came from an actual user, the user sees no error and no discount, and the operator looking at the logs sees nothing either. The bug is invisible.
        	 */
        }
        System.out.println("Done.");
    }
}