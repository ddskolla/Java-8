package com.dilan.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaAndStreamsTest3 {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1, 3, 5, 6, 7, 8);

		// Double all values between 3 & 7 and add them up

		// Pre Java 8
		Integer result = 0;
		for (Integer integer : myList) {
			if (integer > 3 && integer < 7) {
				result = result + (integer * 2);
			}
		}

		System.out.println(result);

		// Java 8
		System.out.println(myList.stream()
		 	  .filter(x -> x > 3 && x < 7)
		 	  .map(x -> x *2)
		 	  .reduce(0,(x,y) -> x+y));
		
		
		//Intermediate operations (lazy)
		//Terminal operations (eager)
		// Parallel stream

	}

}
