package com.bookcart.service.impl;

import java.util.List;

import com.bookcart.dao.BookCartDAO;
import com.bookcart.dao.impl.BookCartDaoImpl;
import com.bookcart.model.Book;
import com.bookcart.service.BookService;

public class BookServiceImpl implements BookService{

	BookCartDAO dao = new BookCartDaoImpl();
	
	@Override
	public List<Book> getBookListByGenre(String genre) {
		return dao.getBookList(genre);
	}

}
