package com.book.dao;

import java.util.Collection;

import com.book.pojo.Book;


public interface CartDao1 {


	public void addtocart(Book book);
	public Collection<Book> displaycart();

	
}
