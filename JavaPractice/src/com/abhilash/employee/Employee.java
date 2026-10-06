package com.abhilash.employee;

public class Employee {
	private String name = "Abhilash";
	protected String name2 = "yyyy";
	String name1 = "XXX";
	
	public void display(String nameInput) {
		name = nameInput;
		System.out.println(name);
	}
}
