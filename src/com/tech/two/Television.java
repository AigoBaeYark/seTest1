package com.tech.two;

public class Television {
	// 필드
	int channel;
	boolean onOff;
	int volume;
	// 필드에서는 자동초기화 된다.

	public static void main(String[] args) {
		// 지역변수는 수동으로 초기화 해야한다.
		int num;
		boolean bool;
		Television tv = new Television(); // 객체 생성

		System.out.println(tv.channel);
		System.out.println(tv.volume);
		System.out.println(tv.onOff);

		tv.channel = 7;
		tv.volume = 5;
		tv.onOff = true;

		System.out.println();
		System.out.println("tv채널은 " + tv.channel);
		System.out.println("tv 볼륨은  " + tv.volume);
		//System.out.println("tv의 상태는 " + tv.onOff);
		
		if(tv.onOff) {
			System.out.println("tv는 켜져있다.");
		}else {
			System.out.println("tv는 꺼져있다.");
		}
	}

	public void watchingTv() {
		// TV를 보는 메소드
	}

	public void tvOn() {
		// TV를 켜는 메소드
	}

}
