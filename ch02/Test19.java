package com.ruby.java.ch02;

import java.util.Scanner;

public class Test19 {
public static void main(String[] args) {
	
	// 시스템 입력 장치 선언 ==>키보드
	Scanner f = new Scanner(System.in);
	// 입력 메세지 출력
	System.out.println("점수:");
	// 시스템 입력 장치로 부터 정수값 입력
	int score = f.nextInt();
	
	String result = "";
	
	if(score>=60){
		result = "합격" ;
		} else {
		result = "불합격";
		}
	System.out.println("당신의 점수는 "+ score +"점이기 때문에 " +result+ " 입니다");
		
	//위에 조건문 한줄로 줄이기
	int score2=80;
	String victory = (score2>=60) ? "합격" : "불합격" ;
	System.out.println("당신의 점수는 "+ victory +"점이기 때문에 " +result+ " 입니다");
	
//		if () {
//		}
//		else {
//		}
//	조건문 설정시 괄호 먼저 표기후 진행할 것. 

}
}
