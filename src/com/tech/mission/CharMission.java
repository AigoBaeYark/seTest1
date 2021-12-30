package com.tech.mission;

import java.util.Scanner;

public class CharMission {

	public static void main(String[] args) {
		// 주민번호 뒷자리 1~2는 1900년대 남성여성
		// 3~4는 20년대 이후 남성여성
		// 5~6은 외국인 남성여성
		// 1, 3, 5 는 남성
		// 2, 4, 6 은 여성
		// q를 입력받기 전까지는 무한반복

		// String msg = "당신의 주민번호는 ?";
		//
		// char c = msg.charAt(2); // 문자열의 길이-1까지 넣을 수 있음 (배열처럼 0부터 시작)
		// System.out.println(c);

		Scanner scanner = new Scanner(System.in);

		String number = "";
		number = scanner.nextLine();
		System.out.println(number);
		System.out.println(number.length());
		char gender = ' ';

		while (true) {

			String msg = "당신의 주민번호는 ? (q를 입력하면 종료됩니다.)";
			System.out.println(msg);
			number = scanner.nextLine();

			if (number.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			if (number.length() != 13) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

			gender = number.charAt(6);
			System.out.println(gender);
			
			
			if(gender == '1') {
				System.out.println("2000년대 이전 남성입니다.");
			}
			else if(gender == '2') {
				System.out.println("2000년대 이전 여성입니다.");
			}
			else if(gender == '3') {
				System.out.println("2000년대 이후 남성입니다.");
			}
			else if(gender == '4') {
				System.out.println("2000년대 이후 여성입니다.");
			}
			else if(gender == '5') {
				System.out.println("외국인 남성입니다.");
			}
			else if(gender == '6') {
				System.out.println("외국인 여성입니다.");
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		}

	}

}
