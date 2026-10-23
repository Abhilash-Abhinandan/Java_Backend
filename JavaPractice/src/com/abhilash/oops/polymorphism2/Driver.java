package com.abhilash.oops.polymorphism2;

class Employee {
	public void markIn() {
		System.out.println("Employee markingin.....");
	}
}

class HRManager extends Employee {
	 @Override
	public void markIn() {
		System.out.println("HRmanager markingin.....");
	}
}
public class Driver {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.markIn();
		
		Employee emp1 = new HRManager();
		emp1.markIn();
		
//		HRManager hr = (HRManager) new Employee();
//		hr.markIn();
		
		HRManager hr1 = (HRManager) emp1;
		hr1.markIn();
	}
}
