package com.abhilash.oops.interface3;

public class Driver1 {
	public static void main(String args[]) {
		Car1 car = new Car1();
		car.start();
		car.brake();
	}
}

// Solving the dimond problem of inheritance throught interface
interface A {
	void start();
}

interface B {
	void brake();
}

class Car1 implements A, B {
	@Override
	public void start() {
		System.out.println("Car has started");
	}
	
	@Override
	public void brake() {
		System.out.println("Car has stopped");
	}
}