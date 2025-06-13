package com.java8_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
	List<User> users = new ArrayList<>();
	 
    users.add(new User(1, "Amit", 50000.0));
    users.add(new User(2, "Priya", 60000.0));
    users.add(new User(3, "Rahul", 55000.0));
    users.add(new User(4, "Sneha", 70000.0));
    users.add(new User(5, "Vikram", 48000.0));
    users.add(new User(6, "Pooja", 2000.0));
    users.add(new User(7, "Rohit", 75000.0));
    users.add(new User(8, "Neha", 8000.0));
    users.add(new User(9, "Ankit", 54000.0));
    users.add(new User(10, "Kiran", 67000.0));
    
//    users.stream().filter((e)->e.getSalary()>50000).
//    forEach((u)-> System.out.println(u.toString()));
    
    
//    List<User> us = users.stream()
//            .filter(e -> e.getSalary() > 50000)
//            .collect(Collectors.toList());
//        for (User u : us) {
//            System.out.println(u.toString());
            
    
//           1 List<String> p = users.stream()
//            	    .filter(user -> user.getName().startsWith("P"))
//            	    .map(user -> user.getName())
//            	    .collect(Collectors.toList());
//            	System.out.println(p);
//            	
//      
//          2  	List<User> us = users.stream()
//            		    .filter(user -> user.getSalary() > 60000)
//            		    .collect(Collectors.toList());
//            		for (User u : us) {
//            		    System.out.println(u);
//            		}
//            		
//           
//            3		List<String> up = users.stream()
//            			    .map(user -> user.getName().toUpperCase())
//            			    .collect(Collectors.toList());
//            			System.out.println(up);
//            			
//           
//            	4		Map<Integer, String> un = users.stream()
//            				    .collect(Collectors.toMap(user -> user.getUid(), user -> user.getName()));
//            				System.out.println(un);

//    Collections.sort(users,(u1,u2)-> u1.getName().compareTo(u2.getName()) );
//    
//    users.forEach((e)-> System.out.println(e.toString()));
    
//    Collections.sort(users,(u1,u2)-> u1.getSalary().compareTo(u2.getSalary()) );
//    
//    users.forEach((e)-> System.out.println(e.toString()));
    
//    System.out.println(users.stream().max((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));
//    System.out.println(users.stream().min((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));

    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name:");
    String n=sc.nextLine();
    users.stream().filter((user)->user.getName().equals(n)).forEach((user)->System.out.println(user.getSalary()));

            				


    
}
}

