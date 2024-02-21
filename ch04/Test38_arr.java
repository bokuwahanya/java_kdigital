package com.ruby.java.ch04;

public class Test38_arr {
public static void main(String[] args) {
	int arr [][] = new int[3][4];
	arr[0][0] = 1;
	int num = arr.length; //행의 길이
	int snum= arr[0].length; //열의 길이
	System.out.println("행의 수 :" + num + "\n열의 수 :" + snum);
//	int arr2[][]= {{1,2},{3,4,7,8},{5,6}}; //가능은 하되 많이 사용하지 않는다. ragged array -코딩 주의가 필요함
}
}
