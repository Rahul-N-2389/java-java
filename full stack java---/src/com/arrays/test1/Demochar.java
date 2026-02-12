package com.arrays.test1;

public class Demochar {
	
	public static void main(String[] args) {
		char arr[]=new char[5];
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		
		
		
		for (char letters : arr) {
			System.out.println(letters);
		}
		
//		for (int i=0;i<=4;i++) {
//			for (char letter : arr) {
//				char let= Character.toLowerCase(arr[i]);
//				System.out.println(let);
//				break;
//			}
//		}
		
	}

}
