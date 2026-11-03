package com.abhilash.oops.interface4;

public class Driver6 {
	public static void main(String args[]) {
		StripeGateway strip = new StripeGateway();
		String result = strip.charge("ORD-1111", 32000);
		System.out.println(result);
		
		String retryResult = strip.retry();
		System.out.println(retryResult);
		
		RozarPayGetway rozarPay = new RozarPayGetway();
		String rozarPayResult = rozarPay.charge("323223232", 12000);
		System.out.println(rozarPayResult);
		
		String retryRozarPayResult = rozarPay.retry();
		System.out.println(retryRozarPayResult);
	}
}
