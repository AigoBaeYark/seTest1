package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays2 {
	// ����迭
	// ���Ǵ� ���� ������ ���ǰ� �������� ���� ��
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
