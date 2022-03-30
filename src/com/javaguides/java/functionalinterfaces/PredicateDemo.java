package com.javaguides.java.functionalinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo  {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if(t % 2 == 0) {
				return true;
			}else {
				return false;
				
			}
		};
		System.out.println(predicate.test(10));
		
		// Example 2
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Predicate<Integer> predicate2 = (x) -> x > 5;
		Predicate<Integer> predicate3 = (x) -> x < 8;
		list.stream().filter(predicate2.and(predicate3)).collect(Collectors.toList()).forEach(System.out::println);
		
		// Example 4
		Predicate<String> lengthIs3 = x -> x.length() == 3;
		Predicate<String> startsWithA = x -> x.startsWith("A");
		
		List<String> list1 = Arrays.asList("A", "AA", "AAA", "B", "BBB");
		
		List<String> collect = list1.stream()
				.filter(lengthIs3.or(startsWithA))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
