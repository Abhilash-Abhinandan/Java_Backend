package com.abhilash.error;


// Suppressed Exceptions
class FailingLog implements AutoCloseable {
    private final String name;

    public FailingLog(String name) {
        this.name = name;
        System.out.println(name + " opened");
    }

    public void write(String line) {
        System.out.println(name + " wrote: " + line);
    }

    @Override
    public void close() {
        System.out.println(name + " close attempted");
        throw new RuntimeException("close failed for " + name);
    }
}

public class SupressedDemo {
    public static void main(String[] args) {
        try (FailingLog log = new FailingLog("order-log")) {
            log.write("checkout started");
            throw new RuntimeException("body failed");
        } catch (RuntimeException e) {
            System.out.println("primary: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("suppressed: " + suppressed.getMessage());
            }
        }
 
    	// We can do bellow in java 9 and onwords this is more efficient
//    	FailingLog log = new FailingLog("order-log");
//    	log.write("checkout started");
//    	
//    	try (log) {
//    		throw new RuntimeException("body failed");
//    	}
    }
}