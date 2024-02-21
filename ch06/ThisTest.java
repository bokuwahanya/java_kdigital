package com.ruby.java.ch06;

public class ThisTest {
	int i = 1; // 필드 변수
	
	public void first() {
		int i = 2;
		int j = 4;
		this.i = i + j;
		
		second(4);
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i + j; // 가까운 변수로 이동
	}
	
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
		System.out.println("Done");
	}
}
