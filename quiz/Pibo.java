package com.ruby.java.quiz;

import java.util.Scanner;

public class Pibo {
	int num;
	int data[];

	//	
	//	public  pibo(int num) {
	//		this.num = num;
	//		data = new int [num] ;
	//		
	//			}
	//	
	//			 
	//	void getdata() {
	//		for(int j = 0; j < data.length; j++) {
	//			this.data[j] = 
	//			//배열에 숫자를 넣는다. 
	//		}		
	//	}
	//	pibo add(pibo x) {
	//		pibo p = new pibo(x.num);
	//		for(int i = 0; i <= x.num; i++ ) {
	//			for(int j = 0; j < x.num; j++) {
	//				p.data[j+2] += p.data[j]+p.data[j+1];
	//				p.data[i] = p.data[j]; 
	//			}
	//		}
	//		return p;
	//		
	//	}

	public  Pibo(int num) {
		this.num = num;
		data = new int [num] ;
		//인덱스 1,2을 따로 처리후
		//2부터 계산 시작.
		if(num == 1 ) {
			data[0] = 0;
			return;
		} 
		data[0] = 0;
		data[1] = 1; // 피보나치는 01이 고정이다. 그래서 0,1을 if문으로 고정시켜준다음 리턴해서 다음 값을 구한다
		if(num == 2) {
			return;
		}

		for(int i = 2; i < data.length; i++) {
			data[i] = data[i-2]+data[i-1];
		}
		//데이터에 값 입력.
	}


	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("숫자입력");

			int f = sc.nextInt();
			if(f <= 0) {
				System.out.println("에러");
				return;
			}
			Pibo p = new Pibo(f);
			p.print();

			//배열 숫자를 입력 받는다.	
		}
	}
	private void print() {
		// TODO Auto-generated method stub
		// 데이터 출력.
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}









