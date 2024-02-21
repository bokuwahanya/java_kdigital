package com.ruby.java.ch02;

import java.util.Scanner;

public class Test28 {
public static void main(String[] args) {
	// do~while문 사용 빈도가 낮음
	// while는 조건검사에 따라 실행을 안하는데 do~while은 조건검사에 상관없이 한번은 실행함
	
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자입력");
	int a = sc.nextInt();
	
	
	//for 문
	for(int i = 0; i < a; i++) {
		System.out.println("for ok");
		
	
	//while문
		int j = 0;
	while(j < a) {
		System.out.println("while ok");
		j++;
		
	}
	
	// do-while 문
		int k = 0; 
	do {
		System.out.println("do-while ok");
			k++;	
	}while(k < a);
	
	
	
   }
}
}



