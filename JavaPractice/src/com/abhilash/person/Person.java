package com.abhilash.person;

public class Person {
	public String name;
	public void displayName(String _name) {
		this.name = _name;
		System.out.println("Hello! " + name);
	}
}
