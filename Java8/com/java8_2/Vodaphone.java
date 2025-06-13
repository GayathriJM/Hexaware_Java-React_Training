package com.java8_2;

public class Vodaphone implements Sim {
    public void calling() {
        System.out.println("call charge: 2rs per minute");
    }

    public void message() {
        System.out.println("sms charge: 1rs per sms");
    }
}