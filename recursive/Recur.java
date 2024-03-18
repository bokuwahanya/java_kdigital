package com.ruby.java.recursive;

import java.util.Scanner;

class Recur {
	static void recur(int n) {
		InStack s = new InStack(n);
//		while (n > 0) { //if(n > 0);
		while(true) {
			if (n > 0) { //체스판에 퀸을 배치할 수 있으면.
				s.push(n);//recur(n-1);
				n = n -1 ;
				continue;
			}
			if (s.isEmtpy() != true) {
				n = s.pop(); // 팝한 위치를 사용해서 다음 열을 조사하고 더 이상 없으면 이전 행으로 돌아가고 
				System.out.println(n); 
				n = n-2;
				continue;
			}
			break;
//			recur(n - 1);
			// n값 출력
//			n = n - 2; // recur(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력해라: ");
		int x = sc.nextInt();
		
		recur(x);
	}
}