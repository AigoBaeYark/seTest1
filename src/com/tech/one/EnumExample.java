package com.tech.one;

enum Season {
	��, ����, ����, �ܿ�
}

public class EnumExample {

	public static void main(String[] args) {

		// System.out.println(args[0]+args[1]); //�׳� �����ϸ� ���� //run configuration�� ����
		// arguments�� ���� �־��ָ� ���´�.

		for (Season sea : Season.values()) {
			System.out.println(sea);
		}
		System.out.println();
		Season season = Season.����;
		System.out.println(season);

	}

}
