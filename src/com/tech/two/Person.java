package com.tech.two;

public class Person {
	// Ŭ���� �ȿ��� ������ �����ϸ� �� Ŭ���� �� ����������� ��밡��
	// ������ �ڵ����� �ʱ�ȭ �Ǿ� null���̳� 0���� �ʱ�ȭ �� (type���� �ʱ�ȭ �⺻�� ����)
	// static = �޸𸮿��� ��� ���ֽ�Ų��.

	static

	int age;
	
	
	
	

	//ĸ��ȭ gerrers and setters -> ���콺 ��Ŭ�� source -> generate getters and setters Ŭ�� -> ����â���� �����ϰ� Ȯ��
	
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Person.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	int height;

	int weight;
	String name;
	boolean sleep;

	public static void main(String[] args) { // ��� Ŭ�������� main �޼ҵ� ��� ��
		// ���� �ȿ��� ������ �����ϸ� main �ȿ����� ��밡���� ���������� �ȴ�.
		// main �ȿ����� ������ ������ �� �⺻������ �ʱ�ȭ �� ���� �ʿ���

		System.out.println(age);
		
		Person person=new Person();
		person.name="AAA";
		person.laugh();
		
	}

	public void laugh() {
		System.out.println(name+"�����ִ�.");
	}
	public void Sleeping() {

	}

	public void Walking() {

	}

	public void Eating() {

	}

	public void Watching() {

	}
	
	

}
