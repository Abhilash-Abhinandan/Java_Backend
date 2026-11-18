package com.abhilash.error;

public class Order {
	private String orderId;
	private String status;
	
	public Order(String orderId) {
		this.orderId = orderId;
		this.status = "Placed";
	}
	
	public void ship() {
		this.status = "Shipped";
	}
	
	public void deliver() {
		this.status = "Delivered";
	}
	
	public void cancel() {
		if(this.status.equals("Delivered")) {
			throw new IllegalStateException("Cannot cancel order " + orderId + ": already delivered");
		}
		
		if(this.status.equals("Cancelled")) {
			throw new IllegalStateException("Cannot cancel order " + orderId + ": already cancelled");
		}
		
		this.status = "Cancelled";
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public static void main(String args[]) {
		Order order = new Order("ORD-2001");
		order.ship();
		order.deliver();
		System.out.println("Status: " + order.getStatus());

        order.cancel();
	}
}
