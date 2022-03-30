package com.javaguides.java.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		System.out.println(biPredicate.test("pandurang", "hande"));
		System.out.println(biPredicate.test("Java guides", "Java Guides"));
		
		BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x > y;
		BiPredicate<Integer, Integer> biPredicate3 = (x, y) -> x > y;
		
		boolean result = biPredicate2.and(biPredicate3).test(20, 10);
		System.out.println(result);
		
		boolean result1 = biPredicate2.and(biPredicate3).test(20, 10);
		System.out.println(result1);
		
		
	}
}
