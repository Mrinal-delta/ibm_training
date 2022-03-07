package com.ibm.lib;

public class Member {
	private String name;
	private Book book;

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void status() {
		if(book == null)
			System.out.println("No book issued by " + name);
		else
			System.out.println(book.getTitle() + " is issued by " + name);
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
}
