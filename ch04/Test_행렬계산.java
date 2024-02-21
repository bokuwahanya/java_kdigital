package com.ruby.java.ch04;

import java.util.Random;

public class Test_행렬계산 {
	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의
	 * 1차버젼: 덧셈후 바로 출력
	 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	

	
	static void showMatrix(int X[][]) { //2차원 모습으로 출력
		for(int i = 0 ; i < X.length ; i++) {
			for(int j = 0 ; j < X[0].length; j++) {
				System.out.print(X[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}	
		
	static int[][] addMatrix(int B[][], int C[][]){//int[][] --> 리턴 함수 밑에 리턴 값을 작성해야함 // 파라미터 패신 파라미터에 타입을 기재함 int
		
		int A[][] = new int [B.length][B[0].length];
		for(int i = 0 ; i < A.length ; i++) {
			for(int j = 0 ; j < A[0].length; j++) { // 함수 계산식 
				A[i][j] = B[i][j]+C[i][j];
				}
			}	// 참조변수 선언만 했다  메모리 공간을 할당  = new int [i][j];  
		return A;
		}
	
	static int[][] multiplyMatrix(int B[][], int E[][]){
	
		int D[][] = new int [B.length][E[0].length];
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < E[0].length; j++) {
					for(int k = 0; k < B.length; k++) { 
						
						D[i][j] += B[i][k]*E[k][j];
					}
				}
			}
		return D;		
		}
	
	static int[][] transposeMatrix(int B[][]){
	
	int F[][] = new int[B[0].length][B.length];
	for(int i = 0; i < B[0].length; i++) {
		for(int j = 0; j < B.length; j++) {
			
			F[i][j] = B[j][i];
			}
		}
	return F;
	}
	static void getData(int X[][]) { // 파라미터 전달해서 받는다 X는 밑에 있는 BCE를 받는다
		
//		 * 난수 생성으로 초기화
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < X.length ; i++)
			for(int j = 0 ; j < X[0].length; j++) {
				
				X[i][j] = rnd.nextInt(30);
			
			}
	}
	public static void main(String[] args) {
		
		int A[][];
		int B[][] = new int[3][4];
		int C[][] = new int[3][4];
		int E[][] = new int[4][5];
		int D[][];
		int F[][];
		
		
		System.out.println("행렬 더하기 :  A[3][4] = B[3][4] + C[3][4]");
		getData(B);getData(C);getData(E);
		A = addMatrix(B,C); //함수 호출 배열 이름만 노출
//		showMatrix(B);showMatrix(C);
		showMatrix(A);
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = multiplyMatrix(B,E);
//		showMatrix(B);showMatrix(E);
		showMatrix(D);
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
//		showMatrix(B);
		showMatrix(F);

	}

}


