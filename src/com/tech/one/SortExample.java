package com.tech.one;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {

		int[] arr = { 50, 30, 20, 70, 90 };
		System.out.println("������ : " + Arrays.toString(arr));

		
		Arrays.sort(arr);
		
//		
//		// ��Ʈ ����
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//
//				if (arr[i] < arr[j]) {
//					int tmp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = tmp;
//				}
//			}
//		}

		System.out.println("������ : " + Arrays.toString(arr));

	}

}
