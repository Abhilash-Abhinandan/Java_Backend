package com.abhilash.oops.interface3;

public class Driver2 {

	public static void main(String args[]) {
		StreetDog streetDog = new StreetDog();
		streetDog.bark();
		streetDog.eat();
		streetDog.sound();
	}
}

// Interface inheritance

interface Animal {
	void eat();
	
	// Generally interface do not allow us to define any mothod;
	// But after Java 8 -> It allows us tu define a mothod using default methods
	default void sound() {
		System.out.println("Every animal has different sound");
	}
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
	
	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}
}