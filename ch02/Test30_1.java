package com.ruby.java.ch02;

import java.util.Scanner;

public class Test30_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하시오");
	
	int a = sc.nextInt();
	
	boolean flag = false;
	for(int i = 2 ; i < a; i++  ) {
		if (a % i ==0) {
			flag = true;
			break;
		}
	}
	System.out.println(flag ? "소수가 아닙니다." : "소수 입니다.");
	
//	int i = 2;
//	for(i = 2 ; i < a ; i++) {
//		if (a % i == 0) break;
//	}
//	System.err.println((i < a)?"소수가 아닙니다." : "소수 입니다.");
//	
	
	
	
//	String result = "";
//	
//		
//		if((a % i)== 0); {
//			result = "소수";}
//		else
//		
//		
//	};
}	
}
