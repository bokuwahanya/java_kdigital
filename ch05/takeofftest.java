package com.ruby.java.ch05;

public class takeofftest {
public static void main(String[] args) {
	
	System.out.println("1");
	System.out.println("2");
	
	//takeoff(); //takeoff라는 메소드가 리턴하는 값을 num에 저장
	
	//System.out.println(takeoff());
	String num = takeoff(6,7);
	System.out.println(num);
	
	System.out.println("3");
	System.out.println("4");

	// System.out.println(takeoff());
	
}
// int, string, long, boolean, char
static String takeoff(int num1, int num2) { //void는 리턴 값이 없을 때 //프린트 칸 안에 있는 참조 변수로 받는다
	System.out.println("30");
	System.out.println("40");
	System.out.println("50");
	
	return num1 + "------>" + num2 ;
	
	
	
	}
}
