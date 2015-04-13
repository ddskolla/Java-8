package com.dilan.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest1 {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1, 3, 5, 6, 7, 8);
		
		// Using a for/foreach loop
		for (Integer value : myList) {
			System.out.println(value);
		}

		// Java 8 way
		// Using new foreach & a Consumer interface
		myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
		// Using lambdas
		myList.forEach((Integer t) -> System.out.println(t));


		// Type inference
		myList.forEach(t -> System.out.println(t));


		// Method reference
		myList.forEach(System.out::println);

	}

}
