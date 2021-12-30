package com.tech.mission;

import java.util.Random;

public class DiceCount {
	// 빈도수 체크
	// 주사위를 10000 번 던져서 1면 : ????번 2면 : ????번 ...
	// 비율 계산 1면 몇퍼? 2면 몇퍼? ...
	// 파일이름 : 주사위_황현우16.zip
	// 메일제목 : 주사위_황현우16

	public static void main(String[] args) {

		// 주사위 숫자굴림
		Random rand_Dice = new Random();

		// 주사위 나오는 숫자
		int Num_Dice = 0;

		// 주사위 면의 숫자확인
		int[] Ck_Dice = new int[6];

		// 총 면의 갯수 확인
		int Ck_SumDice = 0;

		// 총 비율 확인
		float Ck_PerDice = 0.f;

		// 주사위 1만번 굴리고 각 면의 갯수 확인
		for (int i = 0; i < 10000; i++) {
			Num_Dice = rand_Dice.nextInt(6);
			Ck_Dice[Num_Dice]++;
		}

		// 각 면의 갯수가 몇번씩 나왔는지 확인, 카운트가 총 10000인지 확인
		for (int i = 0; i < Ck_Dice.length; i++) {
			System.out.println((i + 1) + " 면의 갯수 : " + Ck_Dice[i]);
			Ck_SumDice += Ck_Dice[i];
		}

		System.out.println("나온면의 총 갯수 : " + Ck_SumDice);
		System.out.println();

		// 각 면의 비율 확인, 면의 비율 총합이 100%가 맞는지 확인
		for (int i = 0; i < Ck_Dice.length; i++) {
			System.out.println((i + 1) + " 면의 비율 : " + (float) Ck_Dice[i] / 100);
			Ck_PerDice += (float) Ck_Dice[i] / 100;
		}
		System.out.println(Ck_PerDice);

	}
}
