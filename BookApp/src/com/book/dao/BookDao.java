package com.book.dao;

import com.book.pojo.Book;

public interface BookDao {
	public void addToCart(Book book);
	public void deleteItems(Book book);
	public void display();

}
