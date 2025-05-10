package com.nt.sbeans;

import java.util.Map;

public class Books {
	
	private static Map<String ,Store> books;
	
	public static void setBooks(Map<String, Store> books) {
		Books.books = books;
	}


	public String showAllBooks() {
		for(String title: books.keySet()) {
			
		Store st = books.get(title);
			
			System.out.println("Book Title\t:"+title+" "+"Book Author\t:"+st.getAuthor());
				
		}
		return "All Books Lists";
		
	}

	

	
	
	
	
	
	
	
	
	
	

}
