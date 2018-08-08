package com.book.service;

import com.book.dao.BookDao;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;

public class BookServiceImpl implements BookService{
	BookDao bookdao=new BookDaoImpl();
	
	public void addToCart(Book book) {
	bookdao.addToCart(book);
	}

	@Override
	public void deleteItems(Book book) {
	
		bookdao.deleteItems(book);
	}

	@Override
	public void display() {
	bookdao.display();
	}
		

}
