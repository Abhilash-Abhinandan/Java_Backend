package com.abhilash.app;

import com.abhilash.employee.EmployeeIdGenerator;

public class Driver {
	public static void main(String args[]) {
		EmployeeIdGenerator emp = new EmployeeIdGenerator("Abhilash", "Java Backend", 150000);
		String id = emp.getEmployeeId();
		System.out.println(id);
		
		EmployeeIdGenerator emp1 = new EmployeeIdGenerator("Abhinandan", "Java Backend", 150000);
		String id1 = emp1.getEmployeeId();
		System.out.println(id1);
	}
}
