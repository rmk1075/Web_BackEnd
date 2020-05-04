package com.study.spring.diexam01;

public class UserBean {
	/**
	 * 1. default constructor
	 * 2. private field
	 * 3. getter, setter
	 */
	
	private String name;
	private int age;
	private boolean male;
	
	public UserBean() {}

	public UserBean(String name, int age, boolean male) {
		super();
		this.name = name;
		this.age = age;
		this.male = male;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	boolean isMale() {
		return male;
	}

	void setMale(boolean male) {
		this.male = male;
	}
}
