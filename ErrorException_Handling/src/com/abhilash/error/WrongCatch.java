package com.abhilash.error;

// Catching the wrong exception
public class WrongCatch {
    public static void main(String[] args) {
        String[] products = {"Notebook", "Pen", "Eraser"};

        try {
            String chosen = products[10];
            System.out.println("Chosen: " + chosen);
        } catch (NumberFormatException e) {
            System.out.println("Bad number.");
        }
    }
}

// Here the throw is an ArrayIndexOutOfBoundsException but the catch is looknig for NumberFormatException 
// Here two types are unrelated to each other so the catch will be skipped and the exception propagates up to the JVM
// Which prints the stack trace and ends the program.