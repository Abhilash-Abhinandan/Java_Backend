package com.abhilash.pacticeFinal;

public class PracticeFinal {
	final double UPI_LIMIT = 100000;
	
	public final void doSomething1() {
//		UPI_LIMIT = 200000;
		// Here use can not change the value of UPI_LIMIT because it is defined as final
		// And using final in variable means we can not change the value of that variable;
	}
	
	public void doSomething2() {
		
	}
}

class PracticeFinal2 extends PracticeFinal{
//	
//	public void doSomething1() {
//		
//	}
	
	// Here above method is can not be override because the method is defined as final;
}
