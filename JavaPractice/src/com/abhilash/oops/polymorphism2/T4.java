package com.abhilash.oops.polymorphism2;

class A {
    int x = 10;
    void m() { System.out.println("A"); }
}

class B extends A {
    int x = 20;
    @Override void m() { System.out.println("B"); }
}
public class T4 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.m();
        B b = new B();
        System.out.println(b.x);
    }
}
	