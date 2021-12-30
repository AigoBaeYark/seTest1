package com.tech.mission;

import java.util.Scanner;

public class CharAtExample {

	public static void main(String[] args) {
		
		//주민번호 뒷자리 1~2는 1900년대 남성여성
		//3~4는 20년대 이후 남성여성
		//5~6은 외국인 남성여성
		
		String msg="당신의 주민번호는 ?";
		
		char c=msg.charAt(2);	//문자열의 길이-1까지 넣을 수 있음 (배열처럼 0부터 시작)
		System.out.println(c);
		
		Scanner scanner= new Scanner(System.in);
		
		
	}

}
