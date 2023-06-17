package com.bookcart.model;

public class Book {
	
	private String book_title;
	private String book_genre;

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public Book(String book_title, String book_genre) {
		super();
		this.book_title = book_title;
		this.book_genre = book_genre;
	}

}
