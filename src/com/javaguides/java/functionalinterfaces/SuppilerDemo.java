package com.javaguides.java.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Supplier;

public class SuppilerDemo {
	
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
		
		
	}
}
