package com.bookcart.service;

import java.util.List;

import com.bookcart.model.Book;

public interface BookService {
	
	public abstract List<Book> getBookListByGenre(String genre);

}
