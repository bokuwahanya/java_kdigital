package com.ruby.java.ch08.innerClass;

//class Node {
//	private String data;
//	private Node link;
//	
//	public Node(String data, Node link) {
//		this.data = data; this.link = link;

	
 // 클래스를 이용해서 노드를 정의 하는데 클래스 아웃 클래스 인도 있다. 교수님은 외부 클래스를 선호한다. 외부 클래스는 다른 곳에서 사용가능.

public class MyLinkedList {

	private Node head ; // 내부 클래스는 클래스 안에서 사용이 가능 하다 관련이 있는 것은 하나로 모은다.
	class Node {
		private String data;
		private Node link;
		
		public Node(String data) { //linked note 
			//생성자는 필드가 2개 이므로 heap에 필드 공간 2개 할당
			//this.data = data; link = null;
		}
	}
	public void add(String data) {
		Node newNode = new Node(data);
		if(head ==null) 
			head = newNode;
			else {
				Node next = head;
				while(next.link != null) {
					next = next.link ;
				}
				next.link = newNode;
			}
	}
	public void print() {
		
	}
		public  MyLinkedList() {
			this.head = null;
		}
	
	
	
}
