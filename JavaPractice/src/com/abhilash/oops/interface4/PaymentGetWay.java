package com.abhilash.oops.interface4;

public interface PaymentGetWay {
	int MAX_RETRIES = 3; // Public staic final
	String charge(String orderId, double amounts); // Public abstract
}

interface Refundable {
	void refund(String txnId);
}

interface Auditable {
	void auditable(String auditTag);
}

// Multiple interface inheritance
interface FullGateway extends PaymentGetWay, Refundable  {}

class StripeGateway implements FullGateway, Auditable {
	@Override
	public String charge(String orderId, double amount) {
		 return "strip-txn-" + orderId;
	}
	
	@Override public void refund(String txnId) {}
	
	@Override public void auditable(String auditTag) {}
	
	public String retry() {
		return "Successful";
	}
}

class RozarPayGetway extends StripeGateway {
	@Override public String charge(String orderId, double amount) {
		return "razorpay-txn-" + orderId;
	}
}

// This is the high level inheritance and we should use the interface and 
//  we know ther is any thing possible here and there!
class  PhonePay extends 