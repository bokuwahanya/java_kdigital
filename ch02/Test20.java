package com.ruby.java.ch02;

import java.util.Scanner;

public class Test20 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("점수");
	
	int score = sc.nextInt();
	char grade;
	
	if(score >= 90) {
		grade = 'A';
		
	} else if(score >=80) {
		grade = 'B';
	
	} else if(score >=70) {
		grade = 'C';
	
	} else if (score >=60) {
		grade = 'D';
		
	} else {
		grade = 'f';
	}
	System.out.println(grade);
}
	
}
