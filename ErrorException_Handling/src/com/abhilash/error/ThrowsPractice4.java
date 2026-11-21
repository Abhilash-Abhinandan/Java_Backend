package com.abhilash.error;

public class ThrowsPractice4 {
    public static void main(String[] args) {
        try {
            completeOrder("ORDER-9", "100 Market St", "SKU-404", 1);
        } catch (Exception e) {
            System.out.println("Fulfillment failed: " + e.getMessage());
        }
    }

    static void completeOrder(String orderId, String address, String sku, int quantity) throws FulfillmentException {
    	System.out.println("Checking order " + orderId);
    	verifyAddress(address);
    	reserveSku(sku, quantity);
    	System.out.println("Order " + orderId + " complete");
        // TODO: declare "throws FulfillmentException" in this method signature.
        // TODO: print "Checking order " + orderId.
        // TODO: call verifyAddress(address), then reserveSku(sku, quantity).
        // TODO: print "Order " + orderId + " complete" after both calls.
    }

    static void verifyAddress(String address) throws BadAddressException {
        if (address.equals("12 Unknown Ave")) {
            throw new BadAddressException(address);
        }
        System.out.println("Address verified: " + address);
    }

    static void reserveSku(String sku, int quantity) throws OutOfStockException {
        if (sku.equals("SKU-404")) {
            throw new OutOfStockException(sku);
        }
        System.out.println("Reserved " + quantity + " of " + sku);
    }

    static class FulfillmentException extends Exception {
        FulfillmentException(String message) { super(message); }
    }

    static class BadAddressException extends FulfillmentException {
        BadAddressException(String address) { super("Bad address: " + address); }
    }

    static class OutOfStockException extends FulfillmentException {
        OutOfStockException(String sku) { super("Out of stock: " + sku); }
    }
}
