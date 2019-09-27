package com.jy.java.Level1;

import java.util.Arrays;

/**
 * 완료 - 완주하지 못한 선수
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class unfulfilledPlayer {

	public static void main(String[] args) {
		String[] arr1 = {"leo", "kiki", "eden"};
		String[] arr2 = {"kiki", "eden"};
		
		solution(arr1, arr2);
	}
	
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        
        for(i = 0; i < completion.length; i++) {
        	if(! participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        //System.out.println(participant[i]);
        return participant[i];
    }

}
