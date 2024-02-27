package com.ruby.java.ch11;

public class Test2 {
	
	private static void test1() {
		
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}
		catch(Exception e) {
			System.out.println("오류발생");
		}
		finally {
			System.out.println("ok");
		}
		System.out.println("4");
	}
	
	private static void test2() {
		try {
			int temp = 10/0;
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			
			

			
			System.out.println("ok");
		}
		catch(ArrayIndexOutOfBoundsException e1){
			e1.printStackTrace();
//			System.out.println("오류 발생 :" + e1);
			
		}
		catch(NullPointerException e2) {
//			System.out.println(e2.getMessage());
			e2.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류 발생 :" + e);
		}
		System.out.println("test2 End");
		return;
	}
	

	public static void main(String[] args) {
		test2();
		System.out.println("test2 end");
		test1();
		System.out.println("test1 end");
	}
	
		

}
