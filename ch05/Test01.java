package com.ruby.java.ch05;

public class Test01 {		//클랙스
	static void test(int... V) {	//
		System.out.print(V.length + " : ");
		for(int X : V)
			System.out.print(X + " ");
		System.out.println();
}
	
	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}
}
