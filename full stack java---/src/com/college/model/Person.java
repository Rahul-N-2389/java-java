package com.college.model;

public class Person {
	private String name;
	private int age;
	private long contactNumber;

	public Person() {
//		System.out.println(" Parent class");

	}

	public Person(String name, int age, long contactNumber) {
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void getPerson() {
		System.out.println(" Student Name : " + name);
		System.out.println(" Student Age : " + age);
		System.out.println(" Student contact Number : " + contactNumber);
	}

}
