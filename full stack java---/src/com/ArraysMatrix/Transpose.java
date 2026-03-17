package com.ArraysMatrix;

import java.util.Scanner;
import java.util.Arrays;


public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =3;
		int col=3;
		int [][]arr = new int [row][col];
		for (int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" Enter values ("+i+","+j+")");
				arr[i][j]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr[i]));
			
			System.out.println("----------------------");
		}
//		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println((Arrays.toString(arr[j])));
			}
			System.out.println();
//		}
			

	}

}
