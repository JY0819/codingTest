package com.jy.java.Level1;

public class numberOfPandY {

/**
 * 완료 - 문자열 내 p와 y의 개수
 * 
 * @author LJY
 * @since 2019.09.30 MON
 * @category Programmers - JAVA / Level1
 * */
	
	public static void main(String[] args) {
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
		solution(s1);
		solution(s2);
	}

	static boolean solution(String s) {
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;
		
		s = s.toUpperCase();
		String[] sArr = s.split("");
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].equals("P")) {
				pCnt++;
			} else if (sArr[i].equals("Y")) {
				yCnt++;
			}
		}

		if(pCnt == yCnt) {
			answer = true;
		} else {
			answer = false;
		}
		
		System.out.println(answer);
		return answer;
	}
}
