package com.abhilash.error;

public class CleanupOnly {
	public static void main(String args[]) {
		try {
			doWork();
		} catch(RuntimeException e) {
			System.out.println("caught at top :" + e.getMessage());
		}
	}
	
	public static void doWork() {
		try {
			System.out.println("Work started");
			throw new RuntimeException("Disk full");
		} finally {
			System.out.println("Work cleanup ran");
		}
	}
}
