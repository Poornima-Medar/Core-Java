package com.bookcart.dao;

import java.util.List;

import com.bookcart.model.Book;

public interface BookCartDAO {
	
	public abstract List<Book> getBookList(String genre);
	
}
