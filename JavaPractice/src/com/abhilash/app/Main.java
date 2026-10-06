package com.abhilash.app;
import com.abhilash.utility.Calculator;
import com.abhilash.employee.Employee;

public class Main {
	public static void main(String args[]) {
		Employee emp = new Employee();
		int result = Calculator.add(2, 3);
		System.out.println(result);
		emp.display("Abhinandan");
	}
}
