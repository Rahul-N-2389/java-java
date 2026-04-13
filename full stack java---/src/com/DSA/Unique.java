package com.DSA;

import java.util.Arrays;

// first non repeating char in String

public class Unique {
	public static char firstUnique(String str) {
		
		boolean [] arr = new boolean [str.length()]; 
//		System.out.println(Arrays.toString(arr));
		for(int i =0;i<str.length();i++) {
			
			if(arr[i]==true) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					arr[j]=true;
//					System.out.println(Arrays.toString(arr));
				}
			}
//			if(count==1) {
//				return str.charAt(i);		
//		}
			System.out.println(str.charAt(i)+"-->"+count);
		}
		return 0;
	}

	public static void main(String[] args) {

		String srt = "banana";
		System.out.println(firstUnique(srt));
	}

}
