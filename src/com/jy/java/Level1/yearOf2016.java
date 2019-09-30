package com.jy.java.Level1;

public class yearOf2016 {

/**
 * 완료 - 2016년
 * 
 * @author LJY
 * @since 2019.09.30 MON
 * @category Programmers - JAVA / Level1
 * */

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		solution(a, b);
	}
	
	public static String solution(int a, int b) {
		int total = 0;
		String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	    int m[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    
	    for(int i = 0; i < a-1; i++) {
	    	total += m[i];
	    }
	    
	    total += b-1;
	    String answer = w[total % 7];
	    
	    System.out.println(answer);
		return answer;
	}

}
