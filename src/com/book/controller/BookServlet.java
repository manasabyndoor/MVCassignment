package com.book.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.pojo.Book;

import com.book.service.BookService;
import com.book.service.BookServiceImpl;
import com.book.service.CartService;
import com.book.service.CartService1;

@WebServlet("*.app")
public class BookServlet extends HttpServlet {

	/**
	 * 
	 */
	static int count;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//Cart carts = new Cart();
		String action = request.getServletPath();
		switch (action) {
		case "/addtocart.app":
			BookService service = new BookServiceImpl();
			CartService1 cartservice=new CartService();
			String bookname = request.getParameter("bookName");
			int price=Integer.parseInt(request.getParameter("bookPrice"));
			System.out.println(bookname);
			//book.setBookName(bookname);
			Book book=new Book(bookname,price); 
			cartservice.addtocart(book);
			System.out.println(book.getBookName());
			Collection <Book> cart=cartservice.displaycart();
		 
			
			session.setAttribute("Cart",cart);
			//request.setAttribute("Cart",cart);
			//System.out.println(cart);
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("home.jsp");
			requestdispatcher.forward(request, response);
			break;
		case "/cart.app":
			if (count == 0)
				response.sendRedirect("nocart.jsp");
			else
			{
				
			}
			break;
		case "/refresh.app":
			
			service = new BookServiceImpl();
			service.add();
			Collection<Book> books = service.display();
			
			System.out.println(service.display());
			request.setAttribute("Book", books);
			requestdispatcher = request.getRequestDispatcher("home.jsp");
			requestdispatcher.forward(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
