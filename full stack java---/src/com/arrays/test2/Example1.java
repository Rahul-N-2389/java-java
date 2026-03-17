package com.arrays.test2;

import java.util.Scanner;
import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the size of the array : ");
		int size = scanner.nextInt();
		int arr[]= new int[size];
			if(size<0 || size>10) {
				System.out.println("invalid size....");
		}
			
			String arr1 []= new String [size];
			for(int i=0;i<size;i++) {
				System.out.println("enter "+i+" index value :");
				arr1[i] =scanner.next();
				
				
			}
			System.out.println(Arrays.toString(arr1));
		
	}
}
