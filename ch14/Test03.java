package com.ruby.java.ch14;


interface Verify {
	boolean check(int n);
}
interface Verify2{
	boolean check(int n, int d);
}
public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n%2) == 0 ;
		System.out.println(isEven.check(24));

		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
		
		Verify2 vf = (n, d) -> (n%d) == 0;
		System.out.println(vf.check(24, 3));
		//변수 식이 하나만 선언된 인터페이스에만 람다식 사용 가능
	}
}
