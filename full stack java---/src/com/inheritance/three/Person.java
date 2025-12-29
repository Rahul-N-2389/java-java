package com.inheritance.three;

public class Person {
		public Person () {
			System.out.println("Person object created");
		}
}
class Student extends Person{
	
	public Student() {
		System.out.println("Student object created");
		
	}
		public static void main (String[]args) {
			Student obj = new Student();
			
		}
}
