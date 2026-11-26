package com.abhilash.error;

public class TryWithResourcesPractice3 {
    static class PaymentLog implements AutoCloseable {
        private final String name;
        PaymentLog(String name) {
            this.name = name;
            System.out.println(name + " opened");
        }
        public void close() {
            System.out.println(name + " closing");
            throw new RuntimeException("close failed for " + name);
        }
    }

    public static void main(String[] args) {
    	try(PaymentLog log = new PaymentLog("payment-log")) {
    		System.out.println("processing ORD-500");
    		throw new RuntimeException("charge failed for ORD-500");
    	} catch (RuntimeException e) {
    		System.out.println("Caught: " + e.getMessage());
    		System.out.println("Suppressed count: " + e.getSuppressed().length);
    		
    		for(Throwable supressed : e.getSuppressed()) {
    			System.out.println("Suppressed: " + supressed.getMessage());
    		}
    	}
    }
}