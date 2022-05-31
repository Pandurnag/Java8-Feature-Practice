package com.java.tutorials.java9;

public class Main implements CustomInterface{

	public static void main(String[] args) {
		CustomInterface customInterface = new Main();
		customInterface.defaultMethod();
		customInterface.abstractMethod();
		CustomInterface.staticMethod();
	 

	}

	@Override
	public void abstractMethod() {
		System.out.println(" abstractMethod ");
		
	}

}
