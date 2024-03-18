package com.ruby.java.recursive;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n - 1); // 함수가 자기자신을 부른다 리커시브
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.: ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은" + factorial(x) + "입니다.");
	}
}
