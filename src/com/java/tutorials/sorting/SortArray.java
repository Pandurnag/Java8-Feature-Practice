package com.java.tutorials.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {

	public static void main(String[] args) {
		
		// sort Array of employee objects using Comparator interface
		
		Employee[] employees = {
				new Employee(01, "Ramesh", 30, 50000),
				new Employee(02, "Suresh", 40, 30000),
				new Employee(03, "Rupesh", 50, 40000),
				new Employee(04, "Ram", 60, 60000)
	
		
		};
	/*
		System.out.println(" Before sorting => " + Arrays.toString(employees));
		Arrays.sort(employees, new SortEmployeeBySalary());
        System.out.println(" After sorting => " + Arrays.toString(employees));
        
        System.out.println(" Before sorting => " + Arrays.toString(employees));
		Arrays.sort(employees, new SortEmployeeByName());
        System.out.println(" After sorting => " + Arrays.toString(employees));
	*/
		
		
       // System.out.println(" Before sorting => " + Arrays.toString(employees));
       // Arrays.sort(employees,(o1, o2) -> o1.getSalary() - o2.getSalary());
        
       // System.out.println(" After sorting => " + Arrays.toString(employees));

			
       // System.out.println(" Before sorting => " + Arrays.toString(employees));
        
        // Arrays.sort(employees, (Employee o1, employee o2) -> o1.getName().compareTo(o2.getName()));
        //System.out.println("After sorting => " + Arrays.toString(employees));
        
	}
	
}