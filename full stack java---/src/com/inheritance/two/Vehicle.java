package com.inheritance.two;

public class Vehicle {
	
	public void  run() {
		System.out.println("Vehicle is running");
		
	}

}
class Car extends Vehicle {
	public void speed() {
		System.out.println(" car is moving at 80 km/h");
	}
	public static void main (String[]args) {
		Car obj = new Car();
		obj.run();
		obj.speed();
		
	}
	
}
