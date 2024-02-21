package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	
	public Professor() {} //부모 기본생성자 호출

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject= subject;
		
	System.out.println("professor 생성자");
		
	}
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override // 저 메소드는 부모에서 상속 받아서 쓴 오버라이드다 
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ":" + subject; // 부모클래스의 값을 들고 오는게 더 편하다 객체지향
	}
}

