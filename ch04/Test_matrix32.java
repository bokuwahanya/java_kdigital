package com.ruby.java.ch04;

import java.util.Random;

public class Test_matrix32 {
public static void main(String[] args) {
				
			Random rnd = new Random();
			
				int A[][] = new int [3][4];
			
					for(int i = 0 ; i < A.length ; i++)
						for(int j = 0 ; j < A[0].length; j++)
							A[i][j] = rnd.nextInt(30);
			
					for(int i = 0; i < A.length ; i++) {
						for(int j = 0; j < A[0].length; j++) {
					
							System.out.print(A[i][j]);
							System.out.print("\t");
							}
							System.out.println();
						}			
			
	}
	
}

