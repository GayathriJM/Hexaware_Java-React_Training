package com.examples;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class custom {
 public static void main(String[] args) {
     int age = 21; 
     try {
         if (age >= 18 && age <= 65) {
             System.out.println("valid");
         } else {
             throw new InvalidAgeException("invalid");
         }
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
 }
}
