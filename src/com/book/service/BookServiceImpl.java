package com.book.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.book.dao.BookDao;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;

public class BookServiceImpl implements BookService{
	BookDaoImpl dao=new BookDaoImpl();

	


	@Override
	public void deleteItems(Book book) {
		dao.deleteItems(book);
	}

	@Override
	public Collection <Book> display() {
	return dao.display();
	}

	@Override
	public void add() {
		

		Book book1=new Book("C++",600);
		Book book2=new Book("JAVA",765);
		Book book3=new Book("Wings of fire",600);
		Book book4=new Book("My Experiments with truth",765);
		
		
		
	dao.add(book1);
	dao.add(book2);
	dao.add(book3);
	dao.add(book4);
	
	
		
	}

	





	




		

}
