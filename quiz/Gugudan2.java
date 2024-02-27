package com.ruby.java.quiz;


public class Gugudan2 {
	int i;

	public Gugudan2(int i) {
		this.i= i;
		// TODO Auto-generated constructor stub
	}

	public Gugudan2 multiplynum(Gugudan2 x) {
		 Gugudan2 k = new Gugudan2(this.i);
		 
		 for(int i = 0; i < 10; i++) {
			 k.i=x.i*i;
		 }
		// TODO Auto-generated method stub
		return k;
	}
	
	public void print(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + "단");
	}
	public static void main(String[] args) {
		 
		 Gugudan2 i = new Gugudan2(1);
		 Gugudan2 x ;
		 
		 x = i.multiplynum(i);
}
}