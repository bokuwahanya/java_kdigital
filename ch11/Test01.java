package com.ruby.java.ch11;

public class Test01 {


	public static void main(String[] args) {

		test1();
		System.out.println("good");
	}

	private static void test1() {
		System.out.println("test2 start");
		test2();
		System.out.println("test1 end");
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
	}
}
