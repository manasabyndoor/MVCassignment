package com.book.service;

import com.book.pojo.Book;

public interface BookService {
	public void addToDB(Book book);
	public void deleteItems(Book book);
	public void display();


}
