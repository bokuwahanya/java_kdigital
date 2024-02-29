package com.ruby.java.ch13;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
//런타임 까지 돌아가야한다.
@interface Mapping {
	String mode();
	int value();
}
//@taget 으로 사용 장소 설정
@Retention(RetentionPolicy.RUNTIME)
@interface Comment {
	String msg();
}
@Mapping(mode = "class", value = 100)
@Comment(msg = "Annotation2 클래스")
public class AnnoTest2 {

	@Mapping(mode = "method" , value = 200)
	@Comment(msg = "Test() 메서드")
	//컴파일 하는 순간 사라져버린다.
	public static void test() {
		AnnoTest2 obj = new AnnoTest2();
		try{
			Class<?> c = obj.getClass(); // 데이터의데이터 메타정보를 담는다
			Annotation annoList[] = c.getAnnotations();
			System.out.println("클래스의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			
			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test()메서드의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}
}

