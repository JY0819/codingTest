package com.jy.java.Level1;

/**
 * 완료 - 핸드폰 번호 가리기
 * 
 * @author LJY
 * @since 2019.09.27 FRI
 * @category Programmers - JAVA / Level1
 * */

public class hidePhoneNumber {

	public static void main(String[] args) {
		String pn1 = "01033334444";
		String pn2 = "027778888";
		
		solution(pn1);
		solution(pn2);
	}
	
	public static String solution(String phone_number) {
		String answer = "";
		
		for(int i = 0; i < phone_number.length(); i++) {
			answer += phone_number.length() - i <= 4 ? phone_number.charAt(i) : "*";
		}

		//System.out.println(answer);
		return answer;
	}

}
