package com.tech.mission;

import java.util.Random;

public class DiceCount {
	// �󵵼� üũ
	// �ֻ����� 10000 �� ������ 1�� : ????�� 2�� : ????�� ...
	// ���� ��� 1�� ����? 2�� ����? ...
	// �����̸� : �ֻ���_Ȳ����16.zip
	// �������� : �ֻ���_Ȳ����16

	public static void main(String[] args) {

		// �ֻ��� ���ڱ���
		Random rand_Dice = new Random();

		// �ֻ��� ������ ����
		int Num_Dice = 0;

		// �ֻ��� ���� ����Ȯ��
		int[] Ck_Dice = new int[6];

		// �� ���� ���� Ȯ��
		int Ck_SumDice = 0;

		// �� ���� Ȯ��
		float Ck_PerDice = 0.f;

		// �ֻ��� 1���� ������ �� ���� ���� Ȯ��
		for (int i = 0; i < 10000; i++) {
			Num_Dice = rand_Dice.nextInt(6);
			Ck_Dice[Num_Dice]++;
		}

		// �� ���� ������ ����� ���Դ��� Ȯ��, ī��Ʈ�� �� 10000���� Ȯ��
		for (int i = 0; i < Ck_Dice.length; i++) {
			System.out.println((i + 1) + " ���� ���� : " + Ck_Dice[i]);
			Ck_SumDice += Ck_Dice[i];
		}

		System.out.println("���¸��� �� ���� : " + Ck_SumDice);
		System.out.println();

		// �� ���� ���� Ȯ��, ���� ���� ������ 100%�� �´��� Ȯ��
		for (int i = 0; i < Ck_Dice.length; i++) {
			System.out.println((i + 1) + " ���� ���� : " + (float) Ck_Dice[i] / 100);
			Ck_PerDice += (float) Ck_Dice[i] / 100;
		}
		System.out.println(Ck_PerDice);

	}
}
