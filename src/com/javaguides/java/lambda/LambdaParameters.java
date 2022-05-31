package com.javaguides.java.lambda;

interface Addable{
	int addition(int a, int b);
}

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}
public class LambdaParameters {
	
	public static void main(String[] args) {
		
		
		Addable addition = (int a, int b)-> (a+b);
		int result = addition.addition(10, 20);
		System.out.println(result);
	}

}
