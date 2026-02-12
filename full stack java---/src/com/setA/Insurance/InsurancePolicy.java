package com.setA.Insurance;

import java.util.Scanner;

public class InsurancePolicy {
	private String CustomerName;
	private String PolicyType;
	private double PolicyAmount;
	private double AprovedAmount;
	private String PolicyStatus;

	public InsurancePolicy() {

	}

	public InsurancePolicy(String CustomerName, String PolicyType, double PolicyAmount, double AprovedAmount,
			String PolicyStatus) {
		this.CustomerName = CustomerName;
		this.PolicyType = PolicyType;
		this.PolicyAmount = PolicyAmount;
		this.AprovedAmount = AprovedAmount;
		this.PolicyStatus = PolicyStatus;

	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String CustomerName) {
		CustomerName = CustomerName;
	}

	public String getPolicyType() {
		return PolicyType;
	}

	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}

	public double getPolicyAmount() {
		return PolicyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		PolicyAmount = policyAmount;
	}

	public double getAprovedAmount() {
		return AprovedAmount;
	}

	public void setAprovedAmount(double aprovedAmount) {
		AprovedAmount = aprovedAmount;
	}

	public String getPolicyStatus() {
		return PolicyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}

	public void policyRecord() {
		System.out.println("\n policy record has been created...\n");
		System.out.println(" Customer Name : " + getCustomerName());
		System.out.println(" Policy Tpe : " + getPolicyType());
		System.out.println(" Policy Amount : " + getPolicyAmount());
		System.out.println(" Aproved Amount : " + getPolicyAmount());
		System.out.println(" Policy Status : " + getPolicyStatus());
	}
}

class InsuranceMain extends InsurancePolicy {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Customer Name : ");
		String Name = sc.nextLine();

		System.out.println(" Enter Policy Type : ");
		String Type = sc.nextLine();

		System.out.println(" Enter Policy Amount : ");
		double PolAmount = sc.nextDouble();

		System.out.println(" Enter Aproved Amount  : ");
		double AppoAmount = sc.nextDouble();
		
		
		if(AppoAmount<0) {
			String PolStatus = " ";
			System.out.println(" Invalid Amount ");	
		}else {
			
			System.out.println(" Policy Status : "+PolStatus);
		}
		InsurancePolicy obj = new InsurancePolicy(Name, Type, PolAmount, AppoAmount, PolStatus);
		obj.policyRecord();

		int options = 0;
		boolean value = true;
		while (value) {
			System.out
					.println("\n Provide a menu to perform the following operations:\r\n" + "Update Approved Amount\r\n"
							+ "Change Policy Status\r\n" + "View Policy Summary\r\n" + "Exit the program\r\n" + "\n");
			options = sc.nextInt();
			switch (options) {
			case 1: {
				System.out.println(" Enter Update Approved Amount : ");
				AppoAmount = sc.nextInt();
				obj.setAprovedAmount(AppoAmount);
				break;
//				sc.nextLine();
			}

			case 2: {
				System.out.println(" Enter Policy Status : ");

			}

			}
		}
		sc.close();
	}
}
