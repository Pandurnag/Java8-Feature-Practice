package com.javaguides.java.lambda;

@FunctionalInterface
interface Arithmetic{
	int operations(int a, int b);
}

public class LambdaExample1 {
	
	public static void main(String[] args) {
		
		// addition operation 
		Arithmetic addition = (a, b) -> (a + b);
		System.out.println("Addition => " + addition.operations(1000, 200));
		
		// subtraction
		Arithmetic substraction = (a, b) -> (a - b);
		System.out.println(" Substraction => " + substraction.operations(500, 300));
		
		// division
		Arithmetic division = (a, b) -> (a / b);
		System.out.println(" Division => " + division.operations(20, 10));
		
		// multiplication
		Arithmetic mul = (a, b) -> (a * b);
		System.out.println(" mul => " + mul.operations(500, 300));
	}

}
