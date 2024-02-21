package com.ruby.java.ch02;

public class Test29 {
public static void main(String[] args) {
	// 루프제어문 break와 continue
	
	// break 문
	
	//	int cnt = 0;
	//	while(true) {
	//		System.out.println("ok");
	//		cnt += 2;
	//		if(cnt == 10) {
	//			break;
	//		}
	//	}
	
	// continue 문

	for(int i = 0; i < 10; i++) {
		
		if((i % 2) == 0)      	//한 줄에 한 문장이면 괄호 생략 가능  
		continue;
		
		System.out.println(i);
		
		}
	}
}
