package com.abhilash.oops.polymorphism2;

class Animal {
	void sound() { 
		System.out.println("Animal"); 
		} 
	}

class Dog extends Animal {
    @Override 
    void sound() { 
    	System.out.println("Dog");
    }
    
    void fetch() { 
    	System.out.println("Fetch"); 
    }
}

public class Driver1 {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.sound();
//        Dog d = (Dog) a;
//        d.fetch();
//        Animal a2 = new Animal();
//        System.out.println(a2 instanceof Dog);
        
        System.out.println("--------------------------------");
        
//        Animal a = new Animal();
//        Dog d = (Dog) a;
//        d.fetch();
        
    }
}

/*
Dog
Fetch 
false
*/