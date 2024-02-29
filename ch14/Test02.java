package com.ruby.java.ch14;


interface Multiply {
	double getValue();
}
//@FunctionalInterface 바디에 함수가 2개 이면 안된다.
public class Test02 {
	
	public static void main(String[] args) {
		Multiply m;
		m = () -> 3.14 *2;
		System.out.println(m.getValue());
		
		m = () -> 10 *3;
		System.out.println(m.getValue());
	}
}
