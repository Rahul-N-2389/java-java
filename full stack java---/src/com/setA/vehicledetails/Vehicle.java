package com.setA.vehicledetails;

import java.util.Scanner;

public class Vehicle {

	private String OwnerName;
	private String VehicleNumber;
	private String VehicleType;

	public Vehicle(String OwnerName, String VehicleNumber, String VehicleType) {
		this.OwnerName = OwnerName;
		this.VehicleNumber = VehicleNumber;
		this.VehicleType = VehicleType;

	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
}

class ServiceVehicle extends Vehicle {

	private String CenterName;
	private String Category;

	public ServiceVehicle(String OwnerName, String VehicleNumber, String VehicleType, String centerName,
			String category) {
		super(OwnerName, VehicleNumber, VehicleType);
		this.CenterName = centerName;
		this.Category = category;

	}

	public String getCenterName() {
		return CenterName;
	}

	public void setCenterName(String centerName) {
		CenterName = centerName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public void profileDetails() {
		System.out.println("  Vehicle profile has been created \n ");

		System.out.println(" owner Name : " + getOwnerName());
		System.out.println(" Vehicle Number : " + getVehicleNumber());
		System.out.println(" Vehicle type : " + getVehicleType());
		System.out.println(" center Name : " + getCenterName());
		System.out.println(" Service Category  : " + getCategory());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Owner name ");
		String Name = sc.nextLine();

		System.out.println(" Enter Vehicle Number ");
		String Number = sc.nextLine();

		System.out.println(" Enter Vehicle Type");
		String Type = sc.nextLine();

		System.out.println(" Enter Center name ");
		String CenName = sc.nextLine();

		System.out.println(" Enter Service Category ");
		String Category = sc.nextLine();

		ServiceVehicle obj = new ServiceVehicle(Name, Number, Type, CenName, Category);
		obj.profileDetails();

		int num = 0;
		while (num != 1) {

			System.out.println("\n" + "Provide a menu to perform the following operations:\r\n"
					+ "1. Update Service Category\r\n" + "2. Update Service Center Name\r\n"
					+ "3. View Vehicle Profile Details\r\n" + "4. Exit the program\r\n" + "\n");

			int choice = sc.nextInt();
			sc.nextLine();

			boolean option = true;
			if (choice == 1) {
				System.out.println(" Update Service Category");
				Category = sc.nextLine();
				obj.setCategory(Category);

				sc.nextLine();
			} else if (choice == 2) {

				System.out.println(" update Service centre Name ");
				Name = sc.nextLine();
				obj.setCenterName(Name);

				sc.nextLine();
			} else if (choice == 3) {
				obj.profileDetails();

			} else if (choice == 4) {
				option = false;
				System.out.println("Thank you ! ");
				break;
			} else {
				System.out.println("Invalid Option please enter correct option");
			}

		}

		sc.close();

	}

}
