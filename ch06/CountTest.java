package com.ruby.java.ch06;

class Count {
	public static int totalCount;
	int count;
}	//defult 같은 package 안에서 만

public class CountTest {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;	//인스턴트 변수 heap
		Count.totalCount++; //  static에 있는 거 클래스 변수 증가 코드 영역
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		
		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}
}
