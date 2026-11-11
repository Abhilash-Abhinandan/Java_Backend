package com.abhilash.error;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Error3 {
	public static void main(String args[]) {
		try {
			readFile();
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}
	
	private static void readFile() throws FileNotFoundException {
		FileReader fr = new FileReader("abc.txt");
	}
}
