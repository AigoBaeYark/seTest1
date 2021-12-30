package com.tech.one;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		
		System.out.println(Arrays.toString(numbers));
		
		
//		for¹® »ç¿ë
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
