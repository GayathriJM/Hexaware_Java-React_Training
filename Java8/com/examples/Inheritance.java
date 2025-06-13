package com.examples;

class Person {
 void display() {
     System.out.println("I am Gayathri");
 }
}

class Student extends Person {
 void study() {
     System.out.println("I am studying");
 }
}

public class Inheritance {
 public static void main(String[] args) {
     Student s = new Student();
     s.display(); 
     s.study();  
 }
}
