package com.ruby.java.ch02;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depositAmount =0;
		float ratio = 0.14f;//실수
		boolean result = true;
		result = false;
		char gender='F';
		char c = '\u0057';
		String str = "good morning";
		String ltr_str1  = "Good Morning";
		String ltr_Str2 = "Good Morning";
		
		System.out.println(str);
		System.out.println("참조위치비교 1 =>\t"+ (ltr_str1 == ltr_Str2));
		  System.out.println("code =" + c + ", gender = "+gender);
		  System.out.println(result); System.out.println("저금액 " + depositAmount);//여러개 출력은 +
		  System.out.println(ratio); System.out.println(gender);
		  // sysout+ctrl space
		 
		}

}
