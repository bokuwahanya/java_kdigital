package com.ruby.java.java_data_Array;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	
	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "name :"+ name + " height :" + height + " vision :" + vision;
		

	}
	@Override
	public int compareTo(PhyscData p) {
		return this.name.compareTo(p.name); // this name과 p.name 비교하여 1, 0, -1로 반환
		// -1이 잘 정렬되어있는상태
		// 1이 바껴야하는 상태
		// 0이 같은 상태

	}
//	public int equals(PhyscData p) {
//		return height;
//
//	}
}
public class 실습2_14객체배열정렬 {
	static void swap(PhyscData[]arr, int ind1, int ind2) {
		PhyscData t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}
	static void sortData(PhyscData []arr) {
		System.out.println("정렬합니다");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) // 
					swap(arr, i, j);
			}
		}
		
	}
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("박길동", 167, 0.2),
				new PhyscData("최길동", 169, 0.5),
		};
		showData(data);
		sortData(data);
		
		//Arrays.sort(null, null);//comparator가 필요하다 
		showData(data);
		}
	
	static void showData(PhyscData[]arr) {
		for(PhyscData i : arr) {
			System.out.println(i);
		}
			
	}

}
