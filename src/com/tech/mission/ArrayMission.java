package com.tech.mission;

import java.util.Scanner;

public class ArrayMission {

	public static void main(String[] args) {

		// 10¥�� �迭 ����
		// �迭�� �����Է� (50~100 ����)
		// �հ�, ���, �ִ�, �ּڰ� ���
		int[] arr = new int[10];

		Scanner scanner = new Scanner(System.in);

		int min = 100, max = 0, sum = 0;
		float avg = 0.f;

		for (int x = 0; x < arr.length; x++) {
			System.out.println((x + 1) + " ��° ������ �Է��ϼ���.(50~100����)");
			arr[x] = scanner.nextInt();

			// ���ڸ� �߸��Է��ϸ� �̹�ȸ�� �ٽ�
			if (arr[x] > 100 || arr[x] < 50) {
				System.out.println(x + " �߸��� �Է��Դϴ�.");
				System.out.println((x + 1) + " ��° ������ �ٽ� �Է��ϼ���!");
				x--;
				continue;
			}

			// �ּڰ�
			if (min > arr[x]) {
				min = arr[x];
			}

			// �ִ�
			if (max < arr[x]) {
				max = arr[x];
			}

			// �հ�
			sum += arr[x];
		}

		// ���
		avg = (float) sum / arr.length;

		System.out.println("���� ���� : " + min);
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ��� : " + avg);
		System.out.println("���� �հ� : " + sum);

	}

}
