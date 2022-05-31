package com.java.tutorials.java9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableHashMap {

	public static void main(String[] args) {
		
		Map<String, String> fruits = new HashMap<String, String>();
		fruits.put("1", "Banana");
		fruits.put("2", "Mango");
		fruits.put("3", "Apple");
		fruits.put("4", "Orange");
		
		// before java 9
		
		Collections.unmodifiableMap(fruits);
		System.out.println(fruits);
		
		// java 9 with factory method
		
		Map<String, String> map = Map.ofEntries(
				Map.entry("1", "Banana"),
				Map.entry("1", "Mango"),
				Map.entry("1", "Apple"));
			
		System.out.println(map);
	}

}
