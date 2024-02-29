package com.ruby.java.ch13.study;



class Bag {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("Object의 타입은" + thing.getClass().getName());
	}
}

class Book {}
class PencilCase{}
class Notebook{}

public class BagTest2 {

	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());


		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2; // 타입 오류지만 오브젝이 매개변수라 오류가 안뜸 이것을 제네릭의 타입 검사로 잡는다.
		
//		Bag<Book> bag = new Bag<>(); //기본 생성자가 없어서
//		bag.setThing(new Book());
//		bag.showType();
//		
		
		//제네릭
//				Bag<Book> bag = new Bag<Book>(new Book());
		//		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		//		Bag<Notebook> bag3 = new Bag<>(new Notebook());

			//  bag.showType();
		//		bag2.showType();
		//		bag3.showType();

		//		bag = bag2; // 제네릭이 타입검사를 통한 안정성 증진 

	
	}
}

