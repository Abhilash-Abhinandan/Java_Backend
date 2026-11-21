package com.abhilash.error;

// throws in method overriding
public class OrderApi {
	public OrderInfo findById(long orderId) throws OrderNotFoundException, InventoryShortageException {
		if(orderId < 0) throw new OrderNotFoundException(orderId);
		return new OrderInfo(orderId, "Placed");
	}
}

class InMemoryOrderApi extends OrderApi {
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		if(orderId < 0) {
			throw new OrderNotFoundException(orderId);
		}
		
		return new OrderInfo(orderId, "PLACED");
	}
}

/*
 *The parent declares two checked exceptions. The subclass declares only one. Callers of the parent expect to handle both, but they're free to handle either; encountering an instance that throws only the first is fine. The override is narrowing the contract, which is always safe. 
 * */

class WideningOrderApi extends OrderApi {
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException { //, PaymentDeclinedException {
		/*
		 * Error:
		 * Exception PaymentDeclinedException is not compatible with throws clause in OrderApi.findById(long)
		 * 
		 * Fix:
		 * Fix: either declare PaymentDeclinedException on the parent (which propagates the requirement to all callers), or catch it inside the override so it doesn't escape:
		 * */
		if(orderId < 0) {
			throw new OrderNotFoundException(orderId);
		}
		
		return new OrderInfo(orderId, "PLACED");
	}
}

// Fix:
class FixedOrderApi extends OrderApi {
	@Override
	public OrderInfo findById(long orderId) throws OrderNotFoundException {
		try {
			if(orderId < 0) {
				throw new PaymentDeclinedException("Order Decliend");
			}
			
			return new OrderInfo(orderId, "Placed");
		} catch(PaymentDeclinedException e) {
			System.out.println(e.getMessage());
		}
		
		return new OrderInfo(orderId, "Can not be Placed");
	}
}

