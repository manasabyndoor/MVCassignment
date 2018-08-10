package com.book.service;

import java.util.Collection;
import java.util.List;

import com.book.pojo.Book;

public interface BookService {

	public void deleteItems(Book book);
	public Collection <Book> display();
	public void add();
	


}
