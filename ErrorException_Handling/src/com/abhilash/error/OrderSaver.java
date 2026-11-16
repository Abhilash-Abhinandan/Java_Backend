package com.abhilash.error;

class OrderConnection {
	private boolean open;
	
	public OrderConnection() {
		this.open = true;
		System.out.println("Connection opened");
	}
	
	public void saveOrder(String orderId) {
		if (orderId == null) {
			throw new IllegalArgumentException("Order is missing");
		}
		
		System.out.println("Order " + orderId + " saved");
	}
	
	public void close() {
		if(open) {
			open = false;
			System.out.println("Connection closed");
		}
	}
}

public class OrderSaver {
	public static void main(String args[]) {
		OrderConnection conn = new OrderConnection();
		
//		try {
//			conn.saveOrder("ORD-1001");
//		} finally {
//			conn.close();
//		}
		// Here try runs then finally runs. If exception finds then the finally block runs then it propagates up call stack
		
		
		// Bad input
		try {
			conn.saveOrder(null);
		} catch (IllegalArgumentException e) {
			System.out.println("Save failed : " + e.getMessage());
		} finally {
			conn.close();
		}
		// Here try runs and finds an exception and catch block handle it then finally block runs.
	}
}