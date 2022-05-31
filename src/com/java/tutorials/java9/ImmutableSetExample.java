package com.java.tutorials.java9;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableSetExample {

	public static void main(String[] args) {
		
	/*	Set<String> fruits = new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		// before java 9
		
		fruits = Collections.unmodifiableSet(fruits);
		fruits.add("S");
		System.out.println(fruits); */
		
		Set<String> fruits = Set.of("Banana", "Orange", "Mango", "Apple");
		fruits.add(" D ");
		System.out.println(fruits);

	}

}
