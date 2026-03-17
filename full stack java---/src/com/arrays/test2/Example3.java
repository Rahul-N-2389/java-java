package com.arrays.test2;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of elements : ");
		int num = sc.nextInt();
		int arr[]=new int[num];
		System.out.println(" enter the elements : ");
		int i =0;
		while (i <num) {
			arr[i] = sc.nextInt();
			i++;
		}
		for (int j =num-1; j>=0; j--) {
			
			System.out.println((arr[j]));
		}
	
	}
}
