package com.ruby.java.ch04;

import java.util.Random;

public class Test_matrix1 {
public static void main(String[] args) {
	
	Random rnd= new Random();
	
	int A[][] = new int [3][4];//난수 입력
	int B[][] = new int [4][5];//난수 입력
	
	for(int i= 0; i < A.length; i++)
		for(int j = 0; j < A[0].length; j++) 
			A[i][j]= rnd.nextInt(5); //A 난수입력
			
	for(int K= 0; K < B.length; K++)
		for(int L = 0; L < B[0].length; L++) 
			B[K][L] = rnd.nextInt(5); //B 난수입력
	
	for(int i= 0; i < A.length; i++) { // i가 0부터 3 길이까지 3 증가
	for(int j = 0; j < A[0].length; j++) { // j가 0부터 4길이까지 4 증가
	for(int K= 0; K < B.length; K++) { // k가 0부터 4 길이까지 4 증가
	for(int L = 0; L < B[0].length; L++){ // l이 0부터 5길이까지 5 증가 
		
		System.out.println(A[i][j]); 
		System.out.print("\t");
	   }
		   System.out.println();
}  
	
			}
		}
		}

			   
			   
		   
	int C[][] = new int [3][5];
		
	
	
	int D[][] = new int [3][4];//난수 입력
	int E[][] = new int [3][4];
	int F[][] = new int [4][3];
	
	
	//C = A * B;//행렬 곱하기
	//E = A + D;//행렬 더하기
	//F = A의 전치행렬
     
    }
 

