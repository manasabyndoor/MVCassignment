package com.book.service;

import java.util.Collection;

import com.book.pojo.Book;


public interface CartService1 {

	public void addtocart(Book book);
	public Collection<Book> displaycart();

}
