package com.abhilash.error;

public class FinallyPractice1 {
    public static void main(String[] args) {
        try {
            reserveSeat();
        } catch (RuntimeException e) {
            System.out.println("main caught: " + e.getMessage());
        }

        System.out.println("booking screen still open");
    }

    static void reserveSeat() {
        try {
            System.out.println("lock seat A12");
            // TODO: throw RuntimeException with message "seat A12 already booked"
            throw new IllegalArgumentException("seat A12 already booked");
            
        } finally {
            // TODO: print "unlock seat A12"
        	System.out.println("unlock seat A12");
        }
    }
}