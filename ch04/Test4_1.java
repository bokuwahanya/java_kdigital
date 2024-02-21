package com.ruby.java.ch04;

public class Test4_1 {
public static void main(String[] args) {
	int[]arr = new int[5]; // new 배열 공간 할당 명령어 
	arr[0] = 10; //arr의 0번지에 10저장
	arr[1] = 20; //arr의 1번지에 20저장
	arr[2] = 30; //arr의 2번지에 30저장
	arr[3] = 40; //arr의 3번지에 40저장
	arr[4] = 50; //arr의 4번지에 50저장
	
	for(int i =0; i < arr.length; i++)
		System.out.println(arr[i]);
	//배열은 0부터 시작 부호 중요
	
//	System.out.println(arr[0]); // arr의 0번지 값 출력
//	System.out.println(arr[1]); // arr의 1번지 값 출력
//	System.out.println(arr[2]); // arr의 2번지 값 출력
//	System.out.println(arr[3]); // arr의 3번지 값 출력
//	System.out.println(arr[4]); // arr의 4번지 값 출력
}
}
