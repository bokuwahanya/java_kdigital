package com.ruby.java.ch05;

class Armor { //접근제한자 

private String name = "홍길동";
private int height = 180;
private int weight = 100;
String color = "red";


private void takeooff() {
	System.out.println("Take off");
}
private void land(){
	System.out.println("Land");
}
private void shootLaser() {
	System.out.println("Shoot Laser");
	}
}

public class ArmorTest {
	public static void main(String[] args) {
		Armor armor = new Armor();
		
		armor.takeooff();
	}

}