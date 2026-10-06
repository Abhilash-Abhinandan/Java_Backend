package com.abhilash.constructor0;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); // Creating connection with console
		
		System.out.println("Please enter your product name : ");
		String name = sc.nextLine(); // Reading String input
		
		
		System.out.println("Enter the pirce :");
		int price = 0;
//		sc.nextLine();
		
		if(sc.hasNextInt()) {
			price = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("Please enter numbers only!");
			sc.nextLine();
		}
		
		System.out.println("Name => " + name);
		System.out.println("Price => " + price);
		sc.close(); // Closing this is very important
	}
}


// Use for loop when you know the number of iteration
// Use while loop when you do not know the number of iteration