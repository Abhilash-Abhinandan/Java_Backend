package com.abhilash.error;

interface OrderLookup {
	OrderInfo findById(long orderId) throws OrderNotFoundException;
}

class DatabaseOrderLookup implements OrderLookup {
	
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		if (orderId < 0) {
			throw new OrderNotFoundException(orderId);
		}
		
		return new OrderInfo(orderId, "Placed");
	}
}

class FakeOrderLookup implements OrderLookup {
	
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		if(orderId < 0) {
			throw new OrderNotFoundException(orderId);
		}
		
		return new OrderInfo(orderId, "Placed");
	}
}

public class LookupDemo {
	public static void main(String args[]) throws OrderNotFoundException {
		OrderLookup lookup = new DatabaseOrderLookup();
		OrderInfo order = lookup.findById(1001);
		System.out.println("Found order " + order.id);
	}
}
