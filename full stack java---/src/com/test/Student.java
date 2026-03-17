package com.test;
import java.util.*;

public class Student {
 private int StudentId;
 private String StudentName;
 private int[] marks;
 
 
 public int getStudentId() {
	return StudentId;
 }
 public void setStudentId(int studentId) {
	StudentId = studentId;
 }
 public String getStudentName() {
	return StudentName;
 }
 public void setStudentName(String studentName) {
	StudentName = studentName;
 }
 public int[] getMarks() {
	return marks;
 }
 public void setMarks(int[] marks) {
	this.marks = marks;
 }
 
 
 public void calculateTotal() {
	 
	 int total = marks[0]+marks[1]+marks[2];
	 System.out.println(" Total marks : "+total); 
	 double Average = total/3;
	 System.out.println(" Average : "+Average); 
 }
 public void displayStudentDetails() {
	 System.out.println("Student ID : "+getStudentId());
	 System.out.println("Student Name : "+getStudentName());
	 System.out.println("marks : "+getMarks());
	 calculateTotal();
	 System.out.println(" Grade : ");
	 System.out.println("Result : ");
 }
 
 public static void main(String[] args) {
	 Student students[]= new Student[3];
	 Scanner sc = new Scanner(System.in);
	 Student obj = new Student();
	 
	 System.out.println("Enter Student ID : ");
	 int ID = sc.nextInt();
	 obj.setStudentId(ID);
	 sc.nextLine();
	 
	 System.out.println(" Enter Student Name : ");
	 String Name = sc.nextLine();
	 obj.setStudentName(Name);
	 sc.nextLine();
	 
//	 int size = sc.nextInt();
//	 int []marks = new int [size];
	 System.out.println("Enter the size: ");
	 int size = sc.nextInt();
	 sc.next();
	 System.out.println("enter Student Marlks : ");
		int marks[]= new int[size];
			if(size<0 || size>3) {
				System.out.println("invalid size....");
		}
			
			int marks1 []= new int [size];
			for(int i=0;i<size;i++) {
//				System.out.println(i);
				marks1[i] =sc.nextInt();
				
				
			}
//			System.out.println(marks1);
			System.out.println(Arrays.toString(marks1));
			obj.setMarks(marks1);
			System.out.println(obj.getMarks());
			obj.displayStudentDetails();
	
}
 
 
}
