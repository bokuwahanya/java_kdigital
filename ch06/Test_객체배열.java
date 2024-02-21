package com.ruby.java.ch06;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
abstract class InterfaceStudents {
	public abstract void showObject();
}

class Student extends InterfaceStudents {
	static int countStudents;//객체수
	int sid;//학번
	String sname; //학생 이름
	String city; //주소 도시

	public Student() {//default 생성자
		countStudents++;
	}

	public Student(int sid) { //super 인가 this 인가 = this
		//		 super(); // 중복 코딩 없애기 위해, 상위 클래스 값을 받는다
		this();
		this.sid = sid; 
	
		
	}
	public Student(int sid, String sname, String city) {
		//		 super(); // 중복 코딩 없애기 위해, 상위 클래스 값을 받는다
		this(sid);
		this.sname = sname; this.city=city;
	}

	public String toString() { // 최상위 루트 object
		return "sid="+sid + ", sname=" + sname + ", city=" + city;
	}
	public void showObject() {
		System.out.println("["+sid +", " + sname + ", " + city+"]");
	}
	static void showNumberObjects() {//생성된 객체수를 출력한다.
		System.out.println(" 생성객체수=" + countStudents);
	}
}
class WorkStudent extends Student {
	String eno;
	String company;
	public WorkStudent(int sid, String sname, String city, String eno, String company) {
		super(sid, sname, city);

		this.company = company;
	}
	public String toString() {
		return "sid="+sid + ", sname=" + sname + ", city=" + city +", company=" + company;
	}
	public void showObject() {
		//Student 출력 코드 추가
		System.out.println("["+eno +", " + company + "]");
	}

}
class CodingWorkStudent extends WorkStudent {
	String language;
	public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
		super(sid, sname, city, eno, company);

		this.language = language;
	}
	public String toString() {
		return "sid="+sid + ", sname=" + sname + ", city=" + city +", company=" + company + ", language=" + language;
	}
	public void showObject() {
		//WorkStudent 출력 코드 추가 
		System.out.println("["+language+"]");
	}
}
// 생성자 구현한다.
public class Test_객체배열 {
	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}
	public static void main(String[] args) {

		Student arry[] = new Student[5];

		Student.showNumberObjects(); //오버로딩
		arry[0] = new Student(); // default 생성자
		arry[1] = new Student(202301); //
		arry[2] = new Student(202301, "Hong", "busan");
		arry[3] = new WorkStudent(202301, "Hong", "Busan", "e-12134","samsung");
		arry[4] = new CodingWorkStudent(202301, "Hong", "Busan", "e-12134","samsung","korean");

		Student.showNumberObjects();
		for (Student s : arry) {
			System.out.println(s.toString());//객체에 메소드를 부른거
		}
		for (Student ss : arry) {
			showObjects(ss); // 일반함수
		}
	}
}




