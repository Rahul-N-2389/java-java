package com.constructor.Case1;

public class Employee {   // BLC AND ELC BY SIR WRITTEN IN TEST NOTES
	private int empId;
	private String empName;
	private String empDesg;
	private double empSaly;
	private int PerformanceRating;
	
	public Employee(int empId,String empName, String empDesg, double empSaly, int PerformanceRating) {
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSaly = empSaly;
		this.PerformanceRating = PerformanceRating;
	}
	
	public int getempId() {
		return empId;
	}
	public void setempId (int empId) {
		this.empId = empId;
	}
	
	
	public String getempName() {
		return empName;
	}
	public void setempName (String empName) {
		this.empName = empName;
	}
	
	public String getempDesg() {
		return empDesg;
	}
	public void setempDesg (String empDesg) {
		this.empDesg = empDesg;
	}
	
	public double getempSaly() {
		return empSaly;
	}
	public void setempSaly (double empSaly) {
		this.empSaly = empSaly;
	}
	
	public int getempRating() {
		return PerformanceRating;
	}
	public void setempRating (int PerformanceRating) {
		this.PerformanceRating = PerformanceRating;
	}
	
	public void promoteEmployee(String NewDesg) {
		if (PerformanceRating >=4) {
			empSaly = empSaly +(empSaly*0.2);
			
			empDesg = NewDesg;
			System.out.println(" Salary has been hiked.....");
			System.out.println(" New Promotion : "+getempDesg());
		}else {
			System.out.println(" No promotion.....");
		}
	}
}
