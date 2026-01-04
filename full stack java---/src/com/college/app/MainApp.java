package com.college.app;

import java.util.Scanner;

import com.college.service.*;

import com.college.model.Person;

import com.college.model.Student;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println(" Enter Student Name : ");
		String Sname = sc1.nextLine();

		System.out.println(" Enter Student age : ");
		int Sage = sc1.nextInt();

		System.out.println(" Enter Contact Number : ");
		long Snumber = sc1.nextLong();
		Person obj1 = new Person(Sname, Sage, Snumber);

		System.out.println(" Enter Student Id : ");
		int Sid = sc1.nextInt();

		System.out.println(" Enter Department : ");
		String Sdep = sc1.next();
		sc1.nextLine();

		System.out.println(" Enter Course Name : ");
		String Scourse = sc1.nextLine();

		Student obj2 = new Student(Sid, Sdep, Scourse);
		obj2.displayDetails(obj1);

		StudentService obj3 = new StudentService();
		System.out.println();

		System.out.println(" Enter fee : ");
		double fee = sc1.nextDouble();

		/* Process 1 */
		int discountPercent = 0;
		if (Sdep.equals("IT")) {

			discountPercent = 10;
		}

		/* Process 2 */
//		String discountPercent = Sdep;

		System.out.println(" Final Payable Fee : " + obj3.calculateDiscount(obj2, fee, discountPercent));

		sc1.close();
	}

}
