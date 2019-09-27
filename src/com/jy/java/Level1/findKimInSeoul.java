package com.jy.java.Level1;

import java.util.Arrays;

/**
 * 완료 - 서울에서 김서방 찾기
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class findKimInSeoul {

	public static void main(String[] args) {
		String[] arr = {"Jane", "Kim", "KI"};
		
		solution(arr);
	}
	
	public static String solution(String[] seoul) {
		
		int answer = Arrays.asList(seoul).indexOf("Kim");
		
		//System.out.println(answer);
		return "김서방은 " + answer + "에 있다";
	}
	

}
