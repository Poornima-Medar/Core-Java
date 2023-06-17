package com.bookcart.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcart.dao.BookCartDAO;
import com.bookcart.model.Book;
import com.bookcart.util.BookCartDatabaseUtil;

public class BookCartDaoImpl implements BookCartDAO{

BookCartDatabaseUtil databaseUtil = new BookCartDatabaseUtil();
	
	@Override
	public List<Book> getBookList(String genre){
		List<Book> book = new ArrayList<>();
		try {
			Connection connection = databaseUtil.getDatabaseConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from booklist where book_genre='" + genre + "'";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				String book_title = resultSet.getString(1);
				String book_genre = resultSet.getString(2);
				Book b = new Book(book_title, book_genre);
				book.add(b);
			}
		}catch(Exception e) {
			return null;
		}
		return book;
	}
}
