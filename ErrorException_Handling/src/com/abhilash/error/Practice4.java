package com.abhilash.error;

public class Practice4 {
    public static void main(String[] args) {
        String[] priceTexts = {"1999", "oops", "2500"};

        for (String priceText : priceTexts) {
            System.out.println("Reading: " + priceText);

            // TODO: Try to parse priceText as an int.
            // TODO: On success, print the cents value and then "Stored item".
            // TODO: On NumberFormatException, print "Skipped bad price: " plus priceText.
            try {
            	int price = Integer.parseInt(priceText);
            	System.out.println("Cents: " + price);
            	System.out.println("Stored item");
            } catch (NumberFormatException e) {
            	System.out.println("Skipped bad price: " + priceText);
            }
        }

        System.out.println("Import complete.");
    }
}