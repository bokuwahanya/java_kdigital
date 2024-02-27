package com.ruby.java.quiz;

public class Gugudan {

	int m;
	
	public void print(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + "단");
		System.out.println();
		for(int num = 1; num < 10; num++) {
		m = (num)*i;	
		System.out.print(i +" * " + num + " = " + m + "\t");
		if( num % 3 == 0) {
			System.out.println();
		}
	}
	}
}
