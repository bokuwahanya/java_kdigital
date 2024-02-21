package com.ruby.java.ch05;

public class Test02 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v) //v에 있는 값을 하나씩 때서 x에 입력. v라는 배열이 있다 할당 i가 생략
			System.out.print(x + " ");
		System.out.println();		
	}
	//for(int x : v){
	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("김푸름", 90, 95, 92);
		test("김하늘", 80, 98, 95);
		
	}
}
