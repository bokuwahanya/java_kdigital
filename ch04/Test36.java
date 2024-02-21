package com.ruby.java.ch04;

public class Test36 {
public static void main(String[] args) {
	char letter = 'A';
	int num = 'A';
	System.out.println("num = " + num);
	char[] alp = new char[26];
	
	for(int i = 0; i <alp.length; i++) {
		alp[i] = (char) ((int)letter + i); // 타입캐스팅으로 작성자의 의도 표출
	}
	for(char c : alp) {
		System.out.println(c);
	}
  }
}
