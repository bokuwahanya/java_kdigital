package com.ruby.java.ch04;

public class Test34_length {
public static void main(String[] args) {
	int[]score;
	score = new int[] {1,2,3,4,5,6,7,8,9};
	int num = score.length;
	String str = "nice day";
	int snum = str.length();
	//배열일 때는 괄호 없이. calss의 어떤 함수 삽입한 문장의 길이 일때는 괄호
	System.out.println("snum = " + snum);
	System.out.println("num = "+ num);
	
}
}
