package com.abhilash.vechileInspection;

interface Inspectable {
	boolean runSafetyCheck();
	
	default void logInspection(String status) {
		System.out.println("[SYSTEM LOG] Inspection status: " + status);
	}
}

// Marker interface
interface Insured{
	
}

abstract class Vechile implements Inspectable {
	@Override public boolean runSafetyCheck() {
		return true;
	}
}

public class KioskApplication {
	public static void main(String args[]) {
		
	}
}
