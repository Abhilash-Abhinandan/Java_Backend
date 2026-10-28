package com.abhilash.oops.immutableClass;

public class Demo1 {
	public static void main(String args[]) {}
	
}

final class Student1 {
	private int age; 
	private String name;
	private College college;
	
	public Student1(int age, String name, College college) {
		this.age = age;
		this.name = name;
		this.college = new College(college.collegeName, college.collegeAddress);
	}
	
	public College getCollege() {
		return new College(this.college.collegeName, this.college.collegeAddress);
	}
}

class College {
	String collegeName;
	String collegeAddress;
	
	public College(String collegeName, String collegeAddress) {
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
}