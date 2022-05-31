package com.java.tutorials.java9;

import java.security.PublicKey;


public interface CustomInterface {

	public abstract void abstractMethod();
	
	public default void defaultMethod() {
		privateMethod();
		System.out.println(" default method");
		
	}
		public static void staticMethod() {
			privateStaticMethod();
			System.out.println(" static method ");
		}
		
		private void privateMethod() {
			System.out.println(" private method ");
		}
		
		private static void privateStaticMethod() {
			System.out.println(" private static method ");
		}
	

	}


