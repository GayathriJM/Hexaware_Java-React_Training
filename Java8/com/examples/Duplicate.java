package com.examples;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {


		        int a[] = {4, 6, 7, 3, 4, 5, 6, 7};

		        List<Integer> l = new ArrayList<>();
		        Set<Integer> dup = new HashSet<>();

		        for (int num : a) {
		            if (l.contains(num)) {
		                dup.add(num);
		            } else {
		                l.add(num);
		            }
		        }
		        System.out.println(dup);

	}

}
