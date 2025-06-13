package com.java8_3;

public class Main {
 
     public static void main(String[] args) {
    	 int amt = 5000;
    	 
         Payment upi = (amount) -> amount - (amount * 5 / 100);
         Payment cash = (amount) -> amount - (amount * 10 / 100);
         Payment creditcard = (amount) -> amount - (amount * 4 / 100);
         Payment others = (amount) -> amount - (amount * 2 / 100);

         System.out.println("upi: " + upi.calBill(amt));
         System.out.println("cash: " + cash.calBill(amt));
         System.out.println("credit card: " + creditcard.calBill(amt));
         System.out.println("others: " + others.calBill(amt));
 
	}
 
}