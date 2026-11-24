package com.abhilash.error;

class CartLock implements AutoCloseable {
	private final String cartId;
	
	public CartLock(String cartId) {
		this.cartId = cartId;
		System.out.println("Lock acquired for cart " + cartId);
	}
	
	public void mark(String action) {
		System.out.println("Cart " + cartId + ": " + action);
	}
	
	@Override
	public void close() {
		System.out.println("Lock released for cart " + cartId);
	}
}

public class TryWithResources1 {
	public static void main(String args[]) {
		try(CartLock lock = new CartLock("ORD-3434")) {
			lock.mark("add SKU-100");
            lock.mark("update quantity");
		}
	}

}