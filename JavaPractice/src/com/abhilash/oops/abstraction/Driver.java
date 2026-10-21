package com.abhilash.oops.abstraction;

public class Driver {
	public static void main(String args[]) {
		Car cr = new ElectricCar();
		cr.start();
		cr.accelerate();
		cr.brake();
	}
}
