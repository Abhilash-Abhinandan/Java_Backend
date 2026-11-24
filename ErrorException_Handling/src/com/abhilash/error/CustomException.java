package com.abhilash.error;

class OrderNotFoundException0 extends RuntimeException {
	public OrderNotFoundException0() {
		super();
	}
	
	public OrderNotFoundException0(String message) {
		super(message);
	}
	
	public OrderNotFoundException0(String message, Throwable cause) {
		super(message, cause);
	}
	
	public OrderNotFoundException0(Throwable cause) {
		super(cause);
	}
}

public class CustomException {
	
	public static void findOrder(long orderId){
		throw new OrderNotFoundException0("Order not found: " + orderId);
	}
	
	public static void main(String args[]) {
		try {
			findOrder(222);
		} catch(OrderNotFoundException0 e) {
			System.out.println("Order missing: " + e.getMessage());
		}
	}
}