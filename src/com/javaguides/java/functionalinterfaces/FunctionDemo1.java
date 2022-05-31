package com.javaguides.java.functionalinterfaces;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}

public class FunctionDemo1 {
	
	public static void main(String[] args) {
		
	//	Function<String, Integer> function = new FunctionImpl();
	//	System.out.println(function.apply("Pandurang"));
		
		Function<String, Integer> function = (String s) -> s.length();
		System.out.println(function.apply("Hande"));
		
	}

}
