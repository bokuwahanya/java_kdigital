package com.ruby.java.ch07.abstraction;

public interface Messenger { // 인터페이스는 항상 퍼블릭으로 할 필요가 없다
	
//	public static final int MIN_SIZE = 1;
//	public static final int MAX_SIZE = 104857600;
	
	// 퍼블릭은 class에 붙은 거 하나 
	public abstract String getMessage(); // 추상 메서드 abstract
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
			if(login) {
				System.out.println("로그인 처리합니다.");
			} else {
				System.out.println("로그아웃 처리합니다");
			}
		}
	
	public static void getConnection() {
		System.out.println("네트워크에 연결합니다");
	}
	
	private void log() {
		System.out.println("일을 시작합시다!");
	}
}	
	
	
