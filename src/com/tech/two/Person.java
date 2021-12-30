package com.tech.two;

public class Person {
	// 클래스 안에서 변수를 선언하면 이 클래스 안 어느곳에서도 사용가능
	// 변수는 자동으로 초기화 되어 null값이나 0으로 초기화 됨 (type마다 초기화 기본값 있음)
	// static = 메모리에서 계속 상주시킨다.

	static

	int age;
	
	
	
	

	//캡슐화 gerrers and setters -> 마우스 우클릭 source -> generate getters and setters 클릭 -> 설정창에서 설정하고 확인
	
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

	public static void main(String[] args) { // 모든 클래스마다 main 메소드 없어도 됨
		// 여기 안에서 변수를 선언하면 main 안에서만 사용가능한 지역변수가 된다.
		// main 안에서는 변수를 선언할 때 기본적으로 초기화 할 값이 필요함

		System.out.println(age);
		
		Person person=new Person();
		person.name="AAA";
		person.laugh();
		
	}

	public void laugh() {
		System.out.println(name+"웃고있다.");
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
