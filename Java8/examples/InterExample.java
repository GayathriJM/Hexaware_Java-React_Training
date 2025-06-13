package com.examples;

interface Device {
 void turnOn();
}
class Fan implements Device {
 public void turnOn() {
     System.out.println("fan on");
 }
}
class Light implements Device {
 public void turnOn() {
     System.out.println("light on");
 }
}
public class InterExample {
 public static void main(String[] args) {
     Device d;
     d = new Fan();
     d.turnOn();
     d = new Light();
     d.turnOn(); 
 }
}
