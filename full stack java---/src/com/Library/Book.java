package com.Library;

public class Book {
	private int BookId;
	private String title;
	private int AvailableCopies;
	public Book (int BookId ,String title,int AvailableCopies) {
		this.BookId=BookId;
		this.BookId= BookId;
		this.AvailableCopies=AvailableCopies;	
	}
	
	public int getBookId() {
		return BookId;
	}
	
	public String gettitle() {
		return title;
	}
	
	
	public int getCopies() {
		return AvailableCopies;
	}
	
	public void getBookDetails() {
		System.out.println(getBookId());
		System.out.println(gettitle());
		getCopies();
		
	}
	public int  borrowBook(int borrowBooks) {
		if(AvailableCopies>0 ) {
			
			AvailableCopies=AvailableCopies-borrowBooks;
		}else {
			System.out.println("Book is not available for borrowing.");
		}
		return AvailableCopies;
	}
	public int returnBook(int returnBooks) {
		AvailableCopies=AvailableCopies+ returnBooks;
		
		return AvailableCopies;
	}
	

}
