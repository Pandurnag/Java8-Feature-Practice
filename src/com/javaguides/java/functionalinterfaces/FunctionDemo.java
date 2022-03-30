package com.javaguides.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		// Example 1
		Function<String, Integer> function = (t) -> t.length();
		System.out.println(function.apply("Ramesh"));
		
		// Example 2
		Function<Integer, String> function2 = ( number ) -> {
			if(number % 2 == 0) {
				return "Number " + number + " is even";
			}else {
				return "Number " + number + " is Odd";
			}
		};
		
		System.out.println(function2.apply(10));
		
		// Example 3
		Function<String, Integer> function3 = (t) -> t.length();
		Function<Integer, Integer> function4 = (number) -> number * 100;
		
		Integer integer = function3.andThen(function4).apply("Ramesh");
		System.out.println(integer);;
		
		//Example 4

	}

}
