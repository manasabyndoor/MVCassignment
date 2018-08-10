package com.book.dao;

import java.util.Collection;

import com.book.pojo.Book;


public interface BookDao {
	public void add(Book book);
	public void deleteItems(Book book);
	public Collection <Book> display();
	
}
