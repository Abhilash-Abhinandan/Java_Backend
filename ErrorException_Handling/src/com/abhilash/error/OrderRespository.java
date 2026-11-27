package com.abhilash.error;

// throws in Method Overriding
public class OrderRespository {
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		return new OrderInfo(orderId, "Placed");
	}
}

class CachedOrderRepository extends OrderRepository0 {
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		System.out.println("Cache lookup for " + orderId);
		return super.findById(orderId);
		
	}
}
