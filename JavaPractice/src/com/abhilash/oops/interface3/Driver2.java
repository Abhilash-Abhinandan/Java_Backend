package com.abhilash.oops.interface3;

public class Driver2 {

	public static void main(String args[]) {
		StreetDog streetDog = new StreetDog();
		streetDog.bark();
		streetDog.eat();
	}
}

// Interface inheritance

interface Animal {
	void eat();
}

interface Dog extends Animal {
	void bark();
}

class StreetDog implements Dog {
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	public void bark() {
		System.out.println("Dog is barking");
	}
}