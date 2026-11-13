package com.abhilash.error;

public class Practice0 {
    public static void main(String[] args) {
        String ageText = "42";

        // TODO: Put Integer.parseInt(ageText) in a try block.
        // TODO: Print "Age parsed: " plus the parsed int when parsing succeeds.
        // TODO: Catch NumberFormatException and print "Invalid age: " plus ageText.
        

        try {
        	int age = Integer.parseInt(ageText);
        	System.out.println("Age Parsed: " + age);
        } catch (NumberFormatException err) {
        	System.out.println("Invalid age: " + ageText);
        }
        
        System.out.println("Finished age check.");
    }
}