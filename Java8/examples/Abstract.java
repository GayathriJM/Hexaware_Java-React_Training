package com.examples;

abstract class Employee {
    String name;
    double sal;
    double bon;
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double sal) {
        this.sal = sal;
    }
    abstract void calBonus();
    public String toString() {
        return "name: " + name + ", sal: " + sal + ", bonus: " + bon;
    }
}

class Temp extends Employee {
    void calBonus() {
        bon = sal * 5 / 100;
    }
}
class Per extends Employee {
    void calBonus() {
        bon = sal * 10 / 100;
    }
}
public class Abstract {
    public static void main(String[] args) {
        Temp emp1 = new Temp();
        emp1.setName("ajay");
        emp1.setSalary(10000);
        emp1.calBonus();
        System.out.println(emp1);

        Per emp2 = new Per();
        emp2.setName("gayathri");
        emp2.setSalary(20000);
        emp2.calBonus();
        System.out.println(emp2); 
    }
}
