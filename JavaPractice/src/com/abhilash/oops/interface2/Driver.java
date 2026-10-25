package com.abhilash.oops.interface2;

public class Driver {
	
}

interface VechileDriver {
	void driverId();
	void driverLicense();
	void drivingExperince();
}

class CarDriver implements VechileDriver {
	@Override
	public void driverId() {
		System.out.println("Driver id printing");
	}
	
	@Override
	public void driverLicense() {
		System.out.println("Driver has the valid driver's license");
	}
	
	@Override
	public void drivingExperince() {
		System.out.println("Driver has 3 years of experince!");
	}
	
}
