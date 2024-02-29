package com.ruby.java.ch14;

import java.util.function.Function;
// 최상위 추상 클래스 geometry 생성 ==> 추상 메서드로 면적 구하는 메서드 선언
abstract class Geometry{
 abstract double getArea();	
}
// 자식 클래스 생성 => circle, rectangle, triangle
class Circle extends Geometry{
	int radius = 0;
	
	public Circle(int radius) {
		this.radius = radius;
		
	}
	@Override
	double getArea() {
		return Math.PI * radius * radius ;
	}
}

class Rectangle extends Geometry{
	int w = 0;
	int h = 0;
	
	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
		
	}
	@Override
	double getArea() {
		return (double)(h * w);
	}
	
}
class Triangle extends Geometry{
	int w = 0;
	int h = 0;
	
	
	public Triangle(int h, int w) {
		this.h = h;
		this.w = w;
	
	}
	@Override
	double getArea() {
		return (double)( h * w * 0.5);
	}
}

public class dff_test {
public static void main(String[] args) {
	
	// Function 람다 출력
	Function<Geometry, Double> func = (g) -> { //<매개변수, 반환타입>
		return g.getArea(); // g는 입력 매개변수를 나타낸다. geometry 타입의 객체를 받고 g라는 변수에 할당
	};
	System.out.println("원 면적:" +func.apply((new Circle(5))));
	System.out.println("사각형 면적:" +func.apply((new Rectangle(5, 10))));
	System.out.println("삼각형 면적 :" +func.apply((new Triangle(5, 10))));
	}
}

// 코드에 주석을 달아라 .. 그리고 주석만 남기고 다 지워라.. 다시 코딩을 짜라.. 주석으로 로직을 먼저 설계
