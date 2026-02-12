package com.arrays.test1;

public class Demostring {
	
	public static void main(String[] args) {
		String arr [] = new String [4];
		arr[0]= "john";
		arr[1]= "Alice";
		arr[2]= "Bob";
		arr[3]= "Emma";
		
		
		for (String name :arr) {
			System.out.println(name.toUpperCase());
		}
	}
}
