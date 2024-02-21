package com.ruby.java.ch08.innerClass;

public class outerClassTest {
public static void main(String[] args) {
	OuterClass outer = new OuterClass();
	OuterClass.InstanceClass inner01 = outer.new InstanceClass();
//	outerClass.InstanceClass inner02 = new InstanceClass();
	//생성자 함수는 new 
//	outerClass.InstanceClass inner02 = outer.new InstanceClass();
	//객체를 넣으면 에러가 나온다. 클래스 앞에는 타입 정보가 와야하는데 말이다 
	
	inner01.a = 123;
	inner01.method2();
	OuterClass.SataticClass inner03 = new OuterClass.SataticClass();
	OuterClass.SataticClass.c = 789;
	OuterClass.SataticClass.method4();
	//static으로 하면 객체를 안만들어도 됨 자주 쓸 내용은 아님
}
}
