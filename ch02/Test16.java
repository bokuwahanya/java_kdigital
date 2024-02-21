package com.ruby.java.ch02;

public class Test16 {
public static void main(String[] args) {
	byte a= 23;
	int b =a;
	//a = (byte)b;//()explict castias 타입변환 시켜라
	
	byte c = 23;
	short d = 47;
	int e =65;
	int f = c + d + e;
	
	System.out.println(f);
	
	byte i = 10;
	byte j = 20;
	byte k = (byte)(i+j);
	
	System.out.println(k);
}
}
