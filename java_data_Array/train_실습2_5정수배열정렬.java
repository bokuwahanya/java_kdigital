package com.ruby.java.java_data_Array;

import java.util.Arrays;
//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;
public class train_실습2_5정수배열정렬 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);

		sortData(data);
		showData(data);

		reverseSort(data);//역순으로 재배치 - 정렬 아님 
		showData(data);
		
		reverse(data);//역순으로 재배치 - 정렬 아님 
		showData(data);

		
	}
	static void showData(int[]data) {
		for( int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();

	}
	static void inputData(int []data) {
		Random rnd = new Random();
		for(int i = 0; i < data.length; i++)	
			data[i] = rnd.nextInt(10);

	}
	static void swap(int[]arr, int ind1, int ind2) {//교재 67페이지
		int t = arr[ind1];
		arr[ind1] = arr [ind2];
		arr[ind2] = t; 
	}
	static void sortData(int []arr) {
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]){ //compareTo 문자의 아스킥 코드를 때와서 비교 
					swap(arr, i, j);
				}
			}
		}
	}
	static void reverse(int[] arr) {//교재 67페이지
		for (int i = 0 ; i <arr.length/2 ; i++) {
			swap(arr, i, arr.length -i -1);	
		}
	}
	static void reverseSort(int []arr) {
		for(int i = 0; i <arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
}
