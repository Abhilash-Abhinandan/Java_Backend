package com.abhilash.error;

// Designing a Class for try-with-resources
class InventoryReservation00 implements AutoCloseable {
    private final String productId;
    private final int quantity;
    private boolean committed;
    private boolean closed;

    public InventoryReservation00(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
        System.out.println("Reserved " + quantity + " of " + productId);
    }

    public void commit() {
        if (closed) {
            throw new IllegalStateException("reservation already closed");
        }
        committed = true;
        System.out.println("Committed " + quantity + " of " + productId);
    }

    @Override
    public void close() {
        if (closed) {
            return;
        }
        closed = true;
        if (!committed) {
            System.out.println("Released " + quantity + " of " + productId);
        } else {
            System.out.println("Reservation on " + productId + " finalized");
        }
    }
}

public class CheckoutDemo1 {
    public static void main(String[] args) {
        System.out.println("--- successful checkout ---");
        try (InventoryReservation00 reservation = new InventoryReservation00("SKU-100", 3)) {
            reservation.commit();
        }

        System.out.println("--- failed checkout ---");
        try (InventoryReservation00 reservation = new InventoryReservation00("SKU-200", 1)) {
            throw new RuntimeException("payment declined");
        } catch (RuntimeException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}