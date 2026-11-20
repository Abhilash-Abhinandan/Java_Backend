package com.abhilash.error;

public class FindOrderDemo {
	public static void main(String args[]) throws OrderNotFoundException {
		OrderRepository repo = new OrderRepository();
		OrderInfo order = repo.findById(1001);
		// In above line the compiler will complaint for not being handled because the line might throw checked excepiton
		// But in main class we throws it again so it does not complaint.
		System.out.println("Found order: " + order.id + " status = " + order.status);
	}
}

class OrderNotFoundException extends Exception {
	// This class extends Exception which make the class checked exception 
	public OrderNotFoundException(long orderId) {
		super("Order " + orderId + " not found");
	}

}

class OrderRepository {
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		if(orderId <= 0) {
			throw new OrderNotFoundException(orderId);
		}
		
		return new OrderInfo(orderId, "Placed");
	}
}

class OrderInfo {
	long id;
	String status;
	
	public OrderInfo(long id, String status) {
		this.id = id;
		this.status = status;
	}
}


