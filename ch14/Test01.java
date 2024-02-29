package com.ruby.java.ch14;

public class Test01 {
	public static void test(MyInterface mi) {
		mi.print();
	}
	
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("Test2()메서드에서 반환된 MyInterface");
				// TODO Auto-generated method stub
				
			}
		};
		return mi;
	}
	
	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); //MyClass1
		mc2.print(); //Myclass2
		
		MyInterface mi = new MyInterface() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("익명 클래스로 구현");
				
			}
		};
		test(mc1); //Myclass1
		test(mi); //익명클래스로 구현
		
		mi.print(); //익명 클래스로 구현
		
		(new MyInterface() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("선언, 생성 호출을 한번에 처리");
				
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리
		
		MyInterface mi2 = test2();
		mi2.print(); // test2()메서드에서 반환된 MyInterface
	}
}
