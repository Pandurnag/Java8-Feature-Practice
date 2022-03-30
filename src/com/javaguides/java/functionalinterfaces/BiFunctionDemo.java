package com.javaguides.java.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

 
public class BiFunctionDemo{
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);
		
		BiFunction<Integer, Integer, Integer> subtraction = (t, u) -> (t - u);
		
		BiFunction<Integer, Integer, Integer> Multipliction = (t, u) -> (t * u);
		
		BiFunction<Integer, Integer, Integer> Division = (t, u) -> (t / u);
		
		Function<Integer, Integer> function = ( number ) -> number * number;
		
		
		System.out.println(biFunction.apply(10, 40));
		System.out.println(subtraction.apply(400, 100));
		System.out.println(Multipliction.apply(400, 100));
		System.out.println(Division.apply(400, 100));
	}

}
