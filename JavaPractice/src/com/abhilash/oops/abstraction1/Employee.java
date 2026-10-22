package com.abhilash.oops.abstraction1;

abstract public class Employee {
	public abstract String getDetails();
}

class Manager extends Employee {
	@Override
	public String getDetails() {
		System.out.println("Details fetched from database!");
		return "Some string result";
	}
}