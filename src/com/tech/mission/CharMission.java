package com.tech.mission;

import java.util.Scanner;

public class CharMission {

	public static void main(String[] args) {
		// �ֹι�ȣ ���ڸ� 1~2�� 1900��� ��������
		// 3~4�� 20��� ���� ��������
		// 5~6�� �ܱ��� ��������
		// 1, 3, 5 �� ����
		// 2, 4, 6 �� ����
		// q�� �Է¹ޱ� �������� ���ѹݺ�

		// String msg = "����� �ֹι�ȣ�� ?";
		//
		// char c = msg.charAt(2); // ���ڿ��� ����-1���� ���� �� ���� (�迭ó�� 0���� ����)
		// System.out.println(c);

		Scanner scanner = new Scanner(System.in);

		String number = "";
		number = scanner.nextLine();
		System.out.println(number);
		System.out.println(number.length());
		char gender = ' ';

		while (true) {

			String msg = "����� �ֹι�ȣ�� ? (q�� �Է��ϸ� ����˴ϴ�.)";
			System.out.println(msg);
			number = scanner.nextLine();

			if (number.equals("q")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
			if (number.length() != 13) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

			gender = number.charAt(6);
			System.out.println(gender);
			
			
			if(gender == '1') {
				System.out.println("2000��� ���� �����Դϴ�.");
			}
			else if(gender == '2') {
				System.out.println("2000��� ���� �����Դϴ�.");
			}
			else if(gender == '3') {
				System.out.println("2000��� ���� �����Դϴ�.");
			}
			else if(gender == '4') {
				System.out.println("2000��� ���� �����Դϴ�.");
			}
			else if(gender == '5') {
				System.out.println("�ܱ��� �����Դϴ�.");
			}
			else if(gender == '6') {
				System.out.println("�ܱ��� �����Դϴ�.");
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

		}

	}

}
