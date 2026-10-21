package com.abhilash.oops.abstraction;

public abstract class Car {
	
	public void start() {
		System.out.println("Car started!");
	}
	
	abstract void accelerate();
	abstract void brake();
}

class FuelCar extends Car {
	@Override
	void accelerate() {
		System.out.println("Fuel car accelerating!");
	}
	
	@Override
	void brake() {
		System.out.println("Fuel car is stopping!");
	}
}

class ElectricCar extends Car {
	@Override
	void accelerate() {
		System.out.println("Electric car is accelerating!");
	}
	
	@Override
	void brake() {
		System.out.println("Electric car is stopping!");
	}
}