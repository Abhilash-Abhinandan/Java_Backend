package com.abhilash.service;

public class GradeCalculator {
	double java, sql, html, css, javascript;
	
	public GradeCalculator(double _java, double _sql, double _html, double _css, double _javascript) {
		this.java = _java;
		this.sql = _sql;
		this.html = _html;
		this.css = _css;
		this.javascript =_javascript;
	}
	
	public String calculateGrade() {
		double totalPercentage = (this.calculateTotal(java, sql, html, css, javascript) / 500) * 100;
		String grade = null;
		
		if(totalPercentage >= 90) {
			grade = "A";
		} else if(totalPercentage >= 75 && totalPercentage <= 89) {
			grade = "B";
		} else if (totalPercentage >= 60 && totalPercentage <= 74) {
			grade = "C";
		} else if (totalPercentage >= 40 && totalPercentage <= 59) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	public double calculateTotal(double java, double sql, double html, double css, double javascript) {
		double total = (java + sql + html + css + javascript);
		if(total == 0) return 0.0;
		return total;
	}
	
	
}
