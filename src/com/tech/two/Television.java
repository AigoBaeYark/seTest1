package com.tech.two;

public class Television {
	// �ʵ�
	int channel;
	boolean onOff;
	int volume;
	// �ʵ忡���� �ڵ��ʱ�ȭ �ȴ�.

	public static void main(String[] args) {
		// ���������� �������� �ʱ�ȭ �ؾ��Ѵ�.
		int num;
		boolean bool;
		Television tv = new Television(); // ��ü ����

		System.out.println(tv.channel);
		System.out.println(tv.volume);
		System.out.println(tv.onOff);

		tv.channel = 7;
		tv.volume = 5;
		tv.onOff = true;

		System.out.println();
		System.out.println("tvä���� " + tv.channel);
		System.out.println("tv ������  " + tv.volume);
		//System.out.println("tv�� ���´� " + tv.onOff);
		
		if(tv.onOff) {
			System.out.println("tv�� �����ִ�.");
		}else {
			System.out.println("tv�� �����ִ�.");
		}
	}

	public void watchingTv() {
		// TV�� ���� �޼ҵ�
	}

	public void tvOn() {
		// TV�� �Ѵ� �޼ҵ�
	}

}
