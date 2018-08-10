package com.book.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.book.pojo.Book;

public class BookDaoImpl implements BookDao {
	 
	Map<String,Book> bookdata= new HashMap<String,Book>();
	Book book=new Book();
	public void add(Book book) {

		bookdata.put(book.getBookName(), book);
		System.out.println(bookdata.values());
		
	}

	public void deleteItems(Book book)
	{
		bookdata.remove(book.getBookName());
		
	}
	public Collection <Book> display()
	{
	
	 return	bookdata.values();
	 
	
	}



	
	



	


	
}
