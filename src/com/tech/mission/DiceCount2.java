package com.tech.mission;

import java.util.Arrays;
import java.util.Random;

public class DiceCount2 {
	// �󵵼� üũ
	// �ֻ����� 10000 �� ������ 1�� : ????�� 2�� : ????�� ...
	// ���� ��� 1�� ����? 2�� ����? ...
	// �����̸� : �ֻ���_Ȳ����16.zip
	// �������� : �ֻ���_Ȳ����16

	public static void main(String[] args) {

		Random r = new Random();
		// int num = r.nextInt(6);
		int[] arr = new int[6];

		int cnt = 0;
		int num = 0;

		for (int i = 0; i < 10000; i++) {
			cnt++;
			num = r.nextInt(6) + 1; // �ֻ��� ���

//			switch (num) {
//			case 1:
//				arr[0]++;
//				break;
//			case 2:
//				arr[1]++;
//				break;
//			case 3:
//				arr[2]++;
//				break;
//			case 4:
//				arr[3]++;
//				break;
//			case 5:
//				arr[4]++;
//				break;
//			case 6:
//				arr[5]++;
//				break;
//
//			default:
//				break;
//		}
			if(num==1) arr[i]++;
			if(num==2) arr[i]++;
			if(num==3) arr[i]++;
			if(num==4) arr[i]++;
			if(num==5) arr[i]++;
			if(num==6) arr[i]++;
			


		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println((1 + i) + "�� : " + arr[i]+" ���� : "+((float)arr[i]/100));
		}

	}
}
