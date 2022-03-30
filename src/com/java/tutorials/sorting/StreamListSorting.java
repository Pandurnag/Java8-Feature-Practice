package com.java.tutorials.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<String> sorrtList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sorrtList1);
		
		List<String> sorrtList2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sorrtList2);
		
		// descending order
		
		List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList3);
		
		List<String> sorrtList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sorrtList4);
		
		// sort employee by salary in ascending order
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 28, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Sanjay", 30, 450000));
		employees.add(new Employee(40, "Pramod", 31, 500000));
		
	    List<Employee> 	employeesSortedList =	employees.stream()
	    		.sorted(( o1,  o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
	    
	    // sort employee by salary in descending order
	    
	    List<Employee> 	employeesSortedList1 =	employees.stream()
	    		.sorted(( o1,  o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
	    
	    // Comparator.comparingLong Method Using ascending order Employee salary
	    
	    List<Employee> 	employeesSortedList2 =	employees.stream()
	    		.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
	    
	    // Comparator.comparingLong Method Using descending order
	    
	    List<Employee> 	employeesSortedList3 =	employees.stream()
	    		.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
	    
	    // Comparator.comparingLong Method Using ascending order Employee Age
	    
	    List<Employee> 	employeesSortedList4 =	employees.stream()
	    		.sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
	    
       // Comparator.comparingLong Method Using descending order Age
	    
	    List<Employee> 	employeesSortedList5 =	employees.stream()
	    		.sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
	    
       // Comparator.comparingLong Method Using ascending order Employee Name
	    
	    List<Employee> 	employeesSortedList6 =	employees.stream()
	    		.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	    
      // Comparator.comparingLong Method Using descending order Name
	    
	    List<Employee> 	employeesSortedList7 =	employees.stream()
	    		.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
	    
	    
	    
	    System.out.println(employeesSortedList);
	    System.out.println(employeesSortedList1);
	    System.out.println(employeesSortedList2);
	    System.out.println(employeesSortedList3);
	    System.out.println(employeesSortedList4);
	    System.out.println(employeesSortedList5);
	    System.out.println(employeesSortedList6);
	    System.out.println(employeesSortedList7);

	}

}
