package com.abhilash.oops.interface1;

interface CarOperations{
	void start();
	void brake();
}

public class Car implements CarOperations{
	@Override
	public void start() {
		System.out.println("Car is starting");
	}
	
	@Override
	public void brake() {
		System.out.println("Car is stopping");
	}
}
