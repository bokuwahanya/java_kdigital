package com.ruby.java.ch06;

import java.util.Arrays;
import java.util.Random;

public class Matrix_test2 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int mx1[] = new int [48];
		
		for(int a = 0; a < mx1.length; a++)
			mx1[a] = rnd.nextInt(40);
		
		
		// 2가지 1. 행렬만들고 정렬 , 2 원본을 사본받고 재사용
		
		int a = 0;
		
		int A1[][] = new int[3][4];
		for(int i = 0; i < A1.length; i++) {
			for(int j = 0; j < A1[0].length;j++) {
				A1[i][j] = mx1[a++]; 
				}
			}
		int B1[][] = new int[3][4];
		for(int i = 0; i < A1.length; i++) {
			for(int j = 0; j < A1[0].length;j++) {
				B1[i][j] = mx1[a++];
				}
			}
		int A2[][] = new int[3][4];						
		for(int i = 0; i < A2.length; i++) {
			for(int j = 0; j < A2[0].length;j++) {
				A2[i][j] = mx1[a++];
				}
			}					
		int B2[][] = new int[4][3];
		for(int i = 0; i < B2.length; i++) {
			for(int j = 0; j <B2[0].length ;j++) {
				B2[i][j] = mx1[a++];
			}
		}
		int C[][] = new int[3][4];		
		for(int i = 0; i < A1.length; i++) {
			for(int j = 0; j < A1[0].length;j++) {
				C[i][j] = A1[i][j]+B1[i][j];
				}
			}
			
		int D[][] = new int[3][3];
		for(int i = 0; i < D.length; i++) {
			for(int j = 0; j < D[0].length; j++) {
				for(int k = 0; k< D[0].length; k++) {
			
				D[i][j] += A2[i][k]*B2[k][j];
				}
			}
		}
		int F[][] = new int[4][4];
		for(int i = 0; i < F.length; i++) {
			for(int j = 0; j < F[0].length; j++) {
				for(int k = 0; k< B2[0].length; k++) {
			
				F[i][j] += B2[i][k]*A2[k][j];
				}
			}
		}
		Arrays.sort(mx1);

		
		System.out.println("--------배열 오름--------");
		System.out.println(Arrays.toString(mx1));
		
		System.out.println("---------A1+B1---------");
		for(int i = 0; i < A1.length; i++) {
			for(int j = 0; j < A1[0].length;j++) {
				System.out.print(C[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("---------A2*B2---------");
		for(int i = 0; i < D.length; i++) {
			for(int j = 0; j < D[0].length; j++) {
				System.out.print(D[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("---------B2*A2---------");
		for(int i = 0; i < F.length; i++) {
			for(int j = 0; j < F[0].length; j++) {
				System.out.print(F[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
		
		//출력 문장
//		System.out.println(Arrays.toString(mx));
		//Arrays.sort(A,(a,b) -> a<b?-1:(a==b?0:1));  	
	
	

