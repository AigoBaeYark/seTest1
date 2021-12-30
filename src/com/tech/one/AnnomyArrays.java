package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays {
	// 무명배열
	// 사용되는 곳이 한차례 사용되고 재사용하지 않을 때
	public static void main(String[] args) {

		int[] aa = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(aa));

		// new int[] {1,2,3,4,5};

		System.out.println(Arrays.toString(new int[] { 5, 5, 5, 5, 5 }));
		

	}

}
