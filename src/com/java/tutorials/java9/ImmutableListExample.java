package com.java.tutorials.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {

	public static void main(String[] args) {
		
	/*	List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        
        // before java 9
        fruits = Collections.unmodifiableList(fruits);
        
        fruits.add("strawberry");
        System.out.println(fruits);
      */
		List<String> fruits = List.of("Banana" ,"Apple","Mango","Orange");
		fruits.add("strawberry");
		System.out.println(fruits);
	}

        
		
			
	}
