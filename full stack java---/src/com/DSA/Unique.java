package com.DSA;



public class Unique {
	public static char firstUnique(String str) {
		for(int i =0;i<str.length();i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				return str.charAt(i);
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		String srt = "eetcode";
		System.out.println(firstUnique(srt));
	}

}
