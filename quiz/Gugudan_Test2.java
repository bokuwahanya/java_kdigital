package com.ruby.java.quiz;

public class Gugudan_Test2 {

	 
	 
	 class ggd{
		 int i;
		 
		 public ggd(int i) {
			 this.i = i; 
		 }
		 
		 ggd multiplynum(ggd x) {
			 ggd k = new ggd(this.i);
			 
			 for(int i = 0; i < 10; i++) {
				 k.i=x.i*i;
			 }
			return k;
			 
		 }

		public static void print(int j) {
			// TODO Auto-generated method stub
			
		}
	 }
	 
	 public static void main(String[] args) {
		 
		 Gugudan2 i = new Gugudan2(1);
		 Gugudan2 x ;
		 
		 x = i.multiplynum(i);
		 
		 
		 
	 
	 ggd.print(2);
	 System.out.println("-".repeat(15));
	 ggd.print(3);
	 System.out.println("-".repeat(15));
	 ggd.print(4);
	 System.out.println("-".repeat(15));
	 ggd.print(5);
	 System.out.println("-".repeat(15));
	 System.out.println("end");
	 
}
}
