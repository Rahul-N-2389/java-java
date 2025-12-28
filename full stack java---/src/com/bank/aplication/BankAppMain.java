package com.bank.aplication;

import java.util.Scanner;

public class BankAppMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		System.out.println("Enter Adress : ");
		String Adress = sc.next();
		
		System.out.println("Enter Phone Number : ");
		long Phone = sc.nextLong();
		
		System.out.println("Enter Deposit Amoount");
		double DepositAmount=sc.nextDouble();
		BankApp obj = new BankApp(name, Adress, Phone, DepositAmount);
		
		int num =1;
		while(num!=0) {
			System.out.println("**** Select an Option from Below **** \n"
					+ "1. Deposit \n"
					+ "2. withdraw \n"
					+ "3. Show Balance \n"
					+ "4. Exit \n");
			System.out.println("Enter your option [1-4] : ");
			int number=sc.nextInt();
			if(number==1) {
				obj.deposite();
			}else if (number == 2) {
				obj.withdraw();
				
			}else if (number == 3) {
				obj.ShowBalance();
			}else {
				obj.Exit();
				break;
				
			}
		}
		
		
		sc.close();
	}

}
