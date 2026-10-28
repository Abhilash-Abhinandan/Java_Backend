package com.abhilash.oops.OopDemo;

//============ ABSTRACTION ============
//Abstract class = a blueprint. You cannot do `new Shape()`
abstract class Shape {

 // ============ ENCAPSULATION ============
 // 'private' field — hidden from outside, exposed via getter/setter
 private String name;

 Shape(String name) {
     this.name = name;
 }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 // Abstract method — subclass MUST implement it
 public abstract double area();

 // Concrete method — inherited by all subclasses
 public void describe() {
     System.out.println(name + " area = " + area());
 }
}

//============ INHERITANCE ============
class Circle extends Shape {
 private final double radius;

 Circle(double radius) {
     super("Circle");   // call parent constructor
     this.radius = radius;
 }

 // ============ POLYMORPHISM (method overriding) ============
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

class Rectangle extends Shape {
 private final double w, h;

 Rectangle(double w, double h) {
     super("Rectangle");
     this.w = w;
     this.h = h;
 }

 @Override
 public double area() {
     return w * h;
 }
}

//============ MAIN ============
public class OopDemo {
 public static void main(String[] args) {

     // Polymorphism: parent-type reference, child-type object
     Shape[] shapes = { new Circle(2), new Rectangle(3, 4) };

     for (Shape s : shapes) {
         s.describe();   // dynamic dispatch — runs the right area()
     }
 }
}