package com.ruby.java.java_data_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class train_스트링리스트정렬 {

	    public static String[] removeElement1(String[] arr, String item) {
	    	//현재 배열에서 중복 제거할려고 코드가 길어진다
	    	//배열을 리스트로 변환 > list.remove();
	    	//삭제된 리스트를 배열로 변환하여 리턴
	    	list.remove(item);
	    	return list.toArray(String[]::new);
	    }
	    
	    static void getList(List<String> list) {
			list.add("서울");	list.add("북경");
			list.add("상해");	list.add("서울");
			list.add("도쿄");	list.add("뉴욕");


			list.add("런던");	list.add("로마");
			list.add("방콕");	list.add("북경");
			list.add("도쿄");	list.add("서울");

			list.add(1, "LA");
	    }
	    static void showList(String topic, List<String> list) {

	    }
	    static void sortList(List<String> list) {

	    }
	    
	    static String[] removeDuplicateList(List<String> list) {
	 
	    	
	    	//리스트를 배열로 변환 > 배열에서 중복을 찾는다
		    String cities[] = new String[0];
		    cities = list.toArray(cities);
		    // list를 배열 cities[]로 변환
		    // for문으로 도시가 중복인 것을 체크 = CompareTo 사용
		    int count = cities.length;
		    for (int i = 0; i < count; i ++) {
		    	int j = i + 1;
		    	while ( j < count) {
		    		if () { // 배열에서 중복 검사하고 참이면
		    			cities = removeElement1(cities, cities[j]); //중복제거
		    		}
		    		//j 수정하고 나머지 작업하면 된다
		    	}
		    }
		    return cities;
	    }
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			getList(list);
			showList("입력후", list);
			//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
			sortList(list);
		    System.out.println();
		    showList("정렬후", list);
// 배열에서 중복제거
		    System.out.println();
		    System.out.println("중복제거::");
		  
		    String[] cities = removeDuplicateList(list);
	        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
		    showList("중복제거후", lst);
		}
	}

