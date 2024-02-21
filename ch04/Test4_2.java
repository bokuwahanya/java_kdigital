package com.ruby.java.ch04;

public class Test4_2 {
public static void main(String[] args) {
	
	String []st = {"apple", "banana", "peach"};
	int[]arr= {1,2,3,4,5};
	for (int i = 0; i < 3; i++) //#1 i에 대한 변수 선언 필수
		System.out.println(arr[i]);
	
	for (String stx : st)       //#2
		System.out.println(stx);
	
	for (int num: arr)  //#3 간결한 코딩 배열의 모든 원소 출력할 때 index를 사용할 필요 없을 때
		System.out.println(num);
	
//	int[] score;
//	score = new int[] {1,2,3,4,5};
}
}
