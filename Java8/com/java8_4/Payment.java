package com.java8_4;

@FunctionalInterface
public interface Payment {
    double cashBill(double amt);

    default double diwaliDiscount(double amt) {
        return amt - (amt * 5 / 100);
    }
}