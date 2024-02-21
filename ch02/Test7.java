package com.ruby.java.ch02;

public class Test7 {
public static void main(String[] args) {
	//boolean isOn = false;
		//반복 실행
	//short e =10;
	//int f = -e;//-는 정수형의 연산자
	int a= 10;
	//전후위 연산자는 int랑 long만
	a++;
	System.out.println(a);
	++a;
	System.out.println(a);
	
	int b,c = 0;
	b = a++;
	c = ++a;
	System.out.println("b="+b+", c="+c );
	System.out.println("a="+a);
	boolean result = b == c;
	System.out.println("result="+result);
	}
}
