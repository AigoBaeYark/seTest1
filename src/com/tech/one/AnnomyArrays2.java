package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays2 {
	// 무명배열
	// 사용되는 곳이 한차례 사용되고 재사용하지 않을 때
	public static void main(String[] args) {

		System.out.println("sum : " + sum(new int[] { 5, 5, 5, 5, 5 }));

	}

	private static int sum(int[] arrs) {

		int total = 0;
		for (int i = 0; i < arrs.length; i++) {
			total += arrs[i];
			// total=total+arrs[i];
		}
		return total;
	}

}
