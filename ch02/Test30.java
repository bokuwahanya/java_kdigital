package com.ruby.java.ch02;

public class Test30 {
public static void main(String[] args) {
	for(int i =2; i < 10; i++ ) {
		for(int j = 1; j < 10; j++) {
			for(int k = 1; k < 10; k++)
			System.out.println(i + "*" + j + "=" + (i * j));
		}
		System.out.println("\t");  //한줄바꿈
	}
  }
}
