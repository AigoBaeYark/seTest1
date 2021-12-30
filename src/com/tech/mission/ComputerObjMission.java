package com.tech.mission;

import java.util.Scanner;

public class ComputerObjMission {

	// �ʵ� �ּ� 3�� �̻�
	// �޼ҵ� �ּ� 3�� �̻�
	// ������ ��³����� �ٹ�
	// �������� : ��ü�̼�_Ȳ����16

	String cpuName, vgaName, mouseName, keyboardName, osName;
	int ramCap, diskCap;
	float diskCapTB;

	public float getDiskCapTB() {
		return diskCapTB;
	}

	public void setDiskCapTB(float diskCapTB) {
		this.diskCapTB = diskCapTB;
	}

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public String getVgaName() {
		return vgaName;
	}

	public void setVgaName(String vgaName) {
		this.vgaName = vgaName;
	}

	public String getMouseName() {
		return mouseName;
	}

	public void setMouseName(String mouseName) {
		this.mouseName = mouseName;
	}

	public String getKeyboardName() {
		return keyboardName;
	}

	public void setKeyboardName(String keyboardName) {
		this.keyboardName = keyboardName;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public int getRamCap() {
		return ramCap;
	}

	public void setRamCap(int ramCap) {
		this.ramCap = ramCap;
	}

	public int getDiskCap() {
		return diskCap;
	}

	public void setDiskCap(int diskCap) {
		this.diskCap = diskCap;
	}

	public static void main(String[] args) {
		ComputerObjMission com = new ComputerObjMission();
		System.out.println("����ڴ��� ��ǻ���� ����� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		Scanner scCom = new Scanner(System.in);
		// String cpuName = "", vgaName = "", mouseName = "", keyboardName = "";

		int flagNum = 0;
		char if_flag = ' ';

		while (true) {

			switch (flagNum) {
			case 0:
				System.out.println("����� cpu�� �����Դϱ�?");
				com.setCpuName(scCom.nextLine());

				if_flag = ' ';

				System.out.println("����� cpu�� " + com.getCpuName() + " �� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				} else {
					System.out.println("�߸��Է� �ٽ� �Է��մϴ�.");
					continue;
				}

			case 1:
				System.out.println("����� vga(�׷���ī��)�� �����Դϱ�?");
				com.setVgaName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("����� vga(�׷���ī��)�� " + com.getVgaName() + " �� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			case 2:
				System.out.println("����� ���콺�� �����Դϱ�?");
				com.setMouseName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("����� ���콺�� " + com.getMouseName() + " �� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			case 3:
				System.out.println("����� Ű����� �����Դϱ�?");
				com.setKeyboardName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("����� Ű���尡 " + com.getKeyboardName() + " �� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			case 4:

				System.out.println("����� �ü��(os)�� �����Դϱ�?");
				com.setOsName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("����� �ü��(os)�� " + com.getOsName() + " �� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			case 5:
				System.out.println("����� ��(�޸�)�뷮�� ���Դϱ�? (GB(�Ⱑ����Ʈ)����)");
				com.setRamCap(scCom.nextInt());
				if_flag = ' ';

				System.out.println("�����  ��(�޸�)�뷮�� " + com.getRamCap() + "GB�� �½��ϱ�? (������ y Ʋ����  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			case 6:
				System.out.println("����� ��ũ �뷮�� ���Դϱ�? (GB(�Ⱑ����Ʈ)����)");
				com.setDiskCap(scCom.nextInt());
				if_flag = ' ';
				if (com.getDiskCap() >= 1024) {
					com.setDiskCapTB((float) com.getDiskCap() / 1024);
				}

				if (com.getDiskCap() >= 1024) {
					System.out.printf("�����  ��ũ �뷮�� %.2f TB�� �½��ϱ�? (������ y Ʋ����  n) \n", com.getDiskCapTB());
					if_flag = scanner.next().charAt(0);
				} else if (com.getDiskCap() < 1024) {
					System.out.println("�����  ��ũ �뷮�� " + com.getDiskCap() + "GB�� �½��ϱ�? (������ y Ʋ����  n)");
					if_flag = scanner.next().charAt(0);
				}

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("�ٽ� �Է��մϴ�.");
					continue;
				}

			}

			if (flagNum > 6)
				break;

		}

		System.out.println("����ڴ��� ��ǻ�� �����");
		System.out.println("cpu : " + com.getCpuName());
		System.out.println("vga(�׷���ī�� : " + com.getVgaName());
		System.out.println("���콺 : " + com.getMouseName());
		System.out.println("Ű���� : " + com.getKeyboardName());
		System.out.println("�ü��(OS) : " + com.getOsName());
		System.out.println("��(�޸�) �뷮 : " + com.getRamCap() + " GB");
		if (com.getDiskCap() >= 1024) {
			// System.out.println("��ũ �뷮 : " + com.getDiskCapTB() + " TB");
			System.out.printf("��ũ �뷮 : %.2f \n", com.getDiskCapTB());
		} else {
			System.out.println("��ũ �뷮 : " + com.getDiskCap() + " GB");
		}

	}

}
