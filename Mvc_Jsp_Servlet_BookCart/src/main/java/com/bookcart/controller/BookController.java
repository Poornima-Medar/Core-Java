package com.bookcart.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.bookcart.dao.BookCartDAO;
import com.bookcart.model.Book;
import com.bookcart.service.BookService;
import com.bookcart.service.impl.BookServiceImpl;

public class BookController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String genre = request.getParameter("genre");
		BookService service = new BookServiceImpl();
		List<Book> books = service.getBookListByGenre(genre);
		if(books !=null && !books.isEmpty()) {
			request.setAttribute("bookList", books);
			RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
			dispatcher.forward(request, response);
		}
		else if(books.isEmpty()){
			RequestDispatcher dispatcher = request.getRequestDispatcher("empty.jsp");
			dispatcher.forward(request, response);	
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
