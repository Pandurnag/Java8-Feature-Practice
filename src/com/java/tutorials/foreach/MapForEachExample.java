package com.java.tutorials.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {

	public static void main(String[] args) {
		
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		
		map.put(1, new Person("Ramesh", 29));
		map.put(2, new Person("Tony", 50));
		map.put(3, new Person("John", 55));
		
		// use for each loop
		
		for(Entry<Integer, Person> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			
		}
		
		// use forEach() method + lambda expression
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v.getName());
			
		});

	}

}
