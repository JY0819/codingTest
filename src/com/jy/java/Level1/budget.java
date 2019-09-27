package com.jy.java.Level1;

import java.util.Arrays;

/**
 * 완료 - 예산
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class budget {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int budget = 9;
		
		solution(arr, budget);
	}
	
	public static int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			if(budget == 0 || budget < d[i]) {
				break;
			}
			budget -= d[i];
			answer++;
		}
		
		//System.out.println(answer);
		return answer;
	}

}
