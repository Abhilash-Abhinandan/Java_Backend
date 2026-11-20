package com.abhilash.error;

class OrderProcessor {
    private OrderRepository repo = new OrderRepository();
    private PaymentService payments = new PaymentService();
    private WarehouseService warehouse = new WarehouseService();

    public void shipOrder(long orderId, String productCode, int quantity, double amount)
            throws OrderNotFoundException, PaymentDeclinedException, InventoryShortageException {
        OrderInfo order = repo.findById(orderId);
        warehouse.reserve(productCode, quantity);
        payments.charge(orderId, amount);
        System.out.println("Order " + order.id + " shipped");
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

class PaymentDeclinedException extends Exception {
	public PaymentDeclinedException(String reason) {
		super("Payment decliend : " + reason);
	}
}

class InventoryShortageException extends Exception {
	public InventoryShortageException(String sku) {
		super("Inventory shortage for SKU" + sku);
	}
}

class PaymentService {
	public void charge(long customerId, double amount) throws PaymentDeclinedException {
		if(amount > 10_000) {
			throw new PaymentDeclinedException("amount exceeds limit");
		}
		
		System.out.println("Charged $" + amount + " to customer " + customerId);
	}
}

class WarehouseService {
	public void reserve (String productCode , int quantity) throws InventoryShortageException {
		if (quantity > 5) {
			throw new InventoryShortageException(productCode);
		}
		
		System.out.println("Reserved " + quantity + " of " + productCode);
	}
}

public class FindOrderDemo {
	private OrderRepository repo = new OrderRepository();
	
	public static void main(String args[]) 
			throws OrderNotFoundException,PaymentDeclinedException, InventoryShortageException {
		
		OrderProcessor processor = new OrderProcessor();
		processor.shipOrder(001, "BOOK-42", 2, 49.99);
	}
}
