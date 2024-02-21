package com.ruby.java.ch04;

import java.util.Random;

public class Test37_Random {
public static void main(String[] args) {
	//난수 생성하기
	Random rnd = new Random(); //Random이 클래스 - 난수 생성된 클래스
	int [] score = new int[5];
	
	//초기값 설정
	int sum = 0;
	double avg = 0.0;
	int max = 0;
	int min =21;
	
		for ( int i = 0; i <score.length ; i++) {
		score[i] = rnd.nextInt(20); // nextint 다음에 생성할 정수
		
	}
//		for (int num: score)
//		System.out.println(num);

		for (int i = 0; i <score.length; i++) {
			if (i % 5 ==0)
				System.out.println("\n ");
			if (score[i] < 10) 
				System.out.println(" ");
				System.out.print(score[i] + " ");
		}
		
		for(int i = 0; i < score.length; i++) {
		sum += score[i];
		if(max < score[i])
			max = score[i];
		if(min > score[i])
			min = score[i];
   }
	
		avg = sum / score.length;
		System.out.println("총  점 : "+ sum);
		System.out.println("평  균 : "+ avg);
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
    	
    }
}
