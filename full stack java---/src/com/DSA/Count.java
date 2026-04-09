package com.DSA;

public class Count {
	public static void main(String[] args) {
		String str = "RobinHood";
		int v = 0;
		int c = 0;
		
		for (int i =0;i<str.length();i++) {
			char ch = Character.toUpperCase(str.charAt(i));
			if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
				v++;
			}else {
				c++;
			}
			
		}
		System.out.println("Vowels : "+v);
		System.out.println("Consonants: "+c);
		
	}

}
