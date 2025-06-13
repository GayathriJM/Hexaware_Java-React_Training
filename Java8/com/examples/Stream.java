package com.examples;

import java.util.Arrays;

public class Stream {

	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "mango", "orange"};
        Arrays.stream(fruits).forEach(f -> System.out.println(f));
        
        Arrays.stream(fruits)
        .filter(f -> f.length() > 5)
        .forEach(f -> System.out.println(f));
        
        double sal[] = {1000,2500,4000,8000,5500,7500,12000,8500,4500};
		Arrays.stream(sal).filter((i)->i>5000).forEach((i)->System.out.println(i));

	}

}
