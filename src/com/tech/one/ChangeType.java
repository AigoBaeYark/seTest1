package com.tech.one;

public class ChangeType {

	public static void main(String[] args) {
		
		byte b=10;
		int num=10000;
		
		num=b;	//�ڵ� ����ȯ
		System.out.println(num);
		
		num=-129;
		
		b=(byte) num;
		System.out.println(b);
		
	}

}
