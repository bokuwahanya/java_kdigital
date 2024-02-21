package com.ruby.java.matrix;

class mx {
	public static int mx1;
	int mx;	
}

public class mx_rnd {
	public static void main(String[] args) {
		mx A1 = new mx();
		mx A2 = new mx();
		
		A1.mx++;
		mx.mx1++;
		A2.mx++;
		mx.mx1++;
		
		System.out.println(mx.mx1 + " : " + A1.mx);
		System.out.println(mx.mx1 + " : " + A2.mx);
	}
	

}
