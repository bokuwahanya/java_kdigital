package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 */
interface Vehicle { // 객체를 못만든다.
	public abstract void showVehicle();
}
class Truck implements Vehicle {
	int weight;
	public Truck(int weight) {
		this.weight=weight;
	}
	public void showVehicle() {
		System.out.println("Truck: weight="+weight);
	}
}
// class Car implements Vehicle {
// 	int vehicleOccupants;
/
// 	}
// }
// class Taxi extends Car {
// 	int mileage;
// 	@override 값이 같으면 갈아엎어 버림 그러니까 오버라이드 하지말고
//	 위에거 출력하고 같이 자신의 것을 출력하자

// 
// 	public void showVehicle() {
// 		super.showVehicle(); // 부모 클래스의 정보를 자식이 상속받을때
// 		System.out.println("Taxi: mileage="+mileage);
// 	}
// }
// class MotorCycle implements Vehicle{
// 
// }
public class Test_vehicle {
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			v.showVehicle();
		}
	}
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[10]; // 참조변수로 배열을 만들었다
	arr[5] = new Vehicle(); // 생성자 vehicle은 인터페이스라 객체를 몬 만듬
	
	arr[0] = new Truck(33);
	arr[1] = new Car(4);
	arr[2] = new Taxi(2, 9000);
	arr[3] = new Truck(22);
	arr[4] = new MotorCycle(12000);
	
	displayVehicles(arr);
}
}
