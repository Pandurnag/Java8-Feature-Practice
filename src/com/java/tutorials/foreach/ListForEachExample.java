package com.java.tutorials.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Ramesh", 29));
		list.add(new Person("Tony", 50));
		list.add(new Person("Tom", 45));
		list.add(new Person("John", 55));
		
		// prior Java 8
		for(Person person : list) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
		
		list.forEach((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
			});
		
		// stream
		
		list.stream().forEach((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			
			
		});

	}

}


class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
