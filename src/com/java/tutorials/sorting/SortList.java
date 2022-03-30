package com.java.tutorials.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	
	public static void main(String[] args) {
		
		/*
		// create list
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		
		Collections.sort(list); // ascending order
		System.out.println(list);
		
		Collections.reverse(list); // descending order
		
		System.out.println(list);
		*/
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(10, "Santosh", 29, 350000));
		employees.add(new Employee(10, "Sanjay", 30, 450000));
		employees.add(new Employee(10, "Pramod", 29, 500000));
		
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getName().compareTo(o2.getName()));
			}
		});
		Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println(employees); // descending order
	}

}
 
class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
}
