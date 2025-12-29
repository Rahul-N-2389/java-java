package com.inhertance.four;

public class Employee {
	int salary=50000;
}
	class Manager extends Employee {
		int bonus = 20000;
		
		public static void main (String[]args) {
			
			Manager obj = new Manager();
			int total = obj.salary + obj.bonus;
			System.out.println(total);
}
		
	
}
