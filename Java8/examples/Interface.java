package com.examples;

interface Sim {
    void calling();
    void message();
    void calBill();
}
class Vodaphone implements Sim {
    public void calling() {
        System.out.println("vodaphone calling");
    }
    public void message() {
        System.out.println("vodaphone:2 messages");
    }
    public void calBill() {
        System.out.println("vodaphone bill calculated");
    }
}
class Airtel implements Sim {
    public void calling() {
        System.out.println("airtel:1 call");
    }
    public void message() {
        System.out.println("airtel:4 messages");
    }
    public void calBill() {
        System.out.println("airtel bill calculated");
    }
}
public class Interface {
    public static void main(String[] args) {
        Sim s1 = new Vodaphone();
        s1.calling();
        s1.message();
        s1.calBill();

        Sim s2 = new Airtel();
        s2.calling();
        s2.message();
        s2.calBill();
    }
}

