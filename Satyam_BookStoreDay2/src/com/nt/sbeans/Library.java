package com.nt.sbeans;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	
	public Library() {
	System.out.println("This is Library Class ::::::::::::::::>");
	}

	public void setBook(ArrayList<Book> books) {
		this.books = books;
	}
		
	public String LibraryBooks() {
		System.out.println("List of Book");
		for(Book bookl : books) {
			System.out.println(bookl);
		}
		
		return "Books Display";
	}
	
	
	
	

}
