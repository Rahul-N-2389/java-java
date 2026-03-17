package com.ArraysMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatriAdition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =3;
		int col=3;
		int [][]arr = new int [row][col];
		int temp=0;
		for (int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" Enter values ("+i+","+j+")");
				arr[i][j]=sc.nextInt();
				temp = temp + arr[i][j];
				
			}
			
		}
		System.out.println("sum of matrix is : "+temp);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print((arr[i][j]));
//			}
//			System.out.println();
//		}

	}

}
