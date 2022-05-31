package com.java.tutorials.java9;

public class App implements CustomCalculator {

	public static void main(String[] args) {
		CustomCalculator calculator = new App();
	    int sumOfEvenNo = calculator.addEvenNumbers(1,2,3,4,5,6,7,8,9);
	    System.out.println(sumOfEvenNo);
	    
	    int sumOfOdd = calculator.addOddNumbers(1,2,3,4,5,6,7,8,9);
		System.out.println(sumOfOdd);

	}

}
