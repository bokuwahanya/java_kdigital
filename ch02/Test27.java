package com.ruby.java.ch02;

import java.util.Scanner;

public class Test27 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
	System.out.println("Num");
	int i = sc.nextInt();
	//int i = 0;					//제어 변수 선언 및 초기화
	while(i <10) {					//조건식
		System.out.println(i);		//실행문
		i
		++;						//증감식
	}
	System.out.println("ok");
	
}
}
