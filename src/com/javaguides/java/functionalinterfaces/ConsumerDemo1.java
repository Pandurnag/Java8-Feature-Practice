package com.javaguides.java.functionalinterfaces;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String input) {
		
		System.out.println(input);
		
	}
	
}


public class ConsumerDemo1 {
	
	public static void main(String[] args) {
		
	//	Consumer<String> consumer = new ConsumerImpl();
	//	consumer.accept("Hello World!");
		
		Consumer<String> consumer = (String input) -> System.out.println(input);
		consumer.accept("Pandurang Hande");
			

}
}