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
	
	// throws
	// When a checked exception is happening the compiler will tell us to handle the exception immediatly and will show
	// error and if you do not want to handle that exception in the same method and want to handle the exception in the
	// caller method then we can simply add the key word "throws" and write the specific exception like bellow.
	private static void readFile() throws FileNotFoundException { // We can also write "Exception" also
		FileReader fr = new FileReader("abc.txt");
	}
}
