package com.ruby.java.ch11;

class Test05 {

	int battery = 0;

	public void charge(int time) throws Exception {

		if(time < 0) {
			time = 0;
			throw new NagativeNumberException("마이너스");

		}

		battery += time;
		System.out.println("현재 배터리 :" + battery);
	}

	public static void main(String[] args) { //exception 으로 던지면 밑에값 진행 안됨 

		Test05 test = new Test05();
		try {
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

