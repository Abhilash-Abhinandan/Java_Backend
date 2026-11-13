package com.abhilash.error;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {
        String[] records = {"north:120:4", "south:90:0", "west:oops:3"};

        for (String record : records) {
            // TODO: Use an outer try-catch for ArithmeticException.
            // TODO: Inside it, print the record, split it, and parse the total in an inner try-catch.
            // TODO: Continue to the next record if the inner catch handles a bad total.
        	
        	try {
        		System.out.println("Record: " + record);
        		String[] parts = record.split(":");
        		String region = parts[0];
        		
        		try {
        			int parsedTotal = Integer.parseInt(parts[1]);
        			int stores = Integer.parseInt(parts[2]);
        			int division = parsedTotal / stores;
        			
        			System.out.println(region + " average : " + division);
        			
        		} catch (NumberFormatException e) {
        			System.out.println("Bad total for " + region);
        		}
        	} catch(ArithmeticException e) {
        		System.out.println("Cannot average record " + record);
        	}
        }

        System.out.println("Reports finished.");
    }
}