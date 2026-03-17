package com.constructor.Case1;

public class EmployeeProcedure {

	public static void main(String[] args) {
	Employee emp = new Employee(420, "RobinHood", "Decoit", 30000, 4);
	
	System.out.println(" Employee ID : "+ emp.getempId());
	System.out.println(" Employee Name : "+ emp.getempName());
	System.out.println(" Employee Desg : "+ emp.getempDesg());
	System.out.println(" Employee Salary : "+ emp.getempSaly());
	System.out.println(" Employee Rating : "+ emp.getempRating());
	
	emp.promoteEmployee("Software Devp");
	
	System.out.println("Updated Salary : "+emp.getempSaly());

	}

}
