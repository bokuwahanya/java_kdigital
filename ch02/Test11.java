package com.ruby.java.ch02;

public class Test11 {
public static void main(String[] args) {
	int a = 12;
	int b = -13;
	
	String bBit = Integer.toBinaryString(b);
	System.out.println("b="+bBit);
	
	String aBit = Integer.toBinaryString(a);
	System.out.println("a="+aBit);
	
	int c = 0x27;
		System.out.println("c =" + c);
	
	byte d = 0b00001100;
	byte f = (byte) 0b11110100;

	System.out.println("d ="+ d);
	System.out.println("f ="+ f);
	
	int g = 017 ;//8진법
	int h = 0x7A9 ;//16진법
	int i = 155;
	System.out.println("g="+g+" h="+h);
	String hexa = Integer.toHexString(i);
	System.out.println("hexa=" +hexa);//hexa 10진수를 16진수로 치환표기
	
}
}
