package com.ruby.java.quiz;

import java.util.Scanner;

public class PrimeNumber2 {

	static Boolean isPrimeNumber(int a) {    
		for(int i = 2 ; i < a; i++) {
			if (a % i == 0) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
	
			System.out.print("숫 자 입 력");
			int a = sc.nextInt();	// 3

			int s = (int) Math.pow(10.0, (double)(a-1)); // 10의 (a-1)승으로 초기화	// 100
			int e = (int) Math.pow(10.0, (double)(a))-1; // 10의 a승에서 1을 뺀값	// 999

			for (int i = s ; i <= e ; i++) {
				if (isPrimeNumber(i) == true) {
					System.out.println(i);
				}
			}
		}
		System.out.println("don");
	}

}
