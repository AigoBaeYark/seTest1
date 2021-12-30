package com.tech.mission;

import java.util.Scanner;

public class ArrayMission {

	public static void main(String[] args) {

		// 10짜리 배열 선언
		// 배열에 성적입력 (50~100 사이)
		// 합계, 평균, 최댓값, 최솟값 출력
		int[] arr = new int[10];

		Scanner scanner = new Scanner(System.in);

		int min = 100, max = 0, sum = 0;
		float avg = 0.f;

		for (int x = 0; x < arr.length; x++) {
			System.out.println((x + 1) + " 번째 성적을 입력하세요.(50~100사이)");
			arr[x] = scanner.nextInt();

			// 숫자를 잘못입력하면 이번회차 다시
			if (arr[x] > 100 || arr[x] < 50) {
				System.out.println(x + " 잘못된 입력입니다.");
				System.out.println((x + 1) + " 번째 성적을 다시 입력하세요!");
				x--;
				continue;
			}

			// 최솟값
			if (min > arr[x]) {
				min = arr[x];
			}

			// 최댓값
			if (max < arr[x]) {
				max = arr[x];
			}

			// 합계
			sum += arr[x];
		}

		// 평균
		avg = (float) sum / arr.length;

		System.out.println("최저 성적 : " + min);
		System.out.println("최고 성적 : " + max);
		System.out.println("성적 평균 : " + avg);
		System.out.println("성적 합계 : " + sum);

	}

}
