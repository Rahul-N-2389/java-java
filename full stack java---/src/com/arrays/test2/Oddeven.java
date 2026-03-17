package com.arrays.test2;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of elements : ");
		int num = sc.nextInt();
		int arr[]=new int[num];
		System.out.println(" enter the elements : ");
		int evenCount = 0;
		int oddCount = 0;
		for( int i=0;i<=num-1;i++) {
			
			arr[i] = sc.nextInt();
			if (arr[i]%2==0) {
				evenCount+=+1;
			}else {
				oddCount+=+1;
			}
		}
		System.out.println("Even count : "+evenCount);
		System.out.println("odd count : "+oddCount);
	}
}
