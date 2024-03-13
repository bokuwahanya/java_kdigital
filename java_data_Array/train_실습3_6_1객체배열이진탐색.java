package com.ruby.java.java_data_Array;

/*
 * Comparable 구현
 */
/*
 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
 * 함수(메소드) 전체를 작성하는 훈련 
 */
import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;

	public PhyscData2 (String string, int i, double d) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.height = i;
		this.vision = d;
	}
	@Override
	public String toString() {
		return "name : " + name + "/"  + height + "/" + vision;
		
	}
	@Override
	public int compareTo(PhyscData2 p) {
		return this.name.compareTo(p.name);
		
	}
//	public boolean equals(PhyscData2 p) {
//		return this.name.compareTo(p.name);
//		
//	}
	
}
public class train_실습3_6_1객체배열이진탐색 {


	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("나동", 164, 1.3),
				new PhyscData2("최길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("박동", 182, 0.6),
				new PhyscData2("이동", 167, 0.2),
				new PhyscData2("길동", 167, 0.5),
		};
		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);
		showData("역순 재배치후", data);
		Arrays.sort(data);//사용된다 그 이유는?
		showData("Arrays.sort() 정렬후", data);
		
		PhyscData2 key = new PhyscData2("길동", 167, 0.2);
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(<길동,167,02>): result = " + resultIndex);
		
		
		/*
		 * 교재 109~113
		 */
		key = new PhyscData2("박동", 182, 0.6);
		resultIndex = binarySearch(data, key);//comparable를 사용
		System.out.println("\nbinarySearch(<박동,182,0.6>): result = " + resultIndex);
		
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		key = new PhyscData2("이동", 167, 0.6);
		resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
		System.out.println("\nArrays.binarySearch(<이동,167,0.6>): result = " + resultIndex);
	}

	private static void reverse(PhyscData2[] data) {
		// TODO Auto-generated method stub
		for(int i = 0; i < data.length/2; i++) {
			swap(data, i, data.length - i -1);
		}
	}

	private static int binarySearch(PhyscData2[] data, PhyscData2 key) {
		// TODO Auto-generated method stub
		int pl = 0;
		int pr = data.length -1;
		do {
			int pc = (pr+pl)/2;
			if(data[pc].compareTo(key) == 0) // 숫자가 아니면 무조건 컴페어 투를 쓴다.
				return pc;
			else if (key.compareTo(data[pc]) < 0)
				pl = pc + 1;
			else
				pr = pc - 1;
		}while(pl<=pr);
		return -1;
	}

	private static int linearSearch(PhyscData2[] data, PhyscData2 key) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while (true) {
			if (i == data.length)
				return -1;
			if(data[i].compareTo(key) == 0)
				return i;
			i++;
		}
		
	}

	private static void sortData(PhyscData2[] data) {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data.length; j++) {
				if(data[i].compareTo(data[j])>0)
					swap(data, i , j);
			}
		}
		// TODO Auto-generated method stub
		
	}

	private static void showData(String string, PhyscData2[] data) {
		// TODO Auto-generated method stub
		System.out.println(string);
		for(int i = 0 ; i < data.length; i++) {
			System.out.println(data[i]+" ");
		}
		System.out.println();
		
	}
	private static void swap(PhyscData2[] data, int ind1, int ind2) {
		PhyscData2 t = data[ind1];
		data[ind1] = data[ind2];
		data[ind2] = t;
	}
	
	

}
