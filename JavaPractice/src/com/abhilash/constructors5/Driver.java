package com.abhilash.constructors5;

public class Driver {
	public static void main(String args[]) {
		ElectronicProducts electronicProduct = new ElectronicProducts("Macbook", "200000", "MCB-43434", 3);
		
		System.out.println(electronicProduct.productName);
	}
}
