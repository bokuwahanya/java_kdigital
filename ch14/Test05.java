package com.ruby.java.ch14;

interface NumberFunc {
	int func(int n);
}
public class Test05 {

	public static void main(String[] args) {
		NumberFunc sum = (n) -> {
			int result = 0;
			for(int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};

		NumberFunc sum2 = (n) -> {
			int result = 0;
			for(int i = 0; i <= n; i++){
				if( i % 2 == 0) {
					for(int j = 0; j <= n; j+=2) 
						result += j;
				}else {
					for(int j = 0; j <= n; j++) 
						result += j+1;
				}
			}
			return result;
			
		};

		System.out.println("1~10 합 : " + sum.func(10));
		System.out.println("1~100 합 : " + sum.func(100));
		System.out.println("1~100 짝 합 : " + sum2.func(6));
		System.out.println("1~100 홀 합  : " + sum2.func(6));
	}
}
