package com.ruby.java.ch14;

interface Calculator {
	int func();
}
public class Test09 {

	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 = 30;
		
		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++; //클래스 변수
			test.num2++; // 인스턴스 변수 //테스트는 수정이 안되는데 테스트 안에 있는 필드는 수정 가능
			num3++; // 메서드에 선언된 지역변수
			num4++; // 람다식에 선언된 지역변수
			return num4;
		};
	}
}
