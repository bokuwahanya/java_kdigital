package com.ruby.java.ch02;

public class Test3 {
public static void main(String[] args) {
	long d = 2147483648L;
	byte age;
	short point;
	int price;
	long totalSales;
	
	age = 23;
	point = 32000;
	price = 3500000;
	totalSales = 2147483648L;//L이 없으면 4byte로 메모리 인식함
	
	//d 변수가 8바이트 확인 방법은?
	int num = 2147483647;
	int numSize = Integer.SIZE;//int 정수변수를 Integer 클래스(객체개념)로 변경 wrapper
	System.out.println("numSize= "+ numSize);
	
	System.out.println(age);
	System.out.println(point);
	System.out.println(price);
	System.out.println(totalSales);
}
}
