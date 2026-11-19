package com.abhilash.error;

public class ThrowPractice1 {
    public static void main(String[] args) {
        tryCancel(new Order("B-200", false));
        tryCancel(new Order("A-100", true));
    }

    static void tryCancel(Order order) {
        try {
            order.cancel();
        } catch (IllegalStateException e) {
            System.out.println("State error: " + e.getMessage());
        }
    }

    static class Order {
        private final String id;
        private final boolean delivered;

        Order(String id, boolean delivered) {
            this.id = id;
            this.delivered = delivered;
        }

        void cancel() {
        	if(this.delivered == true) {
        		throw new IllegalStateException("Cannot cancel delivered order: " + this.id);
        	}
        	
            System.out.println("Canceled order: " + id);
        }
    }
}