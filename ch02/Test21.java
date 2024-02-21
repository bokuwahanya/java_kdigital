package com.ruby.java.ch02;

import java.util.Scanner;

public class Test21 {
public static void main(String[] args) {
	
//	Scanner g = new Scanner(System.in);
//	System.out.println("점수");
//	
//	int num1 = g.nextInt();
//	int num2 = g.nextInt();
	
	int a =12;
	int b = 2;	
	char op = '+';
	
	//switch는 byte, short, int, char, String 만 들어감 
	switch(op) {
		case '+':
			System.out.println(a + b); break;
		case '-':
			System.out.println(a - b); break;
		case '*':
			System.out.println(a * b); break;
		case '/':
			System.out.println(a / b); break;
		//default: 어디에도 해당하지 않은 것이 출력 됨			
	}
}	
}
