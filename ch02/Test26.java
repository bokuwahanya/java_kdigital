package com.ruby.java.ch02;

import java.util.Scanner;

public class Test26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Num");
	int num = sc.nextInt();
	
	int sum1 = 0; //홀수 합
	int sum2 = 0; //짝수 합
	for (int i = 0; i <= num ; i++) {
		//1번방식
		//int i = 0
		//for (; i < 10 ; j++);
		//2번반식
		//for (int i = 0; i < 10) {
		//	i++;
		//3번방식
		//랙 (int i = 0; i < 10 ; i=+2)
		
		
		if (i % 2 == 0) {    //짝수
			sum2 += i;
			System.out.println("e->"+ sum2);
		}
		else {               //홀수
			sum1 += i;
			System.out.println("o->"+ sum1);
		}
	
	}
	System.out.println("OK:" +sum2 + "," + sum1);

}
}

