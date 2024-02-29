package com.ruby.java.ch14;

interface MyInterface {
	public void print();
}
class MyClass1 implements MyInterface{
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("Myclass1");
	}
}

class MyClass2 implements MyInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Myclass2");
	}
}



