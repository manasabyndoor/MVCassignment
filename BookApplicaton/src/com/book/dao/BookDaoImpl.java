package com.book.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.book.pojo.Book;

public class BookDaoImpl implements BookDao {
	 
	Map<Integer,String> bookdata= new HashMap<Integer,String>();
	
	
	
	
	
	
	public void addToDB(Book book) {
		
		bookdata.put(book.getId(), book.getBookName());
		
	}
	public void deleteItems(Book book)
	{
		bookdata.remove(book.getId());
		
	}
	public <Collection>Book display()
	{
	 return	(Book) bookdata.values();
	
	}
	
}
