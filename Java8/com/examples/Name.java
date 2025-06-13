package com.examples;

import java.util.Arrays;

public class Name {
    public static void main(String[] args) {
    	String[] name = {"  Gayathri ", " Divya ", " Varshini ",  "  Priya"};
    	Arrays.stream(name).forEach((us)->System.out.println(us.trim()));
    }
}

