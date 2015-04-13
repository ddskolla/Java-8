package com.dilan.defaultmethods;

public interface A {

	void foo();
	default void bar(){
		System.out.println("Default A");
	};
}
