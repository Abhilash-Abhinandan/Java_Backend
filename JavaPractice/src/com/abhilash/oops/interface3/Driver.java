package com.abhilash.oops.interface3;

public class Driver {
	public static void main(String args[]) {
		Car cr = new Thar();
		cr.start();
	}
}

interface Car {
	void start();
}

class Thar implements Car {
	@Override
	public void start() {
		System.out.println("Car has started");
	}
}