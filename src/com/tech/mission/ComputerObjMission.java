package com.tech.mission;

import java.util.Scanner;

public class ComputerObjMission {

	// 필드 최소 3개 이상
	// 메소드 최소 3개 이상
	// 적절한 출력내용을 꾸밈
	// 메일제목 : 객체미션_황현우16

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
		System.out.println("사용자님의 컴퓨터의 사양을 조사합니다.");
		Scanner scanner = new Scanner(System.in);
		Scanner scCom = new Scanner(System.in);
		// String cpuName = "", vgaName = "", mouseName = "", keyboardName = "";

		int flagNum = 0;
		char if_flag = ' ';

		while (true) {

			switch (flagNum) {
			case 0:
				System.out.println("당신의 cpu는 무엇입니까?");
				com.setCpuName(scCom.nextLine());

				if_flag = ' ';

				System.out.println("당신의 cpu가 " + com.getCpuName() + " 이 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				} else {
					System.out.println("잘못입력 다시 입력합니다.");
					continue;
				}

			case 1:
				System.out.println("당신의 vga(그래픽카드)는 무엇입니까?");
				com.setVgaName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("당신의 vga(그래픽카드)가 " + com.getVgaName() + " 이 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			case 2:
				System.out.println("당신의 마우스는 무엇입니까?");
				com.setMouseName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("당신의 마우스가 " + com.getMouseName() + " 이 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			case 3:
				System.out.println("당신의 키보드는 무엇입니까?");
				com.setKeyboardName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("당신의 키보드가 " + com.getKeyboardName() + " 이 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			case 4:

				System.out.println("당신의 운영체제(os)는 무엇입니까?");
				com.setOsName(scCom.nextLine());
				if_flag = ' ';

				System.out.println("당신의 운영체제(os)가 " + com.getOsName() + " 이 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			case 5:
				System.out.println("당신의 램(메모리)용량은 몇입니까? (GB(기가바이트)기준)");
				com.setRamCap(scCom.nextInt());
				if_flag = ' ';

				System.out.println("당신의  램(메모리)용량이 " + com.getRamCap() + "GB가 맞습니까? (맞으면 y 틀리면  n)");
				if_flag = scanner.next().charAt(0);

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			case 6:
				System.out.println("당신의 디스크 용량은 몇입니까? (GB(기가바이트)기준)");
				com.setDiskCap(scCom.nextInt());
				if_flag = ' ';
				if (com.getDiskCap() >= 1024) {
					com.setDiskCapTB((float) com.getDiskCap() / 1024);
				}

				if (com.getDiskCap() >= 1024) {
					System.out.printf("당신의  디스크 용량이 %.2f TB가 맞습니까? (맞으면 y 틀리면  n) \n", com.getDiskCapTB());
					if_flag = scanner.next().charAt(0);
				} else if (com.getDiskCap() < 1024) {
					System.out.println("당신의  디스크 용량이 " + com.getDiskCap() + "GB가 맞습니까? (맞으면 y 틀리면  n)");
					if_flag = scanner.next().charAt(0);
				}

				if (if_flag == 'y') {
					flagNum++;
					System.out.println(flagNum);
				} else if (if_flag == 'n') {
					System.out.println("다시 입력합니다.");
					continue;
				}

			}

			if (flagNum > 6)
				break;

		}

		System.out.println("사용자님의 컴퓨터 사양은");
		System.out.println("cpu : " + com.getCpuName());
		System.out.println("vga(그래픽카드 : " + com.getVgaName());
		System.out.println("마우스 : " + com.getMouseName());
		System.out.println("키보드 : " + com.getKeyboardName());
		System.out.println("운영체제(OS) : " + com.getOsName());
		System.out.println("램(메모리) 용량 : " + com.getRamCap() + " GB");
		if (com.getDiskCap() >= 1024) {
			// System.out.println("디스크 용량 : " + com.getDiskCapTB() + " TB");
			System.out.printf("디스크 용량 : %.2f \n", com.getDiskCapTB());
		} else {
			System.out.println("디스크 용량 : " + com.getDiskCap() + " GB");
		}

	}

}
