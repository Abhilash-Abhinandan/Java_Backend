package com.abhilash.error;

// try with resources with catch and finally and the execution order 
public class FullTryDemo {
	public static void main(String args[]) {
		try(OrderLogFile order = new OrderLogFile("order-log")) {
			order.write("body line 1");
			throw new RuntimeException("body failed");
		} catch(RuntimeException e) {
			System.out.println("Cause: " + e.getMessage());
		} finally {
			System.out.println("finally ran");
		}
	}
}
