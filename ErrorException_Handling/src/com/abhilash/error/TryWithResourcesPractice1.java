package com.abhilash.error;

public class TryWithResourcesPractice1 {
    static class InventoryConnection implements AutoCloseable {
        private final String name;
        InventoryConnection(String name) {
            this.name = name;
            System.out.println("Inventory " + name + " opened");
        }
        void reserve(String sku, int quantity) {
            System.out.println("Reserved " + quantity + " of " + sku);
        }
        public void close() {
            System.out.println("Inventory " + name + " closed");
        }
    }

    static class PaymentGateway implements AutoCloseable {
        private final String name;
        PaymentGateway(String name) {
            this.name = name;
            System.out.println("Payment " + name + " opened");
        }
        void charge(String orderId, String amount) {
            System.out.println("Charged " + orderId + " amount " + amount);
        }
        public void close() {
            System.out.println("Payment " + name + " closed");
        }
    }

    public static void main(String[] args) {
    	try(
    			InventoryConnection inv = new InventoryConnection("warehouse-east");
    			PaymentGateway pay = new PaymentGateway("stripe-live")
    		) 
    	{
    		inv.reserve("SKU-100", 3);
    		pay.charge("ORD-77", "42.50");
    	}
    }
}