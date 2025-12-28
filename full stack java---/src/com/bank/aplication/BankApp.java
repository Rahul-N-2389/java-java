package com.bank.aplication;

import java.util.Scanner;

public class BankApp {
	Scanner sc1= new Scanner(System.in);
	private String customerName;

	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	public BankApp(String customerName,String customerAddress,long phoneNumber,double balance ) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance= balance;
		
		
		System.out.println("Account Holder Name : "+customerName);
		System.out.println("Adress : "+customerAddress);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println(" Balance : "+balance);
		System.out.println("Account created successfully"+ " \r\n");
	
	}
	public void deposite() {
		System.out.println("Enter deposite amount : ");
		int deposit = sc1.nextInt();
		if(deposit>0) {
			balance = balance + deposit;
			System.out.println("Deposited successfully completed");
			System.out.println(" your Updated balance : "+balance + " \r\n");
			
		}
		
	}
	public void withdraw() {
		System.out.println(" Enter withdraw Amount : ");
		int withdraw = sc1.nextInt();
		if(withdraw > 0 && withdraw <= balance) {
			
			balance = balance - withdraw;
			System.out.println("withdraw amount successfully completed ");
			System.out.println(" your Updated balance : "+balance + " \r\n");
			
		}else {
			System.out.println("Withdraw amount Should be aboove the balance ..." + " \r\n");
		}
		
	}
	public void ShowBalance() {
		
		System.out.println("Updated balance : "+balance + " \r\n");
		
	}
	public void Exit() {
		System.out.println("thank you");
		
	}
}
