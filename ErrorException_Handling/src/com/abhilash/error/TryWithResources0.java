package com.abhilash.error;

// The try-with-resources Statement
class OrderLogFile implements AutoCloseable {
	private final String name;
	
	public OrderLogFile(String name) {
		this.name = name;
		System.out.println(name + " Opend");
	}
	
	public void write(String line) {
		System.out.println(name + " wrote: " + line);
	}
	
	@Override
	public void close() {
		System.out.println(name + " closed");
	}
}

public class TryWithResources0{
	public static void main(String args[]) {
		try(OrderLogFile log = new OrderLogFile("order-log")) {
			log.write("ORD-1001 placed");
			log.write("ORD-1001 shipped");
		}
	}

}
