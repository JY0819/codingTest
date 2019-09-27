package com.jy.java.Level1;

/**
 * 완료 - 평균 구하기
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class averageCalculate {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 5};
		
		solution(arr1);
		solution(arr2);
	}
	
	public static double solution(int[] arr) {
		double answer = 0;
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		answer = sum / arr.length;
		
		//System.out.println(answer);
		return answer;
	}

}
