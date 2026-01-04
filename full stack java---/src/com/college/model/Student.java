package com.college.model;



public class Student extends Person {
	int StudentId;
	String Department;
	String CourseName;
	
	public Student (){
//		System.out.println(" Child class");
		
	}
	
	public Student (int StudentId, String Department, String CourseName) {
		this.StudentId = StudentId ;
		this.Department = Department ;
		this.CourseName = CourseName ;
	}
	
	
	public int getStudentId() {
		return StudentId;
	}
	public String getDepartment() {
		return Department;
	}
	public String getCourseName() {
		return CourseName;
	}
	
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public void displayDetails (Person person) {
//		person.getPerson();
		
		System.out.println(" Student Name : "+person.getName());
		System.out.println(" Student Age : "+person.getAge());
		System.out.println(" Student contact Number : "+person.getContactNumber());
		System.out.println(" Student Id : "+StudentId);
		System.out.println(" Department : "+ Department);
		System.out.println(" Course Name : "+ CourseName);
	}


	}
