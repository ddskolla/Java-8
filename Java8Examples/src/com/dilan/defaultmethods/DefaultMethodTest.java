package com.dilan.defaultmethods;

public class DefaultMethodTest {

	public static void main(String args[]) {

		MyClass myclass = new MyClass();
		myclass.foo();
		myclass.bar();
	}
	
	public static class MyClass implements A,B{
		
		@Override
		public void bar() {
			// TODO Auto-generated method stub
			A.super.bar();
			B.super.bar();
		}
		
		@Override
		public void foo() {
			System.out.println("Implemented");
		}
		
	}

}
