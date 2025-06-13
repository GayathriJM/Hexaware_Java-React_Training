package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Gayathri", "divya", "Varshini", "kowsika", "Priya");
        List<String> up = names.stream()
                                           .filter(name -> Character.isUpperCase(name.charAt(0)))
                                           .collect(Collectors.toList());
        for (String name : up) {
            System.out.println(name);

	}

}}