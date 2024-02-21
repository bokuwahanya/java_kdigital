package com.ruby.java.ch06;

public class Matrix_test {
	public static void main(String[] args) {	
		int A[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10 ,11, 12}
		};
					
		int B[][] ={
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12}
		};
		int [][] C = new int[3][3];
		for(int i = 0; i < C.length; i++) {
			for(int j = 0; j < C[0].length; j++) {
				C[i][j]=0; // 컴파일러 할 때 C를 초기화 시키는 것이 중요하다.
				for(int k = 0; k < B.length; k++ ) {
						
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("---------A*B---------");
	
		for(int i = 0; i < C.length; i++) {
			for(int j = 0; j < C[0].length; j++) {
					System.out.print(C[i][j]);
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}

