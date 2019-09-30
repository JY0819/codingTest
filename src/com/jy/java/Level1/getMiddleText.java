package com.jy.java.Level1;

public class getMiddleText {

/**
 * 완료 - 가운데 글자 가져오기
 * 
 * @author LJY
 * @since 2019.09.30 MON
 * @category Programmers - JAVA / Level1
 * */	
	
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "qwer";
		
		solution(str1);
		solution(str2);
	}
	
	public static String solution(String s) {
		String answer = "";
		
		if(s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1); 
		} else {
			answer = Character.toString(s.charAt(s.length() / 2)); 
		}

		return answer;
	}

}
