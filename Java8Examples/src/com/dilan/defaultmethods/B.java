package com.dilan.defaultmethods;
public interface B {

	default void bar() {
		System.out.println("Default B");
	}

}
