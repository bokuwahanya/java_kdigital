package com.ruby.java.ch05;

import java.util.Random;

public class matrix_final {
public static void main(String[] args) {
	
	Random rnd = new Random();
	
	int A[][] = new int [3][4];
	int D[][] = new int [3][4];
	int E[][] = new int [3][4];
	
	for(int i = 0 ; i < A.length ; i++)
		for(int j = 0 ; j < A[0].length; j++) {
			
			A[i][j] = rnd.nextInt(30);
			D[i][j] = rnd.nextInt(30);
			E[i][j] = A[i][j]+D[i][j];
			}
	
	int B[][] = new int [4][5];
	
	for(int i = 0; i < B.length; i++)
		for(int j = 0; j < B[0].length; j++)
			
			B[i][j] = rnd.nextInt(30);
	
	int C[][] = new int [3][5];
	
	for(int i = 0; i < A.length; i++) 
		for(int j = 0; j < B[0].length; j++) 
				for(int k = 0; k < B.length; k++) { 
					
					C[i][j] += A[i][k]*B[k][j];
					}
	
	int F[][] = new int [4][3];
	
	for(int j = 0; j < F.length; j++) 
		for(int i = 0; i < F[0].length; i++)
			
			F[j][i] = A[i][j];
	
	System.out.println("---------------C=A*B----------------");
	
	for(int i = 0; i < C.length; i++) {
		for(int j = 0; j < C[0].length; j++) { 
			
			System.out.print(C[i][j]);
			System.out.print("\t");
			}
			System.out.println();
		}
	
	System.out.println("---------------E=A+D----------------");
	
	for(int i = 0; i < E.length ; i++) {
		for(int j = 0; j < E[0].length; j++) {
				
			System.out.print(E[i][j]);
			System.out.print("\t");
			}
			System.out.println();
		}	
	
	System.out.println("---------------F=A^T----------------");
	
	for(int j = 0; j < F.length; j++) {
		for(int i = 0; i < F[0].length; i++) {
		
			System.out.print(F[j][i]);
			System.out.print("\t");
			}
			System.out.println();
		}
	}
}