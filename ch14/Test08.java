package com.ruby.java.ch14;

import java.lang.reflect.Array;
import java.util.Arrays;

interface StringFunc2 {
	String[] modify(String s) throws EmptyStringException;
}

class EmptyStringException extends Exception {
	public EmptyStringException() {
		super("빈 문자열");
		// TODO Auto-generated constructor stub
	}
	
}

public class Test08 {
	public static void main(String[] args) 
//			throws EmptyStringException
	{
		try {
			String str = "Korea,australia,chian,gramny,spain,turky";
			
			StringFunc2 sf = (s) -> {
				if(s.length() == 0)
					throw new EmptyStringException();
				return s.split(",");
			};
			String result[] =sf.modify(str);
			System.out.println(Arrays.toString(result));
			
			String str2 = "";
			String result2[] = sf.modify(str2);
			System.out.println(Arrays.toString(result2));
			
		} catch (Exception e) {
			System.out.println("삐빅 예외처리");
			// TODO: handle exception
		}
	}

}
