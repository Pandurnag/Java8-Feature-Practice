package com.java.tutorials.foreach;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetForEachExample {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("Ramesh", 29));
		set.add(new Person("Tony", 50));
		set.add(new Person("Tom", 45));
		set.add(new Person("John", 55));
		
		// for each loop
		
		for (Person person : set) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
		}
		
		// forEach method + lambda
		
		set.forEach((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
		});
		
		// using stream with forEach() method
		
		set.stream().forEach((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
		});

	}

}
