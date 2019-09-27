package com.jy.java.Level1;

/**
 * 완료 - 수박수박수박수박수박수?
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class suBak {

	public static void main(String[] args) {
		solution(6);
	}

	public static String solution(int n) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			answer += i % 2 == 0? "수" : "박";
		}
		
		//System.out.println(answer);
		return answer;
	}
	
}
