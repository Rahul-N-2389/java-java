package com.general;

import java.util.Scanner;

public class TcsQs1 {
	int arr []= {15000,12000,9000,5000,2000};
	public int  gymFee(int months) {
		if (months%12==0) {
			return (months/12)*arr[0];
		}
		else if (months %9 ==0) {
			return (months/9)*arr[1];
		}
		else if (months %6 ==0) {
			return (months/6)*arr[2];
		}
		else if (months %3 ==0) {
			return (months/3)*arr[3];
		}
		else if (months ==1) {
			return (months/1)*arr[4];
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		TcsQs1 emp = new TcsQs1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter months : ");
		int month = sc.nextInt();
		
		if(emp.gymFee(month)==0) {
			System.out.println("Error");
		}
		else {
			System.out.println(emp.gymFee(month));
		}
	}

}
