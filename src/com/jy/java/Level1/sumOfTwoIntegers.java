package com.jy.java.Level1;

public class sumOfTwoIntegers {

/**
 * 완료 - 두 정수 사이의 합
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */
	
	public static void main(String[] args) {
		solution(3, 5);
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a == b) {
			answer = a;
		} else if (a > b) {
			for(int i = b; i <= a; i++) {
				answer += i;
			}
		}
		
		System.out.println(answer);
		return answer;
	}
	
}
