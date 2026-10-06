package com.abhilash.AccountAccess1;
import com.abhilash.security.Account;

public class AccountAccess1 {
	public static void main(String args[]) {
		Account aac = new Account();
		
		// aac.a is visible because of public
		System.out.println(aac.a);
		
		// acc.b is not visible because of protected and 			protected is only accessible within the same package and subclasses.
//		System.out.println(aac.b);
		
		// aac.c is not visible because of default and default is only accessible within same package only.
//		System.out.println(aac.c);
		
		// aac.d is not visible because of private and private is only accessible with in the same class where it defined.
//		System.out.println(aac.d);
	}
}
