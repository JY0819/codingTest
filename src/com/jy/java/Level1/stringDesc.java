package com.jy.java.Level1;

import java.util.Arrays;

/**
 * 완료 - 문자열 내림차순으로 배치하기
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class stringDesc {

	public static void main(String[] args) {
		solution("Zbcdefg");
	}
  
  	public static String solution(String s) {
  		String answer = "";
  		
  		char[] array = s.toCharArray(); 
  		Arrays.sort(array); 
  		
  		answer = new StringBuilder(new String(array)).reverse().toString();
  		
  		System.out.println(answer);
  	    return answer; 
  	}
}
