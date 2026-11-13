package com.abhilash.error;

public class StackTraceDemo {
    public static void main(String[] args) {
        String userInput = "twenty";

        try {
            double price = Double.parseDouble(userInput);
            System.out.println("Parsed: $" + price);
        } catch (NumberFormatException e) {
            System.out.println("Bad input, here's the trace for debugging:");
            e.printStackTrace();
            System.out.println("Carrying on with a default price.");
        }
    }
}