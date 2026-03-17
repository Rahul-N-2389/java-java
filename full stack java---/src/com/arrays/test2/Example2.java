package com.arrays.test2;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter size of the index :");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int i=0;
		int sum=0;
		while( i<size) {
			
			System.out.println(" Enter "+i+" the element : ");
			arr[i] = sc.nextInt();
			 sum = sum + arr[i];
			i++;
			
		}
		System.out.println("sum of the elements :"+sum);
		
	}
}
