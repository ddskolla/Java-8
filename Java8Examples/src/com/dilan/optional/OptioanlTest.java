package com.dilan.optional;

import java.util.Optional;

public class OptioanlTest {

	public static void main(String[] args) throws Exception {
	
	//ifPresent
	//orElse;
    //System.out.println(myMethodOld(0).length());
    System.out.println(myMethod(0).get());


	}

	public static String myMethodOld(int a) {
		if (a == 1) {
			return "Ok";
		}
		return null;
	}
	
	public static Optional<String> myMethod(int a) {
		if (a == 1) {
			return Optional.of("Ok");
		}
		return null;
	}


}
