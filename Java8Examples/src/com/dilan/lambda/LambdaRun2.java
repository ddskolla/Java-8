package com.dilan.lambda;

public class LambdaRun2 {
	public static void main(String[] args) {
		
		// Pre java 8
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi...");
				
			}
		});
		t.run();

		// Java 8
		Thread t1 = new Thread(() -> {System.out.println("Yo");
		
		
			});

	}
}
