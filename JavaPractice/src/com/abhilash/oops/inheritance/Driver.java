package com.abhilash.oops.inheritance;

class Employee {
	String name = "Abhilash";
	String address = "BTM";
	
	public void markIn(String address) {
		System.out.println(address);
	}
}

class Manager extends Employee {
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		
		markIn(address);
	}
}
public class Driver {
	public static void main(String args[]) {
		Manager mrg = new Manager();
		mrg.doSomething();
	}
}
