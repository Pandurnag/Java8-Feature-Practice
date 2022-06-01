package com.javaguides.java.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}


public class MethodReferenceDemo {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static int addition(int a, int b) {
		return (a+b);
		
		
	}
		
	public static void main(String[] args) {
		
		// 1. Method reference to a static method
		// Lambda expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		// using method reference
		Function<Integer, Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(4));
		
		// Lambda expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a , b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(biFunctionLambda.apply(10, 20));
		
		// using method reference
		BiFunction<Integer, Integer, Integer> biFunction =  MethodReferenceDemo::addition;
		System.out.println(biFunction.apply(50, 50));
		
		// 2. Method reference to an instance method of an object
		
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		
		// Lambda expression
		Printable printable = (msg) -> methodReferenceDemo.display(msg); 
		printable.print("Hello World!");
		
		// using method reference
		Printable printableMethodRef = methodReferenceDemo ::display;
		printableMethodRef.print("heloo world");
		
		// 3. Reference to the instance method of an arbitrary object
		// Sometimes, we call a method of argument in the lambda expression.
		// In that case, we can use a method reference to call an instance
		// method of an arbitrary object of a specific type.
		
		Function<String, String> stringFunction = (String input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("JAVA GUIDES"));
		
		// Using method reference
		Function<String, String> stringFunctionMethodRef = String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("JAVA GUIDES RAMESH FADTARE"));
		
		String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
		
		// Using Lambda
		Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
		
		// Using method reference
		Arrays.sort(strArray, String::compareToIgnoreCase);
		
		// 4. reference to a constructor
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
		System.out.println(setFunction.apply(fruits));
		
		// Using method reference
		Function<List<String>, Set<String>> setFunctionMethodRef =  HashSet::new;
		System.out.println(setFunction.apply(fruits));
		
		
		
		
		
		
		
		
		
	}

}
