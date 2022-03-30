package com.javaguides.java.functionalinterfaces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo  {
	
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a + b);
		
		BiConsumer<Integer, Integer> Subtraction = (a,b) -> System.out.println(a - b);
		
		BiConsumer<Integer, Integer> Multiplication = (a,b) -> System.out.println(a * b);
		
		BiConsumer<Integer, Integer> Division = (a,b) -> System.out.println(a / b);
	
		
		biConsumer.accept(100, 400);
		Subtraction.accept(400, 100);
		Multiplication.accept(100, 400);
		Division.accept(400, 100);
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "C++");
		map.put(3, "Rust");
		map.put(4, "JavaScript");
		map.put(5, "Go");
		
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});
	}

}
