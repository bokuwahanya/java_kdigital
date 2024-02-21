package com.ruby.java.ch06;

public class Armor {
	
	private String name;
	private int height;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "armor1 [name=" + name + ", height=" + height + "]";
	}


	public void setName(String value) {
		name = value;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int value) {
		height = value;
	}
	public static void main(String[] args) {
		int c = 20;
		{
			int a = 10;
			System.out.println(a);
		}
		
		{
			int a = 5;
			
			System.out.println(a);
		}
	}
}
