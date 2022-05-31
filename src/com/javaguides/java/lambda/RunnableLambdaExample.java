package com.javaguides.java.lambda;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("run method called ...");	
	}
	
}


public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
			
		Thread threadLmda = new Thread(() -> System.out.println("run mehod called using lambda ..."));
		
		
		threadLmda.start();
	}

}
