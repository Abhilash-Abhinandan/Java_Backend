package com.abhilash.error;

public class CustomExceptionPractice3 {
    public static void main(String[] args) {
        try {
            reserve("SKU-123", 5);
            System.out.println("Reserved");
        } catch (InventoryLookupException e) {
            System.out.println("Inventory error: " + e.getMessage());
            System.out.println("Cause type: " + e.getCause().getClass().getSimpleName());
            System.out.println("Cause message: " + e.getCause().getMessage());
        }
    }

    static void reserve(String sku, int units) {
        loadStock(sku);
    }

    static int loadStock(String sku) {
    	try {
    		return Integer.parseInt("not-a-number");
    	} catch(NumberFormatException e) {
    		throw new InventoryLookupException("Could not read inventory for " + sku, e);
    	}
    }

    static class InventoryLookupException extends RuntimeException {
        InventoryLookupException(String message, Throwable cause) {
        	super(message, cause);
        }
    }
}