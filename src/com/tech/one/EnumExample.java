package com.tech.one;

enum Season {
	봄, 여름, 가을, 겨울
}

public class EnumExample {

	public static void main(String[] args) {

		// System.out.println(args[0]+args[1]); //그냥 실행하면 에러 //run configuration에 가서
		// arguments에 값을 넣어주면 나온다.

		for (Season sea : Season.values()) {
			System.out.println(sea);
		}
		System.out.println();
		Season season = Season.가을;
		System.out.println(season);

	}

}
