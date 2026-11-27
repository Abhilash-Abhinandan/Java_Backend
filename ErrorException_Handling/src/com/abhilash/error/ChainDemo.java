package com.abhilash.error;

import java.io.IOException;

// OrderRepositoryException
class OrderRepositoryException extends RuntimeException {
	public OrderRepositoryException(String message) {
		super(message);
	}
	
    public OrderRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}

// OrderProcessingException
class OrderProcessingException extends RuntimeException {
	public OrderProcessingException(String message) {
		super(message);
	}
	
    public OrderProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

class OrderStorage {
    public String readOrder(String orderId) throws IOException {
        throw new IOException("Disk read failed for " + orderId);
    }
}

class OrderRepository0 {
    private final OrderStorage storage = new OrderStorage();

    public String findOrder(String orderId) {
        try {
            return storage.readOrder(orderId);
        } catch (IOException e) {
            throw new OrderRepositoryException(
                    "Could not load order " + orderId, e);
        }
    }
}

class OrderService {
    private final OrderRepository0 repo = new OrderRepository0();

    public void processOrder(String orderId) {
        try {
            String raw = repo.findOrder(orderId);
            System.out.println("Processed: " + raw);
        } catch (OrderRepositoryException e) {
            throw new OrderProcessingException(
                    "Order processing failed for " + orderId, e);
        }
    }
}

public class ChainDemo {
    public static void main(String[] args) {
//    	OrderService service = new OrderService();
//        service.processOrder("ORD-9001");
    	
    	// We can write like this in a single line
    	new OrderService().processOrder("ORD-9001");
    }
}