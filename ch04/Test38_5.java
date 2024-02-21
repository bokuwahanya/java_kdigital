package com.ruby.java.ch04;

import java.util.Random;

public class Test38_5 {
public static void main(String[] args) {
	
	Random rnd = new Random(); 
	
	int A[][]= new int [3][4]; //A 행렬 설정
	
		//A 난수 입력
		for(int i = 0; i < A.length; i++) 
			for(int j = 0; j < A[0].length; j++) 
				A[i][j] = rnd.nextInt(30); 
		
		System.out.println("----------------A난수-----------------");
		//A 출력 문장
		for(int i = 0; i < A.length; i++) { 
			for(int j = 0; j < A[0].length; j++) {
				
				System.out.print(A[i][j]);
				System.out.print("\t");
				}
				System.out.println();
			}
				System.out.println("----------------B난수-----------------");
				
					
	int B[][]= new int [4][5]; //B 행렬 설정
	
		//B 난수 입력
		for(int i = 0; i < B.length; i++)
			for(int j = 0; j < B[0].length; j++)
				B[i][j] = rnd.nextInt(30);
		
		//B 출력 문장
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j <B[0].length; j++) {
				
				System.out.print(B[i][j]);
				System.out.print("\t");
				}
				System.out.println();	
			}
				System.out.println("----------------C=A*B----------------");

				
	int C[][] = new int [3][5];
		//C 계산 문장
		for(int i = 0; i < A.length; i++) 
			for(int j = 0; j < B[0].length; j++) 
				for(int sum =0; sum <B.length; sum++)
					for(int k = 0; k < B.length; k++) { 
						
						sum += A[i][k]*B[k][j];
						C[i][j] = sum; 
			}
		// C 출력 문장					
		for(int i = 0; i < C.length; i++) {
			for(int j = 0; j < C[0].length; j++) { // 출력할 때 For문이 2개만 있으면 된다. 열과 행을 보여주면 된다. *주의*
				
				System.out.print(C[i][j]);
				System.out.print("\t");
				
				if((j+1) % C[0].length == 0) // J가 0부터 시작하면 나머지가 없을 때 0으로 나눠 떨어준다. 
					System.out.println();
			}
		}
				
	}
}

