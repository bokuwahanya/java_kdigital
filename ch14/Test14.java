package com.ruby.java.ch14;

import java.util.function.Function;

//자바가 기본적으로 제공해주는 function
public class Test14 {

	public static void main(String[] args) {
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};

		int wordCnt = func.apply("배고프다 배고팠다 배고프지만 배고프지않았다");
		System.out.println("단어 수 : " + wordCnt);
	}
}
