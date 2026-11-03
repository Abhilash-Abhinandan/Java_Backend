package com.abhilash.oops.interface4;

public class Driver4 {
	public static void main(String args[]) {
		Parent pr = new Child();
//		pr.dis1();
		
	    Child ch = (Child) pr;
		ch.dis1();
	}
}

class Parent {
	void dis1() {
		System.out.println("Dis1");
	}
}

class Child  extends Parent {
	void dis2() {
		System.out.println("Dis2");
	}
}
