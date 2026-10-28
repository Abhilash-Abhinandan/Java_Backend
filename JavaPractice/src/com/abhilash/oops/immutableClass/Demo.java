package com.abhilash.oops.immutableClass;

public class Demo {
	
	public static void main(String args[]) {
		Student student = new Student(26, "Abhilash");
		System.out.println(student.getAge());
		System.out.println(student.getName());
	}
}

final class Student {
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// Getters
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}