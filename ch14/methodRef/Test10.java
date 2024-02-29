package com.ruby.java.ch14.methodRef;

interface StringFunc {
	String modify(String s);
}
public class Test10 {

	 String func(String s) {
		String result = "";
		char c;
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if( c == ',')
				result +=" ";
			else
				result += c;
		}
		return result;
	}

	public static void main(String[] args) {

//		StringFunc sf = Test10::func; // 메서드,파라미터가 동일하고 리턴타입 이 동일해야 한다. 
		
		Test10 obj = new Test10();
		StringFunc sf = obj::func;

		String str = "korea,austar,chanr,gernay,spain,turkey";
		String result = sf.modify(str);
		System.out.println(result);

		String str2 = "서울,북경,도코,뉴욕,발리";
		result = sf.modify(str2);
		System.out.println(result);
	}
}

