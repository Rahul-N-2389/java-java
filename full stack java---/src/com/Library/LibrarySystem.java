package com.Library;

import java.util.Scanner;

public class LibrarySystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
		Book obj=new Book(2421,"java",10);
		obj.getBookDetails();
		
		System.out.println("Enter borrow books");
		int Borrow = sc.nextInt();
		System.out.println("Available books : "+obj.borrowBook(Borrow));
		
		System.out.println("Enter return books");
		int Return = sc.nextInt();
		System.out.println("Available books : "+obj.returnBook(Return));
		
		sc.close();
		
		
		
		
		

	}

}
