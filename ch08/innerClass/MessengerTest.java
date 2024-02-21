package com.ruby.java.ch08.innerClass;
interface Messenger {
	String getMessage();
	void setMessage(String msg);
}
class GalaxyMessenger implements Messenger {
	
	
}
public class MessengerTest {
public static void main(String[] args) {
	messenger galaxy = new Messenger()
			;

	Messenger test = new Messenger() { // 추상 메서드를 구현한 클래스 
		public String getMessage() { //추상 메서드
			return "test";
	}
		public void setMessage(String msg) {
		System.out.println("test에서 메세지를 설정합니다 :" + msg);
// 인터페이스에 바디가 있으면 익명 클래스
	}		
 }; //여기에 왜 세미클론을 해야할까 요 
 }

}

