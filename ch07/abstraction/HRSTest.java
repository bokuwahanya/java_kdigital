package com.ruby.java.ch07.abstraction;

abstract class Employee { // 추상 메서드를 하나 이상을 가지면 추상 클래스. 추상 클래스도 기본 클래스다. 추상 메서드가 포함되어있다는 것 밖에 없다. 
	
	String name;
	int salary;

	
	public abstract double calcSalary(); //추상 메서드
	public abstract void calcBonus();
}
class Salesman extends Employee {
	int annual_sales;
	public double calcSalary() {
		
		
		System.out.println("Salesman");
		return 200.0;
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
		
	}
	@Override
	public String toString() {
		return "go";
	}
}

class Consultant extends Employee {
	int num_team;
	public double calcSalary() {
		System.out.println("Consultant");
		return 400.0;
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
		
	}
	@Override
	public String toString() {
		return "go";
	}
}

abstract class Manager extends Employee {
	int num_team;
	public double calcSalary() {
		System.out.println("Manager ");
		return 2000.0;
	}

	@Override
	public void calcBonus() {
		
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6 ");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) { //매개변수 탑 부모 타입 선언
//		double tax = x.calcSalary()*0.1;
//		System.out.println("세금=" + tax);
		if (e instanceof Salesman) // 연산자를 사용해 타입을 검사한다
			System.out.println("Salesman"+((Salesman) e).annual_sales ); // 왜 e.annual_sales가 왜 안될까. 
																		//타입캐스팅 : 타입변경후 차별적인 작업을 시작한다.
																		// 더 상위 클래스의 오브젝으로 받으면 Employee 도 타입캐스트
		else if (e instanceof Manager)
			System.out.println("Manager");
		else if (e instanceof Employee)
			System.out.println("Employee"+e.salary);
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Employee e = new Salesman();
		Director d = new Director();
		Object s3= new Salesman();
		Object arr[] = new Object[6]; // 배열 생성자 
//		Manager m= new Manager();
		arr[0] = s;arr[1] = e;arr[2] = d;
		arr[3] = s3;arr[4] = s; 
		HRSTest h = new HRSTest();
		Salesman s2 = s; //
		if(s.equals(s2))
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체");
		HRSTest.calcTax(s);
		calcTax(e);
		calcTax(d);
//		calcTax(m);
//		calcTax();
//		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		s.equals(h);
		System.out.println();
		s.toString();
		System.out.println(s.toString()); //객체 식별자 // 객체를 toSRING으로 전환 
	}
}

