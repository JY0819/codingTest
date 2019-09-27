package com.jy.java.Level1;

import java.util.Scanner;

/**
 * 완료 - 직사각형 별찍기
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class rectangularStar {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
	}
	
	

}
