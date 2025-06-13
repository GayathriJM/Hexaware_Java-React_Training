package com.java8_4;

public class Main {
    public static void main(String[] args) {

        double amount = 5000;

        Payment upi = (amt) -> amt - (amt * 5 / 100);           
        Payment cash = (amt) -> amt - (amt * 10 / 100);      
        Payment creditCard = (amt) -> amt - (amt * 4 / 100);   
        Payment others = (amt) -> amt - (amt * 2 / 100);        

        System.out.println("upi: " + upi.cashBill(amount));
        System.out.println("cash: " + cash.cashBill(amount));
        System.out.println("credit card: " + creditCard.cashBill(amount));
        System.out.println("others: " + others.cashBill(amount));

        System.out.println(upi.diwaliDiscount(amount));
    }
}

