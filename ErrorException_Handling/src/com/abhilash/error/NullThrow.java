package com.abhilash.error;

// There's one case where the compiler lets throw past the type check but the JVM still has to do something at runtime: throwing a null reference of an exception type.
public class NullThrow {
	public static void main(String args[]) {
		IllegalArgumentException e = null;
		throw e;
	}
	
	// It will not complain when compilation but it will crashes at runtime
	// The variable error is declared as IllegalArgumentException, which the compiler accepts as a legal target for throw. At runtime, the value is null. The JVM has nothing to actually throw, so it throws a NullPointerException in place of the missing exception.
	// The rull is simple never throw null;
}
