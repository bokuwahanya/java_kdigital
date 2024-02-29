package com.ruby.java.ch13;

class Bag<T, N> {
	private T thing;
	private N name;

	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
		System.out.println("N의 타입은" + name.getClass().getName());
	}
}

class Book {
	public String toString() {
		return "책";
	}
}
class PencilCase{}
class Notebook{}

public class BagTest {

	public static void main(String[] args) {

		Bag<Book, PencilCase> bag = new Bag<Book, PencilCase>(new Book(), new PencilCase());
		//		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		//		Bag<Notebook> bag3 = new Bag<>(new Notebook());


		bag.showType();
		//		bag2.showType();
		//		bag3.showType();

		//		bag = bag2; // 제네릭이 타입검사를 통한 안정성 증진 

		Book book = bag.getThing();
//		String name = bag.getName();
//		PencilCase pencilCase =bag.getThing();

		System.out.println("Thing is : " + book);
//		System.out.println("Thing is : " + pencilCase);

		//		Bag<Book> bag = new Bag<>(); //기본 생성자가 없어서
		//		bag.setThing(new Book());
		//		bag.showType();
		//		
	}
}
