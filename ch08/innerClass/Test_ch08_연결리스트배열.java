package com.ruby.java.ch08.innerClass;

import com.ruby.java.ch08.innerClass.MyLinkedList.Node;

class Node3 {
	int data;
	Node3 link;
	public Node3(int data) {
		this.data = data; link = null;
	}
}
class LinkedList3 {
	Node3 first;
	void append(int data) {
		Node3 p = first, q = null;
		Node3 newNode = new Node3(data);

		if(p == null) {
			first = newNode;
			return;
		}
		while(p != null) {
			q = p ;
			p = p.link;
		}
		q.link = newNode;
	}


	void showList() {
		Node3 p = first;
		
		if(p == null) {
			first = p;
			return;
		}
		while(p != null) {
			System.out.print(p.data+"\t");
			p = p.link;
		}
		
	}
	void insert(int data) {
//		Node3 p = first, q = null;
//		Node3 newNode = new Node3(data);
//		
//		if(p.data >= newNode.data) { 
//			newNode.link = p;
//			first = newNode;
//		} else {
//		q = p; // 시작점 정의
//		while(q.link != null && q.link.data < newNode.data) {
//				q = q.link;
//		}
//		newNode.link = q.link;
//		q.link = newNode;
//		}
		
		Node3 p = first, q = null;
		Node3 newNode = new Node3(data);
		
		if(p.data >= newNode.data) { 
			newNode.link = p;
			first = newNode;
		} else {
		q = p; // 시작점 정의
		while(q.link != null && q.link.data < newNode.data) {
				q = q.link;
		}
		newNode.link = q.link;
		q.link = newNode;
		}
	}
	
	
}

public class Test_ch08_연결리스트배열 {
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;


		}
		return count;
	}
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
	}
	//		static int insertList(int[] data, int count, int x) {
	//			int indx = 0;
	//
	//		}

	public static void main(String[] args) {
		//			int[]list = new int[10];
		//			int count = 0;
		//			System.out.println("배열로 리스트::");
		//			count = getList(list);
		//			showList(list);
		//			count = insertList(list, count, 3);
		//			showList(list);
		//			count = insertList(list, count, 7);
		//			showList(list);
		//			//파트 1 배열가지고 하는 거

		LinkedList3 ll = new LinkedList3();
		ll.append(5);ll.append(10);ll.append(15);ll.append(20);ll.append(25);
		ll.showList();
		ll.insert(3);ll.showList();
		ll.insert(17);ll.showList();
		//파트 2 node를 이용해서 링크드 리스트로 하는거
	}
}



