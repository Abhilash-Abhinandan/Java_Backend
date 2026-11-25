package com.abhilash.error;

public class TryWithResourcesPractice2 {
    static class AuditSession implements AutoCloseable {
        private final String id;
        AuditSession(String id) {
            this.id = id;
            System.out.println("Audit " + id + " opened");
        }
        void record(String event) {
            System.out.println("Audit " + id + ": " + event);
        }
        public void close() {
            System.out.println("Audit " + id + " closed");
        }
    }

    public static void main(String[] args) {
    	// Bellow is the java 9 short form
//        AuditSession audit = new AuditSession("AUD-9");
//
//        try(audit) {
//            audit.record("login");
//            audit.record("checkout");
//        }
//        
//        System.out.println("After block: audit variable is still in scope");
    }
}