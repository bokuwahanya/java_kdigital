package com.ruby.java.ch11;

import java.io.FileInputStream;

public class Test04 {

	public static void test() throws Exception {
		FileInputStream fi = new FileInputStream("a1.txt");
		int c ;
		while((c = fi.read()) != -1) {
			System.out.print(c);
			System.out.print(", ");
			System.out.print((char) c);
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}



