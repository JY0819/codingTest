package com.jy.java.Level1;

/**
 * 완료 - 약수의 합
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class sumDivisor {

	public static void main(String[] args) {
		solution(5);
	}
	
	public static int solution(int n) {
		  int sum = n;
	      for(int i=1; i <= n/2; i++) // @1
	         if(n % i == 0) sum += i; // @2
	      
	      System.out.println(sum);
	      return sum;
	}
}
