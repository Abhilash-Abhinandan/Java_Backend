package com.abhilash.error;

import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) {
        try {
            String name = loadCustomerName("C-404");
            System.out.println("Loaded customer: " + name);
        } catch (IOException e) {
            // TODO: Print "Checked failure: " followed by e.getMessage().
        	System.out.println("Checked failure: " + e.getMessage());
        }
    }

    static String loadCustomerName(String customerId) throws IOException {
        // TODO: Throw new IOException("Could not load C-404 from customers.csv") when customerId equals "C-404".
    	
    	if(customerId.equals("C-404")) {
    		throw new IOException("Could not load C-404 from customers.csv");
    	}
    	
    	return "temporary";
    }
}