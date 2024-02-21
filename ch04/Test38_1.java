package com.ruby.java.ch04;

import java.util.Random;

public class Test38_1 {
public static void main(String[] args) {
	
	Random rnd = new Random();
	int[][] arr = new int[5][5];
	
//	int num =1;
	
	for(int i =0; i < arr.length; i++) 
		for(int j = 0; j < arr[0].length; j++) 
			arr[i][j] = rnd.nextInt(500); // 입력 FOR 문
   for(int i =0; i < arr.length; i++) {
	   for(int j = 0; j < arr[0].length; j++) { // 출력 FOR 문
		   if (i > j)
		   System.out.print(arr[i][j]);
		   System.out.print("\t");
	   }
		   System.out.println();
	   }
   }
//			int num = arr.length; i++;
//			int snum = arr[i].length; i++;
//					System.out.println(num + snum);
//			
}

