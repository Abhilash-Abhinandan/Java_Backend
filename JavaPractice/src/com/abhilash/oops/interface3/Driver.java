package com.abhilash.oops.interface3;

public class Driver {
	public static void main(String args[]) {
		Car cr = new Thar();
		cr.start();
	}
}

interface Car {
	// We can define variables inside the interface!
	double PI_VALUE = 3.14;
	int value = 23;
	// Here the publi static final is by default and we do not need to write explicitly!
	
	
	void start();
	// Here the public abstract is by default we do not need to write public abstract explicitly!
}

class Thar implements Car {
	@Override
	// Here we have to right public because in Car interface the start() is public by default
	// Here we can widenning the access of the method , Narrowing is not allowed!
	public void start() {
		System.out.println("Car has started");
	}
}