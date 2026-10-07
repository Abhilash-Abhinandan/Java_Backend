package com.abhilash.app;

import com.abhilash.service.GradeCalculator;

public class Driver {
	public static void main(String args[]) {
		
		GradeCalculator grd = new GradeCalculator(75, 75, 75, 100, 50);
		String grade = grd.calculateGrade();
		System.out.println(grade);
	}
}
