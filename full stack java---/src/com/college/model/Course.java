package com.college.model;

public class Course {
	 private int CourseCode;
	 private String CourseTitle;
	 private int CourseFee;
	 

	 public Course(int courseCode, String courseTitle, int courseFee) {
		super();
		CourseCode = courseCode;
		CourseTitle = courseTitle;
		CourseFee = courseFee;
	 }


	 public int getCourseCode() {
		 return CourseCode;
	 }


	 public String getCourseTitle() {
		 return CourseTitle;
	 }


	 public int getCourseFee() {
		 return CourseFee;
	 }


	 public void setCourseCode(int courseCode) {
		 CourseCode = courseCode;
	 }


	 public void setCourseTitle(String courseTitle) {
		 CourseTitle = courseTitle;
	 }


	 public void setCourseFee(int courseFee) {
		 CourseFee = courseFee;
	 }
	 
	

}
