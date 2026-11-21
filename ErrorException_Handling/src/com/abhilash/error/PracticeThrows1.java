package com.abhilash.error;

public class PracticeThrows1 {
    public static void main(String[] args) {
        try {
            processCheckout("LAPTOP-9", 2, 77, 12000.0);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }

    static void processCheckout(String productCode, int quantity, long customerId, double amount) 
    		throws InventoryShortageException, PaymentDeclinedException {
    	reserve(productCode, quantity);
    	charge(customerId, amount);
    }

    static void reserve(String productCode, int quantity) throws InventoryShortageException {
        if (quantity > 3) {
            throw new InventoryShortageException(productCode);
        }
        System.out.println("Reserved " + quantity + " of " + productCode);
    }

    static void charge(long customerId, double amount) throws PaymentDeclinedException {
        if (amount > 10000.0) { 
            throw new PaymentDeclinedException("amount " + amount + " is over limit");
        }
        System.out.println("Charged " + amount + " to customer " + customerId);
    }

    static class InventoryShortageException extends Exception {
        InventoryShortageException(String productCode) {
            super("Inventory shortage for " + productCode);
        }
    }

    static class PaymentDeclinedException extends Exception {
        PaymentDeclinedException(String reason) {
            super("Payment declined: " + reason);
        }
    }
}