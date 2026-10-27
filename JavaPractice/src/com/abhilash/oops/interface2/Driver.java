package com.abhilash.oops.interface2;

public class Driver {
	public static void main (String args[]) {
		VechileDriver driver = new CarDriver();
		driver.drivingExperince();
		driver.driverId();
	}
}

interface VechileDriverEligble {
	void driverLicense();
	void drivingExperince();
}

abstract class VechileDriver implements VechileDriverEligble {
	abstract void driverId();
}

class CarDriver extends VechileDriver {
	@Override
	public void driverId() {
		System.out.println("Deriver has the driver id!");
	}
	
	@Override
	public void driverLicense() {
		System.out.println("Driver has tha valid driver's license!");
	}
	
	@Override
	public void drivingExperince() {
		System.out.println("Driver has 2 years of experinces! ");
	}  
}
