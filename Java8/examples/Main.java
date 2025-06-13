package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		  List<User> Users= new ArrayList();
	
	        Scanner sc = new Scanner(System.in);
	        int choice;
                
	        do {
	            System.out.println("\n====== User Menu ======");
	            System.out.println("1. Sign In");
	            System.out.println("2. Sign Up");
	            System.out.println("3. Update Password");
	            System.out.println("4. Remove User");
	            System.out.println("5. Show All Users");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
 
	            choice = sc.nextInt();
 
	            switch (choice) {
	                case 1:
	                    System.out.println("Sign In selected");
	                    sc.nextLine();
	                    System.out.println("enter username:");
	                    String unm = sc.nextLine();
	                    System.out.println("enter password:");
	                    String pwd = sc.nextLine();
	                    boolean flag = false;
	                    for (User u : Users) {
	                        if (u.getUname().equals(unm) && u.getPassd().equals(pwd)) {
	                            flag = true;
	                        }
	                    }
	                    if (flag == true) {
	                        System.out.println("found");
	                    } else {
	                        System.out.println("not found");
	                    }
	                    break;
	                    
	                case 2:
	                	User u= new User();
	                	sc.nextLine();
	                    System.out.println("Enter usuer name");
	                    u.setUname(sc.nextLine());
	                    
	                    System.out.println("Enter usuer Password");
	                    u.setPassd(sc.nextLine());
	                    
	                    
	                    System.out.println("Enter usuer Email");
	                    u.setEmail(sc.nextLine());
	                    
	                    
	                    System.out.println("Enter Age");
	                    u.setAge(sc.nextInt());
	                    
	                    Users.add(u);
	                    break;
	                case 3:
	                    System.out.println("Update Password selected");
	                    sc.nextLine();
	                    System.out.println("enter username:");
	                    String uname = sc.nextLine();
	                    System.out.println("Enter old password:");
	                    String pass = sc.nextLine();
	                    boolean flag1 = false;
	                    for (User u1 : Users) {
	                        if (u1.getUname().equals(uname) && u1.getPassd().equals(pass)) {
	                            flag1 = true;
	                            System.out.println("enter new password:");
	                            String newpass = sc.nextLine();
	                            u1.setPassd(newpass);
	                        }
	                    }
	                    if (flag1 == true) {
	                        System.out.println("password updated");
	                    } else {
	                        System.out.println("wrong password");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Remove User selected");
	                    sc.nextLine();
	                    System.out.println("enter username:");
	                    String runame = sc.nextLine();
	                    System.out.println("enter password:");
	                    String rpass = sc.nextLine();
	                    boolean flag2 = false;
	                    for (int i = 0; i < Users.size(); i++) {
	                        if (Users.get(i).getUname().equals(runame) && Users.get(i).getPassd().equals(rpass)) {
	                            Users.remove(i);
	                            flag2 = true;
	                            break;
	                        }
	                    }
	                    if (flag2 == true) {
	                        System.out.println("user removed");
	                    } else {
	                        System.out.println("user not found");
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("Show All Users selected");
	                   
	                    
	                    
	                    for(User obj : Users)
	                    {
	                    	System.out.println(obj.toString());
	                    }
	                    break;
	                case 6:
	                    System.out.println("Exiting the application. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
 
	        } while (choice != 6);
 
		
		
		
		
		
 
	}
 
}