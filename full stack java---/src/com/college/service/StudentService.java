package com.college.service;

import com.college.model.Student;

public class StudentService {

	/* Process 1 */
	public double calculateDiscount(Student student, double fee, int discountPercent) {
		String Depart = student.getDepartment();

		if (Depart.equals("IT")) {
			double discount = fee - (fee * 0.1);

			System.out.println(" discount Applied : " +discountPercent +"%");
			return discount;
		}

		return fee;

		/* Process 2 */
//		public double calculateDiscount(Student student, double fee, String discountPercent) {
//			
//			
//		if( discountPercent.equals("IT")) {
//			
//			fee = fee - (fee * 0.1);
//			System.out.println(" discount Applied : 10%");
//			
//			return fee;
//		}
//		
//		return fee;
////		
	}
}
