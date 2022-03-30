package com.javaguides.java.lambda;

@FunctionalInterface
interface EvenOdd{
	void check(int a);
}

public class lambdaExample2 {
	public static void main(String[] args) {
		
		EvenOdd evenOdd = (a) -> {
				if(a % 2 == 0) {
					System.out.println("Number "+ a + " is even.");
				}else {
					System.out.println("Number "+ a + " is Odd.");
				}
				
		};
		evenOdd.check(10);
	}

}
