package com.jy.java.Level1;

/**
 * 완료 - 문자열 다루기 기본
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */


public class BasicStringHandling {

	public static void main(String[] args) {
		String a = "a234";
		String b = "1234";
		
		solution(a);
		solution(b);
	}
	
	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			return s.matches("^[0-9]*$");
		}
		return false;
	}

}
